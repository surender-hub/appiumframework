package base;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.LoginUserPage;
import utils.ConfigReader;
import utils.ConfigUatReader;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseSuper {

    public static AndroidDriver driver;
    public static UiAutomator2Options options;
    private static AppiumDriverLocalService service;
    public LoginUserPage loginUserPage;
    public LoginPage loginPage;
    private boolean isGuestUser = false;
    private static boolean isLoggedIn = false;  // Flag to track login status
    //private static final String APP_PACKAGE = "in.goindigo.android"; //Prod
    //private static final String APP_PACKAGE = "in.goindigo.android.preprod"; //PreProd
    private static final String APP_PACKAGE = "in.goindigo.android.uat";  //UAT


    @BeforeSuite
    public void startAppiumServer() {
        System.out.println("Starting Appium server...");
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withTimeout(Duration.ofSeconds(300))
                .build();
        service.start();
    }


    @BeforeClass
    @Parameters({"userType"})  // Accept parameter "guest" or "loggedIn"
    public void setup(@Optional("noLogin") String userType) throws MalformedURLException {
        System.out.println("Initializing Appium session...");
        // Fix: Now userType is correctly used as a parameter

        // Check if authentication should be skipped
       /* if (userType.equalsIgnoreCase("noLogin")) {
            System.out.println("Skipping login and guest user selection...");
            return;  // Exit setup method early, skipping login & guest selection
        }*/
        isGuestUser = userType.equalsIgnoreCase("guest"); // Set guest mode based on parameter
        options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path.UAT"));
        options.setAutoGrantPermissions(true);

        // Preserve login session
        options.setNoReset(true);  // Do not reset app data
        options.setFullReset(false); // Do not uninstall app

        if (driver == null) {  // Create driver only if it's null
            driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        if (userType.equalsIgnoreCase("noLogin")) {
            System.out.println("Skipping login and guest user selection...");
            return;
        }

        isGuestUser = userType.equalsIgnoreCase("guest");

        // Check if the app is already installed and running
        if (driver.isAppInstalled(APP_PACKAGE)) {
            System.out.println("App is already installed.");

            // Bring app to the foreground instead of launching again
            driver.activateApp(APP_PACKAGE);
            System.out.println("App reactivated: " + APP_PACKAGE);
        } else {
            System.out.println("App launching for the first time...");
        }


        if (isGuestUser) {
            System.out.println("Running as Guest User. Skipping login...");
            selectGuestUser();
        } else {
            if (!isUserAlreadyLoggedIn()) {
                System.out.println("User not logged in. Performing login...");
                performLogin();
            } else {
                System.out.println("User already logged in. Skipping login...");
            }
        }


       /* // Check if user is already logged in before calling performLogin();
        if (!isUserAlreadyLoggedIn()) {
            System.out.println("User not logged in. Performing login...");
            performLogin();
        } else {
            System.out.println("User already logged in. Skipping login...");
        }*/

    }

    /* @BeforeMethod
     public void resumeApp() {
         System.out.println("Resuming app for next test case...");
         try {
             driver.runAppInBackground(Duration.ofSeconds(1));  // Add a small delay
         } catch (Exception e) {
             System.out.println("Failed to resume app: " + e.getMessage());
         }
     }*/
    @BeforeMethod
    public void resumeApp() {
        System.out.println("Resuming app for next test case...");
        try {
            driver.activateApp(APP_PACKAGE);  // Brings the app to the foreground
        } catch (Exception e) {
            System.out.println("Failed to resume app: " + e.getMessage());
            driver.runAppInBackground(Duration.ofSeconds(1));
        }
    }


    @AfterMethod
    public void afterEachTest(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Test Failed - Implement screenshot capture here.");
        }
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Keeping session alive for next tests...");
    }

    @AfterSuite
    public void stopAppiumServer() {
        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("Appium server stopped.");
        }
    }

    private void performLogin() {
        System.out.println("Performing login...");
        loginPage = new LoginPage(driver);
        loginUserPage = new LoginUserPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("loginMobileNumber"));
        loginPage.clickOnContinue();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        loginPage.enterPassword(ConfigUatReader.getProperty("loginPassword"));
        loginUserPage.loginButton();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        System.out.println("Login successful.");
    }

    private boolean isUserAlreadyLoggedIn() {
        try {
            // Check for an element that only appears when logged in
            //return driver.findElementById("com.your.app:id/home_screen_element").isDisplayed();
            return driver.findElement(By.xpath("//android.widget.TextView[@text=\"Explore\"]")).isDisplayed();
        } catch (Exception e) {
            return false; // If the element is not found, assume user is logged out
        }
    }

    private void selectGuestUser() {
        System.out.println("Selecting Guest User option...");
        try {
            driver.findElement(By.xpath("//android.view.View[@resource-id=\"a\"]")).click();
            ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
            System.out.println("Guest User mode activated.");
        } catch (Exception e) {
            System.out.println("Failed to select Guest User: " + e.getMessage());
        }
    }
}
