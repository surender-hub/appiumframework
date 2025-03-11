package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class MultiCity
{
    private AndroidDriver driver;
    private ElementUtils elementUtils;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Multi city\"]")
    private WebElement selectMultiCity;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"To\"])[1]")
    private WebElement toClick1;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"To\"])[2]")
    private WebElement toClick2;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Agra Civil Airport, IAF Arjun Nagar Gate, Kheria\"]")
    private WebElement agraFlight;


    public MultiCity(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Click on Multi City Text")
    public void clickOnMultiCity() {
        ElementUtils.waitAndClickElement(selectMultiCity, 20);
    }

    @Step("Click on To(City 1)")
    public void clickOnTo1() {
        ElementUtils.waitAndClickElement(toClick1, 20);
    }

    @Step("Click on To(City 2)")
    public void clickOnTo2() {
        ElementUtils.waitAndClickElement(toClick1, 20);
    }

    @Step("Select Destination Agra from List")
    @Story("Searching a flight")
    public void clickOnAgraFlight() {
        ElementUtils.waitAndClickElement(agraFlight, 50);
    }

    public void clickOnDate() throws InterruptedException {
        ElementUtils el = new ElementUtils(driver);
        String fututreDate = el.clickReturnDate();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']")).click();
    }

}
