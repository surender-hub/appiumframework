
package tests;


import base.BaseTest;
import base.BaseTestLoginUser;
import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigReader;
import utils.ConfigUatReader;
import utils.ElementUtils;
import utils.LogUtils;
import java.io.ByteArrayInputStream;

public class LoginUserIndigoEndToEndFlowTest extends BaseTest {

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

    @Test(priority = 1, description = "TC_001 - Verify the Login user generate PNR")
    @Description("Verify LoginUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("LoginUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket and Generate Pnr")
    //@Step("{SearchPage.pnrDetails5}")
    public void generatePnrOneWay() throws InterruptedException {
        LogUtils.info("Login User booking ticket using skip to payment");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        validFarePage = new ValidFarePage(driver);
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
        elementUtils.attachTextToAllureReport("PNR Details", "Generated PNR: " + SearchPage.pnrDetails5);
        Allure.step("Generated PNR from Allure.Step: " + SearchPage.pnrDetails5);
        LogUtils.info("PNR Details Generated");
    }

    @Test(priority = 2, description = "TC_002 - Verify the Login user select seat and generate PNR")
    @Description("Verify LoginUser booking ticket by selecting seat end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("LoginUser Booking Ticket Flow ans select seat")
    @Story("User should be able to Book Ticket by selecting seat")
    public void generatePnrSelectSeatOneWay() throws InterruptedException {
        LogUtils.info("Login User booking ticket using skip to payment");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        seatPage = new SeatPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        //welcomePage.clickLogin();
        welcomePage.clickLoginAsQuest();
        try {
            searchPage.clickOnTo();
            LogUtils.info("User Click on Going To Flight Link");
        } catch (Exception e) {
            searchPage.clickOnTo();
        }
        searchPage.searchPlace(ConfigUatReader.getProperty("source"));
        LogUtils.info("Search Destination city");
        searchPage.clickOnMumbaiFlight();
        LogUtils.info("Select Destination city");
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
        seatPage.selectSeat();
        LogUtils.info("User Select Seat");
        seatPage.clickOnNextButton();
        LogUtils.info("User Click on  next Button");
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
        elementUtils.attachTextToAllureReport("PNR Details", "Generated PNR: " + SearchPage.pnrDetails5);
        Allure.step("Generated PNR from Allure.Step: " + SearchPage.pnrDetails5);
        LogUtils.info("PNR Details Generated");

    }

 /*   @Test(priority = 3, description = "TC_003 - Modify the PNR details")
    @Description("Verify LoginUser modify the PNR details")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("LoginUser Modify the PNR id he wants")
    @Story("Login User should be able to modify the PNR details")
    public void modifyPnrDetails() throws InterruptedException {
        LogUtils.info("Login User Modify the PNR");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        modifyPage = new ModifyPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        welcomePage.clickLoginAsQuest();
        modifyPage.clickOnMyTrips();
        modifyPage.enterPnr("K3NL7E");
        modifyPage.enterEmail("surender@gmail.com");
        modifyPage.clickOnGetStarted();
        modifyPage.clickOnModify();
        modifyPage.clickOnChangeFlightButton();
        modifyPage.clickOnCheckBox();
        modifyPage.clickOnProceedButton();
        searchPage.clickOnBookingList();
        //modifyPage.clickOnFlightList();
        //Thread.sleep(2000);
        modifyPage.clickOnNxtButton();
        modifyPage.modifyFlight();
        modifyPage.clickOnNxtButton();
        modifyPage.clickOnFinishButton();
        modifyPage.clickOnCancelButton();
        LogUtils.info("PNR Details Generated");
        System.out.println("Test case is failing due to Known issue");

    }*/


    @Test(priority = 4, description = "TC_004 -Round  Trip booking")
    @Description("Verify LoginUser booked the round trip")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("LoginUser book round trip")
    @Story("Login User should be able to book round trip")
    public void generatePnrRoundWay() throws InterruptedException {
        LogUtils.info("Round Trip booking");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        modifyPage = new ModifyPage(driver);
        roundPage = new RoundPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        // welcomePage.clickLogin();
        welcomePage.clickLoginAsQuest();
        roundPage.selectRoundTrip();
        roundPage.clickOnToRoundTrip();
        roundPage.searchCity(ConfigUatReader.getProperty("source"));
        LogUtils.info("Select Destination city");
        roundPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(ConstantClass.FUTURE_DATE);
        Thread.sleep(5000);
        validFarePage.clickOnFutureDate(ConstantClass.FUTURE_DATE_NEXT);
        roundPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        //validFarePage.clickOnFlightReturn();
        searchPage.bookingNextButton();
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);  // Waits for 5 seconds
        searchPage.clickOnBookingList();
        //validFarePage.clickOnFlightReturn();
        //roundPage.clickOnReturnFlight();
        //Thread.sleep(6000);
        roundPage.nextButton();
        //Thread.sleep(5000);
        searchPage.enterUserDetails(ConfigUatReader.getProperty("firstname"), ConfigUatReader.getProperty("lastname"), ConfigUatReader.getProperty("dob"), ConfigUatReader.getProperty("phone"), ConfigUatReader.getProperty("email"));
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue(ConfigUatReader.getProperty("search_payment"));
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        searchPage.getPnrDetails();
        elementUtils.attachTextToAllureReport("PNR Details", "Generated PNR: " + SearchPage.pnrDetails5);
        Allure.step("Generated PNR from Allure.Step: " + SearchPage.pnrDetails5);
        LogUtils.info("PNR Details Generated");
    }

    @Test(priority = 5, description = "TC_005 -MultiCity booking")
    @Description("Verify LoginUser booked Multi city flight")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("LoginUser book MultiCity")
    @Story("Login User should be able to book Multi CIty")
    public void generatePnrMultiCityWay() throws InterruptedException {
        LogUtils.info("Multi City");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        //welcomePage.clickLogin();
        welcomePage.clickLoginAsQuest();
        multiCity.clickOnMultiCity();
        ThreadWaitClass.customSleep(ConstantClass.SHORT_WAIT_2);
        multiCity.clickOnTo1();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        searchPage.searchPlace(ConfigUatReader.getProperty("source"));
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(ConstantClass.FUTURE_DATE);
        multiCity.clickOnTo2();
        searchPage.searchPlace(ConfigUatReader.getProperty("agra"));
        LogUtils.info("Select Destination city");
        multiCity.clickOnAgraFlight();
        validFarePage.clickOnFutureDate(ConstantClass.FUTURE_DATE_NEXT);
        ElementUtils.scrollToElementByText("Search");
        roundPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        roundPage.nextButton();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        searchPage.clickOnBookingList();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        roundPage.nextButton();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        searchPage.enterUserDetails(ConfigUatReader.getProperty("firstname"), ConfigUatReader.getProperty("lastname"), ConfigUatReader.getProperty("dob"), ConfigUatReader.getProperty("phone"), ConfigUatReader.getProperty("email"));
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue(ConfigUatReader.getProperty("search_payment"));
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        LogUtils.info("Click on Button pay");
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        LogUtils.info("Response Button clicked");
        searchPage.getPnrDetails();
        elementUtils.attachTextToAllureReport("PNR Details", "Generated PNR: " + SearchPage.pnrDetails5);
        Allure.step("Generated PNR from Allure.Step: " + SearchPage.pnrDetails5);
        LogUtils.info("PNR Details Generated");
    }


    @Test(priority = 6, description = "TC_006 -Round  Trip booking Select seat on both way")
    @Description("Verify LoginUser booked the round trip with selecting seat")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("LoginUser book round trip with selecting seat")
    @Story("Login User should be able to book round trip with seat on both way")
    public void generatePnrRoundWaySelectSeat() throws InterruptedException {
        LogUtils.info("Round Trip booking");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        modifyPage = new ModifyPage(driver);
        roundPage = new RoundPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        welcomePage.clickLoginAsQuest();
        roundPage.selectRoundTrip();
        roundPage.clickOnToRoundTrip();
        roundPage.searchCity(ConfigUatReader.getProperty("source"));
        LogUtils.info("Select Destination city");
        roundPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(ConstantClass.FUTURE_DATE);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        validFarePage.clickOnFutureDate(ConstantClass.FUTURE_DATE_NEXT);
        roundPage.clickOnSearchButton();
//        Thread.sleep(5000);
        searchPage.clickOnBookingList();
//        Thread.sleep(5000);
        searchPage.bookingNextButton();
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        searchPage.clickOnBookingList();
//        Thread.sleep(5000);
        roundPage.nextButton();
//        Thread.sleep(5000);
        searchPage.enterUserDetails(ConfigUatReader.getProperty("firstname"), ConfigUatReader.getProperty("lastname"), ConfigUatReader.getProperty("dob"), ConfigUatReader.getProperty("phone"), ConfigUatReader.getProperty("email"));
        LogUtils.info("Enter User Details");
        try {
            searchPage.bookingNextButton();
        } catch (Exception e) {
            searchPage.bookingNextButton();

        }
        searchPage.bookingNextButton();
        searchPage.selectSeatDelhiToMumbai();
        searchPage.selectSeatMumbaiToDelhi();
        searchPage.bookingNextButton();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue(ConfigUatReader.getProperty("search_payment"));
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        LogUtils.info("Clicking on Button Response");
        searchPage.clickOnButtonResponse();
        LogUtils.info("CLicked on button Response");
        searchPage.getPnrDetails();
        elementUtils.attachTextToAllureReport("PNR Details", "Generated PNR: " + SearchPage.pnrDetails5);
        Allure.step("Generated PNR from Allure.Step: " + SearchPage.pnrDetails5);
    }
}


