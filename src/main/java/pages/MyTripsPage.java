package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ElementUtils;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class MyTripsPage {

    public AndroidDriver driver;

    public MyTripsPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text='My Trips']")
    public WebElement myTripsMenu;

    @FindBy(xpath = "//android.widget.EditText[@text='PNR / Booking Reference']")
    public WebElement pnrField;

    @FindBy(xpath = "//android.widget.EditText[@text='Last Name']")
    public WebElement lastName;

    @FindBy(xpath = "//android.widget.TextView[@text='Get Started']")
    public WebElement getStartedBtn;

    @FindBy(xpath = "(//android.widget.TextView[@text='Booking confirmed']/ancestor::*[position()=1]/following-sibling::android.view.ViewGroup//android.widget.TextView)[4]")
    public WebElement bookingPnrAndTime;

    @FindBy(xpath = "(//android.widget.TextView[contains(@text,'PNR')])[1]")
    public WebElement allPNRValue;

    @FindBy(xpath = "//android.widget.TextView[starts-with(@text,'Hello')]")
    public WebElement guestFullName;

    @FindBy(xpath = "(//android.widget.TextView[starts-with(@text,'PNR:')])[1]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup/android.widget.TextView")
    public WebElement confirmedText;

    @FindBy(xpath = "(//android.widget.TextView[@text='Booking confirmed']/ancestor::*[position()=1]/following-sibling::android.view.ViewGroup//android.widget.TextView)[1]")
    public WebElement bookingDepartureCity;

    @FindBy(xpath = "(//android.widget.TextView[@text='Booking confirmed']/ancestor::*[position()=1]/following-sibling::android.view.ViewGroup//android.widget.TextView)[3]")
    public WebElement bookingDestinationCity;

    @FindBy(xpath = "//android.widget.HorizontalScrollView//android.widget.TextView[1]")
    public WebElement departure_City;

    @FindBy(xpath = "//android.widget.HorizontalScrollView//android.widget.TextView[2]")
    public WebElement destination_City;

    @FindBy(xpath = "(//android.widget.TextView[@text='Departure Flight']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView)[1]")
    public WebElement departure_Date;

    @FindBy(xpath = "//android.widget.TextView[@text='Pax']/preceding-sibling::android.widget.TextView")
    public WebElement bookingPassengerNum;

    @FindBy(xpath = "//android.widget.TextView[@text='Pax']/preceding-sibling::android.widget.TextView")
    public WebElement passenger_num;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Departure Flight\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView)[5]")
    public WebElement journey_time;


    public void enterPNRinMyTripsMenu(String pnr_Value, String last_Name) {
        ElementUtils.waitAndClickElement(myTripsMenu, ConstantClass.SHORT_WAIT_2);
        pnrField.sendKeys(pnr_Value);
        lastName.sendKeys(last_Name);
        getStartedBtn.click();
    }

    public List<String> getBookingDetails() throws InterruptedException {

        List<String> bookingDetails = new ArrayList<>();

        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Quick actions\"]"), ConstantClass.LONG_WAIT_180);

        String departure_City = bookingDepartureCity.getText();
        String destination_City = bookingDestinationCity.getText();

        String[] pnrDateTime = bookingPnrAndTime.getText().split("\\|");
        String pnrDate = pnrDateTime[0].trim();
        String journeyTime = pnrDateTime[1].trim();
        String pnrNumber = pnrDateTime[2].trim();

        bookingDetails.add(pnrNumber);
        bookingDetails.add(departure_City);
        bookingDetails.add(destination_City);
        bookingDetails.add(pnrDate);
        bookingDetails.add(journeyTime);

        ElementUtils.scrollToEndAndCheck("Flight Details");

        String passengerNumber = bookingPassengerNum.getText();

        bookingDetails.add(passengerNumber);

        driver.navigate().back();
        return bookingDetails;
    }


    public void verifyPNRDetails(String pnr_Value) {
        String pnrNum = allPNRValue.getText().replaceAll(".*\\s([A-Z0-9]+)$", "$1");
        Assert.assertEquals(pnr_Value, pnrNum);
    }

    public void guestUserName() {
//        String userFirstName = guestFullName.getText().replaceAll()
    }

    public void checkBookingConfirmed() {
        Assert.assertEquals("Confirmed", confirmedText.getText());
    }

    public void checkDepartureCity(String expectedCity) {
        String actualCity = departure_City.getText();
        Assert.assertEquals(expectedCity, actualCity);
    }

    public void checkDestinationCity(String expectedCity) {
        String actualCity = destination_City.getText();
        Assert.assertEquals(expectedCity, actualCity);
    }

    public void checkBookingDate(String expectedDate) {
        String actualDate = departure_Date.getText();
        Assert.assertEquals(expectedDate, actualDate);
    }

    public void checkJourneyTime(String expectedJourneyTime) {
        Assert.assertEquals(expectedJourneyTime, journey_time.getText());
    }

    public void checkPassengerCount(String expectedPassenger) {
        Assert.assertEquals(expectedPassenger, passenger_num.getText());
    }
}