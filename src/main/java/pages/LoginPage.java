package pages;

import constant.ConstantClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
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
import java.util.NoSuchElementException;

public class LoginPage {
    public AndroidDriver driver;
    private ElementUtils elementUtils;

    String inputText = "Enter Mobile No. / Email Id";
    String dynamicXPath = "//android.widget.EditText[@text='" + inputText + "']";
    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Mobile No. / Email Id\"]")
    private WebElement enterMobile;

    //@FindBy(xpath = "//android.widget.TextView[contains(@text,'Login or Sign up')]/ancestor::*[position()=4]/following-sibling::android.view.ViewGroup")
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Login or Sign up')]/ancestor::*[position()=4]/following-sibling::android.view.ViewGroup//android.widget.EditText")
    private WebElement enterValidEmailAddress;

    @FindBy(xpath = "//android.widget.EditText[contains(@text, \"Enter Mobile No.\") or contains(@text, \"@\")]")
    private WebElement enterValidEmailAddress1;

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
    @FindBy(xpath = "//android.view.View[@resource-id='otpField']//android.widget.EditText")
    private WebElement OtpField;

    @FindBy(xpath = "//android.view.View[@resource-id='otpField']//android.widget.EditText[1]")
    private WebElement OtpFieldOne;
    @FindBy(xpath = "//android.view.View[@resource-id='otpField']//android.widget.EditText[2]")
    private WebElement OtpFieldTwo;
    @FindBy(xpath = "//android.view.View[@resource-id='otpField']//android.widget.EditText[3]")
    private WebElement OtpFieldThree;
    @FindBy(xpath = "//android.view.View[@resource-id='otpField']//android.widget.EditText[4]")
    private WebElement OtpFieldFour;
    @FindBy(xpath = "//android.view.View[@resource-id='otpField']//android.widget.EditText[5]")
    private WebElement OtpFieldFifth;
    @FindBy(xpath = "//android.view.View[@resource-id='otpField']//android.widget.EditText[6]")
    private WebElement OtpFieldSix;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Add details for an improved experience.\"]")
    private WebElement displayText;
    @FindBy(xpath = "//android.widget.TextView[@text=\" Male\"]")
    private WebElement maleText;
    @FindBy(xpath = "android.widget.EditText")
    private WebElement editText;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Privacy Policy\"]")
    private WebElement privacyText;
    @FindBy(xpath = "//android.widget.Image[@text=\"Indigo Logo Image\"]")
    private WebElement verifyLogo;
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'Login or Sign up')]/ancestor::*[position()=4]/following-sibling::android.view.ViewGroup//android.widget.EditText")
    private WebElement clearMobile;



    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    @Step("Enter Mobile Number: {mobile number}")
    public void enterMobileNumber(String mobileNumber) {
        clearMobile.clear();
        ElementUtils.waitAndClickElement(enterMobile, ConstantClass.LONG_WAIT_10);
        elementUtils.sendKeys(enterMobile, mobileNumber, ConstantClass.LONG_WAIT_10);
    }

    @Step("Enter Valid Email Address")
    public void enterValidEmailAddress(String validEmail) {
        ElementUtils.waitAndClickElement(enterValidEmailAddress, ConstantClass.LONG_WAIT_10);
        // elementUtils.sendKeys(enterValidEmailAddress1, validEmail, ConstantClass.LONG_WAIT_10);
    }


    @Step("Click on Continue Button")
    public void clickOnContinue() {
        ElementUtils.waitAndClickElement(continueButton, ConstantClass.LONG_WAIT_10);
    }

    @Step("Enter password: {password}")
    public void enterPassword(String enterPassword) {
        enterPass.click();
        // elementUtils.waitAndClickElement(enterPass, 50);
        elementUtils.sendKeys(enterPass, enterPassword, 50);
    }


    @Step("Click Verify Button")
    public void clickOnVerifyButton() {
        ElementUtils.waitAndClickElement(verifyOtp, 50);

    }

    public void verifyElementTextVisibility() {

   /*     List<WebElement> elements = Arrays.asList(loginButton, maleText);
        List<String> expectedTexts = Arrays.asList("Login", "Male");

        boolean isElementVisible = elements.stream().anyMatch(element -> {
            try {
                return expectedTexts.contains(element.getText().trim());
            } catch (Exception ignored) {
                return false; // Ignore NoSuchElementException or StaleElementException
            }

        });*/
        // Assert.assertTrue(isElementVisible, "None of the expected elements are visible on the page.");

        Assert.assertTrue(maleText.isDisplayed(), "Male text is not displayed");
        driver.navigate().back();
        enterValidEmailAddress.clear();
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
        enterValidEmailAddress.clear();
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
        enterValidEmailAddress.clear();
    }

    public void verifyContinueButtonClicking() {

        ElementUtils.waitAndClickElement(continueAsGuestButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(bookFlight.isDisplayed(), "Validation message is not visible.");
        //driver.navigate().back();
    }

    @Step("Click on Continue As a Guest User Button")
    public void clickOnContinueAsGuestButton() {
        Assert.assertTrue(continueAsGuestButton.isDisplayed(), "Continue as a guest is not displayed");
        //ElementUtils.waitAndClickElement(continueAsGuestButton, 50);

    }

    @Step("Click on Terms and condition link text")
    public void clickOnTermsAndConditionButton() {
        Assert.assertTrue(termButton.isDisplayed(), "Terms & Conditions is not displayed");
    }


    @Step("Click on Continue As a Guest User Button")
    public void clickOnLoginButton() {
        ElementUtils.waitAndClickElement(loginButton, ConstantClass.LONG_WAIT_10);
    }

    public void verifyTextInWebView() {

        ElementUtils.waitAndClickElement(termButton, ConstantClass.MEDIUM_WAIT_5);
        Assert.assertTrue(indigoTextButton.isDisplayed(), "Terms & Conditions is not displayed");

        /*try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            // Wait for the error message to be visible
            wait.until(ExpectedConditions.visibilityOf(indigoTextButton));
            // Assert that the message is displayed
            Assert.assertTrue(indigoTextButton.isDisplayed(), "Validation message is not visible.");
            System.out.println("Validation message is visible: " + indigoTextButton.getText());

        } catch (WebDriverException e) {
            Assert.fail("Failed to find the validation message: " + e.getMessage());
        }*/
        driver.navigate().back();
    }


    @Step("Enter  Otp: {Otp}")
    public void enterOtpNumber(String otpField2) {
        ElementUtils.waitAndClickElement(OtpField, ConstantClass.LONG_WAIT_10);
        elementUtils.sendKeys(OtpField, otpField2, ConstantClass.LONG_WAIT_10);
    }


    public void enterOTP(AndroidDriver driver, String otp) {
        List<WebElement> otpFields = driver.findElements(By.xpath("//android.view.View[@resource-id='otpField']//android.widget.EditText"));

        if (otpFields.isEmpty()) {
            throw new NoSuchElementException("OTP input fields not found!");
        }
        // Ensure only valid OTP length is used
        char[] otpDigits = otp.toCharArray();
        int length = Math.min(otpDigits.length, otpFields.size());
        for (int i = 0; i < length; i++) {
            WebElement field = otpFields.get(i);

            // Click the field to focus (important for some apps)
            field.click();

            // Clear any pre-filled values (optional)
            //field.clear();
            // Enter OTP digit
            field.sendKeys(String.valueOf(otpDigits[i]));
        }
        // Hide keyboard if needed
        try {
            driver.hideKeyboard();
        } catch (Exception e) {
            System.out.println("Keyboard not visible, skipping hide.");
        }
    }

    @Step("Verify Privacy Policy Text Displayed")
    public void verifyPrivacyT() {
        Assert.assertTrue(privacyText.isDisplayed(), "Terms & Conditions is not displayed");
    }

    @Step("Verify Privacy Policy Text is clickable")
    public void verifyPrivacyTClickable() {
        ElementUtils.waitAndClickElement(privacyText, ConstantClass.MEDIUM_WAIT_5);
        Assert.assertTrue(verifyLogo.isDisplayed(), "Terms & Conditions is not displayed");
        driver.navigate().back();
        enterValidEmailAddress.clear();
    }

}
