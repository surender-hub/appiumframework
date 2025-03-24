package tests;

import base.BaseTest;
import base.BaseTestLoginUser;
import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigUatReader;
import utils.ElementUtils;
import utils.LogUtils;

public class MyTripsTest extends BaseTestLoginUser {

    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private ValidFarePage validFarePage;
    private ElementUtils elementUtils;
    private ThreadWaitClass threadWaitClass;
    String currentPackage;

    @BeforeClass
    public void setup() {
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        validFarePage = new ValidFarePage(driver);
    }

    /*

    @Test(priority = 1, description = "TC_001 - Verify the Guest user generate PNR")
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket and Generate Pnr")
    @Step("{SearchPage.pnrDetails5}")
    public void generatePnrOneWay() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");

        //welcomePage.loginByOtp();
        welcomePage.clickLoginAsQuest();
        LogUtils.info("User Enter Login Details For OTP");
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
//        searchPage.getPnrDetails();
//        elementUtils.scrollToElementByText("Departure Flight");

        searchPage.getPNRText();

//        elementUtils.attachTextToAllureReport("PNR Details", "Generated PNR: " + SearchPage.pnrDetails5);
//        Allure.step("Generated PNR from Allure.Step: " + SearchPage.pnrDetails5);
//        LogUtils.info("PNR Details Generated");
    }


     */


    @Test(priority = 1, description = "TC_001 - Verify the Guest user generate PNR")
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket and Generate Pnr")
    @Step("{SearchPage.pnrDetails5}")
    public void generatePnrOneWay() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");

        //welcomePage.loginByOtp();
        welcomePage.clickLoginAsQuest();
        LogUtils.info("User Enter Login Details For OTP");
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
        searchPage.getPnrDetails();
        elementUtils.scrollToElementByText("Departure Flight");

       // searchPage.getPNRText();

//        elementUtils.attachTextToAllureReport("PNR Details", "Generated PNR: " + SearchPage.pnrDetails5);
//        Allure.step("Generated PNR from Allure.Step: " + SearchPage.pnrDetails5);
//        LogUtils.info("PNR Details Generated");
    }



}
