package tests;

import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.WelcomePage;

public class LoginProfile extends BaseTestLoginUser {

    private WelcomePage welcomePage;
    private ProfilePage profilePage;
    private ThreadWaitClass threadWaitClass;


    @Test(priority = 1, description = "TC_01 - Verify the Profile button is Displayed or not ")
    @Description("Verify  Profile button is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to  see the Profile  button")
    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        welcomePage.loginByOtp();
        profilePage.displayProfileButton();
    }


    @Test(priority = 2, description = "TC_02 - Verify the Profile button is enabled or not ")
    @Description("Verify Profile button is enabled for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Profile button is enabled for Login user.or not ")
    public void verifyProfileButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.enabledProfileButton();
    }

    @Test(priority = 3, description = "TC_03 - Verify the Profile button is Working or not ")
    @Description("Verify Profile button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Profile  button is Clickable for the Login user or not ")
    public void verifyProfileButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.clickProfileButton();
    }

    @Test(priority = 4, description = "TC_04 - Verify the About Us is Displayed or not ")
    @Description("Verify About Us is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to  see the About Us  button")
    public void verifyAboutUsLinkIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.displayAboutUs();
    }

    @Test(priority = 5, description = "TC_05 - Verify the About Us is enabled or not ")
    @Description("Verify About Us is enabled for Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the About Us is enabled for Login user.or not ")
    public void verifyAboutUsIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        profilePage.enabledAboutUs();
    }

    @Test(priority = 6, description = "TC_06 - Verify the About Us is Working or not ")
    @Description("Verify About Us is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the About Us is Clickable for the Login user or not ")
    public void verifyWorkingAboutUsLinkIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        profilePage=new ProfilePage(driver);
        profilePage.workingAboutUsButton();
    }

    @Test(priority = 7, description = "TC_07 - Verify the Indigo Blue chip is Displayed or not ")
    @Description("Verify Indigo Blue chip is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to  see the Indigo Blue chip Link")
    public void verifyIndigoBlueChipLinkIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.displayIndigoBlueChip();
    }

    @Test(priority = 8, description = "TC_08 - Verify the Indigo Blue chip Link  is enabled or not ")
    @Description("Verify Indigo Blue chip is enabled for Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Indigo Blue chip is enabled for Login user.or not ")
    public void verifyIndigoBlueChipEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        // welcomePage.clickLoginAsQuest();
        profilePage.enabledIndigoBlueChip();
    }
    @Test(priority = 9, description = "TC_09 - Verify the Indigo Blue Chip Link is Working or not ")
    @Description("Verify Indigo Blue Chip is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Indigo Blue Chip is Clickable for the Login user or not ")
    public void verifyIndigoBlueChipLinkIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.workingAboutIndigoBlueChipLink();
    }


    @Test(priority = 10, description = "TC_010 - Verify the My Scratch Card Link is Displayed or not ")
    @Description("Verify My Scratch Card Link is visible for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to  see the My Scratch Card Link ")
    public void verifyMyScratchCardLinkIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.displayScratchCard();
    }

    @Test(priority = 11, description = "TC_011 - Verify the My Scratch Card Link  is enabled or not ")
    @Description("Verify My Scratch Card Link enabled for  Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Login User should be able to see the My Scratch Card Link")
    public void verifyMyScratchCardLinkIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.enabledScratchCard();
    }

    @Test(priority = 12, description = "TC_012 - Verify the My Scratch Card Link is Working or not ")
    @Description("Verify My Scratch Card Link is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the My Scratch Card Link is Clickable for the Login user or not ")
    public void verifyMyScratchCardLinkIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoginAsQuest();
        profilePage.workingScratchCardLink();
    }
}





