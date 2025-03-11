package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ElementUtils;

public class RegistrationPage {
    private AndroidDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.view.ViewGroup[contains(@content-desc, 'Male')]//android.widget.RadioButton")
    private WebElement maleRadio;
    @FindBy(xpath = "//android.widget.EditText[@text=\"First Name\"]")
    private WebElement enterFirstName;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Last Name\"]")
    private WebElement enterLastName;
    @FindBy(xpath = "//android.widget.EditText[@text=\"pal\"]")
    private WebElement checkValidLastname;



    @FindBy(xpath = "//android.widget.EditText[@text=\"Date of Birth\"]")
    private WebElement enterValidDob;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Please enter valid date of birth\"]")
    private WebElement enterInvalidDate;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Male Unselected\"]/android.view.ViewGroup/android.widget.RadioButton/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement maleRadioButton;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Date of Birth\"]")
    private WebElement clickDob;
    @FindBy(xpath = "//android.widget.EditText[@text=\"01-01-1991\"]")
    private WebElement validDobCheck;
    @FindBy(xpath = "//android.widget.EditText[@text=\"surender\"]")
    private WebElement validCheckFirstName;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Please enter valid date of birth\"]")
    private WebElement invalidDobCheck;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='Male Unselected']/android.view.ViewGroup/android.widget.RadioButton")
    private WebElement checkMaleRadioButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\" Male\"]")
    private WebElement checkMaleText;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Female Unselected\"]/android.view.ViewGroup/android.widget.RadioButton")
    private WebElement checkFemaleRadioButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\" Female\"]")
    private WebElement checkFemaleText;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"TNC\"]")
    private WebElement linkTextTnc;
    @FindBy(xpath = "//android.view.View[contains(@text, 'Privacy Policy')]")
    private WebElement privacyPolicyText;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Privacy Policy\"]")
    private WebElement privacyPolicyLinkText;
    @FindBy(xpath = "//android.widget.Button[@content-desc=\"T&C.\"]")
    private WebElement tcLinkText;



















    public RegistrationPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Click on Male Radio Button")
    public void clickOnMaleRadio() {
        ElementUtils.waitAndClickElement(maleRadio, 50);
    }
    public void isMaleSelected() {
        Point beforeClick = maleRadio.getLocation();
        ElementUtils.waitAndClickElement(maleRadio, 50);
        Point afterClick = maleRadio.getLocation();
        Assert.assertNotEquals(beforeClick, afterClick, "Radio button did not move after clicking.");
    }

    @Step("Enter First Name: {first name}")
    public void enterFirstName(String firstName) {
        ElementUtils.waitAndClickElement(enterFirstName, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(enterFirstName, firstName, ConstantClass.LONG_WAIT_180);
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);  // Waits for 5 seconds
        Assert.assertEquals(validCheckFirstName.getText(), "surender", "First name input should be correct");
    }
    @Step("Enter last Name: {last name}")
    public void enterValidLastName(String lastName) {
        ElementUtils.waitAndClickElement(enterLastName, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(enterLastName, lastName, ConstantClass.LONG_WAIT_180);
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);  // Waits for 5 seconds
        Assert.assertEquals(checkValidLastname.getText(), "pal", "Last name input should be correct");
    }

    @Step("Enter valid dob: {dob}")
    public void enterValidDob(String validDob) {
        ElementUtils.waitAndClickElement(enterValidDob, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(enterValidDob, validDob, ConstantClass.LONG_WAIT_180);
    }

    @Step("Enter valid dob: {dob}")
    public void checkValidDateOfBirth() {
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);  // Waits for 5 seconds
        Assert.assertEquals(validDobCheck.getText(), "01-01-1991", "Data of birth input should be correct");

    }


    @Step("Enter Invalid dob: {dob}")
    public void enterInvalidDob(String invalidDob) {
        ElementUtils.waitAndClickElement(clickDob, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(clickDob, invalidDob, ConstantClass.LONG_WAIT_180);
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        Assert.assertEquals(invalidDobCheck.getText(), "Please enter valid date of birth", "Data of birth input is incorrect");

    }

    @Step("Enter invalid date of birth: {date of birth}")
    public void checkMaleRadioButton() throws InterruptedException {
        Thread.sleep(5000);
        ElementUtils.waitAndClickElement(maleRadio, 20);
         String button = maleRadio.getAttribute("checked");

        System.out.println(button);
//        if()
//        {
//            System.out.println("Radio button is Selected");
//        }
//        else {
//            System.out.println("radio button is not selected");
//        }
       // Assert.assertEquals(enterInvalidDob.getText(), "Please enter valid date of birth", "First name input should be correct");
    }

    public void verifyMaleRadioButton() {
        Assert.assertTrue(checkMaleRadioButton.isDisplayed(), "Check male Radio button is not displayed!");
    }

    public void verifyMaleText() {
        Assert.assertTrue(checkMaleText.isDisplayed(), "Check male text  is not displayed!");
    }
    public void verifyFemaleRadioButton() {
        Assert.assertTrue(checkFemaleRadioButton.isDisplayed(), "Female Radio button is not displayed!");
    }
    public void verifyFemaleText() {
        Assert.assertTrue(checkFemaleText.isDisplayed(), "Female text is not displayed!");
    }
    public void verifyLinkTextTnc() {
        Assert.assertTrue(linkTextTnc.isDisplayed(), "LinkTNC link text is not displayed!");
    }

    public void verifyLinkTextTncIsClickable() {
        ElementUtils.waitAndClickElement(linkTextTnc,ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(privacyPolicyText.isDisplayed(), "Privacy PolicyText is not displayed!");
    }

    public void verifyLinkTextPrivacy() {
        Assert.assertTrue(privacyPolicyLinkText.isDisplayed(), "LinkTNC link text is not displayed!");
    }

    public void verifyLinkTextPrivacyIsClickable() {
        ElementUtils.waitAndClickElement(privacyPolicyLinkText,ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(privacyPolicyText.isDisplayed(), "Privacy PolicyText is not displayed!");
    }
    public void verifyLinkTextTc() {
        Assert.assertTrue(tcLinkText.isDisplayed(), "LinkTNC link text is not displayed!");
    }

    public void verifyLinkTextTcIsClickable() {
        ElementUtils.waitAndClickElement(tcLinkText,ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(privacyPolicyText.isDisplayed(), "Privacy PolicyText is not displayed!");
    }

}
