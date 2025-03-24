package tests;

import base.BaseSuper;
import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.WelcomePage;

public class GuestUserProfilePageTest extends BaseSuper {
    private WelcomePage welcomePage;
    private ProfilePage profilePage;
    private ThreadWaitClass threadWaitClass;


    @Test(priority = 1, description = "TC_01 - Verify the Profile button is Displayed or not ")
    @Description("Verify  Profile button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Guest User should be able to  see the Profile  button")
    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.displayProfileButton();

    }

    @Test(priority = 2, description = "TC_02 - Verify the Profile button is enabled or not ")
    @Description("Verify Profile button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Profile button is enabled for Guest user.or not ")
    public void verifyProfileButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.enabledProfileButton();
    }

    @Test(priority = 3, description = "TC_03 - Verify the Profile button is Working or not ")
    @Description("Verify Profile button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Profile  button is Clickable for the Guest user or not ")
    public void verifyProfileButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage = new ProfilePage(driver);
        profilePage.verifyQuestProfileButton();
    }
    @Test(priority = 4, description = "TC_04 - Verify the About Us is Displayed or not ")
    @Description("Verify About Us is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Guest User should be able to  see the About Us  button")
    public void verifyAboutUsLinkIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.displayAboutUs();
    }

    @Test(priority = 5, description = "TC_05 - Verify the About Us is enabled or not ")
    @Description("Verify About Us is enabled for Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the About Us is enabled for Guest user.or not ")
    public void verifyAboutUsIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.enabledAboutUs();
    }

    @Test(priority = 6, description = "TC_06 - Verify the About Us is Working or not ")
    @Description("Verify About Us is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the About Us is Clickable for the Guest user or not ")
    public void verifyWorkingAboutUsLinkIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.workingAboutUsButton();
    }

    @Test(priority = 7, description = "TC_07 - Verify the Indigo Blue chip is Displayed or not ")
    @Description("Verify Indigo Blue chip is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Guest User should be able to  see the Indigo Blue chip Link")
    public void verifyIndigoBlueChipLinkIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.displayIndigoBlueChip();
    }

    @Test(priority = 8, description = "TC_08 - Verify the Indigo Blue chip Link  is enabled or not ")
    @Description("Verify Indigo Blue chip is enabled for Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Indigo Blue chip is enabled for Guest user.or not ")
    public void verifyIndigoBlueChipEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
       // welcomePage.clickLoginAsQuest();
        profilePage.enabledIndigoBlueChip();
    }
    @Test(priority = 9, description = "TC_09 - Verify the Indigo Blue Chip Link is Working or not ")
    @Description("Verify Indigo Blue Chip is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Indigo Blue Chip is Clickable for the Guest user or not ")
    public void verifyIndigoBlueChipLinkIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
       //welcomePage.clickLoginAsQuest();
        profilePage.workingAboutIndigoBlueChipLink();
    }


//    @Test(priority = 10, description = "TC_010 - Verify the Flight Status Link is Displayed or not ")
//    @Description("Verify Flight Status Link is visible for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("ProfilePage")
//    @Story("Guest User should be able to  see the Flight Status Link ")
//    public void verifyMyScratchCardLinkIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        profilePage=new ProfilePage(driver);
//        //welcomePage.clickLoginAsQuest();
//        profilePage.displayScratchCard();
//    }
//
//    @Test(priority = 11, description = "TC_011 - Verify the Flight Status Link  is enabled or not ")
//    @Description("Verify Flight Status Link enabled for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("ProfilePage")
//    @Story("Guest User should be able to see the Flight Status Link")
//    public void verifyMyScratchCardLinkIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        profilePage=new ProfilePage(driver);
//        //welcomePage.clickLoginAsQuest();
//        profilePage.enabledScratchCard();
//    }
//
//    @Test(priority = 12, description = "TC_012 - Verify the Flight Status Link is Working or not ")
//    @Description("Verify Flight Status Link is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("ProfilePage")
//    @Story("Verify whether the Flight Status Link is Clickable for the Guest user or not ")
//    public void verifyMyScratchCardLinkIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        profilePage=new ProfilePage(driver);
//        //welcomePage.clickLoginAsQuest();
//        profilePage.workingScratchCardLink();
//    }



    @Test(priority = 13, description = "TC_013 - Verify the Flight Status link is Display or not ")
    @Description("Verify Flight Status link  is Display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status link  is Display for the Guest user or not ")
    public void verifyFlightStatusLinkIsDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.displayFlightStatus();
    }

    @Test(priority = 14, description = "TC_14 - Verify the Flight Status Link  is enabled or not ")
    @Description("Verify Flight Status Link enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Guest User should be able to see the Flight Status Link")
    public void verifyFlightStatusLinkIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage = new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.enabledFlightStatus();
    }

    @Test(priority = 15, description = "TC_15 - Verify the Flight Status Link is Working or not ")
    @Description("Verify Flight Status Link is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status Link is Clickable for the Guest user or not ")
    public void verifyFlightStatusLinkIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
//        welcomePage.clickLoginAsQuest();
        profilePage.workingFlightStatus();
    }


    @Test(priority = 16, description = "TC_16 - Verify the Flight Status link is Display or not ")
    @Description("Verify Flight Status link  is Display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status link  is Display for the Guest user or not ")
    public void verifyHelpAndFaqLinkIsDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.displayHelpAndFAQ();
    }

    @Test(priority = 17, description = "TC_17 - Verify the HelpAndFAQ Link  is enabled or not ")
    @Description("Verify HelpAndFAQ Link enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Guest User should be able to see the HelpAndFAQ Link")
    public void verifyHelpAndFAQIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage = new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.enabledHelpAndFAQ();
    }


    @Test(priority = 18, description = "TC_18 - Verify the HelpAndFAQs Link is Working or not ")
    @Description("Verify HelpAndFAQS Link is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the HelpAndFAQs Link is Clickable for the Guest user or not ")
    public void verifyHelpAndFAQLinkIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
       //welcomePage.clickLoginAsQuest();
        profilePage.workingHelpAndFaq();
    }

    @Test(priority = 19, description = "TC_19 - Verify the Flight Status link is Display or not ")
    @Description("Verify Flight Status link  is Display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status link  is Display for the Guest user or not ")
    public void verifyContactUsLinkIsDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.displayContactUs();
    }


    @Test(priority = 20, description = "TC_20 - Verify the ContactUs Link  is enabled or not ")
    @Description("Verify ContactUs Link enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Guest User should be able to see the ContactUs Link")
    public void verifyContactUsIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage = new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.enabledContactUs();
    }


    @Test(priority = 21, description = "TC_21 - Verify the ContactUs Link is Working or not ")
    @Description("Verify ContactUs Link is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the ContactUs Link is Clickable for the Guest user or not ")
    public void verifyContactUsLinkIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
//        welcomePage.clickLoginAsQuest();
        profilePage.workingContactUs();
    }
}
