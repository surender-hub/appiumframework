package pages;

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
import org.testng.annotations.Test;
import utils.ElementUtils;
import utils.RetryAnalyzer;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class LoginPage {
    public AndroidDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.EditText[@text=\"Enter Mobile No. / Email Id\"]")
    private WebElement enterMobile;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Continue\"]")
    private WebElement continueButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"password\"]")
    private WebElement enterPass;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"phoneVerificationControl-readOnly_but_verify_code\"]")
    private WebElement verifyOtp;
    @FindBy(xpath = "//android.widget.Button[@resource-id=\"next\"]")
    private WebElement loginButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Personal Information\"]")
    private WebElement personalText;
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
        elementUtils.waitAndClickElement(enterMobile, 50);
        elementUtils.sendKeys(enterMobile, mobileNumber, 50);
    }

    @Step("Click on Continue Button")
    public void clickOnContinue() {
        elementUtils.waitAndClickElement(continueButton, 50);

    }

    @Step("Enter password: {password}")
    public void enterPassword(String enterPassword) {
        elementUtils.waitAndClickElement(enterPass, 50);
        elementUtils.sendKeys(enterPass, enterPassword, 50);
    }


    @Step("Click Verify Button")
    public void clickOnVerifyButton() {
        elementUtils.waitAndClickElement(verifyOtp, 50);

    }

    public void verifyLoginOrPersonalInfoVisibility() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            // Create a list of elements
            List<WebElement> elements = Arrays.asList(loginButton, personalText);
            boolean isElementVisible = false;
            // Iterate through the elements and check visibility
            for (WebElement element : elements) {
                try {
                    wait.until(ExpectedConditions.visibilityOf(element));
                    if (element.isDisplayed()) {
                        System.out.println("Element found and visible: " + element.getText());
                        isElementVisible = true;
                        break;  // Stop checking once we find a visible element
                    }
                } catch (Exception ignored) {
                    // Ignore the exception and continue to check the next element
                }
            }
            // Assert if at least one element is visible
            Assert.assertTrue(isElementVisible, "Neither Login button nor Personal Information is visible.");

        } catch (WebDriverException e) {
            Assert.fail("Failed to find the required elements: " + e.getMessage());
        }
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
            // Wait for the error message to be visible
            wait.until(ExpectedConditions.visibilityOf(bookFlight));
            // Assert that the message is displayed
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
