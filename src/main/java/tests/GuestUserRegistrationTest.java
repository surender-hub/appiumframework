package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LoginUserPage;
import pages.RegistrationPage;
import pages.SearchPage;
import utils.ConfigUatReader;
import utils.ElementUtils;

public class GuestUserRegistrationTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginUserDummy.class);
    private ElementUtils elementUtils;
    public LoginUserPage loginUserPage;
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public SearchPage searchPage;

    @Test(priority = 1, description = "TC_001 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Select first name and enter valid first name")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid First Name must be enter")
    @Story("Verify valid first name enter and no error message is displayed")
    public void testValidFirstName() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.enterFirstName(ConfigUatReader.getProperty("firstname"));
    }
    @Test(priority = 2, description = "TC_002 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Select last name and enter Invalid last name")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check valid last Name")
    @Story("Verify valid last name enter and no error message will be displayed")
    public void testValidLastName() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.enterValidLastName(ConfigUatReader.getProperty("lastName"));
    }

    @Test(priority = 3, description = "TC_003 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Select dob and enter valid dob")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check valid dob and no error message will be displayed.")
    @Story("Verify valid dob and no error message will be displayed")
    public void testValidDob() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.enterValidDob(ConfigUatReader.getProperty("validDob"));
        registrationPage.checkValidDateOfBirth();
    }

    @Test(priority = 4, description = "TC_004 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Select dob  and enter Invalid dob")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Invalid dob and  displayed error message.")
    @Story("Verify Invalid dob and  error message will be displayed")
    public void testInvalidDob() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.enterInvalidDob(ConfigUatReader.getProperty("invalidDob"));
    }

    @Test(priority = 5, description = "TC_005 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Male Radio Button is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Male Radio button is visible on screen")
    @Story("Verify Male Radio button is showing after redirect to Registration screen")
    public void checkMaleRadioButton() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyMaleRadioButton();
    }
    @Test(priority = 6, description = "TC_006 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Male Text is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Male text is visible on screen")
    @Story("Verify Male Text is showing after redirect to Registration screen")
    public void checkMaleText() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyMaleText();
    }
    @Test(priority = 7, description = "TC_007 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Female Radio Button is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Female Radio button is visible on screen")
    @Story("Verify Female Radio Button is showing after redirect to Registration screen")
    public void checkFemaleRadioButton() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyFemaleRadioButton();
    }
    @Test(priority = 8, description = "TC_008 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Female Text is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Female text is visible on screen")
    @Story("Verify Female Text is showing after redirect to Registration screen")
    public void checkFemaleText() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyFemaleText();
    }

    @Test(priority = 9, description = "TC_009 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Tnc Text is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check TNC text is visible")
    @Story("Verify TNC Text is showing after redirect to Registration screen")
    public void verifyLinkTextTnc() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyLinkTextTnc();
    }

    @Test(priority = 10, description = "TC_010 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Tnc Text is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check TNC text is visible")
    @Story("Verify TNC Text is showing after redirect to Registration screen")
    public void verifyLinkTextTncClickable() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyLinkTextTncIsClickable();
    }



    @Test(priority = 11, description = "TC_011 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check PrivacyPolicy Text is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check PrivacyPolicy text is visible")
    @Story("Verify PrivacyPolicy Text is showing after redirect to Registration screen")
    public void verifyLinkTextPrivacyPolicy() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyLinkTextPrivacy();
    }

    @Test(priority = 12, description = "TC_012 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check PrivacyPolicy Text is Clickable or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check PrivacyPolicy text is clickable")
    @Story("Verify Privacy Policy Text is showing after Clicking on Link text")
    public void verifyLinkTextPrivacyPolicyIsClickable() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyLinkTextPrivacyIsClickable();
    }


    @Test(priority = 13, description = "TC_013 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check T&C Text is displayed or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check T&C text is visible")
    @Story("Verify PrivacyPolicy Text is showing after redirect to Registration screen")
    public void verifyLinkTextTc() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyLinkTextTc();
    }

    @Test(priority = 14, description = "TC_014 -Registration page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check T&C Text is Clickable or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check T&C text is clickable")
    @Story("Verify Privacy Policy Text is showing after Clicking on Link text")
    public void verifyLinkTextTcIsClickable() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        loginPage.clickOnContinue();
        registrationPage.verifyLinkTextTcIsClickable();
    }


   /* @Test(priority = 5, description = "TC_005 -Registration page")
    @Description("Select Radio button")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check radio button is selected.")
    @Story("Verify radio button is slected")
    public void testRadioButtonSelected() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber("7820079798");
        loginPage.clickOnContinue();
        registrationPage.checkMaleRadioButton();
    }*/
}