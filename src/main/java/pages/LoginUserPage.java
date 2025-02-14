package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

import java.util.List;

public class LoginUserPage
{
    public AndroidDriver driver;
    private ElementUtils elementUtils;
    List<WebElement> elements;


    @FindBy(xpath = "//android.widget.TextView[@text='To']")
    private WebElement searchOnTo;
    @FindBy(xpath = "//android.widget.EditText[@text='Search place/airport']")
    private WebElement searchPlace;


    public LoginUserPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }
    @Step("Click on Destination Button")
    public void clickOnTo() {
        elementUtils.waitAndClickElement(searchOnTo, 50);
    }

    @Step("Search Place: {placeName}")
    public void searchPlace(String placeName) {
        elementUtils.waitAndClickElement(searchPlace, 50);
        elementUtils.sendKeys(searchPlace, placeName, 50);
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

    public void clickOnFutureDate() throws InterruptedException {
        ElementUtils el = new ElementUtils(driver);
        String fututreDate = el.clickDate();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']")).click();
    }


}
