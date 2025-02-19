package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class TermsAndConditionPage {

    public AndroidDriver driver;
    private ElementUtils elementUtils;

    public TermsAndConditionPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath ="//android.widget.Button[@content-desc='Terms & Conditions']")
    public WebElement termsAndCondtionLink;

@FindBy(xpath = "//android.widget.TextView[@text=\"INDIGO BLUCHIP PROGRAM – TERMS &CONDITIONS\"]")
public WebElement verifyTermsAndConditionsText;

    public void validateTermsAndConditonLink() throws InterruptedException {

        if (termsAndCondtionLink.isEnabled()) {
            Thread.sleep(5000);
            termsAndCondtionLink.click();
            System.out.println("Terms And Condition link is working");
        } else {
            System.out.println("Terms And Condition link is  not working");
        }
    }

        public void  verifyText()
        {
            termsAndCondtionLink.click();
String text = verifyTermsAndConditionsText.getText();
            System.out.println(text);
        }
    }

