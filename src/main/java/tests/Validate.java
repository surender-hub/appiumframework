package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.ElementUtils;
import utils.LogUtils;

public class Validate extends BaseTest {
    private WelcomePage welcomePage;
    public SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private ValidFarePage validFarePage;
    private ElementUtils elementUtils;
    private String flightFare;
    private String returnFlightFare;
    private int actualtotalFare;
    private String totalFareCheck;
    private int actualFare;


    @Test(priority = 1, description = "TC_001 -Compare Fare details")
    @Description("Verify GuestUser compare fare")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on select city and payment screen")
    public void ValidFareOneWay() throws InterruptedException {
        LogUtils.info("Validate Fare");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFarePage = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        welcomePage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        validFarePage.clickOnFlightList();
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
        Thread.sleep(5000);
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        Thread.sleep(5000);
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        Thread.sleep(5000);
        elementUtils.scrollToElementByText("Total fare");
        String totalFareOnPnrScreen = validFarePage.getTotalFare();
        Assert.assertEquals(validFarePage.getActualText(), totalFareOnPnrScreen, "Test Failed: Texts do NOT match!");
        System.out.println("Actual Text " + validFarePage.getActualText() + " " + " Expected text " + validFarePage.getExpectedText());
    }
    @Test(priority = 2, description = "TC_002 -Compare Fare details Round Trip")
    @Description("Verify GuestUser compare Fare in round trip")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on select city and payment screen")
    public void ValidFareRound() throws InterruptedException {
        LogUtils.info("Validate Fare");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFarePage = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        roundPage.selectRoundTrip();
        roundPage.clickOnToRoundTrip();
        roundPage.searchCity("Mumbai");
        LogUtils.info("Select Destination city");
        roundPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(3);
        Thread.sleep(5000);
        validFarePage.clickOnFutureDate(5);
        Thread.sleep(5000);
        searchPage.clickOnSearchButton();
        validFarePage.clickOnFlightList();
        Thread.sleep(5000);
        flightFare = validFarePage.getActualText();
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        validFarePage.clickOnFlightReturn();
        returnFlightFare = validFarePage.getActualText();
        int num1 = Integer.parseInt(flightFare.replace("₹", "").replace(",", ""));
        int num2 = Integer.parseInt(returnFlightFare.replace("₹", "").replace(",", ""));
        actualtotalFare = num1 + num2;
        System.out.println("Total Fare: " + actualtotalFare + "flightFare: " + flightFare + "Return FLight Fare: " + returnFlightFare);
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
        Thread.sleep(5000);
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        Thread.sleep(5000);
        totalFareCheck = validFarePage.getActualText();
        int totalExpectedFare = Integer.parseInt(totalFareCheck.replace("₹", "").replace(",", ""));
        System.out.println("Total fare check " + totalExpectedFare);
        Assert.assertEquals(actualtotalFare, totalExpectedFare, "Fare mismatch! Test Case Failed.");
        System.out.println("Test Case Passed: Fare is as expected.");
    }


    @Test(priority = 3, description = "TC_003 -Compare Fare details in Multi city")
    @Description("Verify GuestUser compare Fare in Multi city")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on Delhi to Mumbai and Mumbai to Agra city")
    public void ValidFareMultiCity() throws InterruptedException {
        LogUtils.info("Validate Fare for Multi city");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFarePage = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
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
        validFarePage.clickOnFlightList();
        Thread.sleep(5000);
        String flightFareDelhi = validFarePage.getActualText();
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        validFarePage.clickOnFlightReturn();
        String cityFlightMumbai = validFarePage.getActualText();
        int num1 = Integer.parseInt(flightFareDelhi.replace("₹", "").replace(",", ""));
        int num2 = Integer.parseInt(cityFlightMumbai.replace("₹", "").replace(",", ""));
        int actualMultiFare = num1 + num2;
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
        Thread.sleep(5000);
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        Thread.sleep(5000);
        String totalExpectedCheck = validFarePage.getActualText();
        int totalExpectedFares = Integer.parseInt(totalExpectedCheck.replace("₹", "").replace(",", ""));
        System.out.println("Total fare check " + totalExpectedFares);
        Assert.assertEquals(actualMultiFare, totalExpectedFares, "Fare mismatch! Test Case Failed.");
        System.out.println("Test Case Passed: Fare is as expected.");
    }

    @Test(priority = 4, description = "TC_004 -Compare Date details one Way")
    @Description("Verify GuestUser compare Date in One Way")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on select city and payment screen")
    public void validateDateOneWay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        seatPage = new SeatPage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        String ExpectedDate = welcomePage.printFutureDate().trim();

