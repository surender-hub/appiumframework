package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.AllureUtils;
import utils.ConfigReader;
import utils.ListenerImplement;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.logging.LogManager;
import java.util.logging.Logger;


@Listeners(utils.ListenerImplement.class)

public class BaseTest extends ListenerImplement
{
    @BeforeSuite
    public void setupSuite() {
        //System.out.println("Test Suite Setup - Run Once Before Suite");
    }

    public static AndroidDriver driver;
    @BeforeMethod
    public void setup() throws MalformedURLException {
        // Use UiAutomator2Options instead of DesiredCapabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path"));
        options.setAutoGrantPermissions(true);
        // Initialize the driver
        try {
            driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
            String currentPackage = driver.getCurrentPackage();
            driver.activateApp(currentPackage);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        } catch (MalformedURLException e) {
            e.printStackTrace();
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

    @AfterMethod
    public void tearDown() throws InterruptedException {

        if (driver != null) {

            String currentPackage = driver.getCurrentPackage();
            driver.terminateApp(currentPackage);
            Thread.sleep(5000);
            //driver.activateApp(currentPackage);
            driver.quit();
            System.out.println("Close the Session");
        }

    }

    @AfterSuite
    public void cleanupSuite() {
        //System.out.println("Test Suite Cleanup - Run Once After Suite");
    }

}