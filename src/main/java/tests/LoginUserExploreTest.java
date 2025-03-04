package tests;

import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.LoginUserExplorePage;
import utils.ElementUtils;

public class LoginUserExploreTest extends BaseTestLoginUser
{

    private ThreadWaitClass threadWaitClass;
    public ElementUtils elementUtils;
    public LoginUserExplorePage loginUserExplorePage;

    @Test(priority = 1, description = "TC_001 - Verify Explore Page functionality after Login.")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Login User should be able to redirect on Explore Page")
    public void verifyMyTripsButtonIsDisplayed() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.loginUser();
        loginUserExplorePage.pressExploreButton();
    }

    @Test(priority = 2, description = "TC_002 - Verify Explore Page functionality after Login.")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a flight text should be visible")
    public void verifyBookFlightText()  {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyBookFlightText();

    }

    @Test(priority = 3, description = "TC_003 - Verify Explore Page functionality after Login.")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay text is displayed")
    public void verifyBookStayText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyStayText();
    }

    @Test(priority = 4, description = "TC_004 - Verify Explore Page functionality after Login.")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay is clickable")
    public void verifyBookStayClickable(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressBookStay();
    }

    @Test(priority = 5, description = "TC_005 - Verify Explore Page functionality after Login.")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Flight is clickable")
    public void verifyBookFlightClickable() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressBookFlight();
    }
}