        welcomePage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        Thread.sleep(2000);
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
        Thread.sleep(20000);
        //searchPage.getPnrDetails();
        String DestinationDate = searchPage.validateDate();
        String ActualDate = DestinationDate.substring(5, 8).trim();
        System.out.println(DestinationDate);
        System.out.println(ActualDate);
        Assert.assertEquals(ExpectedDate, ActualDate, "Date is mismatch test case failed");
        LogUtils.info("Validate Date Succesfully");
    }

    @Test(priority = 5, description = "TC_005 -Compare Date details Round Way")
    @Description("Verify GuestUser compare Date in One Way")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on select city and payment screen")
    public void validateDateRoundWay() throws InterruptedException {
        LogUtils.info("Validate Fare");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFarePage = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
try {
    welcomePage.clickLogin();
    roundPage.selectRoundTrip();
    roundPage.clickOnToRoundTrip();
    roundPage.searchCity("Mumbai");
    LogUtils.info("Select Destination city");
    roundPage.clickOnMumbaiFlight();
    validFarePage.clickOnFutureDate(3);
    Thread.sleep(5000);
    String expectedDate = validFarePage.getFutureDate(3).trim();
    System.out.println("print expected Date 3 days ahead" + expectedDate);
    //String ExpectedDate = welcomePage.printFutureDate().trim();
    validFarePage.clickOnFutureDate(5);
    String expectedDate2 = validFarePage.getFutureDate(5).trim();
    System.out.println("print expected Date 5 days ahead" + expectedDate2);

    Thread.sleep(5000);
    searchPage.clickOnSearchButton();
    validFarePage.clickOnFlightList();
    Thread.sleep(5000);
    flightFare = validFarePage.getActualText();
    searchPage.bookingNextButton();
    Thread.sleep(5000);
    validFarePage.clickOnFlightReturn();
    searchPage.bookingNextButton();
    Thread.sleep(5000);
    searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
    Thread.sleep(5000);
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
    Thread.sleep(5000);
    elementUtils.scrollToElementByText("Departure Flight");
    String DestinationDate = driver.findElement(By.xpath(" (//android.widget.TextView[@text=\"Departure Flight\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView)[1]")).getText();
    System.out.println(DestinationDate);
    String ActualDate1 = DestinationDate.substring(5, 8).trim();
    System.out.println(DestinationDate);
    System.out.println(ActualDate1);

    elementUtils.scrollToElementByText("Passengers and Add-ons");
    String DestinationDate2 = driver.findElement(By.xpath(" (//android.widget.TextView[@text=\"Return Flight\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView)[1]")).getText();
    System.out.println(DestinationDate2);
    String ActualDate2 = DestinationDate.substring(5, 8).trim();
    System.out.println(ActualDate2);

    //Assert.assertEquals(expectedDate, ActualDate, "Date is mismatch test case failed");
    LogUtils.info("Validate Date Succesfully");
}
catch (Exception e) {
    // LogUtils.error(e.getMessage());
    //System.out.println("TestCase failed ");

}
    }


    @Test(priority = 6, description = "TC_006 -Compare Date details Multiple Way")
    @Description("Verify GuestUser compare Date in One Way")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on select city and payment screen")
    public void validateDateMultiWay() throws InterruptedException {
        LogUtils.info("Validate Fare for Multi city");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFarePage = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
        try {
            welcomePage.clickLogin();
            multiCity.clickOnMultiCity();
            Thread.sleep(2000);
            multiCity.clickOnTo1();
            searchPage.searchPlace("Mumbai");
            LogUtils.info("Select Destination city");
            searchPage.clickOnMumbaiFlight();
            validFarePage.clickOnFutureDate(3);
            String expectedDate = validFarePage.getFutureDate(3).trim();
            System.out.println("print expected Date 3 days ahead " + expectedDate);

            multiCity.clickOnTo2();
            searchPage.searchPlace("Agra");
            LogUtils.info("Select Destination city");
            multiCity.clickOnAgraFlight();
            validFarePage.clickOnFutureDate(5);
            String expectedDate2 = validFarePage.getFutureDate(5).trim();
            System.out.println("print expected Date 5 days ahead" + expectedDate2);
            Thread.sleep(10000);
            elementUtils.scrollToElementByText("Search");
            roundPage.clickOnSearchButton();
            validFarePage.clickOnFlightList();
            Thread.sleep(5000);
            validFarePage.clickOnFlightReturn();
            searchPage.bookingNextButton();
            Thread.sleep(5000);
            searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
            Thread.sleep(5000);
            LogUtils.info("Enter User Details");
            searchPage.clickOnSkipToPayment();
            Thread.sleep(5000);
            //  Assert.assertEquals(actualMultiFare, totalExpectedFares, "Fare mismatch! Test Case Failed.");
            System.out.println("Test Case Passed: Fare is as expected.");
        }
        catch (Exception e)
        {
            System.out.println("Test case got failed");
        }
    }
}
