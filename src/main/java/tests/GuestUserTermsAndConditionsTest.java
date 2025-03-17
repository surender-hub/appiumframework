package tests;

import base.BaseTestLoginUser;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.TermsAndConditionPage;

public class GuestUserTermsAndConditionsTest extends BaseTestLoginUser {

     @Test(groups = {"regression"},priority = 1, description = "TC_001 -Validate the Terms And Condition Link in Working or not ")
    @Description("Validate the Terms And Condition Link in Working or not")
    @Feature("GuestUser")
    public void validateTermsAndConditionLink() throws InterruptedException{
         TermsAndConditionPage termsAndConditionPage = new TermsAndConditionPage(driver);
          termsAndConditionPage.validateTermsAndConditionsLink();
     }

}
