package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.ElementUtils;
import java.time.Duration;
import java.util.List;


public class SeatPage {
    public  AndroidDriver driver;
    public ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[7]/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup")
    //@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(84)")
    private WebElement nextSeat;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"When press next button open new screen\"]")
    //@AndroidFindBy(uiAutomator = "new UiSelector().description(\"When press next button open new screen\")")
    private WebElement nextFare;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Free\"]")
    private WebElement freeSeat;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    private List<WebElement> viewGroups;

    @AndroidFindBy (accessibility="When press next button open new screen")
    private WebElement nextButtonWithAccessbility;





//accessibility id
    //When press next button open new screen

    //new UiSelector().description("When press next button open new screen")

    //List<WebElement> viewGroups = driver.findElements(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
    int indexToClick = 3;

    //android.widget.TextView
    public SeatPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Click on Next to Select Seat")
    public void clickOnNextForSeat() {
        elementUtils.waitAndClickElement(nextSeat, 50);
    }
    @Step("Click on Next Fare screen")
    public void clickOnNextFare() {
        elementUtils.waitAndClickElement(nextFare, 50);
    }
    @Step("Click on Free Button")
    public void clickOnFreeButton() {
        elementUtils.waitAndClickElement(freeSeat, 50);
    }



    public void clickOnNextButton()
    {
       // nextButtonWithAccessbility.click();
        WebElement nextButton2 = driver.findElement(AppiumBy.androidUIAutomator(
          "new UiSelector().description(\"When press next button open new screen\")"));
        nextButton2.click();
    }




    @Step("Click on Seat")
    public void clickOnSeat()
    {
        System.out.println(viewGroups.size()+" Size");
        System.out.println(viewGroups+" view data");
        if (viewGroups.size() > indexToClick) {
            System.out.println(viewGroups.size());
            WebElement targetElement = viewGroups.get(indexToClick);

            elementUtils.waitAndClickElement(targetElement, 50);
        } else {
            System.out.println("Element at the specified index is not found.");
        }
    }


    public void selectSeat() throws InterruptedException {

        boolean value = driver.findElement(By.className("android.view.ViewGroup")).isEnabled();


        while (value) {

            try {
                boolean elememnt = driver.findElement(By.xpath("//android.widget.TextView[@text=\"All seat\"]")).isDisplayed();
                if (elememnt == true) {
                    break;
                }

            } catch (Exception e) {

              WebElement ele =   driver.findElement(By.xpath("//*[@text ='Next']"));
              Thread.sleep(2000);
              elementUtils.waitAndClickElement(ele, 50);



            }

        }

        //code to select seat

        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
        ));



        List<WebElement> seats = driver.findElements(By.xpath("//*[@class='android.widget.ScrollView']/descendant::android.view.ViewGroup[contains(@resource-id,\"seatSelectionSeatSelectTestID\")]/descendant::android.widget.TextView"));

        //System.out.println("Total seats found: " + seats.size());
        System.out.println("Total: " + seats);

        for (WebElement seat : seats) {


            //System.out.println( "Seat Name "+seat.getText());
            System.out.println(" Seat Name "+seat.getText());
            if(seat.isEnabled()) {
                Thread.sleep(2000);
                seat.click();
                break;
            }
        }
        Thread.sleep(5000);
        WebElement elem = driver.findElement(By.xpath("//com.horcrux.svg.CircleView"));
        elementUtils.waitAndClickElement(elem, 50);
        //seatPage.clickOnSeat();

        System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text=\"1 Seats Added\"]")).getText());

    }

    public void modifySeat(){
//        boolean value = driver.findElement(By.className("android.view.ViewGroup")).isEnabled();
//
//
//        while (value) {
//
//            try {
//                boolean elememnt = driver.findElement(By.xpath("//android.widget.TextView[@text=\"All seat\"]")).isDisplayed();
//                if (elememnt == true) {
//                    break;
//                }
//
//            } catch (Exception e) {
//
//                WebElement ele =   driver.findElement(By.xpath("//*[@text ='Next']"));
//                Thread.sleep(2000);
//                elementUtils.waitAndClickElement(ele, 50);
//
//
//
//            }
//
//        }

        //code to select seat




        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(1)"
        ));
        List<WebElement> seats = driver.findElements(By.xpath("//*[@class='android.widget.ScrollView']/descendant::android.view.ViewGroup[contains(@resource-id,\"seatSelectionSeatSelectTestID\")]/descendant::android.widget.TextView"));

        //System.out.println("Total seats found: " + seats.size());
        System.out.println("Total: " + seats);

        for (WebElement seat : seats) {


            //System.out.println( "Seat Name "+seat.getText());
            System.out.println("Modify Seat Name "+seat.getText());
            if(seat.isEnabled()) {
                seat.click();
                break;
            }
        }

        WebElement elem = driver.findElement(By.xpath("//com.horcrux.svg.CircleView"));
        elementUtils.waitAndClickElement(elem, 50);
        //seatPage.clickOnSeat();

        System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@text=\"1 Seats Added\"]")).getText());

    }
    }
