package tests.functionalTestCases;

import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.BookPage;
import pages.ProfilePage;
import pages.WelcomePage;

public class LoginUserHomePageTest extends BaseTestLoginUser {

    private WelcomePage welcomePage;
    private BookPage bookPage;
    private ThreadWaitClass threadWaitClass;

    @Test(priority = 1, description = "TC_01 - Verify the My Trips button is Displayed or not ")
    @Description("Verify  My Trips button is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Login User should be able to  see the My Trips button")
    public void verifyMyTripsButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        welcomePage.clickLoginAsQuest();
        bookPage.displayMyTripButton();
    }

    @Test(priority = 2, description = "TC_02 - Verify the My Trips button is enabled or not ")
    @Description("Verify My Trips button is enabled for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the My Trips button is enabled for Login user.")
    public void verifyMyTripsButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.enabledMyTripButton();

    }

    @Test(priority = 3, description = "TC_003 - Verify the Book button is Working or not ")
    @Description("Verify  Book button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Book button is Clickable for the Login user")
    public void verifyMyTripsButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.clickMyTripButton();


    }

    @Test(priority = 4, description = "TC_004 - Verify the Book button is Displayed or not ")
    @Description("Verify  Book button is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Login User should be able to  see the Book button")
    public void verifyBookButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.displayBookButton();


    }

    @Test(priority = 5, description = "TC_005 - Verify the Book button is enabled or not ")
    @Description("Verify   Book button is enabled for  Login user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Book button is enabled for Login user.")
    public void verifyBookButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.enabledBookButton();
    }

    @Test(priority = 6, description = "TC_006 - Verify the Book button is Working or not ")
    @Description("Verify   Book button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Book button is Clickable for the Login user")
    public void verifyBookButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.clickBookButton();
    }

    @Test(priority = 7, description = "TC_007 - Verify the Check-In button is Displayed or not ")
    @Description("Verify   Check-In  button is visible for  Login user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to  see the Check-In  button")
    public void verifyCheckInButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayCheckInButton();

    }

    @Test(priority = 8, description = "TC_008 - Verify the Check-In button is enabled or not ")
    @Description("Verify  Check-In button is enabled for  Login user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify the Check-In button is enabled for Login user")
    public void verifyCheckInButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.enabledCheckInButton();
    }


    @Test(priority = 9, description = "TC_009 - Verify the Check-In button is Working or not ")
    @Description("Verify  Check-In  button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Check-In  button is Clickable for the Login user or not ")
    public void verifyCheckInButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.clickCheckInButton();

    }


    @Test(priority = 10, description = "TC_0010 - Verify the Profile button is Displayed or not ")
    @Description("Verify  Profile button is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to  see the Profile  button")
    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.displayProfileButton();

    }

    @Test(priority = 11, description = "TC_0011 - Verify the Profile button is enabled or not ")
    @Description("Verify Profile button is enabled for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Profile button is enabled for Login user.or not ")
    public void verifyProfileButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.enabledProfileButton();
    }

    @Test(priority = 12, description = "TC_0012 - Verify the Profile button is Working or not ")
    @Description("Verify Profile button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Profile  button is Clickable for the Login user or not ")
    public void verifyProfileButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.verifyQuestProfileButton();

    }


    @Test(priority = 13, description = "TC_0013 - Verify the Explore button is Displayed or not ")
    @Description("Verify Explore button is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to  see the  Explore button")
    public void verifyExploreButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayExploreButton();
    }

    @Test(priority = 14, description = "TC_0014 - Verify the Explore button is enabled or not ")
    @Description("Verify Explore button is enabled for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Explore button is enabled for Login user.or not ")
    public void verifyExploreButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.enabledExploreButton();
    }

    @Test(priority = 15, description = "TC_0015 - Verify the Explore button is Working or not ")
    @Description("Verify  Explore  button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Explore  button is Clickable for the Login user or not ")
    public void verifyExploreButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.clickExploreButton();

    }

}
//}



