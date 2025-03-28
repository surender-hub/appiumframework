package tests.functionalTestCases;

import base.BaseSuper;
import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigUatReader;
import utils.ElementUtils;
import utils.LogUtils;

import java.util.List;

public class MyTripsTest extends BaseSuper {

    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private ValidFarePage validFarePage;
    private ElementUtils elementUtils;
    private ThreadWaitClass threadWaitClass;
    private MyTripsPage myTripsPage;
    String currentPackage;
    List<String> userBookingDetails;


    @BeforeClass
    public void setup() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        validFarePage = new ValidFarePage(driver);
        myTripsPage = new MyTripsPage(driver);

        LogUtils.info("Guest User booking ticket using skip to payment");
        searchPage.clickOnTo();
        LogUtils.info("User Click on Going To Flight Link");
        searchPage.searchPlace(ConfigUatReader.getProperty("source"));
        LogUtils.info("Search Destination city Mumbai");
        searchPage.clickOnMumbaiFlight();
        LogUtils.info("Select Destination city  first Flight ");
        validFarePage.clickOnFutureDate(ConstantClass.FUTURE_DATE);
        LogUtils.info("Select Future Date 3 Days Ahead ");
        searchPage.clickOnSearchButton();
        LogUtils.info("Click on Search Button");
        searchPage.clickOnBookingList();
        LogUtils.info("Select a  First Flight ");
        // validFarePage.clickOnFlightReturn();
        searchPage.bookingNextButton();
        LogUtils.info("Click on next Button");
        searchPage.enterUserDetails(ConfigUatReader.getProperty("firstname"), ConfigUatReader.getProperty("lastname"), ConfigUatReader.getProperty("dob"), ConfigUatReader.getProperty("phone"), ConfigUatReader.getProperty("email"));
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        searchPage.clickOnNetBanking();
        LogUtils.info("User Click on Net banking Button");
        searchPage.clickOnAddBank();
        LogUtils.info("User Click on More Bank Button");
        searchPage.searchAvenue(ConfigUatReader.getProperty("search_payment"));
        LogUtils.info("Search Avenue payment method");
        searchPage.clickOnAvenuePayment();
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenueButtonPay();
        LogUtils.info("User Click on Pay Button");
        searchPage.clickOnButtonResponse();
        LogUtils.info("User Click on Response Button");
        userBookingDetails = myTripsPage.getBookingDetails();
        myTripsPage.enterPNRinMyTripsMenu(userBookingDetails.get(0),ConfigUatReader.getProperty("lastname"));

    }


    @Test(priority = 1, description = "TC_001 - Verify the Guest user generated PNR")
    @Description("Verify GuestUser booking ticket PNR number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to check details using PNR")
    public void verifyPNRNumber() {
        myTripsPage.verifyPNRDetails(userBookingDetails.get(0));
    }

//    @Test
    public void verifyGuestName() {
        myTripsPage.guestUserName();
    }

    @Test(priority = 2)
    public void verifyBookingConfirmed() {
        myTripsPage.checkBookingConfirmed();

    }

    @Test(priority = 3)
    public void verifyDepartureCity() {
        myTripsPage.checkDepartureCity(userBookingDetails.get(1));
    }

    @Test(priority = 4)
    public void verifyDestinationCity() {
        myTripsPage.checkDestinationCity(userBookingDetails.get(2));
    }

    @Test(priority = 5)
    public void verifyBookingDate() {
        myTripsPage.checkBookingDate(userBookingDetails.get(3));
    }

    @Test(priority = 6)
    public void verifyJourneyTime() {
        System.out.println(userBookingDetails.get(4));
       myTripsPage.checkJourneyTime(userBookingDetails.get(4));

    }

    @Test(priority = 7)
    public void verifyPassengerCount() {
        System.out.println(userBookingDetails.get(5));
        myTripsPage.checkPassengerCount(userBookingDetails.get(5));
    }








}
