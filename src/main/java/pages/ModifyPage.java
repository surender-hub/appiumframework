package pages;

import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class ModifyPage {

    private AppiumDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.TextView[@text=\"My Trips\"]")
    private WebElement myTrips;
    @FindBy(xpath = "//android.widget.EditText[@text=\"PNR / Booking Reference\"]")
    private WebElement pnrDetails;
    @FindBy(xpath = "//android.widget.EditText[@text=\"Email ID / Last Name\"]")
    private WebElement emailId;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Get Started\"]")
    private WebElement getStarted;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Modify\"]")
    private WebElement modifyButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Change flight\"]")
    private WebElement changeFlightButton;
    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView")
    private WebElement checkBox;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Proceed\"]")
    private WebElement proceedButton;
    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")
    private WebElement selectFlight;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Next\"]")
    private WebElement nxtButton;
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"When press next button open new screen\"]")
    private WebElement nxtButtonFare;


    public ModifyPage(AppiumDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    @Step("Click on  My Trips on Bottom Bar ")
    public void clickOnMyTrips() {
        elementUtils.waitAndClickElement(myTrips, 20);
    }

    @Step("Enter PNR {Pnr details}")
    public void enterPnr(String pnrDetail) {
        elementUtils.waitAndClickElement(pnrDetails, 50);
        elementUtils.sendKeys(pnrDetails, pnrDetail, 50);
    }

    @Step("Enter EmailId {Pnr details}")
    public void enterEmail(String email) {
        elementUtils.waitAndClickElement(emailId, 50);
        elementUtils.sendKeys(emailId, email, 50);
    }

    @Step("Click on  Get Started Button after pnr details ")
    public void clickOnGetStarted() throws InterruptedException {
        elementUtils.waitAndClickElement(getStarted, 20);
        Thread.sleep(10000);
    }

    @Step("Click on Modify button")
    public void clickOnModify() throws InterruptedException
    {
        elementUtils.waitAndClickElement(modifyButton,20);
//        System.out.println("Clicking Modify");
//        driver.findElement(By.xpath("//android.widget.TextView[@text=\"Modify\"]")).click();
//        Thread.sleep(10000);
//        System.out.println("Clicked Modify");
//        while (!changeFlightButton.isDisplayed()) {
//            System.out.println("outside loop");
//           // elementUtils.clickElement(modifyButton, 50);
//            driver.findElement(By.xpath("//android.widget.TextView[@text=\"Modify\"]")).click();
//            System.out.println("While loop");
//            if (changeFlightButton.isDisplayed())
//                break;
//        }

    }

    @Step("Click on change flight Button")
    public void clickOnChangeFlightButton() {
        elementUtils.waitAndClickElement(changeFlightButton, 20);
    }

    @Step("Click on Check Box")
    public void clickOnCheckBox() {
        elementUtils.waitAndClickElement(checkBox, 20);
    }

    @Step("Click on Check Box")
    public void clickOnProceedButton() {
        elementUtils.waitAndClickElement(proceedButton, 20);
    }

    @Step("Click on Check Box")
    public void clickOnFlightList() {
        elementUtils.waitAndClickElement(selectFlight, 20);
    }

    @Step("Click on Check Box")
    public void clickOnNxtButton() {
        elementUtils.waitAndClickElement(nxtButton, 20);
    }

    @Step("Click on Next Button")
    public void clickOnNxtFareButton() {
        elementUtils.waitAndClickElement(nxtButtonFare, 20);
    }


}
