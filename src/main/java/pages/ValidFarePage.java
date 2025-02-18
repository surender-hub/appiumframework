package pages;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DateUtils;
import utils.ElementUtils;

import java.time.LocalDate;
import java.util.List;

public class ValidFarePage
{
    private AndroidDriver driver;
    private ElementUtils elementUtils;
    List<WebElement> elements;
    List<WebElement> elements1;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Multi city\"]")
    private WebElement selectMultiCity;
    @FindBy(xpath = "//android.widget.TextView[@text=\"TOTAL FARE\"]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView")
    private WebElement getFareText;
    @FindBy(xpath ="//android.widget.TextView[@content-desc='clk_text' and starts-with(@text, '₹')]")
    private WebElement getExpectedText;



    public ValidFarePage(AndroidDriver driver) {
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

    @Step("Select the city")
    public void clickOnFlightReturn() throws InterruptedException {
        elements1 = driver.findElements(By.xpath("//android.widget.TextView[contains(@text,\"BOM, T\")]"));
        System.out.println("xpath list " + elements1);
        if (!elements1.isEmpty()) {
            Thread.sleep(2000);
            elements1.get(0).click();
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

    public void clickOnFutureDate() throws InterruptedException {
        String fututreDate = clickDate();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']")).click();
    }

    public String clickDate() {
        // Get today's date and the date 5 days from today
        LocalDate today = LocalDate.now();
        String fiveDaysLater = getDateAfterDays(3);
        System.out.println("Today's date: " + today);
        System.out.println("Select Future date: " + fiveDaysLater);
        String date = fiveDaysLater.substring(0, 2);
        int dat = Integer.parseInt(date);
        String parseMonth = today.getMonth().name();
        System.out.println("Month Number "+parseMonth);
        return date;
        // Define the XPath locator for the calendar dates (Modify if necessary)

    }
    public String getDateAfterDays(int daysToAdd) {
        return DateUtils.getDateAfterDays(daysToAdd, "dd/MM/yyyy");
    }

    public void clickOnReturnDate() throws InterruptedException {
        String fututreDate = clickReturnDate();
        Thread.sleep(2000);
        List<WebElement> elements = driver.findElements(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']"));
        if (!elements.isEmpty()) {
            for (WebElement ele : elements) {
                ele.click();
                System.out.println("Clicked on every element");
            }
        }
    }
    public String clickReturnDate() {
        // Get today's date and the date 8 days from today
        LocalDate today = LocalDate.now();
        String fiveDaysLater = getDateAfterDays(5);

        String retMonth = today.getMonth().name();
        System.out.println("Return month "+retMonth);
        System.out.println("Today's date: " + today);
        System.out.println("Skipping the date: " + fiveDaysLater);
        String date = fiveDaysLater.substring(0, 2);
        int dat = Integer.parseInt(date);
        return date;
        // Define the XPath locator for the calendar dates (Modify if necessary)

    }

}
