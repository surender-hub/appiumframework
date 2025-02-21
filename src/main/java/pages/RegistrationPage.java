package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class RegistrationPage {
    private AndroidDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.view.ViewGroup[contains(@content-desc, 'Male')]//android.widget.RadioButton")
    private WebElement maleRadio;

    public RegistrationPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Click on Male Radio Button")
    public void clickOnMaleRadio() {
        elementUtils.waitAndClickElement(maleRadio, 50);
    }
    public boolean isMaleSelected() {
        return maleRadio.isSelected();
    }
}
