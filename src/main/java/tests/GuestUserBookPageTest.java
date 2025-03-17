package tests;

import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;

public class GuestUserBookPageTest extends BaseTestLoginUser {

    private WelcomePage welcomePage;
    private BookPage bookPage;
    private ThreadWaitClass threadWaitClass;

    @Test(priority = 1, description = "TC_01 - Verify the My Trips button is Displayed or not ")
    @Description("Verify  My Trips button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Guest User should be able to  see the My Trips button")
    public void verifyMyTripsButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        welcomePage.clickLoginAsQuest();
        bookPage.displayMyTripButton();
    }

    @Test(priority = 2, description = "TC_02 - Verify the My Trips button is enabled or not ")
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

    @Test(priority = 3, description = "TC_003 - Verify the Book button is Working or not ")
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

    @Test(priority = 4, description = "TC_004 - Verify the Book button is Displayed or not ")
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

    @Test(priority = 5, description = "TC_005 - Verify the Book button is enabled or not ")
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

    @Test(priority = 6, description = "TC_006 - Verify the Book button is Working or not ")
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

    @Test(priority = 7, description = "TC_007 - Verify the Check-In button is Displayed or not ")
    @Description("Verify   Check-In  button is visible for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Guest User should be able to  see the Check-In  button")
    public void verifyCheckInButtonIsDisplayed() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayCheckInButton();

    }

    @Test(priority = 8, description = "TC_008 - Verify the Check-In button is enabled or not ")
    @Description("Verify  Check-In button is enabled for  Guest user or not")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify the Check-In button is enabled for Guest user")
    public void verifyCheckInButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.enabledCheckInButton();
    }


    @Test(priority = 9, description = "TC_009 - Verify the Check-In button is Working or not ")
    @Description("Verify  Check-In  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Check-In  button is Clickable for the Guest user or not ")
    public void verifyCheckInButtonIsWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.clickCheckInButton();

    }


//    @Test(priority = 10, description = "TC_0010 - Verify the Profile button is Displayed or not ")
//    @Description("Verify  Profile button is visible for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("bookPage")
//    @Story("Guest User should be able to  see the Profile  button")
//    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.displayProfileButton();
//
//    }

