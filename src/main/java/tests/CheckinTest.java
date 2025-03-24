package tests;

import base.BaseTestLoginUser;
import constant.ConstantClass;
import io.appium.java_client.android.Activity;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigUatReader;
import utils.ElementUtils;
import utils.LogUtils;

import java.util.HashMap;
import java.util.Map;

public class CheckinTest extends BaseTestLoginUser {

    CheckinPage checkinPage;
    LoginPage loginPage;


    @BeforeClass
    public void setup() {
        checkinPage = new CheckinPage(driver);
        loginPage = new LoginPage(driver);
        loginPage.clickOnContinueAsGuestButton();
    }

    @BeforeMethod
    public void navigateToCheckinMenu() throws Exception{
        checkinPage.clickOnCheckinMenu();
        Thread.sleep(3000);
        ElementUtils.scrollToTop();
    }


    @Test(priority = 1, description = "TC_001 - Verify the FAQ")
    @Description("Verify all FAQ's for GuestUser ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser FAQ's Flow")
    @Story("Guest User should be able to verify the solution of different FAQ's.")
    public void guestUserFAQ() throws InterruptedException {
        LogUtils.info("Guest User checkin....");
        String currentActivity = driver.currentActivity();
        System.out.println(currentActivity);
        checkinPage.moveToText("Need help? Check FAQ");
//        checkinPage.verifyAllFAQ();
    }

    @Test(priority = 2, description = "TC_002 - Verify to chat with us link visibility")
    @Description("Verify chat with us for GuestUser ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("visibilty of Chat with us for Guest User")
    @Story("Guest User should be able to see the chat link.")
    public void verifyChatLinkIsVisible() throws Exception {
        ElementUtils.scrollToEnd();
        checkinPage.verifyChatLink();
    }


    @Test(priority = 3, description = "TC_003 - Verify to functionality of chat with us link")
    @Description("Verify chat with us link for GuestUser ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Functionality of Chat with us for Guest User")
    @Story("Guest User should be able verify the chat with us link.")
    public void verifyChatLinkIsClickable() throws Exception {
        Thread.sleep(3000);
        ElementUtils.scrollToEnd();
        checkinPage.clickVerifyLink();
        driver.navigate().back();
    }

    @Test(priority = 4)
    @Feature("Guest User should be able to see the checkin Page's title")
    public void verifyCheckinPageTitle() {
        checkinPage.verifypageTitle();
    }

    @Test(priority = 5)
    @Description("Verify chat with us link for GuestUser ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Visibility of back arrow button within checkin page for Guest User")
    @Story("Guest User should be able to see the back arrow button in checkin page.")
    public void verifyCheckinBackArrow() {
        checkinPage.verifyBackArrowVisible();
    }

    @Test(priority = 6)
    @Feature("Guest User should be able to move on the Explore page if click back arrow on checkin Page.")
    public void verifyBackButtonNavigation() throws Exception{
        checkinPage.verifyBackArrowClickable();
    }

    @Test(priority = 7)
    @Feature("Guest User should be able to move chat page if click chatBot logo")
    public void verifyChatBotLogoNavigation() {
        checkinPage.verifyChatBot();
        driver.navigate().back();
    }

    @Test(priority = 8)
    @Feature("Guest User should be able to return on the checkin page from chat page.")
    public void verifyReturnToCheckinPageFromChat() throws Exception{
        Thread.sleep(3000);
        checkinPage.verifyReturn();
    }

    @Test(priority = 9)
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Guest User should be able to see the checkin menu remain selected ")
    @Story("Guest User should be able to see the checkin menu remain selected ")
    public void verifyCheckinMenuRemainSelected() throws Exception {
        checkinPage.verifyCheckinMenuSelected();
    }

    @Test(priority = 10)
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Guest User should be able to check the Important Information")
    @Story("Guest User should be able to check the Important Information")
    public void verifyImportantInformation() {
        checkinPage.moveToText("Important Information");
        checkinPage.clickImportantInformationMsg();
        driver.navigate().back();
    }

    @Test(priority = 11)
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Guest User should be able to check safety measure Banner message inside Important Information")
    @Story("Guest User should be able to check safety measure Banner message inside Important Information")
    public void verifySafetyMeasureBannerMsg() {
        checkinPage.moveToText("Important Information");
        checkinPage.checkBannerMessage();
        driver.navigate().back();
    }

    @Test(priority = 12)
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Verify banner message disappears on clicking close (✖) icon")
    @Story("Verify banner message disappears on clicking close (✖) icon")
    public void verifyBannerMsgCrossIcon() throws Exception {
        checkinPage.moveToText("Important Information");
        Assert.assertFalse(checkinPage.clickCrossIcon());
        driver.navigate().back();
    }


}
