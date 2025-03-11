package pages;

import constant.ConstantClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

import java.util.List;

public class RoundPage {

    private AndroidDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Round trip\"]")
    private WebElement selectRoundTrip;
    @FindBy(xpath = "//android.widget.TextView[@text=\"To\"]")
    private WebElement searchOnTo;
    @FindBy(xpath = "//android.widget.EditText[@text='Search place/airport']")
    private WebElement searchCity;
    @FindBy(xpath = "//android.widget.TextView[@text='Chhatrapati Shivaji Maharaj International Airport']")
    private WebElement mumbaiFlight;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Search\"]")
    private WebElement searchButton;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")
    private WebElement returnFlightList;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"When press next button open new screen\"]")
    private WebElement nxtButton;
    List<WebElement> elements;

    public RoundPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    @Step("Select Round Trip")
    public void selectRoundTrip() {
        ElementUtils.waitAndClickElement(selectRoundTrip, ConstantClass.LONG_WAIT_180);
    }
    @Step("Select city in round trip")
    public void clickOnToRoundTrip() {
        ElementUtils.waitAndClickElement(searchOnTo, ConstantClass.LONG_WAIT_180);
    }

    @Step("Search City: {placeName}")
    public void searchCity(String cityName) {
        ElementUtils.waitAndClickElement(searchCity, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(searchCity, cityName, ConstantClass.LONG_WAIT_180);
    }

    @Step("Select Destination Mumbai from List")
    @Story("Searching a flight")
    public void clickOnMumbaiFlight() {
        ElementUtils.waitAndClickElement(mumbaiFlight, ConstantClass.LONG_WAIT_180);
    }

    public void clickOnDate() throws InterruptedException {
        ElementUtils el = new ElementUtils(driver);
        String fututreDate = el.clickDate();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']")).click();
    }

    public void clickOnReturneDate() throws InterruptedException {
        ElementUtils el = new ElementUtils(driver);
        String fututreDate = el.clickReturnDate();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']")).click();
    }

    @Step("Search the available city")
    public void clickOnSearchButton() {
        ElementUtils.waitAndClickElement(searchButton, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click the return city")
    public void clickOnReturnFlight() throws InterruptedException {
//        elements = driver.findElements(By.xpath("//android.widget.TextView[@text='BOM, T']"));
        //android.widget.TextView[contains(@text,'BOM, T')]
        elements = driver.findElements(By.xpath("(//android.widget.TextView[@text=\"6Exclusive\"])"));
        System.out.println("xpath list " + elements);

        // Click the first element if found
        if (!elements.isEmpty()) {
            Thread.sleep(6000);
            elements.get(0).click();
            System.out.println("Clicked on the first matching element.");
        } else {
            System.out.println("No elements found with the given XPath.");
        }
        //elementUtils.waitAndClickElement(returnFlightList, 50);
    }

    @Step("Select Next for Payment")
    public void nextButton() throws InterruptedException {
        ElementUtils.waitForElementVisible(By.xpath("//android.view.ViewGroup[@content-desc=\"When press next button open new screen\"]"),ConstantClass.LONG_WAIT_100);
        ElementUtils.waitAndClickElement(nxtButton, ConstantClass.LONG_WAIT_180);
    }
}
