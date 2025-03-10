package tests;

import base.BaseTest;
import base.BaseTestLoginUser;
import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GuestUserExplorePage;
import pages.LoginPage;
import pages.LoginUserExplorePage;
import pages.WelcomePage;
import utils.ElementUtils;

public class GuestUserExploreTest extends BaseTest {

    private ThreadWaitClass threadWaitClass;
    public ElementUtils elementUtils;
    public GuestUserExplorePage guestUserExplorePage;
    public LoginPage loginPage;
    public WelcomePage welcomePage;

    @Test(priority = 1, description = "TC_001 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Guest User should be able to redirect on Explore Page")
    public void verifyExploreDisplayed() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        // loginPage = new LoginPage(driver);
        // loginUserExplorePage.loginUser();
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        //loginPage.clickOnContinue();
        guestUserExplorePage.pressExploreButton();
    }

    @Test(priority = 2, description = "TC_002 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a flight text should be visible")
    public void verifyBookFlightText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyBookFlightText();

    }

    @Test(priority = 3, description = "TC_003 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay text is displayed")
    public void verifyBookStayText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyStayText();
    }

    @Test(priority = 4, description = "TC_004 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay is clickable")
    public void verifyBookStayClickable() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.pressBookStay();
    }


    @Test(priority = 5, description = "TC_005 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyWhereTextInStay() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyWhereTInStay();
    }

    @Test(priority = 6, description = "TC_006 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyDesTInStay() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyDesTInStay();
    }

    @Test(priority = 7, description = "TC_007 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyClickAwayText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyClickAway();
    }

    @Test(priority = 8, description = "TC_008 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyLowestFareText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyLowestFare();
    }

    @Test(priority = 9, description = "TC_009 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifySvgView() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifySvgView();
    }


   /* @Test(priority = 5, description = "TC_005 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Flight is clickable")
    public void verifyBookFlightClickable() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressBookFlight();
    }*/

    @Test(priority = 10, description = "TC_010 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify From text is displayed")
    public void verifyFromText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyFromT();
    }

    @Test(priority = 11, description = "TC_011 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Where text is displayed")
    public void verifyWhereToText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        // WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Explore\"]"));
        //element.click();
        guestUserExplorePage.verifyWhereT();
    }

    @Test(priority = 12, description = "TC_012 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifySearchByPlaceText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifySearchT();
    }

    @Test(priority = 13, description = "TC_013 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyWhereTextClickable() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifySearchT();
    }

    @Test(priority = 14, description = "TC_014 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Whats New text is displayed")
    public void verifyWhatsNewText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyWhatsNewText();
    }

    @Test(priority = 15, description = "TC_015 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View All Offers text is displayed")
    public void verifyAllOffersText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyAllOfferText();
    }

    @Test(priority = 16, description = "TC_016 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify explore text is displayed")
    public void verifyExploreText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyExploreText();
    }

    @Test(priority = 17, description = "TC_017 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify All Offers text is displayed")
    public void verifyAllOffersTextClickable() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.pressAllOfferText();
    }

    @Test(priority = 18, description = "TC_018 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify All Offers text is displayed")
    public void verifyExploreTextClickable() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.pressExploreText();
    }

    @Test(priority = 19, description = "TC_019 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View More text is displayed")
    public void verifyViewMoreText() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyViewMoreText();
    }
    @Test(priority = 20, description = "TC_020 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View More text is displayed")
    public void verifyViewMoreClickable() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.pressViewMoreText();
    }

    @Test(priority = 21, description = "TC_021 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Add More text is displayed")
    public void verifyAddMore() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.verifyAddMoreText();
    }
    @Test(priority = 22, description = "TC_022 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Image Loading in Whats New Category")
    public void verifyImageLoading() {
        guestUserExplorePage = new GuestUserExplorePage(driver);
        welcomePage = new WelcomePage(driver);
        welcomePage.clickLogin();
        guestUserExplorePage.whatsNewImageLoading();
    }
}
//8,12,13,15