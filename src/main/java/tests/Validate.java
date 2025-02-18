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
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private ValidFarePage validFare;
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
    public void ValidFare() throws InterruptedException {
        LogUtils.info("Validate Fare");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFare = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        welcomePage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        validFare.clickOnFlightList();
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
        Thread.sleep(5000);
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        Thread.sleep(5000);
        Assert.assertEquals(validFare.getActualText(), validFare.getExpectedText(), "Test Failed: Texts do NOT match!");
        System.out.println("Actual Text " + validFare.getActualText() + " " + " Expected text " + validFare.getExpectedText());
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
        validFare = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        roundPage.selectRoundTrip();
        roundPage.clickOnToRoundTrip();
        roundPage.searchCity("Mumbai");
        LogUtils.info("Select Destination city");
        roundPage.clickOnMumbaiFlight();
        validFare.clickOnFutureDate();
        Thread.sleep(5000);
        validFare.clickOnReturnDate();
        Thread.sleep(5000);
        searchPage.clickOnSearchButton();
        validFare.clickOnFlightList();
        Thread.sleep(5000);
        flightFare = validFare.getActualText();
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        validFare.clickOnFlightReturn();
        returnFlightFare = validFare.getActualText();
        int num1 = Integer.parseInt(flightFare.replace("₹", "").replace(",", ""));
        int num2 = Integer.parseInt(returnFlightFare.replace("₹", "").replace(",", ""));
        actualtotalFare = num1 + num2;
        System.out.println("Total Fare: "+actualtotalFare+ "flightFare: "+flightFare+ "Return FLight Fare: "+returnFlightFare);
        searchPage.bookingNextButton();
        Thread.sleep(5000);
        searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
        Thread.sleep(5000);
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        Thread.sleep(5000);
        totalFareCheck = validFare.getActualText();
        int totalExpectedFare = Integer.parseInt(totalFareCheck.replace("₹", "").replace(",", ""));
        System.out.println("Total fare check "+totalExpectedFare);
        Assert.assertEquals(actualtotalFare, totalExpectedFare, "Fare mismatch! Test Case Failed.");
        System.out.println("Test Case Passed: Fare is as expected.");
    }



    @Test(priority = 3, description = "TC_003 -Compare Fare details Round Trip")
    @Description("Verify GuestUser compare Fare in Round trip")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on select city and payment screen")
    public void ValidFareMultiCity() throws InterruptedException {
        LogUtils.info("Validate Fare");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFare = new ValidFarePage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();


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
        String ExpectedDate = welcomePage.printFutureDate();
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
        Thread.sleep(10000);
        //searchPage.getPnrDetails();
        String DestinationDate = searchPage.validateDate();
        //String DestinationDate = driver.findElements(By.className("android.widget.TextView")).get(5).getText();
           String ActualDate=  DestinationDate.substring(5,8);
        System.out.println(DestinationDate);
        System.out.println(ActualDate);
        Assert.assertEquals(ExpectedDate,ActualDate,"Date is Same");

        LogUtils.info("Validate Date Succesfully");

    }
}
