package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PrivacyPolicyPage {
    public AndroidDriver driver;

    public PrivacyPolicyPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Privacy Policy\"]")
    public WebElement policyLink;

    @FindBy(xpath = "(//android.view.View[@text=\"Privacy Policy\"])[2]")
    public WebElement validatePolicyLink;

    public void displayPrivacyPolicy() {
        if (policyLink.isDisplayed()) {
            System.out.println("Privacy Policy link is Displayed ");
        } else {
            System.out.println("Privacy Policy link  is not Displayed ");
            Assert.fail();
        }
    }


    public void clickPrivacyPolicyLink() {
        if (policyLink.isEnabled()) {
            policyLink.click();
            boolean policyLink=validatePolicyLink.isDisplayed();
            Assert.assertEquals(policyLink,true);
            System.out.println("Privacy Policy link is working ");
        } else {

            System.out.println("Privacy Policy link is not working ");
            Assert.fail();
        }

    }

}
