package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class RoundPage {

    private AppiumDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Round trip\"]")
    private WebElement searchOnTo;

    public RoundPage(AppiumDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


}
