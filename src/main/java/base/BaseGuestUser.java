package base;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.*;
        import utils.ConfigReader;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseGuestUser {

    public static AndroidDriver driver;
    public static UiAutomator2Options options;
    private static AppiumDriverLocalService service;
    //private static final String APP_PACKAGE = "in.goindigo.android.uat";
    private static final String APP_PACKAGE = "in.goindigo.android";

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
    public void setup() throws MalformedURLException {
        System.out.println("Initializing Appium session...");

        options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setCapability("appPackage", APP_PACKAGE);         // Your App's Package Name
        // options.setApp(ConfigReader.getProperty("app.path.UAT"));
        options.setAutoGrantPermissions(true);
        options.setNoReset(true);  // Preserve session
        options.setFullReset(false);

        if (driver == null) {
            driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        if (driver.isAppInstalled(APP_PACKAGE)) {
            System.out.println("App is already installed.");
            driver.activateApp(APP_PACKAGE);
            System.out.println("App reactivated: " + APP_PACKAGE);
        } else {
            System.out.println("App launching for the first time...");
        }
    }

    @BeforeMethod
    public void resumeApp() {
        System.out.println("Resuming app for next test case...");
        try {
            driver.activateApp(APP_PACKAGE);
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
}
