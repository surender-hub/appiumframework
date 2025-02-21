package tests;


import base.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.annotations.Test;
import pages.*;
import utils.ElementUtils;
import utils.LogUtils;

import java.util.List;

public class IndigoTest extends BaseTest {

    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private ValidFarePage validFarePage;
    private ElementUtils elementUtils;
    String currentPackage;

    @Test(priority = 1, description = "TC_001 - Verify the Guest user generate PNR", retryAnalyzer = RetryAnalyzer.class)
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket")
    public void generatePnrOneWay() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(3);
        searchPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        Thread.sleep(5000);
        searchPage.bookingNextButton();
        searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        searchPage.getPnrDetails();
        LogUtils.info("PNR Details Generated");
    }

    @Test(priority = 2, description = "TC_002 - Verify the Guest user select seat and generate PNR", retryAnalyzer = RetryAnalyzer.class)
    @Description("Verify GuestUser booking ticket by selecting seat end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow ans select seat")
    @Story("User should be able to Book Ticket by selecting seat")
    public void generatePnrSelectSeatOneWay() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        seatPage = new SeatPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(3);
        searchPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        searchPage.bookingNextButton();
        searchPage.enterUserDetails("ahyil", "pal", "02/04/1953", "6474344463", "Indisddftusneo@gmail.com");
        LogUtils.info("Enter User Details");
        seatPage.selectSeat();
        seatPage.clickOnNextButton();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        Thread.sleep(10000);
        searchPage.getPnrDetails();
        LogUtils.info("PNR Details Generated");

    }

    @Test(priority = 3, description = "TC_003 - Modify the PNR details", retryAnalyzer = RetryAnalyzer.class)
    @Description("Verify GuestUser modify the PNR details")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Modify the PNR id he wants")
    @Story("Guest User should be able to modify the PNR details")
    public void modifyPnrDetails() throws InterruptedException {
        LogUtils.info("Guest User Modify the PNR");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        modifyPage = new ModifyPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        welcomePage.clickLogin();
        modifyPage.clickOnMyTrips();
        modifyPage.enterPnr("K3NL7E");
        modifyPage.enterEmail("surender@gmail.com");
        modifyPage.clickOnGetStarted();
        Thread.sleep(10000);
        modifyPage.clickOnModify();
        Thread.sleep(10000);
        modifyPage.clickOnChangeFlightButton();
        modifyPage.clickOnCheckBox();
        Thread.sleep(2000);
        modifyPage.clickOnProceedButton();
        modifyPage.clickOnFlightList();
        Thread.sleep(2000);
        modifyPage.clickOnNxtButton();
        modifyPage.modifyFlight();
        modifyPage.clickOnNxtButton();
        modifyPage.clickOnFinishButton();
        modifyPage.clickOnCancelButton();
        LogUtils.info("PNR Details Generated");

    }


    @Test(priority = 4, description = "TC_004 -Round  Trip booking", retryAnalyzer = RetryAnalyzer.class)
    @Description("Verify GuestUser booked the round trip")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser book round trip")
    @Story("Guest User should be able to book round trip")
    public void generatePnrRoundWay() throws InterruptedException {
        LogUtils.info("Round Trip booking");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        modifyPage = new ModifyPage(driver);
        roundPage = new RoundPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        welcomePage.clickLogin();
        roundPage.selectRoundTrip();
        roundPage.clickOnToRoundTrip();
        roundPage.searchCity("Mumbai");
        LogUtils.info("Select Destination city");
        roundPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(3);
        Thread.sleep(5000);
        validFarePage.clickOnFutureDate(5);
        roundPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        searchPage.bookingNextButton();
        roundPage.clickOnReturnFlight();
        Thread.sleep(6000);
        roundPage.nextButton();
        Thread.sleep(5000);
        searchPage.enterUserDetails("anil", "pal", "04/04/1953", "6474344463", "abc@gmail.com");
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        Thread.sleep(10000);
        searchPage.getPnrDetails();
        LogUtils.info("PNR Details Generated");
    }


    @Test(priority = 5, description = "TC_005 -MultiCity booking", retryAnalyzer = RetryAnalyzer.class)
    @Description("Verify GuestUser booked Multi city flight")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser book MultiCity")
    @Story("Guest User should be able to book Multi CIty")
    public void generatePnrMultiCityWay() throws InterruptedException {
        LogUtils.info("Multi City");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        elementUtils = new ElementUtils(driver);
        validFarePage = new ValidFarePage(driver);
        welcomePage.clickLogin();
        multiCity.clickOnMultiCity();
        Thread.sleep(2000);
        multiCity.clickOnTo1();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(3);
        multiCity.clickOnTo2();
        searchPage.searchPlace("Agra");
        LogUtils.info("Select Destination city");
        multiCity.clickOnAgraFlight();
        validFarePage.clickOnFutureDate(5);
        Thread.sleep(10000);
        elementUtils.scrollToElementByText("Search");
        roundPage.clickOnSearchButton();
        roundPage.clickOnReturnFlight();
        Thread.sleep(6000);
        roundPage.nextButton();
        roundPage.clickOnReturnFlight();
        Thread.sleep(6000);
        roundPage.nextButton();
        Thread.sleep(5000);
        searchPage.enterUserDetails("anil", "pal", "04/04/1953", "6474344463", "abc@gmail.com");
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        LogUtils.info("Click on Button pay");
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        LogUtils.info("Response Button clicked");
        Thread.sleep(10000);
        searchPage.getPnrDetails();
        LogUtils.info("PNR Details Generated");
    }
}


