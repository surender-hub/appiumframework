package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class ValidFare
{
    private AndroidDriver driver;
    private ElementUtils elementUtils;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Multi city\"]")
    private WebElement selectMultiCity;

    public ValidFare(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }
}
