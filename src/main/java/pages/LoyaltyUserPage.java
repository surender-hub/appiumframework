package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class LoyaltyUserPage {
    public AndroidDriver driver;
    private ElementUtils elementUtils;


    @FindBy(xpath = "//android.view.View[3]//android.widget.TextView[@text='Book']")
    private WebElement bookButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"One way\"]")
    private WebElement oneWay;

    public LoyaltyUserPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("CLick on Book Button")
    public void bookSingleTripWithAddOns() {
        ElementUtils.waitAndClickElement(bookButton, ConstantClass.LONG_WAIT_10);
        ElementUtils.waitAndClickElement(oneWay, ConstantClass.LONG_WAIT_10);

    }


}
