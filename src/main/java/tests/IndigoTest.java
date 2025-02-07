package tests;

//import base.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;

import utils.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IndigoTest {

    public AppiumDriver driver;

//    WelcomePage welcomePage = new WelcomePage(driver);
//    SearchPage searchPage = new SearchPage(driver);

    @Test
    public void testLogin() throws InterruptedException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName(ConfigReader.getProperty("platform.name"));
        options.setDeviceName(ConfigReader.getProperty("device.name"));
        options.setApp(ConfigReader.getProperty("app.path"));
        options.setAutoGrantPermissions(true);
        // Initialize the driver
        try {
//            PageFactory.initElements(driver,this);
            driver = new AndroidDriver(new URL(ConfigReader.getProperty("appium.server")), options);
            PageFactory.initElements(driver, this);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println("Driver initiate" + driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//android.view.View[@resource-id='a']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"To\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Search place/airport\"]")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Chhatrapati Shivaji Maharaj International Airport\"]")).click();

//        driver.findElement(By.xpath("//android.widget.TextView[@text="+futuredate+"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Chhatrapati Shivaji Maharaj International Airport\"]")).click();

        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Search\"]")).click();

        // searchPage.clickOnTo();
        // searchPage.searchPlace("Mumbai");

    }
}

