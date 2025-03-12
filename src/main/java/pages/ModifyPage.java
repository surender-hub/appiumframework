package pages;

import constant.ConstantClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

import java.util.List;

public class ModifyPage {

    public AndroidDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.TextView[@text=\"My Trips\"]")
    private WebElement myTrips;
    @FindBy(xpath = "//android.widget.EditText[@text=\"PNR / Booking Reference\"]")
    private WebElement pnrDetails;
    @FindBy(xpath = "//android.widget.EditText[contains(@text, 'Email') or contains(@text, 'Last')]")
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
    @FindBy(xpath = "//android.widget.TextView[@text=\"Finish\"]")
    private WebElement finishButton;
    @FindBy(xpath = "//com.horcrux.svg.PathView")
    private WebElement cancelButton;


    public ModifyPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    @Step("Click on  My Trips on Bottom Bar ")
    public void clickOnMyTrips() {
        ElementUtils.waitAndClickElement(myTrips, ConstantClass.LONG_WAIT_180);
    }

    @Step("Enter PNR {Pnr details}")
    public void enterPnr(String pnrDetail) {
        ElementUtils.waitAndClickElement(pnrDetails, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(pnrDetails, pnrDetail, ConstantClass.LONG_WAIT_180);
    }

    @Step("Enter EmailId {Pnr details}")
    public void enterEmail(String email) {
        ElementUtils.waitAndClickElement(emailId, ConstantClass.LONG_WAIT_180);
        elementUtils.sendKeys(emailId, email, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on  Get Started Button after pnr details ")
    public void clickOnGetStarted() throws InterruptedException {
        ElementUtils.waitAndClickElement(getStarted, ConstantClass.LONG_WAIT_10);
    }

    @Step("Click on Modify button")
    public void clickOnModify() throws InterruptedException {
        ElementUtils.waitAndClickElement(modifyButton, ConstantClass.LONG_WAIT_180);
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
        ElementUtils.waitAndClickElement(changeFlightButton, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on Check Box")
    public void clickOnCheckBox() {
        ElementUtils.waitAndClickElement(checkBox, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on Check Box")
    public void clickOnProceedButton() {
        ElementUtils.waitAndClickElement(proceedButton, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on Check Box")
    public void clickOnFlightList() {
        ElementUtils.waitAndClickElement(selectFlight, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on Check Box")
    public void clickOnNxtButton() {
        ElementUtils.waitAndClickElement(nxtButton, ConstantClass.LONG_WAIT_180);
    }

    @Step("Click on Next Button")
    public void clickOnNxtFareButton() {
        ElementUtils.waitAndClickElement(nxtButton, 50);

        Actions actions = new Actions(driver);
        actions.moveToElement(nxtButtonFare).click().perform();


    }


    @Step("Click on finish")
    public void clickOnFinishButton() {
        ElementUtils.waitAndClickElement(finishButton, 20);
    }

    @Step("Click on Check Box")
    public void clickOnCancelButton() {
        ElementUtils.waitAndClickElement(cancelButton, 20);
    }




    public void modifyFlight() throws InterruptedException {
        boolean value = driver.findElement(By.className("android.view.ViewGroup")).isEnabled();

        while (value) {

            try {
                boolean elememnt = driver.findElement(By.xpath("//android.widget.TextView[@text=\"All seat\"]")).isDisplayed();
                if (elememnt == true) {
                    break;
                }

            } catch (Exception e) {

                WebElement ele = driver.findElement(By.xpath("//*[@text ='Next']"));
                ElementUtils.waitAndClickElement(ele,ConstantClass.LONG_WAIT_180);
                //ele.click();

                //Thread.sleep(2000);
            }
        }

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
        ));
        List<WebElement> seats = driver.findElements(By.xpath("//*[@class='android.widget.ScrollView']/descendant::android.view.ViewGroup[contains(@resource-id,\"seatSelectionSeatSelectTestID\")]/descendant::android.widget.TextView"));


        System.out.println("Total: " + seats);

        for (WebElement seat : seats) {



            System.out.println("Modify Seat Name " + seat.getText());
            if (seat.isEnabled()) {
                ElementUtils.waitAndClickElement(seat,ConstantClass.LONG_WAIT_180);
               // seat.click();
                break;
            }
        }
        Thread.sleep(5000);
        WebElement elem = driver.findElement(By.xpath("//com.horcrux.svg.CircleView"));
        //Thread.sleep(2000);
        //elem.click();


        System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text=\"1 Seats Added\"]")).getText());
        Thread.sleep(2000);
    }
}
