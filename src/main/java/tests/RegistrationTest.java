package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.RetryAnalyzerLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LoginUserPage;
import pages.RegistrationPage;
import pages.SearchPage;
import utils.ElementUtils;

public class RegistrationTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginUser.class);
    private ElementUtils elementUtils;
    public LoginUserPage loginUserPage;
    public LoginPage loginPage;
    public RegistrationPage registrationPage;
    public SearchPage searchPage;


    @Test(priority = 1, description = "TC_001 -Registration page", groups = { "smoke" })
    @Description("Select first name and enter valid first name")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid First Name must be enter")
    @Story("Verify valid first name enter and no error message is displayed")
    public void testValidFirstName() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber("7820079798");
        loginPage.clickOnContinue();
        registrationPage.enterFirstName("surender");
    }
    @Test(priority = 2, description = "TC_002 -Registration page", groups = { "smoke" })
    @Description("Select last name and enter Invalid last name")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check valid last Name")
    @Story("Verify valid last name enter and no error message will be displayed")
    public void testValidLastName() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber("7820079798");
        loginPage.clickOnContinue();
        registrationPage.enterValidLastName("pal");
    }

    @Test(priority = 3, description = "TC_003 -Registration page", groups = { "smoke" })
    @Description("Select dob and enter valid dob")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check valid dob and no error message will be displayed.")
    @Story("Verify valid dob and no error message will be displayed")
    public void testValidDob() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber("7820079798");
        loginPage.clickOnContinue();
        registrationPage.enterValidDob("01-01-1991");
        registrationPage.checkValidDateOfBirth();
    }

    @Test(priority = 4, description = "TC_004 -Registration page", groups = { "smoke" })
    @Description("Select dob  and enter Invalid dob")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Invalid dob and  displayed error message.")
    @Story("Verify Invalid dob and  error message will be displayed")
    public void testInvalidDob() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber("7820079798");
        loginPage.clickOnContinue();
        registrationPage.enterInvalidDob("19-93-1333");
    }

   /* @Test(priority = 5, description = "TC_005 -Registration page", retryAnalyzer = RetryAnalyzer.class)
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