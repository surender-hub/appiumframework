package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.PrivacyPolicyPage;
import pages.WelcomePage;

public class PrivacyPolicyTest extends BaseTest {

    private PrivacyPolicyPage policyPage;

    @Test(priority = 1, description = "TC_001 - Verify the Privacy Policy link is Displayed or not ")
    @Description("Verify  Privacy Policy link is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the Privacy Policy link ")
    public void verifyPrivacyPolicylinkIsDisplayed()
    {
        policyPage = new PrivacyPolicyPage(driver);
        policyPage.displayPrivacyPolicy();
    }

    @Test(priority = 2, description = "TC_002 - Verify the Privacy Policy link is Working or not ")
    @Description("Verify  Privacy Policy link is Clickable for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  Click on the Privacy Policy link ")
    public void verifyPrivacyPolicyLinkIsWorking() throws InterruptedException {
        policyPage = new PrivacyPolicyPage(driver);
        policyPage.clickPrivacyPolicyLink();
        Thread.sleep(5000);
    }
}
