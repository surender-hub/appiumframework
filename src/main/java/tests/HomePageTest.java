package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import utils.ElementUtils;

public class HomePageTest extends BaseTest {

    private WelcomePage welcomePage;
    private HomePage homePage;



    @Test(priority = 1, description = "TC_001 - Verify the My Trips button is Displayed or not ")
    @Description("Verify whether the My Trips button is visible for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the My Trips button")
    public void verifyMyTripsButtonIsDisplayed()
    {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.displayMyTripButton();

    }

    @Test(priority = 2, description = "TC_002 - Verify the My Trips button is enabled or not ")
    @Description("Verify whether the My Trips button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the My Trips button is enabled for Guest user.")
    public void verifyMyTripsButtonIsEnabled()
    {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.enabledMyTripButton();

    }
    @Test(priority = 3, description = "TC_002 - Verify the Book button is Working or not ")
    @Description("Verify whether the Book button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Book button is Clickable for the Guest user")
    public void verifyMyTripsButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.clickMyTripButton();


    }

    @Test(priority = 4, description = "TC_004 - Verify the Book button is Displayed or not ")
    @Description("Verify whether the Book button is visible for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the Book button")
    public void verifyBookButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.displayBookButton();
        Thread.sleep(5000);

    }

    @Test(priority = 5, description = "TC_005 - Verify the Book button is enabled or not ")
    @Description("Verify whether the Book button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Book button is enabled for Guest user.")
    public void verifyBookButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.enabledBookButton();
    }

    @Test(priority = 6, description = "TC_006 - Verify the Book button is Working or not ")
    @Description("Verify whether the Book button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Book button is Clickable for the Guest user")
    public void verifyBookButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.clickBookButton();
    }

    @Test(priority = 7, description = "TC_007 - Verify the Check-In button is Displayed or not ")
    @Description("Verify whether the Check-In  button is visible for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the Check-In  button")
    public void verifyCheckInButtonIsDisplayed()
    {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.displayCheckInButton();

    }

    @Test(priority = 8, description = "TC_008 - Verify the Check-In button is enabled or not ")
    @Description("Verify whether the Check-In button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Check-In button is enabled for Guest user.")
    public void verifyCheckInButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.enabledCheckInButton();
    }


    @Test(priority = 9, description = "TC_009 - Verify the Check-In button is Working or not ")
    @Description("Verify whether the Check-In  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Check-In  button is Clickable for the Guest user")
    public void verifyCheckInButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new HomePage(driver);
        welcomePage.clickLogin();
        homePage.clickCheckInButton();
        Thread.sleep(5000);
    }
}
