package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ElementUtils;

public class LoginTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    LoginPage loginPage;
    private AndroidDriver driver;
    private ElementUtils elementUtils;


    public LoginTest(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Test(priority = 1, description = "TC_001 -Login page")
    @Description("Check Login functionality with OTP")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Login Functionality")
    @Story("New login from 6E user")
    public void login6eUser() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber("");
        loginPage.clickOnContinue();
        loginPage.enterPassword("");


        //loginPage.clickOnVerifyButton();




    }
}
