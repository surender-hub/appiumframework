package tests;

import base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.*;
import utils.ElementUtils;
import utils.LogUtils;

public class ValidateFare extends BaseTest
{
    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private RoundPage roundPage;
    private MultiCity multiCity;
    private ElementUtils elementUtils;


    @Test(priority = 1, description = "TC_001 -MultiCity booking")
    @Description("Verify GuestUser booked Multi city flight")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser book MultiCity")
    @Story("Guest User should be able to book Multi CIty")
    public void Valid() throws InterruptedException {
        LogUtils.info("Validate Fare");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        multiCity = new MultiCity(driver);
        roundPage = new RoundPage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();



    }
}
