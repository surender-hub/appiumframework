package tests.functionalTestCases;

import base.BaseGuestUser;
import base.BaseSuper;
import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.testng.annotations.Test;
import pages.ExplorePage;
import utils.ElementUtils;

public class ExploreTest extends BaseSuper
{

    private ThreadWaitClass threadWaitClass;
    public ElementUtils elementUtils;
    public ExplorePage loginUserExplorePage;

    @Test(priority = 1, description = "TC_001 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Login User should be able to redirect on Explore Page")
    public void verifyExploreDisplayed() throws InterruptedException {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.pressExploreButton();
    }

    @Test(priority = 2, description = "TC_002 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a flight text should be visible")
    public void verifyBookFlightText()  {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyBookFlightText();
    }

    @Test(priority = 3, description = "TC_003 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay text is displayed")
    public void verifyBookStayText(){
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyStayText();
    }
   /* @Test(priority = 4, description = "TC_004 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Book a Stay is clickable")
    public void verifyBookStayClickable(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.pressBookStay();
    }*/

  /*  @Test(priority = 5, description = "TC_005 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyWhereTextInStay(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyWhereTInStay();
    }*/
  /*  @Test(priority = 6, description = "TC_006 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyDesTInStay(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyDesTInStay();
    }*/
   /* @Test(priority = 7, description = "TC_007 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyCLickAwayText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyClickAway();
    }*/
 /*   @Test(priority = 8, description = "TC_008 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyLowestFareText(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifyLowestFare();
    }*/
  /*  @Test(priority = 9, description = "TC_009 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifySvgView(){
        loginUserExplorePage = new LoginUserExplorePage(driver);
        loginUserExplorePage.verifySvgView();
    }*/

    @Test(priority = 4, description = "TC_04 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify From text is displayed")
    public void verifyFromText(){
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyFromT();
    }
    @Test(priority = 5, description = "TC_005 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Where text is displayed")
    public void verifyWhereToText(){
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyWhereT();
    }
    @Test(priority = 6, description = "TC_006 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifySearchByPlaceText(){
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifySearchT();
    }

    @Test(priority = 7, description = "TC_007 - Verify Explore Page functionality after Login.", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyWhereTextClickable(){
        loginUserExplorePage = new ExplorePage(driver);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        loginUserExplorePage.pressWhereText();
    }


    @Test(priority = 8, description = "TC_008 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyClickAwayText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyClickAway();
    }

    @Test(priority = 9, description = "TC_009 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifyLowestFareText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyLowestFare();
    }

    @Test(priority = 10, description = "TC_010 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality With GuestUser")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Search By Place text is displayed")
    public void verifySvgView() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifySvgView();
    }

    @Test(priority = 11, description = "TC_011 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Whats New text is displayed")
    public void verifyWhatsNewText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyWhatsNewText();
    }

    @Test(priority = 12, description = "TC_012 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View All Offers text is displayed")
    public void verifyAllOffersText() {
        loginUserExplorePage = new ExplorePage(driver);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        loginUserExplorePage.verifyAllOfferText();
    }

     @Test(priority = 13, description = "TC_013 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify explore text is displayed")
    public void verifyExploreText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyExploreText();
    }

    @Test(priority = 14, description = "TC_014 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify All Offers text is displayed")
    public void verifyAllOffersTextClickable() {
        loginUserExplorePage = new ExplorePage(driver);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        loginUserExplorePage.pressAllOfferText();
    }
   @Test(priority = 15, description = "TC_015 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify All Offers text is displayed")
    public void verifyExploreTextClickable() {
        loginUserExplorePage = new ExplorePage(driver);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        loginUserExplorePage.pressExploreText();
    }

    @Test(priority = 16, description = "TC_016 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View More text is displayed")
    public void verifyViewMoreText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyViewMoreText();
    }
    @Test(priority = 17, description = "TC_017 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify View More text is displayed")
    public void verifyViewMoreClickable() {
        loginUserExplorePage = new ExplorePage(driver);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        loginUserExplorePage.pressViewMoreText();
    }
     @Test(priority = 18, description = "TC_018 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Add More text is displayed")
    public void verifyAddMore() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.verifyAddMoreText();
    }
    @Test(priority = 19, description = "TC_019 - Verify Explore Page functionality with Guest User")
    @Description("Check Explore page functionality after successfully Logged In.")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Image Loading in Whats New Category")
    public void verifyImageLoading() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.whatsNewImageLoading();

    }

    @Test(priority = 20, description = "TC_020 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check for clicking on exclusive images")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Image clicking and redirected to another screen")
    public void clickOnExclusiveImagesOne() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.clickOnIndex(0);
    }
   @Test(priority = 21, description = "TC_021 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check for clicking on exclusive images")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Image clicking and redirected to another screen")
    public void clickOnExclusiveImagesTwo() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.clickOnIndexOne(1);
    }
     @Test(priority = 22, description = "TC_022 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check for clicking on exclusive images")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Image clicking and redirected to another screen")
    public void clickOnExclusiveImagesThree() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.clickOnIndexTwo(2);
    }

   /* @Test(priority = 23, description = "TC_023 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check XL Seat text")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify XL Seat text is displayed on screen")
    public void checkXlSeatText() {
        loginUserExplorePage = new ExplorePage(driver);
        ElementUtils.scrollToEndAndCheck("View All Offer");
        loginUserExplorePage.checkXlSeatText();
    }

    @Test(priority = 23, description = "TC_023 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check XL Seat text")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify XL Seat text is displayed on screen")
    public void checkBonusText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkBonusText();
    }*/

  /*  @Test(priority = 24, description = "TC_024 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check XL Seat text is clickable")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify XL Seat text is clicked and redirected to another screen")
    public void checkXlSeatTextClickable() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkXlSeatTextClickable();
    }
    @Test(priority = 25, description = "TC_024 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check Bonus Indigo text is clickable")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify Bonus Indigo text is clicked and redirected to another screen")
    public void checkBonusIndigoTextClickable() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkBonusIndigoTextClickable();
    }*/

   /* @Test(priority = 25, description = "TC_025 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check SPT text is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify SPT text is displayed on screen")
    public void checkCitySptText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkSpitiText();
    }

    @Test(priority = 26, description = "TC_026 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check SPT text is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify SPT text is displayed on screen")
    public void checkCityBomText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkBomText();
    }
    @Test(priority = 27, description = "TC_027 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check CNN text is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify CNN text is displayed on screen")
    public void checkCityCnnText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkCnnText();
    }
    @Test(priority = 28, description = "TC_028 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check GOA text is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify GOA text is displayed on screen")
    public void checkCityGoaText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkGoaText();
    }
    @Test(priority = 29, description = "TC_029 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check HYD text is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify HYD text is displayed on screen")
    public void checkCityHydText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkHydText();
    }

*/
  /*  @Test(priority = 30, description = "TC_030 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check AGR text is displayed")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify AGR text is displayed on screen")
    public void checkCityAgrText() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.checkAgrText();
    }*/

   /* @Test(priority = 26, description = "TC_026 - Verify Explore Page functionality with Guest User and Login user")
    @Description("Check SPT text is clickable")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Explore Page")
    @Story("Verify SPT text is clicked and redirected to another screen")
    public void checkCitySptClickable() {
        loginUserExplorePage = new ExplorePage(driver);
        loginUserExplorePage.clickSpitiClickable();
    }*/
}
