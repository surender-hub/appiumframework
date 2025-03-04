package base;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.*;
import utils.ConfigReader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


//@Listeners(utils.ListenerImplement.class)

public class BaseTestLoginUser {

    public static AndroidDriver driver;
    private static AppiumDriverLocalService service;

    @BeforeSuite
    public void setup() throws MalformedURLException {
        // Start Appium Server
        service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")) // Update Appium Path
                .withIPAddress(ConfigReader.getProperty("appium.ip"))
                .usingPort(Integer.parseInt(ConfigReader.getProperty("appium.port")))
                .build();
        service.start();
        System.out.println("✅ Appium server started.");

        // Set up driver options
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path"));
        options.setAutoGrantPermissions(true);
        // Initialize the driver
        driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
        System.out.println("✅ AndroidDriver initialized.");

        // Get and activate the current package
        String currentPackage = driver.getCurrentPackage();
        System.out.println("Current App package name: " + currentPackage);
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        driver.activateApp(currentPackage);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @AfterSuite
    public void tearDown() throws InterruptedException {
        System.out.println("🔻 Starting TearDown Process 🔻");

        if (driver != null) {
            String currentPackage = driver.getCurrentPackage();
            driver.terminateApp(currentPackage);
            System.out.println("🛑 Terminated App: " + currentPackage);

            ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
            driver.quit();
            System.out.println("🚪 Closed the session.");
        }

        // Stop Appium after each test
        if (service != null && service.isRunning()) {
            service.stop();
            System.out.println("🛑 Appium server stopped after test.");
        }
        System.out.println("✅ TearDown Completed!");
    }

}
