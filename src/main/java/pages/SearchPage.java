package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.ElementUtils;
import utils.RetryAnalyzer;

import java.time.Duration;


public class SearchPage {
    private AndroidDriver driver;
    private ElementUtils elementUtils;

    //android.widget.TextView
    public SearchPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Send Response\"]")
    private WebElement textButton;


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

    @FindBy(xpath = "//android.widget.TextView[@text=\"Search\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='dateofbirth']")
    private WebElement dob;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Primary contact number\"]")
    private WebElement mobileNumber;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"primaryEmail\"]")
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

    @FindBy(xpath = "//android.widget.TextView[@text=\"Fri, 07 Feb | 04h 15m | YV2M7G\"]")
    private WebElement pnr;


    @Step("Click on Destination Button")
    public void clickOnTo() {
        elementUtils.waitAndClickElement(searchOnTo, 50);
    }

    @Step("Search Place: {placeName}")
    public void searchPlace(String placeName) {
        elementUtils.waitAndClickElement(searchPlace, 50);
        elementUtils.sendKeys(searchPlace, placeName, 50);
    }

    @Step("Select Destination Mumbai from List")
    @Story("Searching a flight")
    public void clickOnMumbaiFlight() {
        elementUtils.waitAndClickElement(mumbaiFlight, 50);
    }

    @Step("Click on first in booking List")
    public void clickOnBookingList() {
        elementUtils.waitAndClickElement(bookingList, 50);
    }

    @Step("Click on Booking")
    public void clickOnBooking() {
        elementUtils.waitAndClickElement(desBook, 50);
    }

    @Step("Search the available city")
    public void clickOnSearchButton() {
        elementUtils.waitAndClickElement(searchButton, 50);
    }

    @Step("Select Next for Payment")
    public void bookingNextButton() throws InterruptedException {
        Thread.sleep(5000);
        elementUtils.waitAndClickElement(nextButton, 50);
    }

    @Step("Enter User Details")
    public void enterUserDetails(String firstname, String lastname, String Dob, String MobileNumber, String mailId) throws InterruptedException {
        Thread.sleep(2000);
        elementUtils.waitAndClickElement(firstName, 20);
        Thread.sleep(2000);
        firstName.sendKeys(firstname);
        Thread.sleep(2000);
        elementUtils.scrollToElementByResourceId("lastName");
        lastName.sendKeys(lastname);
        elementUtils.scrollToElementByResourceId("dateofbirth");
        elementUtils.waitAndClickElement(dob, 20);
        dob.sendKeys(Dob);
        elementUtils.scrollToElementByText("Primary contact number");
        elementUtils.waitAndClickElement(mobileNumber, 20);
        mobileNumber.sendKeys(MobileNumber);
        elementUtils.scrollToElementByResourceId("primaryEmail");
        emailId.sendKeys(mailId);
    }

    @Step("Click on Skip To Payment")
    public void clickOnSkipToPayment() {
        if (!skipToPayment.isDisplayed()) {
            elementUtils.waitForElement(nextButton, 50);
            nextButton.click();
        } else {
            elementUtils.waitAndClickElement(skipToPayment, 50);
        }
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void clickOnNetBanking() {
        elementUtils.scrollToElementByText("Net banking");
        elementUtils.waitAndClickElement(netBanking, 50);
    }

    @Step("Click on Add  Bank")
    public void clickOnAddBank() {
        elementUtils.scrollToElementByText("+MORE BANKS");
        elementUtils.waitAndClickElement(addBank, 50);
    }

    @Step("Search Avenue Payment Method: {Avenue Payment Method}")
    public void searchAvenue(String avenuePayment) {
        elementUtils.waitAndClickElement(searchPaymentMethod, 50);
        elementUtils.sendKeys(searchPaymentMethod, avenuePayment, 50);
    }

    @Step("Select Avenue Method")
    public void clickOnAvenuePayment() {
        elementUtils.waitAndClickElement(addAvenuePayment, 50);
    }


    @Step("Click On Avenue Button pay")
    public void clickOnAvenueButtonPay() {
        elementUtils.waitAndClickElement(buttonAvenuePay, 50);
    }

    @Step("Click On Click on Response")
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void clickOnButtonResponse() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 sec
        try {
            wait.until(ExpectedConditions.elementToBeClickable(buttonResponse)).click();
            System.out.println("Button clicked successfully.");
        } catch (Exception e) {
            System.out.println("Failed to click button: " + e.getMessage());
            throw e;
        }
        //String dynamicXPath = "//android.widget.Button[@resource-id='btn' and @text='Send Response']";
        //driver.findElement(By.xpath(dynamicXPath)).click();
        //elementUtils.waitAndClickElement(textButton, 20);
    }

    public void getPnrDetails() throws InterruptedException {
        Thread.sleep(20000);
        WebElement pnr1 = driver.findElements(By.className("android.widget.TextView")).get(1);
        WebElement pnr2 = driver.findElements(By.className("android.widget.TextView")).get(2);
        WebElement pnr3 = driver.findElements(By.className("android.widget.TextView")).get(3);
        WebElement pnr4 = driver.findElements(By.className("android.widget.TextView")).get(4);
        WebElement pnr5 = driver.findElements(By.className("android.widget.TextView")).get(5);
        WebElement pnr6 = driver.findElements(By.className("android.widget.TextView")).get(6);
        WebElement pnr7 = driver.findElements(By.className("android.widget.TextView")).get(7);
        WebElement pnr8 = driver.findElements(By.className("android.widget.TextView")).get(8);
        WebElement pnr9 = driver.findElements(By.className("android.widget.TextView")).get(9);
        WebElement pnr10 = driver.findElements(By.className("android.widget.TextView")).get(10);
        elementUtils.waitAndClickElement(pnr1, 50);
        String pnrDetails = pnr1.getText();
        System.out.println("PNR Details: " + pnrDetails);


        String pnrDetails2 = pnr2.getText();
        String pnrDetails3 = pnr3.getText();
        String pnrDetails4 = pnr4.getText();
        String pnrDetails5 = pnr5.getText();
        String pnrDetails6 = pnr6.getText();
        String pnrDetails7 = pnr6.getText();
        String pnrDetails8 = pnr6.getText();
        String pnrDetails9 = pnr6.getText();
        String pnrDetails10 = pnr6.getText();

        //String pnrDetails =  pnr1.getText();
        //System.out.println("PNR Details: "+pnrDetails);
        System.out.println("PNR Details: " + pnrDetails2);
        System.out.println("PNR Details: " + pnrDetails3);
        System.out.println("PNR Details: " + pnrDetails4);
        System.out.println("PNR Details: " + pnrDetails5);
        System.out.println("PNR Details: " + pnrDetails6);

    }

    public String validateDate() throws InterruptedException {
        Thread.sleep(20000);

//        WebElement pnr5 = driver.findElements(By.className("android.widget.TextView")).get(5);
//        WebElement pnr6 = driver.findElements(By.className("android.widget.TextView")).get(6);
//        elementUtils.waitAndClickElement(pnr5, 50);
//        System.out.println("PNR Details: " + pnr5.getText());
        elementUtils.scrollToElementByText("Departure Flight");
        String DestinationDate = driver.findElement(By.xpath(" (//android.widget.TextView[@text=\"Departure Flight\"]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.TextView)[1]")).getText();
        return DestinationDate;


    }


}
