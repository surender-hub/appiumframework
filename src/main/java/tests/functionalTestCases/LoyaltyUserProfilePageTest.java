package tests.functionalTestCases;

import base.BaseSuper;
import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.WelcomePage;

public class LoyaltyUserProfilePageTest extends BaseSuper{

    private WelcomePage welcomePage;
    private ProfilePage profilePage;
    private ThreadWaitClass threadWaitClass;


    @Test(priority = 1, description = "TC_01 - Verify the Profile button is Displayed or not ")
    @Description("Verify  Profile button is visible for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to  see the Profile  button")
    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
//        welcomePage.loginByOtp();
        profilePage.displayProfileButton();
    }

    @Test(priority = 2, description = "TC_02 - Verify the Profile button is enabled or not ")
    @Description("Verify Profile button is enabled for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Profile button is enabled for Loyalty user.or not ")
    public void verifyProfileButtonIsEnabled() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.enabledProfileButton();
    }

    @Test(priority = 3, description = "TC_03 - Verify the Profile button is Working or not ")
    @Description("Verify Profile button is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Profile  button is Working for the Loyalty user or not ")
    public void verifyProfileButtonIsWorking() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.verifyLoginProfileButton();
    }

    @Test(priority = 4, description = "TC_04 - Verify the About Us is Displayed or not ")
    @Description("Verify About Us is visible for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to  see the About Us  button")
    public void verifyAboutUsLinkIsDisplayed() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.displayAboutUs();
    }

    @Test(priority = 5, description = "TC_05 - Verify the About Us is enabled or not ")
    @Description("Verify About Us is enabled for Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the About Us is enabled for Loyalty user.or not ")
    public void verifyAboutUsIsEnabled() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.enabledAboutUs();
    }

    @Test(priority = 6, description = "TC_06 - Verify the About Us is Working or not ")
    @Description("Verify About Us is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the About Us is Clickable for the Loyalty user or not ")
    public void verifyWorkingAboutUsLinkIsWorking() throws InterruptedException {
//        profilePage=new ProfilePage(driver);
        profilePage.workingAboutUsButton();
    }

    @Test(priority = 7, description = "TC_07 - Verify the Indigo Blue chip is Displayed or not ")
    @Description("Verify Indigo Blue chip is visible for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to  see the Indigo Blue chip Link")
    public void verifyIndigoBlueChipLinkIsDisplayed() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.displayIndigoBlueChip();
    }

    @Test(priority = 8, description = "TC_08 - Verify the Indigo Blue chip Link  is enabled or not ")
    @Description("Verify Indigo Blue chip is enabled for Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Indigo Blue chip is enabled for Loyalty user.or not ")
    public void verifyIndigoBlueChipEnabled() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        // welcomePage.clickLoyaltyAsQuest();
        profilePage.enabledIndigoBlueChip();
    }
    @Test(priority = 9, description = "TC_09 - Verify the Indigo Blue Chip Link is Working or not ")
    @Description("Verify Indigo Blue Chip is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Indigo Blue Chip is Clickable for the Loyalty user or not ")
    public void verifyIndigoBlueChipLinkIsWorking() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.workingIndigoBlueChipLink();
    }


    @Test(priority = 10, description = "TC_010 - Verify the My Scratch Card Link is Displayed or not ")
    @Description("Verify My Scratch Card Link is visible for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to  see the My Scratch Card Link ")
    public void verifyMyScratchCardLinkIsDisplayed() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.displayScratchCard();
    }

    @Test(priority = 11, description = "TC_011 - Verify the My Scratch Card Link  is enabled or not ")
    @Description("Verify My Scratch Card Link enabled for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to see the My Scratch Card Link")
    public void verifyMyScratchCardLinkIsEnabled() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.enabledScratchCard();
    }

    @Test(priority = 12, description = "TC_012 - Verify the My Scratch Card Link is Working or not ")
    @Description("Verify My Scratch Card Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the My Scratch Card Link is Clickable for the Loyalty user or not ")
    public void verifyMyScratchCardLinkIsWorking() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.workingScratchCardLink();
    }

    @Test(priority = 13, description = "TC_013 - Verify the Flight Status link is Display or not ")
    @Description("Verify Flight Status link  is Display for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status link  is Display for the Loyalty user or not ")
    public void verifyFlightStatusLinkIsDisplay() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.displayFlightStatus();
    }

    @Test(priority = 14, description = "TC_14 - Verify the Flight Status Link  is enabled or not ")
    @Description("Verify Flight Status Link enabled for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to see the Flight Status Link")
    public void verifyFlightStatusLinkIsEnabled() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.enabledFlightStatus();
    }

    @Test(priority = 15, description = "TC_15 - Verify the Flight Status Link is Working or not ")
    @Description("Verify Flight Status Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status Link is Clickable for the Loyalty user or not ")
    public void verifyFlightStatusLinkIsWorking() throws InterruptedException {
        profilePage=new ProfilePage(driver);
//        welcomePage.clickLoyaltyAsQuest();
        profilePage.workingFlightStatus();
    }


    @Test(priority = 16, description = "TC_16 - Verify the Flight Status link is Display or not ")
    @Description("Verify Flight Status link  is Display for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status link  is Display for the Loyalty user or not ")
    public void verifyHelpAndFaqLinkIsDisplay() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.displayHelpAndFAQ();
    }

    @Test(priority = 17, description = "TC_17 - Verify the HelpAndFAQ Link  is enabled or not ")
    @Description("Verify HelpAndFAQ Link enabled for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to see the HelpAndFAQ Link")
    public void verifyHelpAndFAQIsEnabled() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.enabledHelpAndFAQ();
    }


    @Test(priority = 18, description = "TC_18 - Verify the HelpAndFAQs Link is Working or not ")
    @Description("Verify HelpAndFAQS Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the HelpAndFAQs Link is Clickable for the Loyalty user or not ")
    public void verifyHelpAndFAQLinkIsWorking() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        //welcomePage.clickLoyaltyAsQuest();
        profilePage.workingHelpAndFaq();
    }

    @Test(priority = 19, description = "TC_19 - Verify the Flight Status link is Display or not ")
    @Description("Verify Flight Status link  is Display for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the Flight Status link  is Display for the Loyalty user or not ")
    public void verifyContactUsLinkIsDisplay() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.displayContactUs();
    }


    @Test(priority = 20, description = "TC_20 - Verify the ContactUs Link  is enabled or not ")
    @Description("Verify ContactUs Link enabled for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to see the ContactUs Link")
    public void verifyContactUsIsEnabled() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.enabledContactUs();
    }


    @Test(priority = 21, description = "TC_21 - Verify the ContactUs Link is Working or not ")
    @Description("Verify ContactUs Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the ContactUs Link is Clickable for the Loyalty user or not ")
    public void verifyContactUsLinkIsWorking() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.workingContactUs();
    }


    @Test(priority = 22, description = "TC_22 - Verify the My Nominees button is Display or not ")
    @Description("Verify My Nominees button  is Display for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the My Nominees link  is Display for the Loyalty user or not ")
    public void verifyMyNomineesIsDisplay() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.displayMyNominees();
    }


    @Test(priority = 23, description = "TC_23 - Verify the My Nominees Link  is enabled or not ")
    @Description("Verify My NomineesLink enabled for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to see the My Nominees Link")
    public void verifyMyNomineesIsEnabled() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.enabledMyNominees();
    }

    @Test(priority = 24, description = "TC_24 - Verify the My Nominees Link is Working or not ")
    @Description("Verify My Nominees Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the My Nominees Link is Clickable for the Loyalty user or not ")
    public void verifyMyNomineesLinkIsWorking() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.workingMyNominees();
    }


    @Test(priority = 25, description = "TC_25 - Verify Whether Loyalty User can  Add Nominees Details for the Loyalty user or not ")
    @Description("Verify User can add Nominees Details ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Add Nominees Details for the Loyalty user or not ")
    public void addNomineesDetails() throws InterruptedException {;
        profilePage=new ProfilePage(driver);
        profilePage.addNominessDetails();
    }

    @Test(priority = 26, description = "TC_26 - Verify the TermsAndConditions button is Display or not ")
    @Description("Verify TermsAndConditions button  is Display for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the TermsAndConditions link  is Display for the Loyalty user or not ")
    public void verifyTermsAndConditionsIsDisplay() throws InterruptedException {
        profilePage=new ProfilePage(driver);
        profilePage.displayTermsAndCondtions();
    }
    @Test(priority = 27, description = "TC_27 - Verify the Terms and Conditions Link  is enabled or not ")
    @Description("Verify Terms and Conditions Link enabled for  Loyalty user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Loyalty User should be able to see the Terms and Conditions  Link")
    public void verifyTermsAndConditionsIsEnabled() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.enabledTermsAndConditions();
    }

