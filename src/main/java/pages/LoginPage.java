package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ElementUtils;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class LoginPage {
    public AndroidDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Mobile No. / Email Id\"]")
    private WebElement enterMobile;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
    private WebElement continueButton;

    //@FindBy(xpath = "//android.widget.EditText[@resource-id=\"password\"]")
    @FindBy(xpath = "(//android.webkit.WebView[contains(@text, 'User details')]//android.widget.EditText)[2]")
    private WebElement enterPass;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"phoneVerificationControl-readOnly_but_verify_code\"]")
    private WebElement verifyOtp;
    @FindBy(xpath = "//android.widget.Button[@text=\"Login\"]")
    private WebElement loginButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Personal Information\"]")
    private WebElement personalText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Login or Sign up for IndiGo BluChip\"]")
    private WebElement otpPage;



    @FindBy(xpath = "//android.widget.TextView[@text=\"*Please enter a valid phone number\"]")
    private WebElement enterValidNumber;
    @FindBy(xpath = "//android.widget.TextView[@text=\"*Please enter a valid email ID\"]")
    private WebElement enterValidEmail;
    @FindBy(xpath = "//android.view.View[@resource-id=\"a\"]")
    private WebElement continueAsGuestButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Book a flight\"]")
    private WebElement bookFlight;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Terms & Conditions\"]")
    private WebElement termButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"INDIGO BLUCHIP PROGRAM – TERMS &CONDITIONS\"]")
    private WebElement indigoTextButton;


    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    @Step("Enter Mobile Number: {mobile number}")
    public void enterMobileNumber(String mobileNumber) {
        elementUtils.waitAndClickElement(enterMobile, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(enterMobile, mobileNumber, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on Continue Button")
    public void clickOnContinue() {
        elementUtils.waitAndClickElement(continueButton, ConstantClass.LONG_WAIT_180);
    }

    @Step("Enter password: {password}")
    public void enterPassword(String enterPassword) {
        enterPass.click();
       // elementUtils.waitAndClickElement(enterPass, 50);
        elementUtils.sendKeys(enterPass, enterPassword, 50);
    }


    @Step("Click Verify Button")
    public void clickOnVerifyButton() {
        elementUtils.waitAndClickElement(verifyOtp, 50);

    }

    public void verifyElementTextVisibility() {
        List<WebElement> elements = Arrays.asList(loginButton, personalText, otpPage);
        List<String> expectedTexts = Arrays.asList("Login", "Personal Information", "Login or Sign up for IndiGo BluChip");

        boolean isElementVisible = elements.stream().anyMatch(element -> {
            try {
                return expectedTexts.contains(element.getText().trim());
            } catch (Exception ignored) {
                return false; // Ignore NoSuchElementException or StaleElementException
            }
        });

        Assert.assertTrue(isElementVisible, "None of the expected elements are visible on the page.");
    }










    public void verifyInvalidNumberMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            // Wait for the error message to be visible
            wait.until(ExpectedConditions.visibilityOf(enterValidNumber));
            // Assert that the message is displayed
            Assert.assertTrue(enterValidNumber.isDisplayed(), "Validation message is not visible.");
            System.out.println("Validation message is visible: " + enterValidNumber.getText());

        } catch (WebDriverException e) {
            Assert.fail("Failed to find the validation message: " + e.getMessage());
        }
    }

    public void verifyInvalidEmailMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            // Wait for the error message to be visible
            wait.until(ExpectedConditions.visibilityOf(enterValidEmail));
            // Assert that the message is displayed
            Assert.assertTrue(enterValidEmail.isDisplayed(), "Validation message is not visible.");
            System.out.println("Validation message is visible: " + enterValidEmail.getText());
        } catch (WebDriverException e) {
            Assert.fail("Failed to find the validation message: " + e.getMessage());
        }
    }

    public void verifyContinueButtonClicking() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(bookFlight));
            Assert.assertTrue(bookFlight.isDisplayed(), "Validation message is not visible.");
            System.out.println("Validation message is visible: " + bookFlight.getText());

        } catch (WebDriverException e) {
            Assert.fail("Failed to find the validation message: " + e.getMessage());
        }
    }

    @Step("Click on Continue As a Guest User Button")
    public void clickOnContinueAsGuestButton() {
        elementUtils.waitAndClickElement(continueAsGuestButton, 50);

    }
    @Step("Click on Terms and condition link text")
    public void clickOnTermsAndConditionButton() {
        elementUtils.waitAndClickElement(termButton, 50);

    }



    public void verifyTextInWebView()
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            // Wait for the error message to be visible
            wait.until(ExpectedConditions.visibilityOf(indigoTextButton));
            // Assert that the message is displayed
            Assert.assertTrue(indigoTextButton.isDisplayed(), "Validation message is not visible.");
            System.out.println("Validation message is visible: " + indigoTextButton.getText());

        } catch (WebDriverException e) {
            Assert.fail("Failed to find the validation message: " + e.getMessage());
        }
    }
}
