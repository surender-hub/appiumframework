package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.RetryAnalyzerLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ElementUtils;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    LoginPage loginPage;
    private ElementUtils elementUtils;
    String expectedText = "INDIGO BLUCHIP";


    @Test(priority = 1, description = "TC_001 - Login page")
    @Description("Enter Valid Mobile Number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid Mobile Number feature")
    @Story("Enter valid mobile number and click on Continue button")
    public void testEnterValidMobileNumberAndContinue() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber("8265858568");
        // loginPage.enterPassword("Bhagatsingh@1");
        loginPage.clickOnContinue();
        loginPage.verifyLoginOrPersonalInfoVisibility();
    }

    @Test(priority = 2, description = "TC_002 -Login page", retryAnalyzer = RetryAnalyzerLocal.class)
    @Description("Enter Valid Email address")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid email feature")
    @Story("Enter valid email  and click on Continue button")
    public void testEnterValidEmailAndContinue() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber("test@gmail.com");
        loginPage.clickOnContinue();
        loginPage.verifyLoginOrPersonalInfoVisibility();
    }

    @Test(priority = 3, description = "TC_003 -Login page")
    @Description("Enter Invalid Mobile number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check invalid mobile number")
    @Story("Enter Invalid mobile number  and check error message is displayed")
    public void testInvalidMobileNumber() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber("123");
        loginPage.verifyInvalidNumberMessage();
    }

    @Test(priority = 4, description = "TC_004 -Login page")
    @Description("Enter Invalid email address")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check invalid email address")
    @Story("Enter Invalid email address   and check error message is displayed")
    public void testInvalidEmailFormat() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber("test@gmail");
        loginPage.verifyInvalidEmailMessage();
    }

    @Test(priority = 5, description = "TC_005 -Login page")
    @Description("Click on continue as a guest button")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check button clicking")
    @Story("Verify continue as a guest button clicked and redirected to Next screen")
    public void testContinueAsGuest() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnContinueAsGuestButton();
        loginPage.verifyContinueButtonClicking();
    }

    @Test(priority = 6, description = "TC_006 -Login page")
    @Description("Click Terms and Condition link text")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check button clicking")
    @Story("Verify terms and condition link text clicked and redirected to Next screen")
    public void testTermsAndConditionsLink() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnTermsAndConditionButton();
        loginPage.verifyTextInWebView();
    }
}
