package tests;


import base.BaseTest;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.ModifyPage;
import pages.SearchPage;
import pages.SeatPage;
import pages.WelcomePage;
import utils.ElementUtils;
import utils.LogUtils;

import java.util.List;

public class IndigoTest extends BaseTest {

    private WelcomePage welcomePage;
    private SearchPage searchPage;
    private SeatPage seatPage;
    private ModifyPage modifyPage;
    private ElementUtils elementUtils;
    String currentPackage;

    @Test(priority = 1, description = "TC_001 - Verify the Guest user generate PNR")
    @Description("Verify GuestUser booking ticket end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow")
    @Story("User should be able to Book Ticket")
    public void indigoUatFLow1() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        welcomePage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        searchPage.bookingNextButton();
        searchPage.enterUserDetails("surender", "pal", "01/04/1993", "6474634463", "surende@gmail.com");
        LogUtils.info("Enter User Details");
        searchPage.clickOnSkipToPayment();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        searchPage.getPnrDetails();
        LogUtils.info("PNR Details Generated");
        currentPackage = driver.getCurrentPackage();
//        driver.terminateApp(currentPackage);
//        driver.activateApp(currentPackage);
    }

    @Test(priority = 2, description = "TC_002 - Verify the Guest user select seat and generate PNR")
    @Description("Verify GuestUser booking ticket by selecting seat end-to-end flow")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Booking Ticket Flow ans select seat")
    @Story("User should be able to Book Ticket by selecting seat")

    public void indigoUatFLow2() throws InterruptedException {
        LogUtils.info("Guest User booking ticket using skip to payment");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        seatPage = new SeatPage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        welcomePage.clickOnFutureDate();
        searchPage.clickOnSearchButton();
        searchPage.clickOnBookingList();
        searchPage.bookingNextButton();
        searchPage.enterUserDetails("ahyil", "pal", "02/04/1953", "6474344463", "Indisddftusneo@gmail.com");
        LogUtils.info("Enter User Details");
        seatPage.selectSeat();
        seatPage.clickOnNextButton();
        searchPage.clickOnNetBanking();
        searchPage.clickOnAddBank();
        searchPage.searchAvenue("av");
        LogUtils.info("Select Avenue payment method");
        searchPage.clickOnAvenuePayment();
        searchPage.clickOnAvenueButtonPay();
        searchPage.clickOnButtonResponse();
        Thread.sleep(10000);
        searchPage.getPnrDetails();
        LogUtils.info("PNR Details Generated");

    }


    @Test(priority = 3, description = "TC_003 - Modify the PNR details")
    @Description("Verify GuestUser modify the PNR details")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("GuestUser Modify the PNR id he wants")
    @Story("Guest User should be able to modify the PNR details")

    public void indigoFlow3() throws InterruptedException {
        LogUtils.info("Guest User Modify the PNR");
        welcomePage = new WelcomePage(driver);
        searchPage = new SearchPage(driver);
        modifyPage = new ModifyPage(driver);
        elementUtils = new ElementUtils(driver);
        welcomePage.clickLogin();
        modifyPage.clickOnMyTrips();
        modifyPage.enterPnr("K3NL7E");
        modifyPage.enterEmail("surender@gmail.com");
        modifyPage.clickOnGetStarted();
        Thread.sleep(10000);
        modifyPage.clickOnModify();
        modifyPage.clickOnChangeFlightButton();
        modifyPage.clickOnCheckBox();
        Thread.sleep(5000);
        modifyPage.clickOnProceedButton();

        modifyPage.clickOnFlightList();
        Thread.sleep(5000);
        modifyPage.clickOnNxtButton();
        Thread.sleep(1000);
        boolean value = driver.findElement(By.className("android.view.ViewGroup")).isEnabled();


        while (value) {

            try {
                boolean elememnt = driver.findElement(By.xpath("//android.widget.TextView[@text=\"All seat\"]")).isDisplayed();
                if (elememnt == true) {
                    break;
                }

            } catch (Exception e) {

                WebElement ele = driver.findElement(By.xpath("//*[@text ='Next']"));
                ele.click();

                Thread.sleep(2000);
            }
        }

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
        ));
        List<WebElement> seats = driver.findElements(By.xpath("//*[@class='android.widget.ScrollView']/descendant::android.view.ViewGroup[contains(@resource-id,\"seatSelectionSeatSelectTestID\")]/descendant::android.widget.TextView"));

        //System.out.println("Total seats found: " + seats.size());
        System.out.println("Total: " + seats);

        for (WebElement seat : seats) {


            //System.out.println( "Seat Name "+seat.getText());
            System.out.println("Modify Seat Name " + seat.getText());
            if (seat.isEnabled()) {
                seat.click();
                break;
            }
        }
        Thread.sleep(5000);
        WebElement elem = driver.findElement(By.xpath("//com.horcrux.svg.CircleView"));
        Thread.sleep(2000);
        elem.click();
        //elementUtils.waitAndClickElement(elem, 50);
        //seatPage.clickOnSeat();

        System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text=\"1 Seats Added\"]")).getText());

        Thread.sleep(2000);
        modifyPage.clickOnNxtButton();
        modifyPage.clickOnFinishButton();
        modifyPage.clickOnCancelButton();
        LogUtils.info("PNR Details Generated");

    }
}


//How to call
// captureScreenshotStep("After opening the website");
//    @Step("Screenshot: {0}")
//    public void captureScreenshotStep(String description) {
//        AllureUtils.takeScreenshot(driver);
//    }


