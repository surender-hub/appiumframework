package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
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


    @Test(priority = 1, description = "TC_001 -Registration page", retryAnalyzer = RetryAnalyzer.class)
    @Description("Select Male radio button and check it is selected")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Male radio button is selected")
    @Story("Verify Male radio Button is working fine")
    public void testMaleRadioButtons() {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        loginPage.enterMobileNumber("7820079798");
        loginPage.clickOnContinue();
        registrationPage.clickOnMaleRadio();
        Assert.assertTrue(registrationPage.isMaleSelected(), "Male radio button should be selected");
    }
}