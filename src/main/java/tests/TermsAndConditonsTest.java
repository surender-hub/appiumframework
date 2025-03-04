package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.TermsAndConditionPage;
import utils.LogUtils;

public class TermsAndConditonsTest extends BaseTest {



     @Test(groups = {"regression"},priority = 1, description = "TC_001 -Validate the Terms And Condition Link in Clickable or not ")
    @Description("Validate the Terms And Condition Link in Clickable or not")
    @Feature("GuestUser compare fare on payment screen")
    public void validateTermsAndConditionLink() throws InterruptedException {

         TermsAndConditionPage termsAndConditionPage = new TermsAndConditionPage(driver);
        termsAndConditionPage.validateTermsAndConditonLink();
        Thread.sleep(5000);
        LogUtils.info("Validate Terms and Conditions Page is Clickable or not ");

    }


    @Test(groups = {"regression"},priority = 2, description = "TC_002 -Validate the Terms And Condition Page Text")
    @Description("Validate the Terms And Condition Page Title Text is Visible or not")
    @Feature("GuestUser compare fare on payment screen")
    public void validateTermsAndConditionsPage() throws InterruptedException {
        TermsAndConditionPage termsAndConditionPage = new TermsAndConditionPage(driver);
        termsAndConditionPage.verifyText();
        Thread.sleep(5000);
        LogUtils.info("Validate Terms and Conditions Page text is visible  ");

    }


}
