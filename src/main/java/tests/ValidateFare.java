package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.ElementUtils;
import utils.LogUtils;

public class ValidateFare extends BaseTest {
    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private ValidFare validFare;
    private ElementUtils elementUtils;

    @Test(priority = 1, description = "TC_001 -Compare Fare details")
    @Description("Verify GuestUser compare text")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser compare fare on payment screen")
    @Story("Guest User should be able compare fare on select city and payment screen")
    public void ValidFare() throws InterruptedException {
        LogUtils.info("Validate Fare");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        validFare = new ValidFare(driver);
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
}
