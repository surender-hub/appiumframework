package tests.functionalTestCases;

import base.BaseSuper;
import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;

public class GuestUserHomePageTest extends BaseSuper {

    private WelcomePage welcomePage;
    private BookPage bookPage;
    private ThreadWaitClass threadWaitClass;

    @Test(priority = 6, description = "TC_01 - Verify the My Trips button is Displayed or not ")
    @Description("Verify  My Trips button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Guest User should be able to  see the My Trips button")
    public void verifyMyTripsButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
//        welcomePage.clickLoginAsQuest();
        bookPage.displayMyTripButton();
    }

    @Test(priority = 7, description = "TC_02 - Verify the My Trips button is enabled or not ")
    @Description("Verify My Trips button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the My Trips button is enabled for Guest user.")
    public void verifyMyTripsButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.enabledMyTripButton();

    }

    @Test(priority = 8, description = "TC_003 - Verify the Book button is Working or not ")
    @Description("Verify  Book button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Book button is Clickable for the Guest user")
    public void verifyMyTripsButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.clickMyTripButton();


    }

    @Test(priority = 9, description = "TC_004 - Verify the Book button is Displayed or not ")
    @Description("Verify  Book button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Guest User should be able to  see the Book button")
    public void verifyBookButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.displayBookButton();


    }

    @Test(priority = 10, description = "TC_005 - Verify the Book button is enabled or not ")
    @Description("Verify   Book button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Book button is enabled for Guest user.")
    public void verifyBookButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.enabledBookButton();
    }

    @Test(priority = 11, description = "TC_006 - Verify the Book button is Working or not ")
    @Description("Verify   Book button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Book button is Clickable for the Guest user")
    public void verifyBookButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.clickBookButton();
    }

    @Test(priority = 12, description = "TC_007 - Verify the Check-In button is Displayed or not ")
    @Description("Verify   Check-In  button is visible for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Guest User should be able to  see the Check-In  button")
    public void verifyCheckInButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayCheckInButton();

    }

    @Test(priority = 13, description = "TC_008 - Verify the Check-In button is enabled or not ")
    @Description("Verify  Check-In button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify the Check-In button is enabled for Guest user")
    public void verifyCheckInButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.enabledCheckInButton();
    }


    @Test(priority = 14, description = "TC_009 - Verify the Check-In button is Working or not ")
    @Description("Verify  Check-In  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Check-In  button is Clickable for the Guest user or not ")
    public void verifyCheckInButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.clickCheckInButton();

    }


    @Test(priority = 15, description = "TC_0010 - Verify the Profile button is Displayed or not ")
    @Description("Verify  Profile button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Guest User should be able to  see the Profile  button")
    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.displayProfileButton();

    }

    @Test(priority = 16, description = "TC_0011 - Verify the Profile button is enabled or not ")
    @Description("Verify Profile button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Profile button is enabled for Guest user.or not ")
    public void verifyProfileButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.enabledProfileButton();
    }

    @Test(priority = 17, description = "TC_0012 - Verify the Profile button is Working or not ")
    @Description("Verify Profile button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Profile  button is Clickable for the Guest user or not ")
    public void verifyProfileButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.verifyQuestProfileButton();

    }


    @Test(priority = 18, description = "TC_0013 - Verify the Explore button is Displayed or not ")
    @Description("Verify Explore button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Guest User should be able to  see the  Explore button")
    public void verifyExploreButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayExploreButton();
    }

    @Test(priority = 19, description = "TC_0014 - Verify the Explore button is enabled or not ")
    @Description("Verify Explore button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Explore button is enabled for Guest user.or not ")
    public void verifyExploreButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.enabledExploreButton();
    }

    @Test(priority = 20, description = "TC_0015 - Verify the Explore button is Working or not ")
    @Description("Verify  Explore  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Explore  button is Clickable for the Guest user or not ")
    public void verifyExploreButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.clickExploreButton();

    }


  /*  @Test(groups = {"regression"},priority = 1, description = "TC_001 -Validate the Terms And Condition Link in Working or not ")
    @Description("Validate the Terms And Condition Link in Working or not")
    @Feature("GuestUser")
    public void validateTermsAndConditionLink() throws InterruptedException{
        TermsAndConditionPage termsAndConditionPage = new TermsAndConditionPage(driver);
        termsAndConditionPage.validateTermsAndConditionsLink();
    }



        @Test(priority = 2, description = "TC_001 - Verify the Privacy Policy link is Displayed or not ",groups = {"regression"})
        @Description("Verify  Privacy Policy link is visible for  Guest user ")
        @Severity(SeverityLevel.NORMAL)
        @Feature("HomePage")
        @Story("Guest User should be able to  see the Privacy Policy link ")
        public void verifyPrivacyPolicylinkIsDisplayed()
        {
            PrivacyPolicyPage policyPage = new PrivacyPolicyPage(driver);
            policyPage.displayPrivacyPolicy();
        }

        @Test(priority = 3, description = "TC_002 - Verify the Privacy Policy link is Working or not ",groups = {"regression"})
        @Description("Verify  Privacy Policy link is Working for Guest user ")
        @Severity(SeverityLevel.NORMAL)
        @Feature("HomePage")
        @Story("Guest User should be able to  Click on the Privacy Policy link ")
        public void verifyPrivacyPolicyLinkIsWorking() throws InterruptedException {
            PrivacyPolicyPage policyPage = new PrivacyPolicyPage(driver);
            policyPage.clickPrivacyPolicyLink();
        }


    @Test(priority = 4, groups = {"smoke"}, description = "TC_01 - Verify the Continue as Quest Link is Displayed or not ")
    @Description("Verify Continue as Quest Link is visible for Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Guest User should be able to see the Continue as Quest Link ")
    public void verifyContinueAsQuestLinkDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayLoginAsQuestLink();
    }


    @Test(priority = 5, groups = {"smoke","regression"}, description = "TC_02 - Verify the  Quest User Link is Working or not ")
    @Description("Verify Quest User Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Quest User Link is Working for the Guest user or not ")
    public void workingQuestUserLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workingQuestUserLink();
    }*/
}
//}



