package tests.functionalTestCases;

import base.BaseGuestUser;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.ProfilePage;

public class Login_LogOut_MultipleTimes extends BaseGuestUser {

    private ProfilePage profilePage;

    @Test(priority = 1, description = "TC_01 - Try to Login and Logout Multiple Times ")
    @Description("Verify Login and Logout Multiple Times ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Guest User should be able to  Login and Logout Multiple Times ")
    public void loginLogOut() {
        profilePage = new ProfilePage(driver);
        profilePage.checkLoginLogout();
        profilePage.ClickProfileButton();
        profilePage.checkLoginLogout();
        profilePage.ClickProfileButton();
        profilePage.checkLoginScreen();
    }
}