//    @Test(priority = 28, description = "TC_28 - Verify the verifyTermsAndConditionsLink is Working or not ")
//    @Description("Verify TermsAndConditions Link is clickable for the Loyalty user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("ProfilePage")
//    @Story("Verify whether the TermsAndConditions  Link is Clickable for the Loyalty user or not ")
//    public void verifyTermsAndConditionsButtonIsWorking() throws InterruptedException {
//        profilePage=new ProfilePage(driver);
//        profilePage.workingTermsAndConditions();
//    }

    @Test(priority = 28, description = "TC_28 - Verify the My Dashboard is visible for the Loyalty user or not after Loyalty ")
    @Description("Verify My Dashboard  Link is clickable for the Loyalty user after Loyalty")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the My Dashboard  Link is visible and  Clickable for the Loyalty user or not  after Loyalty ")
    public void verifyMyDashboardButtonIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnMyDashboard();
    }

    @Test(priority = 29, description = "TC_29 - Verify the About Indigo Blue Chip is Working or not")
    @Description("Verify About Indigo Blue Chip Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the About Indigo Blue Chip Link is Clickable for the Loyalty user or not ")
    public void verifyAboutIndigoBlueChipLinkIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnAboutIndigoBlueChip();
    }

    @Test(priority = 30, description = "TC_30 - Verify the TierAndBenefits is Working or not")
    @Description("Verify TierAndBenefits Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the TierAndBenefits Link is Clickable for the Loyalty user or not ")
    public void verifyTierAndBenefitsLinkIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnTierAndBenefits();
    }
    @Test(priority = 31, description = "TC_31 - Verify the TermsAndConditions is Working or not")
    @Description("Verify TermsAndConditions Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the TermsAndConditions Link is Clickable for the Loyalty user or not ")
    public void verifyTermsAndConditionsLinkIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnTermsAndConditions();
    }

    @Test(priority = 32, description = "TC_32 - Verify the FAQ is Working or not")
    @Description("Verify FAQ Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the FAQ Link is Clickable for the Loyalty user or not ")
    public void verifyFAQLinkIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnFAQ();
    }

    @Test(priority = 33, description = "TC_33 - Verify the EarnAndRedeems is Working or not")
    @Description("Verify EarnAndRedeems Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the EarnAndRedeems Link is Clickable for the Loyalty user or not ")
    public void verifyEarnAndRedeemsLinkIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnEarnAndRedeem();
    }

    @Test(priority = 34, description = "TC_34 - Verify the EarnIndigoBlueChip is Working or not")
    @Description("Verify EarnIndigoBlueChip Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the EarnIndigoBlueChip Link is Clickable for the Loyalty user or not ")
    public void verifyEarnIndigoBlueChipLinkIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnEarnIndigoBlueChip();
    }

    @Test(priority = 35, description = "TC_35 - Verify the RedeemIndigoBlueChip is Working or not")
    @Description("Verify RedeemIndigoBlueChip Link is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the RedeemIndigoBlueChip Link is Clickable for the Loyalty user or not ")
    public void verifyRedeemIndigoBlueChipLinkIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.clickOnRedeemIndigoBlueChip();
    }

//    @Test(priority = 33, description = "TC_33 - Verify the indigoWallet is Working or not")
//    @Description("Verify indigoWallet button is clickable for the Loyalty user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("ProfilePage")
//    @Story("Verify whether the RedeemIndigoBlueChip button is Clickable for the Loyalty user or not ")
//    public void verifyIndigoWalletIsWorking() throws InterruptedException {
//        profilePage = new ProfilePage(driver);
//        profilePage.workingIndigoWallet();
  //  }

    @Test(priority = 36, description = "TC_36 - Verify the LogOut is Working or not")
    @Description("Verify LogOut button is clickable for the Loyalty user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("ProfilePage")
    @Story("Verify whether the LogOut button is Clickable for the Loyalty user or not ")
    public void verifyLogOutIsWorking() throws InterruptedException {
        profilePage = new ProfilePage(driver);
        profilePage.workingLogOut();
    }
}





