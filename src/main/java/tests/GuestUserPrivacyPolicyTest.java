package tests;

import base.BaseTestLoginUser;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.PrivacyPolicyPage;

public class GuestUserPrivacyPolicyTest extends BaseTestLoginUser {

    private PrivacyPolicyPage policyPage;

    @Test(priority = 1, description = "TC_001 - Verify the Privacy Policy link is Displayed or not ",groups = {"regression"})
    @Description("Verify  Privacy Policy link is visible for  Guest user ")
    @Severity(SeverityLevel.NORMAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  see the Privacy Policy link ")
    public void verifyPrivacyPolicylinkIsDisplayed()
    {
        policyPage = new PrivacyPolicyPage(driver);
        policyPage.displayPrivacyPolicy();
    }

    @Test(priority = 2, description = "TC_002 - Verify the Privacy Policy link is Working or not ",groups = {"regression"})
    @Description("Verify  Privacy Policy link is Working for Guest user ")
    @Severity(SeverityLevel.NORMAL)
    @Feature("HomePage")
    @Story("Guest User should be able to  Click on the Privacy Policy link ")
    public void verifyPrivacyPolicyLinkIsWorking() throws InterruptedException {
        policyPage = new PrivacyPolicyPage(driver);
        policyPage.clickPrivacyPolicyLink();
    }
}
