package tests;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.*;
import utils.ElementUtils;
import utils.LogUtils;

public class LoginUser
{
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    LoginPage loginPage;
    private AndroidDriver driver;
    private ElementUtils elementUtils;
    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private LoginUserPage loginUserPage;


    public LoginUser(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Test(priority = 1, description = "TC_001 - Verify the Guest user generate PNR")
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket")
    public void indigoLoginUser() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");
        loginUserPage = new LoginUserPage(driver);
        loginUserPage.clickOnTo();
        loginUserPage.searchPlace("Mumbai");
        loginUserPage.clickOnFlightList();
        loginUserPage.clickOnFutureDate();






       // elementUtils = new ElementUtils(driver);
//        LogUtils.info("Select Destination city");
//        searchPage.clickOnMumbaiFlight();
//        welcomePage.clickOnFutureDate();
//        searchPage.clickOnSearchButton();

    }

}
