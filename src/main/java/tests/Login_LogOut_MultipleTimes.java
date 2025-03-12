package tests;

import base.BaseTestLoginUser;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.WelcomePage;

import static utils.ElementUtils.driver;

public class Login_LogOut_MultipleTimes  extends BaseTestLoginUser {

    private WelcomePage welcomePage;
    private ProfilePage profilePage;

    @Test(priority = 1, description = "TC_01 - Verify the Profile button is Displayed or not ")
    @Description("Verify  Profile button is visible for  Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Guest User should be able to  see the Profile  button")
    public void loginLogOut() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        welcomePage.loginByOtp();
        profilePage.clickProfileButton();
        Thread.sleep(5000);
        profilePage.clickOnLogOutButton();
        welcomePage.loginByOtp();
        profilePage.clickProfileButton();
        Thread.sleep(5000);
        profilePage.clickOnLogOutButton();
    }
}
