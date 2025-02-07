package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.ElementUtils;

import java.time.Duration;


public class SearchPage {
    private AppiumDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.TextView[@text='To']")
    private WebElement searchOnTo;

    @FindBy(xpath = "//android.widget.EditText[@text='Search place/airport']")
    private WebElement searchPlace;

    @FindBy(xpath = "//android.widget.TextView[@text='Chhatrapati Shivaji Maharaj International Airport']")
    private WebElement mumbaiFlight;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
    private WebElement desBook;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
    private WebElement bookingList;

    @FindBy(xpath = "//android.widget.TextView[@text='Next']")
    private WebElement nextButton;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement searchButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='dateofbirth']")
    private WebElement dob;

    @FindBy(xpath = "//android.widget.EditText[@text='Flyer’s contact number']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='primaryEmail']")
    private WebElement emailId;

    // @FindBy(xpath = "//android.widget.TextView[@text="Skip To Payment"]")
    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup")
    private WebElement skipToPayment;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"msg_first_line_one\" and @text=\"Net banking\"]")
    private WebElement netBanking;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"msg_text\" and @text=\"+MORE BANKS\"]")
    private WebElement addBank;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"edt_searchbox\"]")
    private WebElement searchPaymentMethod;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Avenue Test\"]")
    private WebElement addAvenuePayment;

    @FindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"btn_pay\"]/android.widget.LinearLayout")
    private WebElement buttonAvenuePay;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"btn\"]")
    private WebElement buttonResponse;

    public SearchPage(AppiumDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Click on Destination Button")
    public void clickOnTo() {
        elementUtils.clickElement(searchOnTo, 50);
    }

    @Step("Search Place: {placeName}")
    public void searchPlace(String placeName) {
        elementUtils.clickElement(searchPlace, 50);
        elementUtils.sendKeys(searchPlace, placeName, 50);
    }

    @Step("Select Destination Mumbai from List")
    @Story("Searching a flight")
    public void clickOnMumbaiFlight() {
        elementUtils.clickElement(mumbaiFlight, 50);
    }

    @Step("Click on first in booking List")
    public void clickOnBookingList() {
        elementUtils.clickElement(bookingList, 50);
    }

    @Step("Click on Booking")
    public void clickOnBooking() {
        elementUtils.clickElement(desBook, 50);
    }

    @Step("Search the available city")
    public void clickOnSearchButton() {
        elementUtils.clickElement(searchButton, 50);
    }

    @Step("Select Next for Payment")
    public void bookingNextButton() throws InterruptedException {
        Thread.sleep(5000);
        elementUtils.clickElement(nextButton, 50);
    }

    @Step("Enter User Details")
    public void enterUserDetails(String firstname, String lastname, String Dob, String MobileNumber, String mailId) throws InterruptedException {


        firstName.sendKeys(firstname);
        lastName.click();
        lastName.sendKeys(lastname);
        Thread.sleep(2000);


        WebElement elememnt = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"dateofbirth\"))"));

        System.out.println(elememnt.getText());
        elememnt.sendKeys(Dob);
        Thread.sleep(2000);

        WebElement mob = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Primary contact number\"))"));

        mob.sendKeys(MobileNumber);


        WebElement email = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"primaryEmail\"))"));
        email.sendKeys(mailId);

        ;
        email.sendKeys(mailId);
        Thread.sleep(5000);


    }

    @Step("Click on Skip To Payment")
    public void clickOnSkipToPayment() {
        //elementUtils.clickElement(skipToPayment, 50);
        WebElement skipPayment = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().text(\"Skip To Payment\")"));
        skipPayment.click();
    }

    @Step("Click on Net Banking")
    public void clickOnNetBanking() {
        elementUtils.clickElement(netBanking, 50);
    }

    @Step("Click on Add  Bank")
    public void clickOnAddBank() {
        elementUtils.clickElement(addBank, 50);
    }

    @Step("Search Avenue Payment Method: {Avenue Payment Method}")
    public void searchAvenue(String avenuePayment) {
        elementUtils.clickElement(searchPaymentMethod, 50);
        elementUtils.sendKeys(searchPaymentMethod, avenuePayment, 50);
    }

    @Step("Select Avenue Method")
    public void clickOnAvenuePayment() {
        elementUtils.clickElement(addAvenuePayment, 50);
    }


    @Step("Click On Avenue Button pay")
    public void clickOnAvenueButtonPay() {
        elementUtils.clickElement(buttonAvenuePay, 50);
    }

    @Step("Click On Click on Response")
    public void clickOnButtonResponse() {
        elementUtils.clickElement(buttonResponse, 50);
    }


}
