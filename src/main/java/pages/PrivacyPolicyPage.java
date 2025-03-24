package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ConfigReader;
import utils.ElementUtils;

public class PrivacyPolicyPage {
    public AndroidDriver driver;

    public PrivacyPolicyPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Privacy Policy\"]")
    public WebElement policyLink;

    @FindBy(xpath = "//android.view.View[@content-desc=\"Home\"]/ancestor::android.widget.ListView/descendant::android.view.View[@text=\"Privacy Policy\"]")
    public WebElement validatePolicyLink;

    public void displayPrivacyPolicy() {
        if (policyLink.isDisplayed()) {
            Assert.assertEquals(policyLink.isDisplayed(),true);
            System.out.println("Privacy Policy link is Displayed ");
        } else {
            System.out.println("Privacy Policy link  is not Displayed ");
            Assert.fail();
        }
    }


    public void clickPrivacyPolicyLink() {
        try {
            if (policyLink.isDisplayed()) {
                ElementUtils.waitAndClickElement(policyLink, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validatePolicyLink.getText(), ConfigReader.getProperty("PrivacyPolicy"));
                System.out.println("Privacy Policy link is working ");
            } else {

                System.out.println("Privacy Policy link is not working ");
                Assert.fail();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.navigate().back();
        }


    }

}
