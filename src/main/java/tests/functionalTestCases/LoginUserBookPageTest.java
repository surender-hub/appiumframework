package tests.functionalTestCases;

import base.BaseSuper;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;

public class LoginUserBookPageTest extends BaseSuper {

    private WelcomePage welcomePage;
    private BookPage bookPage;
    private ThreadWaitClass threadWaitClass;


    @Test(priority = 1, description = "TC_001 - Verify the Book button is Displayed or not ")
    @Description("Verify Book button is visible for Login user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Login User should be able to see the Book button")
    public void verifyBookButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.loginByOtp();
        bookPage.displayBookButton();
    }

    @Test(priority = 2, description = "TC_002 - Verify the Book button is enabled or not ")
    @Description("Verify Book button is enabled for Login user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Book button is enabled for Login user.")
    public void verifyBookButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.enabledBookButton();
    }

    @Test(priority = 3, description = "TC_003 - Verify the Book button is Working or not ")
    @Description("Verify Book button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Book button is Clickable for the Login user")
    public void verifyBookButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.clickBookButton();
    }

    @Test(priority = 4, description = "TC_004 - Verify the Leisure button is displayed or not ")
    @Description("Verify Leisure button is displayed for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Leisure button is displayed for the Login user or not ")
    public void verifyLeisureButtonDisplay() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayLeisureButton();
    }

    @Test(priority = 5, description = "TC_005 - Verify the Leisure button is Working or not ")
    @Description("Verify Leisure button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Leisure Radio button is Clickable for the Login user or not ")
    public void verifyLeisureButtonWorking() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.workingLeisureButton();
    }

    @Test(priority = 6, description = "TC_006 - Verify the Work Radio button is displayed or not ")
    @Description("Verify Work Radio button is displayed for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Work Radio button is displayed for the Login user or not ")
    public void verifyWorkRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayWorkButton();
    }

    @Test(priority = 7, description = "TC_007 - Verify the Work button is Working or not ")
    @Description("Verify Work radio button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Work Radio button is Clickable for the Login user or not ")
    public void verifyWorkRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workRadioButton();
    }

    @Test(priority = 8, description = "TC_008 - Verify the Medical Radio button is displayed or not ")
    @Description("Verify Medical Radio button is displayed for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Medical Radio button is displayed for the Login user or not ")
    public void verifyMedicalRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayMedicalButton();
    }

    @Test(priority = 9, description = "TC_009 - Verify the Medical button is Working or not ")
    @Description("Verify Medical radio button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Medical Radio button is Clickable for the Login user or not ")
    public void verifyMedicalRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workMedicalRadioButton();
    }

    @Test(priority = 10, description = "TC_010 - Verify the RoundTrip Radio button is displayed or not ")
    @Description("Verify RoundTrip Radio button is displayed for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the RoundTrip Radio button is displayed for the Login user or not ")
    public void verifyRoundTripRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayRoundCityButton();
    }

    @Test(priority = 11, description = "TC_0022 - Verify the RoundTrip button is Working or not ")
    @Description("Verify RoundTrip radio button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the RoundTrip Radio  button is Clickable for the Login user or not ")
    public void verifyRoundTripRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        welcomePage.clickLoginAsQuest();
        bookPage.selectRoundRadioButton();

    }

//    @Test(priority = 12, description = "TC_0012 - Verify the Return button is Displayed or not ")
//    @Description("Verify  Return button is visible for  Login user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("BookPage")
//    @Story("Login User should be able to  see the Return  button")
//    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.displayReturnLink();
//
//    }

