package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

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
}
