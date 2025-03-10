package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
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

public class ValidFarePage {
    private AndroidDriver driver;
    private ElementUtils elementUtils;
    List<WebElement> elements;
    List<WebElement> elements1;
    private ThreadWaitClass threadWaitClass;


    @FindBy(xpath = "//android.widget.TextView[@text=\"Multi city\"]")
    private WebElement selectMultiCity;
    @FindBy(xpath = "//android.widget.TextView[@text=\"TOTAL FARE\"]/following-sibling::android.view.ViewGroup[1]//android.widget.TextView")
    private WebElement getFareText;
    @FindBy(xpath = "//android.widget.TextView[@content-desc='clk_text' and starts-with(@text, '₹')]")
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
            // Thread.sleep(2000);
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
            //Thread.sleep(2000);
            ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
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
        actualText = actualText.replaceAll("\\s+", "").replace("₹", "").trim();
        System.out.println("Actual Text: " + actualText);
        return actualText;
    }

    @Step("Get Expected Text")
    public String getExpectedText() {
        String expected = getExpectedText.getText().trim();
        return expected;
    }

    public void clickOnFutureDate(int daysAhead) throws InterruptedException {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(daysAhead);
        String date = String.valueOf(futureDate.getDayOfMonth());
        String currentMonth = today.getMonth().name();
        String futureMonth = futureDate.getMonth().name();
        System.out.println("Today's date: " + today);
        System.out.println("Selecting future date: " + futureDate);
        System.out.println("Current Month: " + currentMonth);
        System.out.println("Future Month: " + futureMonth);
        if (!currentMonth.equals(futureMonth)) {


            WebElement nextButton = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Next Month\"]/com.horcrux.svg.SvgView"));
            ElementUtils.waitAndClickElement(nextButton, ConstantClass.LONG_WAIT_180);
            ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);

            //Thread.sleep(5000);
        }
        List<WebElement> dateElements = driver.findElements(By.xpath("//android.widget.TextView[@text='" + date + "']"));
        for (int i = 0; i < dateElements.size(); i++) {
            List<WebElement> updatedDateElements = driver.findElements(By.xpath("//android.widget.TextView[@text='" + date + "']"));
            if (!updatedDateElements.isEmpty() && i < updatedDateElements.size()) {
                System.out.println("Clicking date: " + date);
                ElementUtils.waitAndClickElement(updatedDateElements.get(i), ConstantClass.LONG_WAIT_180);
                //Thread.sleep(1000);
            }
        }
    }

    public String getFutureDate(int daysAhead) {
        LocalDate futureDate = LocalDate.now().plusDays(daysAhead);
        return String.valueOf(futureDate.getDayOfMonth());
    }


    public String getTotalFare() {
        String fareXPath = "(//android.view.ViewGroup[.//android.widget.TextView[contains(@text, 'Total')]]//android.widget.TextView[contains(@text, '₹')])";
        try {
            List<WebElement> fareElements = driver.findElements(By.xpath(fareXPath));
            if (fareElements.isEmpty()) {
                System.out.println("No fare elements found!");
                return null;
            }
            WebElement lastFareElement = fareElements.get(fareElements.size() - 1);
            lastFareElement.click();
            String fareValue = lastFareElement.getText();
            String cleanedFare = fareValue.replace("₹", "").replace(",", "").trim();
            System.out.println("Total value: " + cleanedFare);
            return cleanedFare;
        } catch (Exception e) {
            System.out.println("Error fetching fare: " + e.getMessage());
            return null;
        }
    }
}
