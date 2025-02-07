package tests;


import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.WelcomePage;
import utils.AllureUtils;
import utils.ElementUtils;
import utils.LogUtils;

public class IndigoTest2 extends BaseTest {

    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private ElementUtils elementUtils;

    @Test(priority = 1, description = "TC_001 - Verify the Guest user generate PNR")
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket")
    public void indigoUatFLow1() throws InterruptedException
    {
        LogUtils.info("Guest User booking ticket using skip to payment");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        welcomePage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        searchPage.bookingNextButton();
        searchPage.enterUserDetails("surender", "pal", "01/04/1995", "6474627463", "Indigtusneo@gmail.com");
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

    @Test(priority = 2, description = "TC_002 - Verify the Guest user select seat and generate PNR")
    @Description("Verify GuestUser booking ticket by selecting seat end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow ans select seat")
    @Story("User should be able to Book Ticket by selecting seat")
    public void indigoUatFLow2() throws InterruptedException
    {

    }





//How to call
    // captureScreenshotStep("After opening the website");
//    @Step("Screenshot: {0}")
//    public void captureScreenshotStep(String description) {
//        AllureUtils.takeScreenshot(driver);
//    }


}