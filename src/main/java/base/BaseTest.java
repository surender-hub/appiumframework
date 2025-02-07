package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
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
    public static AppiumDriver driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        // Use UiAutomator2Options instead of DesiredCapabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path"));
        options.setAutoGrantPermissions(true);
        // Initialize the driver
        try {

            driver = new AppiumDriver(new URL(ConfigReader.getProperty("appium.server")), options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println("Driver initiate" +driver);
    }


    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            AllureUtils.takeScreenshot(driver);
        }
        if (driver != null) {
            //driver.quit();
        }
    }

}