package tests;

import base.BaseGuestUser;
import base.BaseSuper;
import base.BaseTestLoginUser;
import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.ProfilePage;
import pages.WelcomePage;

import static utils.ElementUtils.driver;

public class Login_LogOut_MultipleTimes  extends BaseSuper {

    private WelcomePage welcomePage;
    private ProfilePage profilePage;

    @Test(priority = 1, description = "TC_01 - Try to Login and Logout Multiple Times ")
    @Description("Verify Login and Logout Multiple Times ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Guest User should be able to  Login and Logout Multiple Times ")
    public void loginLogOut() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        profilePage=new ProfilePage(driver);
        welcomePage.loginByOtp();
//        profilePage.ClickProfileButton();
//        profilePage.verifyLogOutButton();
//        welcomePage.loginByOtp();
//        profilePage.ClickProfileButton();
//        profilePage.verifyLogOutButton();
    }
}
