package tests.functionalTestCases;

import base.BaseSuper;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigUatReader;
import utils.ElementUtils;

public class LoginTest extends BaseSuper {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    LoginPage loginPage;
    private ElementUtils elementUtils;
    String expectedText = "INDIGO BLUCHIP";


    @Test(priority = 1, description = "TC_001 - Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Enter Valid Mobile Number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid Mobile Number feature")
    @Story("Enter valid mobile number and click on Continue button")
    public void testEnterValidMobileNumberAndContinue() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        // loginPage.enterPassword("Bhagatsingh@1");
        loginPage.clickOnContinue();
        loginPage.verifyElementTextVisibility();
    }

/*    @Test(priority = 2, description = "TC_002 -Login page", groups = {"smoke"})
    @Description("Enter Valid Email address")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid email feature")
    @Story("Enter valid email  and click on Continue button")
    public void testEnterValidEmailAndContinue() {
        loginPage = new LoginPage(driver);
        loginPage.enterValidEmailAddress(ConfigUatReader.getProperty("username"));
        loginPage.clickOnContinue();
        loginPage.verifyElementTextVisibility();
    }*/

    @Test(priority = 3, description = "TC_003 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Enter Invalid Mobile number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check invalid mobile number")
    @Story("Enter Invalid mobile number  and check error message is displayed")
    public void testInvalidMobileNumber() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("wrongMobileNumber"));
        loginPage.verifyInvalidNumberMessage();
    }

    @Test(priority = 4, description = "TC_004 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Enter Invalid email address")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check invalid email address")
    @Story("Enter Invalid email address   and check error message is displayed")
    public void testInvalidEmailFormat() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("invalidUsername"));
        loginPage.verifyInvalidEmailMessage();
    }

    @Test(priority = 5, description = "TC_005 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Click Terms and Condition link text is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check button displaying")
    @Story("Verify terms and condition link text displaying")
    public void checkTermAndCondDisplayed() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnTermsAndConditionButton();
        //loginPage.verifyTextInWebView();
    }

    @Test(priority = 6, description = "TC_006 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Click Terms and Condition link text")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check button clicking")
    @Story("Verify terms and condition link text clicked and redirected to Next screen")
    public void testTermsAndConditionsLink() {
        loginPage = new LoginPage(driver);
        loginPage.verifyTextInWebView();
    }

    @Test(priority = 7, description = "TC_007 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Privacy Text displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check privacy policy displaying")
    @Story("Verify privacy policy button displayed")
    public void verifyPrivacyText() {
        loginPage = new LoginPage(driver);
        loginPage.verifyPrivacyT();
    }

    @Test(priority = 7, description = "TC_007 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Privacy Text clickable")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check privacy policy clickable")
    @Story("Verify privacy policy button is clickable")
    public void verifyPrivacyTextClickable() {
        loginPage = new LoginPage(driver);
        loginPage.verifyPrivacyTClickable();

    }

}


