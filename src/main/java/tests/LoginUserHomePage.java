//package tests;
//
//import base.BaseTestLoginUser;
//import constant.ConstantClass;
//import constant.ThreadWaitClass;
//import io.appium.java_client.android.nativekey.AndroidKey;
//import io.appium.java_client.android.nativekey.KeyEvent;
//import io.qameta.allure.*;
//import org.testng.annotations.Test;
//import pages.*;
//import utils.ElementUtils;
//
//public class LoginUserHomePage extends BaseTestLoginUser {
//
//    private WelcomePage welcomePage;
//    private BookPage bookPage;
//    private ThreadWaitClass threadWaitClass;
//    public ElementUtils elementUtils;
//
//    @Test(priority = 1, description = "TC_001 - Verify the My Trips button is Displayed or not ")
//    @Description("Verify  My Trips button is visible for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("BookPage")
//    @Story("Guest User should be able to  see the My Trips button")
//    public void verifyMyTripsButtonIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        welcomePage.clickLoginAsQuest();
//        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
//        bookPage.displayMyTripButton();
//    }
//
//    @Test(priority = 2, description = "TC_002 - Verify the My Trips button is enabled or not ")
//    @Description("Verify   My Trips button is enabled for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("BookPage")
//    @Story("Verify whether the My Trips button is enabled for Guest user.")
//    public void verifyMyTripsButtonIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        //welcomePage.clickLogin();
//        bookPage.enabledMyTripButton();
//
//    }
//
//    @Test(priority = 3, description = "TC_002 - Verify the Book button is Working or not ")
//    @Description("Verify  Book button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("BookPage")
//    @Story("Verify whether the Book button is Clickable for the Guest user")
//    public void verifyMyTripsButtonIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        // welcomePage.clickLogin();
//        bookPage.clickMyTripButton();
//
//
//    }
//
//    @Test(priority = 4, description = "TC_004 - Verify the Book button is Displayed or not ")
//    @Description("Verify  Book button is visible for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("BookPage")
//    @Story("Guest User should be able to  see the Book button")
//    public void verifyBookButtonIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        // welcomePage.clickLogin();
//        bookPage.displayBookButton();
//
//
//    }
//
//    @Test(priority = 5, description = "TC_005 - Verify the Book button is enabled or not ")
//    @Description("Verify   Book button is enabled for  Guest user or not")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Book button is enabled for Guest user.")
//    public void verifyBookButtonIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        //welcomePage.clickLogin();
//        bookPage.enabledBookButton();
//    }
//
//    @Test(priority = 6, description = "TC_006 - Verify the Book button is Working or not ")
//    @Description("Verify   Book button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Book button is Clickable for the Guest user")
//    public void verifyBookButtonIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        //welcomePage.clickLogin();
//        bookPage.clickBookButton();
//    }
//
//    @Test(priority = 7, description = "TC_007 - Verify the Check-In button is Displayed or not ")
//    @Description("Verify   Check-In  button is visible for  Guest user or not")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Guest User should be able to  see the Check-In  button")
//    public void verifyCheckInButtonIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        //welcomePage.clickLogin();
//        bookPage.displayCheckInButton();
//
//    }
//
//    @Test(priority = 8, description = "TC_008 - Verify the Check-In button is enabled or not ")
//    @Description("Verify  Check-In button is enabled for  Guest user or not")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify the Check-In button is enabled for Guest user")
//    public void verifyCheckInButtonIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.enabledCheckInButton();
//    }
//
//
//    @Test(priority = 9, description = "TC_009 - Verify the Check-In button is Working or not ")
//    @Description("Verify  Check-In  button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Check-In  button is Clickable for the Guest user or not ")
//    public void verifyCheckInButtonIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.clickCheckInButton();
//
//    }
//
//
//    @Test(priority = 10, description = "TC_0010 - Verify the Profile button is Displayed or not ")
//    @Description("Verify  Profile button is visible for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Guest User should be able to  see the Profile  button")
//    public void verifyProfileButtonIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.displayProfileButton();
//
//    }
//
//    @Test(priority = 11, description = "TC_0011 - Verify the Profile button is enabled or not ")
//    @Description("Verify Profile button is enabled for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Profile button is enabled for Guest user.or not ")
//    public void verifyProfileButtonIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.enabledProfileButton();
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//    }
//
//    @Test(priority = 12, description = "TC_0012 - Verify the Profile button is Working or not ")
//    @Description("Verify Profile button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Profile  button is Clickable for the Guest user or not ")
//    public void verifyProfileButtonIsWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        ProfilePage profilePage = new ProfilePage(driver);
//        elementUtils = new ElementUtils(driver);
//       /* driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1)"
//        ));*/
//        ElementUtils.scrollToElementByText("Book a Stay");
//        profilePage.clickProfileButton();
//
//    }
//
//
//    @Test(priority = 13, description = "TC_0013 - Verify the Explore button is Displayed or not ")
//    @Description("Verify Explore button is visible for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Guest User should be able to  see the  Explore button")
//    public void verifyExploreButtonIsDisplayed() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        //welcomePage.clickLogin();
//        bookPage.displayExploreButton();
//
//    }
//
//
//    @Test(priority = 14, description = "TC_0014 - Verify the Explore button is enabled or not ")
//    @Description("Verify Explore button is enabled for  Guest user ")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Explore button is enabled for Guest user.or not ")
//    public void verifyExploreButtonIsEnabled() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.enabledExploreButton();
//    }
//
//
//    @Test(priority = 15, description = "TC_0015 - Verify the Explore button is Working or not ")
//    @Description("Verify  Explore  button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Explore  button is Clickable for the Guest user or not ")
//    public void verifyExploreButtonWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        // welcomePage.clickLogin();
//        bookPage.clickExploreButton();
//
//    }
//
//    @Test(priority = 16, description = "TC_0016 - Verify the Leisure button is display or not ")
//    @Description("Verify  Leisure  button is display for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Leisure  button is display for the Guest user or not ")
//    public void verifyLeisureButtonDisplay() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        elementUtils = new ElementUtils(driver);
//        bookPage.clickBookButton();
//      /*  driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
//        ));*/
//        sElementUtils.scrollToElementByText("Leisure");
//        bookPage.displayLeisureButton();
//
//    }
//
//    @Test(priority = 17, description = "TC_0017 - Verify the Leisure button is Working or not ")
//    @Description("Verify  Leisure  button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Leisure  button is Clickable for the Guest user or not ")
//    public void verifyLeisureButtonWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.workingLeisureButton();
//
//    }
//
//
//    @Test(priority = 18, description = "TC_0018 - Verify the Work Radio button is display or not ")
//    @Description("Verify Work Radio button is display for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Work Radio  button is display for the Guest user or not ")
//    public void verifyWorkRadioButtonDisplay() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.displayWorkButton();
//    }
//
//    @Test(priority = 19, description = "TC_0019 - Verify the Work button is Working or not ")
//    @Description("Verify Work radio button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Work Radio  button is Clickable for the Guest user or not ")
//    public void verifyWorkRadioButtonWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.workRadioButton();
//
//    }
//
//
//    @Test(priority = 20, description = "TC_0020 - Verify the Medical Radio button is display or not ")
//    @Description("Verify Medical Radio button is display for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Medical Radio  button is display for the Guest user or not ")
//    public void verifyMedicalRadioButtonDisplay() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.displayMedicalButton();
//    }
//
//
//    @Test(priority = 21, description = "TC_0021 - Verify the Medical button is Working or not ")
//    @Description("Verify Medical radio button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the Medical Radio  button is Clickable for the Guest user or not ")
//    public void verifyMedicalRadioButtonWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.workMedicalRadioButton();
//
//    }
//
//
//    @Test(priority = 22, description = "TC_0022 - Verify the RoundTrip button is Working or not ")
//    @Description("Verify RoundCity radio button is clickable for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the RoundTrip Radio  button is Clickable for the Guest user or not ")
//    public void verifyRoundTripRadioButtonWorking() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        elementUtils.scrollToElementByText("Book a Stay");
//        bookPage.selectRoundRadioButton();
//    }
//
//
//    @Test(priority = 23, description = "TC_0023 - Verify the RoundTrip Radio button is display or not ")
//    @Description("Verify Medical Radio button is display for the guest user")
//    @Severity(SeverityLevel.CRITICAL)
//    @Feature("HomePage")
//    @Story("Verify whether the RoundTrip Radio  button is display for the Guest user or not ")
//    public void verifyRoundTripRadioButtonDisplay() throws InterruptedException {
//        welcomePage = new WelcomePage(driver);
//        bookPage = new BookPage(driver);
//        bookPage.displayRoundCityButton();
//    }
//}
