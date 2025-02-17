package tests;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.*;
import utils.ElementUtils;
import utils.LogUtils;

public class LoginUser extends BaseTest
{
    private static final Logger log = LoggerFactory.getLogger(LoginUser.class);
    private ElementUtils elementUtils;
    public LoginUserPage loginUserPage;
    public LoginPage loginPage;
    public SearchPage searchPage;

    @Test(priority = 1, description = "TC_001 - Verify the Guest user generate PNR")
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket")
    public void indigoLoginUser() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");
        loginPage = new LoginPage(driver);
        loginUserPage = new LoginUserPage(driver);
        searchPage = new SearchPage(driver);
        loginPage.enterMobileNumber("8265858568");
        loginPage.clickOnContinue();
        loginPage.enterPassword("Bhagatsingh@1");
        loginUserPage.loginButton();
        Thread.sleep(10000);
        loginUserPage.clickOnTo();
        loginUserPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        loginUserPage.clickOnMumbaiFlight();
        loginUserPage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        loginUserPage.clickOnFlightList();
        loginUserPage.bookingNextButton();
        Thread.sleep(3000);
        loginUserPage.clickCheckbox();
        Thread.sleep(5000);
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

}
