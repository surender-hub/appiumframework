package tests;

import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.testng.annotations.Test;
import pages.GuestUserExplorePage;
import pages.LoginUserExplorePage;
import pages.WelcomePage;
import utils.ElementUtils;

public class LoginUserExploreTest extends BaseTestLoginUser
{

    private ThreadWaitClass threadWaitClass;
    public ElementUtils elementUtils;
    public LoginUserExplorePage loginUserExplorePage;

    @Test(priority = 1, description = "TC_001 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Login User should be able to redirect on Explore Page")
    public void verifyExploreDisplayed() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.loginUser();
        loginUserExplorePage.pressExploreButton();
    }

    @Test(priority = 2, description = "TC_002 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a flight text should be visible")
    public void verifyBookFlightText()  {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyBookFlightText();
    }

    @Test(priority = 3, description = "TC_003 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay text is displayed")
    public void verifyBookStayText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyStayText();
    }
    @Test(priority = 4, description = "TC_004 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay is clickable")
    public void verifyBookStayClickable(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressBookStay();
    }

    @Test(priority = 5, description = "TC_005 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyWhereTextInStay(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyWhereTInStay();
    }
    @Test(priority = 6, description = "TC_006 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyDesTInStay(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyDesTInStay();
    }
    @Test(priority = 7, description = "TC_007 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyCLickAwayText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyClickAway();
    }
    @Test(priority = 8, description = "TC_008 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyLowestFareText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyLowestFare();
    }
    @Test(priority = 9, description = "TC_009 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifySvgView(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifySvgView();
    }

    @Test(priority = 10, description = "TC_010 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify From text is displayed")
    public void verifyFromText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyFromT();
    }
    @Test(priority = 11, description = "TC_011 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Where text is displayed")
    public void verifyWhereToText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyWhereT();
    }
    @Test(priority = 12, description = "TC_012 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifySearchByPlaceText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifySearchT();
    }

    @Test(priority = 13, description = "TC_014 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyWhereTextClickable(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifySearchT();
    }


    @Test(priority = 14, description = "TC_014 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Whats New text is displayed")
    public void verifyWhatsNewText() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyWhatsNewText();
    }

    @Test(priority = 15, description = "TC_015 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View All Offers text is displayed")
    public void verifyAllOffersText() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyAllOfferText();
    }

    @Test(priority = 16, description = "TC_016 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify explore text is displayed")
    public void verifyExploreText() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyExploreText();
    }

    @Test(priority = 17, description = "TC_017 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify All Offers text is displayed")
    public void verifyAllOffersTextClickable() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressAllOfferText();
    }

    @Test(priority = 18, description = "TC_018 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify All Offers text is displayed")
    public void verifyExploreTextClickable() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressExploreText();
    }

    @Test(priority = 19, description = "TC_019 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View More text is displayed")
    public void verifyViewMoreText() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyViewMoreText();
    }
    @Test(priority = 20, description = "TC_020 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View More text is displayed")
    public void verifyViewMoreClickable() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressViewMoreText();
    }

    @Test(priority = 21, description = "TC_021 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Add More text is displayed")
    public void verifyAddMore() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyAddMoreText();
    }
    @Test(priority = 22, description = "TC_022 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Image Loading in Whats New Category")
    public void verifyImageLoading() {
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.whatsNewImageLoading();
    }

}