//    @Test(priority = 11, description = "TC_0011 - Verify the Profile button is enabled or not ")
//    @Description("Verify Profile button is enabled for  Login user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("BookPage")
//    @Story("Verify whether the Profile button is enabled for Login user.or not ")
//    public void verifyProfileButtonIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.enabledProfileButton();
//    }

    @Test(priority = 12, description = "TC_0012 - Verify the Return button is Working or not ")
    @Description("Verify Return button is clickable for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Return  button is Clickable for the Login user or not ")
    public void verifyProfileButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workingReturnLink();

    }


    @Test(priority = 13, groups = {"regression"}, description = "TC_13 - Verify the MultiCity Radio button is display or not ")
    @Description("Verify MultiCity Radio button is display for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the MultiCity Radio  button is display for the Login user or not ")
    public void verifyMultiCityRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.displayMultiCityRadioButton();
    }

    @Test(priority = 14, groups = {"regression"}, description = "TC_14 - Verify the MultiCity Radio button is Working or not ")
    @Description("Verify MultiCity Radio button is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the MultiCity Radio  button is Working for the Login user or not ")
    public void verifyMultiCityRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingMultiCityButton();
    }

    @Test(priority = 15, groups = {"regression"}, description = "TC_15 - Verify the Passenger Selection  button is Working or not ")
    @Description("Verify  Passenger Selection  button is Display for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Passenger Selection  button is Working for the Login user or not ")
    public void verifyPassengerSelectionButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayPassengerSelectionButton();
    }

    @Test(priority = 16, groups = {"regression"}, description = "TC_16 - Verify the Passenger Selection  button is Working or not ")
    @Description("Verify  Passenger Selection  button is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Passenger Selection  button is Working for the Login user or not ")
    public void verifyPassengerSelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingPassengerSelectionButton();
    }

    @Test(priority = 17, groups = {"regression"}, description = "TC_17 - Verify the Close Passenger Selection  button is Working or not ")
    @Description("Verify  Close Passenger Selection button is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Close Passenger Selection button is Working for the Login user or not ")
    public void verifyClosePassengerSelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.workingClosePassengerSelectionButton();
    }

    @Test(priority = 18, groups = {"regression"}, description = "TC_18 - Verify the Choose Currency Selection button is Display or not ")
    @Description("Verify Choose Currency Selection  button is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Choose Currency Selection button is Displaying for the Login user or not ")
    public void displayCurrencySelectionButton() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.displayChooseCurrencyButton();
    }

    @Test(priority = 19, groups = {"regression"}, description = "TC_19 - Verify the  Choose Currency Selection  button is Working or not ")
    @Description("Verify   Choose Currency Selection button is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the   Choose Currency Selection button is Working for the Login user or not ")
    public void verifyChooseCurrencySelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.workingChooseCurrencySelectionButton();
    }

    @Test(priority = 20, groups = {"smoke","regression"}, description = "TC_20 - Verify the  flying from Link is Displaying or not ")
    @Description("Verify Flying From Link is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Flying From Link is Displaying for the Login user or not ")
    public void displayFlyingFromLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayFlyingFromLink();
    }

    @Test(priority = 21, groups = {"smoke","regression"}, description = "TC_21 - Verify the flying from  Link is Working or not ")
    @Description("Verify flying from  Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the flying from  Link is Working for the Login user or not ")
    public void workingFlyingFromLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingFlyingFromLink();
    }

    @Test(priority = 22, groups = {"smoke","regression"}, description = "TC_22 - Verify the  Going To Link is Displaying or not ")
    @Description("Verify Going To Link is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Going To Link is Displaying for the Login user or not ")
    public void displayGoingToLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayGoingToLink();
    }

    @Test(priority = 23, groups = {"smoke","regression"}, description = "TC_23 - Verify the  Select Departure Date Link is Displaying or not ")
    @Description("Verify Select Departure Date  Link is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Select Departure Date  is Displaying for the Login user or not ")
    public void displaySelectDepartureDateLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayDepartureDateLink();
    }

    @Test(priority = 24, groups = {"smoke","regression"}, description = "TC_24 - Verify the Departure Date Link is Working or not ")
    @Description("Verify Departure Date Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Departure Date Link is Working for the Login user or not ")
    public void validateDepartureDate() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.workingDepartureDateLink();
    }


    @Test(priority = 25, groups = {"smoke","regression"}, description = "TC_25 - Verify the Select Passenger  Link is Displaying or not ")
    @Description("Verify Select Passenger Link is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Select Passenger is Displaying for the Login user or not ")
    public void displayPassengerSelectionLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.displayPassengerSelectionLink();
    }

    @Test(priority = 26, groups = {"smoke","regression"}, description = "TC_26 - Verify the Passenger Selection Link is Working or not ")
    @Description("Verify Passenger Selection  Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Passenger Selection  Link is Working for the Login user or not ")
    public void validateSelectPassengerLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workingSelectionPassengerLink();
    }

    @Test(priority = 27, groups = {"smoke","regression"}, description = "TC_27 - Verify the PromoCode Link is Displaying or not ")
    @Description("Verify PromoCode is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the PromoCode is Displaying for the Login user or not ")
    public void displayPromoCode() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayPromCodeLink();
    }

    @Test(priority = 28, groups = {"smoke","regression"}, description = "TC_28 - Verify the PromoCode Link is Working or not ")
    @Description("Verify PromoCode Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the PromoCode Link is Working for the Login user or not ")
    public void validatePromoCodeLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.workingPromoCodeLink();
    }

    @Test(priority = 29, groups = {"smoke","regression"}, description = "TC_29 - Verify the Search Link is Displaying or not ")
    @Description("Verify Search is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Search is Displaying for the Login user or not ")
    public void displaySearchLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displaySearchLink();
    }


    @Test(priority = 30, groups = {"smoke","regression"}, description = "TC_30 - Verify the Search Link is Working or not ")
    @Description("Verify Search Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Search Link is Working for the Login user or not ")
    public void validateSearchLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.workingSearchLink();
    }
    @Test(priority = 31, groups = {"smoke","regression"}, description = "TC_31 - Verify the Recent Searches Link is Displaying or not ")
    @Description("Verify Recent Searches is Displaying for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the  Recent Searches is Displaying for the Login user or not ")
    public void displayRecentSearchesLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayRecentSearchesLink();
    }

    @Test(priority = 32, groups = {"smoke","regression"}, description = "TC_32 - Verify the Recent Searches Link is Working or not ")
    @Description("Verify Recent Searches Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Recent Searches Link is Working for the Login user or not ")
    public void validateRecentSearchesLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.workingRecentSearchesLink();
    }

    @Test(priority = 33, groups = {"smoke","regression"}, description = "TC_33 - Verify the Indigo Blue Chips Radio Button is Disable or not ")
    @Description("Verify Indigo Blue Chips Radio Button is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Indigo Blue Chips Radio Button is Disable for the Login user or not ")
    public void validateIndigoBlueChips() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.verifyIndigoBlueChipsIsDisabled();
    }

    @Test(priority = 34, groups = {"smoke","regression"}, description = "TC_34 - Verify the Going To  Link is Working or not ")
    @Description("Verify flying from  Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Going To  Link is Working for the Login user or not ")
    public void workingGoingToLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingGoingToLink();
    }

    @Test(priority = 35, groups = {"smoke","regression"}, description = "TC_35 - Verify the Add Nominee Link is Displaying or not ")
    @Description("Verify ADD Nominee Link is Displaying  for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the ADD Nominee Link is Displaying for the Login user or not ")
    public void displayingAddNomineeLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLoginAsQuest();
        bookPage.displayAddNomineeLink();
    }


    @Test(priority = 36, groups = {"smoke","regression"}, description = "TC_36 - Verify the Add Nominee Link is Working or not ")
    @Description("Verify Add Nominee Link is Working for the Login user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Add Nominee Link is Working for the Login user or not ")
    public void workingAddNomineeLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.loginByOtp();
        bookPage.workingAddNomineeLink();
    }


//    @Test(priority = 37, groups = {"regression"}, description = "TC_0027 - Verify the book a stay  button is working or not ")
//    @Description("Verify book a stay button is display for the Login user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("bookPage")
//    @Story("Verify whether the book a stay  button is working or not ")
//    public void bookStayButton() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new bookPage(driver);
//        welcomePage.clickLogin();
//        bookPage.newbuttonbook();
//        Thread.sleep(5000);
//        bookPage.verifyBookStayElement();
//    }
}
//}