//    @Test(priority = 11, description = "TC_0011 - Verify the Profile button is enabled or not ")
//    @Description("Verify Profile button is enabled for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("bookPage")
//    @Story("Verify whether the Profile button is enabled for Guest user.or not ")
//    public void verifyProfileButtonIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.enabledProfileButton();
//    }
//
//    @Test(priority = 12, description = "TC_0012 - Verify the Profile button is Working or not ")
//    @Description("Verify Profile button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("bookPage")
//    @Story("Verify whether the Profile  button is Clickable for the Guest user or not ")
//    public void verifyProfileButtonIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.clickProfileButton();
//
//    }


    @Test(priority = 13, description = "TC_0013 - Verify the Explore button is Displayed or not ")
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

    @Test(priority = 14, description = "TC_0014 - Verify the Explore button is enabled or not ")
    @Description("Verify Explore button is enabled for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Explore button is enabled for Guest user.or not ")
    public void verifyExploreButtonIsEnabled() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.enabledExploreButton();
    }

    @Test(priority = 15, description = "TC_0015 - Verify the Explore button is Working or not ")
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

    @Test(priority = 16, description = "TC_0016 - Verify the Leisure button is display or not ")
    @Description("Verify  Leisure  button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Leisure  button is display for the Guest user or not ")
    public void verifyLeisureButtonDisplay() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayLeisureButton();
    }

    @Test(priority = 17, description = "TC_0017 - Verify the Leisure button is Working or not ")
    @Description("Verify  Leisure  button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Leisure Radio button is Clickable for the Guest user or not ")
    public void verifyLeisureButtonWorking() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.workingLeisureButton();

    }
    @Test(priority = 18, description = "TC_0018 - Verify the Work Radio button is display or not ")
    @Description("Verify Work Radio button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Work Radio  button is display for the Guest user or not ")
    public void verifyWorkRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayWorkButton();
    }

    @Test(priority = 19, description = "TC_0019 - Verify the Work button is Working or not ")
    @Description("Verify Work radio button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Work Radio  button is Clickable for the Guest user or not ")
    public void verifyWorkRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workRadioButton();

    }

    @Test(priority = 20, description = "TC_0020 - Verify the Medical Radio button is display or not ")
    @Description("Verify Medical Radio button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Medical Radio  button is display for the Guest user or not ")
    public void verifyMedicalRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayMedicalButton();
    }


    @Test(priority = 21, description = "TC_0021 - Verify the Medical button is Working or not ")
    @Description("Verify Medical radio button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Medical Radio  button is Clickable for the Guest user or not ")
    public void verifyMedicalRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workMedicalRadioButton();

    }


    @Test(priority = 22, description = "TC_0022 - Verify the RoundTrip button is Working or not ")
    @Description("Verify RoundCity radio button is clickable for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the RoundTrip Radio  button is Clickable for the Guest user or not ")
    public void verifyRoundTripRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.selectRoundRadioButton();
    }


    @Test(priority = 23, description = "TC_0023 - Verify the RoundTrip Radio button is display or not ")
    @Description("Verify Medical Radio button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the RoundTrip Radio  button is display for the Guest user or not ")
    public void verifyRoundTripRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayRoundCityButton();
    }

    @Test(priority = 24, groups = {"regression"}, description = "TC_24 - Verify the MultiCity Radio button is display or not ")
    @Description("Verify MultiCity Radio button is display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the MultiCity Radio  button is display for the Guest user or not ")
    public void verifyMultiCityRadioButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.displayMultiCityRadioButton();
    }

    @Test(priority = 25, groups = {"regression"}, description = "TC_25 - Verify the MultiCity Radio button is Working or not ")
    @Description("Verify MultiCity Radio button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the MultiCity Radio  button is Working for the Guest user or not ")
    public void verifyMultiCityRadioButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingMultiCityButton();
    }


    @Test(priority = 26, groups = {"regression"}, description = "TC_26 - Verify the Passenger Selection  button is Working or not ")
    @Description("Verify  Passenger Selection  button is Display for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Passenger Selection  button is Working for the Guest user or not ")
    public void verifyPassengerSelectionButtonDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayPassengerSelectionButton();
    }

    @Test(priority = 27, groups = {"regression"}, description = "TC_27 - Verify the Passenger Selection  button is Working or not ")
    @Description("Verify  Passenger Selection  button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Passenger Selection  button is Working for the Guest user or not ")
    public void verifyPassengerSelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingPassengerSelectionButton();
    }

    @Test(priority = 28, groups = {"regression"}, description = "TC_28 - Verify the Close Passenger Selection  button is Working or not ")
    @Description("Verify  Close Passenger Selection button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Close Passenger Selection button is Working for the Guest user or not ")
    public void verifyClosePassengerSelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.workingClosePassengerSelectionButton();
    }

    @Test(priority = 29, groups = {"regression"}, description = "TC_29 - Verify the Choose Currency Selection button is Display or not ")
    @Description("Verify Choose Currency Selection  button is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Choose Currency Selection button is Displaying for the Guest user or not ")
    public void displayCurrencySelectionButton() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.displayChooseCurrencyButton();
    }

    @Test(priority = 30, groups = {"regression"}, description = "TC_30 - Verify the  Choose Currency Selection  button is Working or not ")
    @Description("Verify   Choose Currency Selection button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the   Choose Currency Selection button is Working for the Guest user or not ")
    public void verifyChooseCurrencySelectionButtonWorking() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.workingChooseCurrencySelectionButton();
    }

    @Test(priority = 31, groups = {"smoke","regression"}, description = "TC_31 - Verify the  flying from Link is Displaying or not ")
    @Description("Verify Flying From Link is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Flying From Link is Displaying for the Guest user or not ")
    public void displayFlyingFromLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayFlyingFromLink();
    }

    @Test(priority = 32, groups = {"smoke","regression"}, description = "TC_32 - Verify the flying from  Link is Working or not ")
    @Description("Verify flying from  Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the flying from  Link is Working for the Guest user or not ")
    public void workingFlyingFromLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingFlyingFromLink();
    }

    @Test(priority = 33, groups = {"smoke","regression"}, description = "TC_33 - Verify the  Going To Link is Displaying or not ")
    @Description("Verify Going To Link is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Going To Link is Displaying for the Guest user or not ")
    public void displayGoingToLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.displayGoingToLink();
    }

    @Test(priority = 34, groups = {"smoke","regression"}, description = "TC_34 - Verify the  Select Departure Date Link is Displaying or not ")
    @Description("Verify Select Departure Date  Link is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Select Departure Date  is Displaying for the Guest user or not ")
    public void displaySelectDepartureDateLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayDepartureDateLink();
    }

    @Test(priority = 35, groups = {"smoke","regression"}, description = "TC_35 - Verify the Departure Date Link is Working or not ")
    @Description("Verify Departure Date Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Departure Date Link is Working for the Guest user or not ")
    public void validateDepartureDate() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.workingDepartureDateLink();
    }


    @Test(priority = 36, groups = {"smoke","regression"}, description = "TC_36 - Verify the Select Passenger  Link is Displaying or not ")
    @Description("Verify Select Passenger Link is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Select Passenger is Displaying for the Guest user or not ")
    public void displayPassengerSelectionLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.displayPassengerSelectionLink();
    }

    @Test(priority = 37, groups = {"smoke","regression"}, description = "TC_37 - Verify the Passenger Selection Link is Working or not ")
    @Description("Verify Passenger Selection  Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Passenger Selection  Link is Working for the Guest user or not ")
    public void validateSelectPassengerLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.workingSelectionPassengerLink();
    }

    @Test(priority = 38, groups = {"smoke","regression"}, description = "TC_38 - Verify the PromoCode Link is Displaying or not ")
    @Description("Verify PromoCode is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the PromoCode is Displaying for the Guest user or not ")
    public void displayPromoCode() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayPromCodeLink();
    }

    @Test(priority = 39, groups = {"smoke","regression"}, description = "TC_39 - Verify the PromoCode Link is Working or not ")
    @Description("Verify PromoCode Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the PromoCode Link is Working for the Guest user or not ")
    public void validatePromoCodeLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.workingPromoCodeLink();
    }

    @Test(priority = 40, groups = {"smoke","regression"}, description = "TC_40 - Verify the Search Link is Displaying or not ")
    @Description("Verify Search is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Search is Displaying for the Guest user or not ")
    public void displaySearchLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displaySearchLink();
    }


    @Test(priority = 41, groups = {"smoke","regression"}, description = "TC_41 - Verify the Search Link is Working or not ")
    @Description("Verify Search Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Search Link is Working for the Guest user or not ")
    public void validateSearchLink() throws InterruptedException {
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.workingSearchLink();
    }
    @Test(priority = 42, groups = {"smoke","regression"}, description = "TC_42 - Verify the Recent Searches Link is Displaying or not ")
    @Description("Verify Recent Searches is Displaying for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the  Recent Searches is Displaying for the Guest user or not ")
    public void displayRecentSearchesLink() throws InterruptedException {
        bookPage = new BookPage(driver);
        bookPage.displayRecentSearchesLink();
    }

    @Test(priority = 43, groups = {"smoke","regression"}, description = "TC_43 - Verify the Recent Searches Link is Working or not ")
    @Description("Verify Recent Searches Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Recent Searches Link is Working for the Guest user or not ")
    public void validateRecentSearchesLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
       // welcomePage.clickLogin();
        bookPage.workingRecentSearchesLink();
    }

