package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

import java.util.List;

public class ValidFare
{
    private AndroidDriver driver;
    private ElementUtils elementUtils;
    List<WebElement> elements;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Multi city\"]")
    private WebElement selectMultiCity;
    @FindBy(xpath = "//android.widget.TextView[@text=\"TOTAL FARE\"]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView")
    private WebElement getFareText;
    @FindBy(xpath ="//android.widget.TextView[@content-desc='clk_text' and starts-with(@text, '₹')]")
    private WebElement getExpectedText;



    public ValidFare(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    @Step("Select the city")
    public void clickOnFlightList() throws InterruptedException {
        elements = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,\"DEL, T\")]"));
        System.out.println("xpath list " + elements);
        if (!elements.isEmpty()) {
            Thread.sleep(2000);
            elements.get(0).click();
            System.out.println("Clicked on the first matching element.");

        } else {
            System.out.println("No elements found with the given XPath.");
        }
        //elementUtils.waitAndClickElement(returnFlightList, 50);
    }

    @Step("Get Fare Text")
    public String getActualText() throws InterruptedException {
        Thread.sleep(5000);
        String actualText = getFareText.getText();
        actualText=actualText.replaceAll("\\s+", "").trim();
        System.out.println("Actual txt" +actualText);
        return  actualText;
    }

    @Step("Get Expected Text")
    public String getExpectedText()
    {
        String expected = getExpectedText.getText().trim();
        return expected;
    }
}
