package tests;

import base.BaseTest;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;

public class BookPageTest extends BaseTest {

    private WelcomePage welcomePage;
    private BookPage homePage;
    private ThreadWaitClass threadWaitClass;


    @Test(priority = 1, groups = {"regression"}, description = "TC_001 - Verify the My Trips button is Displayed or not ")
    @Description("Verify  My Trips button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the My Trips button")
    public void verifyMyTripsButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayMyTripButton();


    }

    @Test(priority = 2, groups = {"regression"}, description = "TC_002 - Verify the My Trips button is enabled or not ")
    @Description("Verify   My Trips button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the My Trips button is enabled for Guest user.")
    public void verifyMyTripsButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.enabledMyTripButton();

    }

    @Test(priority = 3, groups = {"regression"}, description = "TC_002 - Verify the Book button is Working or not ")
    @Description("Verify  Book button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Book button is Clickable for the Guest user")
    public void verifyMyTripsButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.clickMyTripButton();


    }

    @Test(priority = 4, groups = {"regression"}, description = "TC_004 - Verify the Book button is Displayed or not ")
    @Description("Verify  Book button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the Book button")
    public void verifyBookButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayBookButton();


    }

    @Test(priority = 5, groups = {"regression"}, description = "TC_005 - Verify the Book button is enabled or not ")
    @Description("Verify   Book button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Book button is enabled for Guest user.")
    public void verifyBookButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.enabledBookButton();
    }

    @Test(priority = 6, groups = {"regression"}, description = "TC_006 - Verify the Book button is Working or not ")
    @Description("Verify   Book button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Book button is Clickable for the Guest user")
    public void verifyBookButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.clickBookButton();
    }

    @Test(priority = 7, groups = {"regression"}, description = "TC_007 - Verify the Check-In button is Displayed or not ")
    @Description("Verify   Check-In  button is visible for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the Check-In  button")
    public void verifyCheckInButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayCheckInButton();

    }

    @Test(priority = 8, groups = {"regression"}, description = "TC_008 - Verify the Check-In button is enabled or not ")
    @Description("Verify  Check-In button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify the Check-In button is enabled for Guest user")
    public void verifyCheckInButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.enabledCheckInButton();
    }


    @Test(priority = 9, groups = {"regression"}, description = "TC_009 - Verify the Check-In button is Working or not ")
    @Description("Verify  Check-In  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Check-In  button is Clickable for the Guest user or not ")
    public void verifyCheckInButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.clickCheckInButton();

    }


    @Test(priority = 10, groups = {"regression"}, description = "TC_0010 - Verify the Profile button is Displayed or not ")
    @Description("Verify  Profile button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the Profile  button")
    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayProfileButton();

    }

    @Test(priority = 11, groups = {"regression"}, description = "TC_0011 - Verify the Profile button is enabled or not ")
    @Description("Verify Profile button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Profile button is enabled for Guest user.or not ")
    public void verifyProfileButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.enabledProfileButton();
    }

    @Test(priority = 12, groups = {"regression"}, description = "TC_0012 - Verify the Profile button is Working or not ")
    @Description("Verify Profile button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Profile  button is Clickable for the Guest user or not ")
    public void verifyProfileButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.clickProfileButton();

    }


    @Test(priority = 13, groups = {"regression"}, description = "TC_0013 - Verify the Explore button is Displayed or not ")
    @Description("Verify Explore button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the  Explore button")
    public void verifyExploreButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayExploreButton();

    }


    @Test(priority = 14, groups = {"regression"}, description = "TC_0014 - Verify the Explore button is enabled or not ")
    @Description("Verify Explore button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Explore button is enabled for Guest user.or not ")
    public void verifyExploreButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.enabledExploreButton();
    }


    @Test(priority = 15, groups = {"regression"}, description = "TC_0015 - Verify the Explore button is Working or not ")
    @Description("Verify  Explore  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Explore  button is Clickable for the Guest user or not ")
    public void verifyExploreButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.clickExploreButton();

    }

    @Test(priority = 16, groups = {"regression"}, description = "TC_0016 - Verify the Leisure button is display or not ")
    @Description("Verify  Leisure  button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Leisure  button is display for the Guest user or not ")
    public void verifyLeisureButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayLeisureButton();

    }

    @Test(priority = 17, groups = {"regression"}, description = "TC_0017 - Verify the Leisure button is Working or not ")
    @Description("Verify  Leisure  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Leisure  button is Clickable for the Guest user or not ")
    public void verifyLeisureButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workingLeisureButton();

    }


    @Test(priority = 18, groups = {"regression"}, description = "TC_0018 - Verify the Work Radio button is display or not ")
    @Description("Verify Work Radio button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Work Radio  button is display for the Guest user or not ")
    public void verifyWorkRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayWorkButton();
    }

    @Test(priority = 19, groups = {"regression"}, description = "TC_0019 - Verify the Work button is Working or not ")
    @Description("Verify Work radio button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Work Radio  button is Clickable for the Guest user or not ")
    public void verifyWorkRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workRadioButton();

    }


    @Test(priority = 20, groups = {"regression"}, description = "TC_0020 - Verify the Medical Radio button is display or not ")
    @Description("Verify Medical Radio button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Medical Radio  button is display for the Guest user or not ")
    public void verifyMedicalRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayMedicalButton();
    }


    @Test(priority = 21, groups = {"regression"}, description = "TC_0021 - Verify the Medical button is Working or not ")
    @Description("Verify Medical radio button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Medical Radio  button is Clickable for the Guest user or not ")
    public void verifyMedicalRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workMedicalRadioButton();

    }


    @Test(priority = 22, groups = {"regression"}, description = "TC_0022 - Verify the RoundTrip button is Working or not ")
    @Description("Verify RoundCity radio button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the RoundTrip Radio  button is Clickable for the Guest user or not ")
    public void verifyRoundTripRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.selectRoundRadioButton();

    }


    @Test(priority = 24, groups = {"regression"}, description = "TC_0024 - Verify the MultiCity Radio button is display or not ")
    @Description("Verify MultiCity Radio button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the MultiCity Radio  button is display for the Guest user or not ")
    public void verifyMultiCityRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayMultiCityRadioButton();
    }

    @Test(priority = 25, groups = {"regression"}, description = "TC_0025 - Verify the MultiCity Radio button is Working or not ")
    @Description("Verify MultiCity Radio button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the MultiCity Radio  button is Working for the Guest user or not ")
    public void verifyMultiCityRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workingMultiCityButton();
    }


    @Test(priority = 26, groups = {"regression"}, description = "TC_0026 - Verify the Passenger Selection  button is Working or not ")
    @Description("Verify  Passenger Selection  button is Display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Passenger Selection  button is Working for the Guest user or not ")
    public void verifyPassengerSelectionButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayPassengerSelectionButton();
    }


    @Test(priority = 27, groups = {"regression"}, description = "TC_0027 - Verify the Passenger Selection  button is Working or not ")
    @Description("Verify  Passenger Selection  button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Passenger Selection  button is Working for the Guest user or not ")
    public void verifyPassengerSelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workingPassengerSelectionButton();
    }


    @Test(priority = 27, groups = {"regression"}, description = "TC_0027 - Verify the Close Passenger Selection  button is Display or not ")
    @Description("Verify  Passenger Selection  button is Display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Close Passenger Selection  button is Display for the Guest user or not ")
    public void verifyClosePassengerSelectionButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayClosePassengerSelectionButton();
    }


    @Test(priority = 28, groups = {"regression"}, description = "TC_0028 - Verify the Close Passenger Selection  button is Working or not ")
    @Description("Verify  Close Passenger Selection button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Close Passenger Selection button is Working for the Guest user or not ")
    public void verifyClosePassengerSelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workingClosePassengerSelectionButton();
    }


    @Test(priority = 29, groups = {"regression"}, description = "TC_0029 - Verify the Choose Currency Selection button is Display or not ")
    @Description("Verify Choose Currency Selection  button is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Choose Currency Selection button is Displaying for the Guest user or not ")
    public void displayCurrencySelectionButton() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayChooseCurrencyButton();
    }


    @Test(priority = 30, groups = {"regression"}, description = "TC_0030 - Verify the  Choose Currency Selection  button is Working or not ")
    @Description("Verify   Choose Currency Selection button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the   Choose Currency Selection button is Working for the Guest user or not ")
    public void verifyChooseCurrencySelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workingChooseCurrencySelectionButton();
    }

    @Test(priority = 31, groups = {"smoke","regression"}, description = "TC_0031 - Verify the  Quest User Link is Displaying or not ")
    @Description("Verify Quest User Link is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Quest User Link is Displaying for the Guest user or not ")
    public void displayQuestUserLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        homePage.displayLoginAsQuestLink();
    }

    @Test(priority = 32, groups = {"smoke","regression"}, description = "TC_0032 - Verify the  Quest User Link is Working or not ")
    @Description("Verify Quest User Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Quest User Link is Working for the Guest user or not ")
    public void workingQuestUserLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        homePage.workingQuestUserLink();
    }

    @Test(priority = 33, groups = {"smoke","regression"}, description = "TC_0033 - Verify the  flying from Link is Displaying or not ")
    @Description("Verify Flying From Link is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Flying From Link is Displaying for the Guest user or not ")
    public void displayFlyingFromLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayFlyingFromLink();
    }

    @Test(priority = 34, groups = {"smoke","regression"}, description = "TC_0034 - Verify the flying from  Link is Working or not ")
    @Description("Verify flying from  Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the flying from  Link is Working for the Guest user or not ")
    public void workingFlyingFromLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workingFlyingFromLink();
    }

    @Test(priority = 35, groups = {"smoke","regression"}, description = "TC_0035 - Verify the  Going To Link is Displaying or not ")
    @Description("Verify Going To Link is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Going To Link is Displaying for the Guest user or not ")
    public void displayGoingToLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.displayGoingToLink();
    }

    @Test(priority = 36, groups = {"smoke","regression"}, description = "TC_0036 - Verify the Going To  Link is Working or not ")
    @Description("Verify flying from  Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Verify whether the Going To  Link is Working for the Guest user or not ")
    public void workingGoingToLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        homePage = new BookPage(driver);
        welcomePage.clickLogin();
        homePage.workingGoingToLink();
    }


//    @Test(priority = 37, groups = {"regression"}, description = "TC_0027 - Verify the book a stay  button is working or not ")
//    @Description("Verify book a stay button is display for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the book a stay  button is working or not ")
//    public void bookStayButton() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        homePage = new HomePage(driver);
//        welcomePage.clickLogin();
//        homePage.newbuttonbook();
//        Thread.sleep(5000);
//        homePage.verifyBookStayElement();
//    }
}
//}



