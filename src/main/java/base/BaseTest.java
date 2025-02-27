package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.AllureUtils;
import utils.ConfigReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.logging.LogManager;
import java.util.logging.Logger;


//@Listeners(utils.ListenerImplement.class)

public class BaseTest {
    @BeforeSuite
    public void setupSuite() {
        //System.out.println("Test Suite Setup - Run Once Before Suite");
    }

    public static AndroidDriver driver;
    private static AppiumDriverLocalService service;


    @BeforeClass
    public void startAppiumServer() {
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")) // Update Appium Path
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withTimeout(Duration.ofSeconds(300)) // Ensure server doesn't time out
                .build();
        service.start();
        System.out.println("✅ Appium server started.");
    }


    @BeforeMethod
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path"));
        //options.setApp(ConfigReader.getProperty("app.path2"));
        options.setAutoGrantPermissions(true);
        options.setNewCommandTimeout(Duration.ofSeconds(300)); // Prevent session timeout

        // Initialize the driver
        driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
        System.out.println("✅ AndroidDriver initialized.");

        // Get and activate the current package
        String currentPackage = driver.getCurrentPackage();
        driver.activateApp(currentPackage);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException {
        if (result.getStatus() == ITestResult.FAILURE) {
            // Implement screenshot capture if needed (AllureUtils or another utility)
            System.out.println("❌ Test Failed - Implement screenshot capture here.");
        }

        if (BaseTest.driver != null) {
            String currentPackage = BaseTest.driver.getCurrentPackage();
            BaseTest.driver.terminateApp(currentPackage);
            System.out.println("🛑 Terminated App: " + currentPackage);
            Thread.sleep(5000);
            BaseTest.driver.quit();
            System.out.println("🚪 Closed the session.");
        }
    }

    @AfterClass
    public void stopAppiumServer() {
        if (BaseTest.service != null) {
            BaseTest.service.stop();
            System.out.println("🛑 Appium server stopped.");
        }

    }

//        AndroidDriver driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
//        System.out.println("Driver initiate" +driver);
//        String currentPackage = driver.getCurrentPackage();
//        System.out.println("Current App Package: " + currentPackage);
}
//
//    @BeforeMethod
//    public void beforeTestMethod() {
//        System.out.println("Before Each Test - Run Before Every Test Case");
//    }
//
//    @AfterMethod
//    public void afterTestMethod() {
//        System.out.println("After Each Test - Run After Every Test Case");
//    }


 /*   @AfterClass
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            AllureUtils.takeScreenshot(driver);
        }
        if (driver != null) {
           // in.goindigo.android.uat
            //surender@gmail.com
            driver.quit();
        }
    }*/

