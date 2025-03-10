package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.ElementUtils;

import java.time.Duration;
import java.util.List;


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

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Starts at\"])[1]")
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

    //@FindBy(xpath = "//android.widget.EditText[@text=\"Flyer’s contact number\"]")
    @FindBy(xpath = "//android.widget.EditText[contains(@text, 'contact number')]")
    private WebElement mobileNumber;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Flyer’s contact number\"]")
    private WebElement mobileNumber1;
    
    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"primaryEmail\"]")
    private WebElement emailId;

    @FindBy(xpath = "//android.widget.TextView[@text='Skip To Payment']")
    //@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup")
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

    @FindBy(xpath = "//android.widget.Button[@text=\"Send Response \"]")
    private WebElement buttonResponse;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Fri, 07 Feb | 04h 15m | YV2M7G\"]")
    private WebElement pnr;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Quick actions\"]")
    private WebElement quickActions;



    @Step("Click on Destination Button")
    public void clickOnTo() {
        ElementUtils.waitAndClickElement(searchOnTo, ConstantClass.LONG_WAIT_180);
    }

    @Step("Search Place: {placeName}")
    public void searchPlace(String placeName) {
        ElementUtils.waitAndClickElement(searchPlace, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(searchPlace, placeName, ConstantClass.LONG_WAIT_180);
    }

    @Step("Select Destination Mumbai from List")
    @Story("Searching a flight")
    public void clickOnMumbaiFlight() {
        ElementUtils.waitAndClickElement(mumbaiFlight, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on first in booking List")
    public void clickOnBookingList() throws InterruptedException {
        //Thread.sleep(5000);
        ElementUtils.waitForElementVisible(By.xpath("(//android.widget.TextView[@text=\"Starts at\"])[1]"),ConstantClass.LONG_WAIT_100);
        ElementUtils.waitAndClickElement(bookingList, ConstantClass.MEDIUM_WAIT_5);
    }

    @Step("Click on Booking")
    public void clickOnBooking() {
        ElementUtils.waitAndClickElement(desBook, 50);
    }

    @Step("Search the available city")
    public void clickOnSearchButton() {
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        ElementUtils.waitAndClickElement(searchButton, ConstantClass.LONG_WAIT_180);
        ElementUtils.waitAndClickElement(searchButton, 500);
    }

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id=\"seatSelectionSectorTestID1\"]")
    private WebElement selectReturnSeat;


    //Select Seat method
    @FindBy(xpath = "//android.widget.TextView[@text='All seat']")
    private WebElement allSeatText;

    @FindBy(xpath = "//*[@text='Next']")
    private WebElement nextButto;

    @FindBy(xpath = "//*[@class='android.widget.ScrollView']/descendant::android.view.ViewGroup[contains(@resource-id,'seatSelectionSeatSelectTestID')]/descendant::android.widget.TextView")
    private List<WebElement> availableSeats;

    //@FindBy(xpath = "//com.horcrux.svg.CircleView")
    @FindBy(xpath = "//*[@class='com.horcrux.svg.CircleView']")
    private WebElement confirmSeatButton;

    @FindBy(xpath = "//android.widget.TextView[@text='1 Seats Added']")
    private WebElement seatAddedText;


    @Step("Select Next for Payment")
    public void bookingNextButton() throws InterruptedException {
        //Thread.sleep(5000);
        ElementUtils.waitAndClickElement(nextButton, ConstantClass.LONG_WAIT_180);
    }

    @Step("Enter User Details")
    public void enterUserDetails(String firstname, String lastname, String Dob, String MobileNumber, String mailId) throws InterruptedException {
        //Thread.sleep(2000);
        ElementUtils.waitForElementVisible(By.xpath("//android.widget.EditText[@resource-id='firstName']"),ConstantClass.LONG_WAIT_100);
        ElementUtils.scrollToElementByResourceId("firstName");
        ElementUtils.waitAndClickElement(firstName, ConstantClass.LONG_WAIT_180);
        //Thread.sleep(2000);
        firstName.sendKeys(firstname);
        // Thread.sleep(2000);
        ElementUtils.scrollToElementByResourceId("lastName");
        lastName.sendKeys(lastname);
        ElementUtils.scrollToElementByResourceId("dateofbirth");
        //elementUtils.waitAndClickElement(dob, 20);
        dob.sendKeys(Dob);
        ElementUtils.scrollToElementByText("Flyer’s contact number");
       // elementUtils.scrollToElementByText("contact number");
        ElementUtils.waitAndClickElement(mobileNumber1, ConstantClass.LONG_WAIT_180);
        mobileNumber1.sendKeys(MobileNumber);
        ElementUtils.scrollToElementByResourceId("primaryEmail");
        emailId.sendKeys(mailId);
    }

    @Step("Click on Skip To Payment")
    public void clickOnSkipToPayment() {
        // ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        // elementUtils.waitAndClickElement(skipToPayment, ConstantClass.LONG_WAIT_180);
        if (!skipToPayment.isDisplayed()) {
            //elementUtils.waitForElement(nextButton, 50);
            nextButton.click();
        } else {
            ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_50);
            ElementUtils.waitAndClickElement(skipToPayment, ConstantClass.LONG_WAIT_180);
        }
    }


    public void clickOnNetBanking() throws InterruptedException {
//        ElementUtils.scrollToElementByText("Net banking");
        ElementUtils.waitAndClickElement(netBanking, ConstantClass.LONG_WAIT_100);
    }

    @Step("Click on Add  Bank")
    public void clickOnAddBank() {
//        ElementUtils.scrollToElementByText("+MORE BANKS");
        ElementUtils.waitAndClickElement(addBank, ConstantClass.MEDIUM_WAIT_5);
    }

    @Step("Search Avenue Payment Method: {Avenue Payment Method}")
    public void searchAvenue(String avenuePayment) {
        ElementUtils.waitAndClickElement(searchPaymentMethod, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(searchPaymentMethod, avenuePayment, ConstantClass.LONG_WAIT_180);
    }

    @Step("Select Avenue Method")
    public void clickOnAvenuePayment() {
        ElementUtils.waitAndClickElement(addAvenuePayment, ConstantClass.LONG_WAIT_180);
    }


    @Step("Click On Avenue Button pay")
    public void clickOnAvenueButtonPay() {
        ElementUtils.waitAndClickElement(buttonAvenuePay, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click On Click on Response")
    //@Test(retryAnalyzer = RetryAnalyzerResponse.class)
    public void clickOnButtonResponse() throws InterruptedException {
        //Thread.sleep(5000);
//        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            wait.until(ExpectedConditions.elementToBeClickable(buttonResponse)).click();
//            System.out.println("Button clicked successfully.");
//        } catch (Exception e) {
//            System.out.println("Failed to click button: " + e.getMessage());
//            throw e;
//        }

        ElementUtils.waitAndClickElement(buttonResponse,ConstantClass.LONG_WAIT_180);
    }

    public void getPnrDetails() throws InterruptedException {

        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Quick actions\"]"),ConstantClass.LONG_WAIT_180);
        BookPage bp = new BookPage(driver);
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

        String pnrDetails = pnr1.getText();
        String pnrDetails2 = pnr2.getText();
        String pnrDetails3 = pnr3.getText();
        String pnrDetails4 = pnr4.getText();
        String pnrDetails5 = pnr5.getText();
        String pnrDetails6 = pnr6.getText();
        String pnrDetails7 = pnr7.getText();
        String pnrDetails8 = pnr8.getText();
        String pnrDetails9 = pnr9.getText();
        String pnrDetails10 = pnr10.getText();
        System.out.println("PNR Details: "+pnrDetails);
        System.out.println("PNR Details: " + pnrDetails2);
        System.out.println("PNR Details: " + pnrDetails3);
        System.out.println("PNR Details: " + pnrDetails4);
        System.out.println("PNR Details: " + pnrDetails5);
        System.out.println("PNR Details: " + pnrDetails6);
        System.out.println("PNR Details: " + pnrDetails7);
        System.out.println("PNR Details: " + pnrDetails8);
        System.out.println("PNR Details: " + pnrDetails9);
        System.out.println("PNR Details: " + pnrDetails10);

      driver.navigate().back();
      bp.bookButton.click();
    }

    public void selectSeatDelhiToMumbai() throws InterruptedException {
        while (true) {
            try {
                if (allSeatText.isDisplayed()) {
                    break;
                }
            } catch (Exception e) {
                nextButto.click();
            }
        }
        // Scroll to end
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
        ));
        // Select first available seat
        for (WebElement seat : availableSeats) {
            if (seat.isEnabled()) {
                Thread.sleep(5000);
                seat.click();
                break;
            }
        }
        // Confirm seat selection
        Thread.sleep(3000);
        //confirmSeatButton.click();
        ElementUtils.waitAndClickElement(confirmSeatButton,ConstantClass.MEDIUM_WAIT_5);
        System.out.println("Seat selected from Delhi to Mumbai: "+seatAddedText.getText());
    }
    public void selectSeatMumbaiToDelhi() throws InterruptedException {
       // Thread.sleep(5000);
        ElementUtils.scrollToElementByResourceId("seatSelectionSectorTestID1");
        Thread.sleep(4000);
        System.out.println("click on bombay to delhi button");
        selectReturnSeat.click();
        //elementUtils.waitAndClickElement(selectReturnSeat, 50);
        while (true) {
            try {
                if (allSeatText.isDisplayed()) {
                    break;
                }
            } catch (Exception e) {
                nextButto.click();
            }
        }
        // Scroll to end
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
        ));

        // Select first available seat
        for (WebElement seat : availableSeats) {
            if (seat.isEnabled()) {
                Thread.sleep(3000);
                seat.click();
                break;
            }
        }
        Thread.sleep(5000);
        //confirmSeatButton.click();
        ElementUtils.waitAndClickElement(confirmSeatButton,ConstantClass.MEDIUM_WAIT_5);
        //System.out.println("Seat selected from Mumbai to Delhi: "+seatAddedText.getText());
        nextButton.click();
    }

}
