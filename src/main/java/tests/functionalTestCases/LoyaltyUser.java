package tests.functionalTestCases;

import base.BaseSuper;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LoyaltyUserPage;
import utils.ConfigUatReader;
import utils.ElementUtils;

public class LoyaltyUser extends BaseSuper {
    private static final Logger log = LoggerFactory.getLogger(LoyaltyUser.class);
    private ElementUtils elementUtils;
    LoyaltyUserPage loyaltyUserPage;


    @Test(priority = 1, description = "TC_001 - Loyalty User", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Continue with Loyalty Full Flow with all Add-ons")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Add-ons features")
    @Story("After Login Loyalty User check add-0ne features on single Trip")
    public void testEnterValidMobileNumberAndContinue() {
        loyaltyUserPage = new LoyaltyUserPage(driver);
        loyaltyUserPage.bookSingleTripWithAddOns();
    }
}
