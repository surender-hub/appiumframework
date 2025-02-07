package tests;


import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.WelcomePage;
import utils.ElementUtils;

public class IndigoTest2 extends BaseTest {

    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private ElementUtils elementUtils;

    @Test
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket")
    public void welcomeToIndigo() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        searchPage.clickOnMumbaiFlight();
        welcomePage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        searchPage.bookingNextButton();
        searchPage.enterUserDetails("Shubham", "Jain", "01/01/1995", "8473647464", "Indigostatusneo@gmail.com");
        searchPage.clickOnSkipToPayment();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        Thread.sleep(10000);
        searchPage.getPnrDetails();
    }
}