//    @Test(priority = 29, groups = {"regression"}, description = "TC_48 - Verify the Close Passenger Selection  button is Display or not ")
//    @Description("Verify  Passenger Selection  button is Display for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("bookPage")
//    @Story("Verify whether the Close Passenger Selection  button is Display for the Guest user or not ")
//    public void verifyClosePassengerSelectionButtonDisplay() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//       // welcomePage.clickLogin();
//        bookPage.displayClosePassengerSelectionButton();
//    }

    @Test(priority = 44, groups = {"smoke","regression"}, description = "TC_44 - Verify the Indigo Blue Chips Radio Button is Disable or not ")
    @Description("Verify Indigo Blue Chips Radio Button is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Verify whether the Indigo Blue Chips Radio Button is Disable for the Guest user or not ")
    public void validateIndigoBlueChips() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        // welcomePage.clickLogin();
        bookPage.verifyIndigoBlueChipsIsDisabled();
    }

    @Test(priority = 45, groups = {"smoke","regression"}, description = "TC_45 - Verify the Going To  Link is Working or not ")
    @Description("Verify flying from  Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Going To  Link is Working for the Guest user or not ")
    public void workingGoingToLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        //welcomePage.clickLogin();
        bookPage.workingGoingToLink();
    }
//    @Test(priority = 46, groups = {"regression"}, description = "TC_0046 - Verify the book a stay  button is working or not ")
//    @Description("Verify book a stay button is display for the guest user")
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



