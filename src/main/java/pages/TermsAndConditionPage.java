package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ConfigReader;
import utils.ElementUtils;

public class TermsAndConditionPage {

    public AndroidDriver driver;
    private ElementUtils elementUtils;

    public TermsAndConditionPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc='Terms & Conditions']")
    public WebElement termsAndConditionsLink;

    @FindBy(xpath = "//android.widget.TextView[@text=\"INDIGO BLUCHIP PROGRAM – TERMS &CONDITIONS\"]")
    public WebElement verifyTermsAndConditionsText;

    public void validateTermsAndConditionsLink() throws InterruptedException {

        try {


            if (termsAndConditionsLink.isDisplayed()) {
                ElementUtils.waitAndClickElement(termsAndConditionsLink, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(verifyTermsAndConditionsText.getText(), ConfigReader.getProperty("Expected(TermsAndConditions)"));
                System.out.println("Terms And Condition link is working");
            } else {
                System.out.println("Terms And Condition link is  not working");
                Assert.fail();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.navigate().back();
        }

    }


}