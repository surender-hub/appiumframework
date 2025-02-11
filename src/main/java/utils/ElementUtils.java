package utils;

import ch.qos.logback.core.joran.event.stax.StaxEvent;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;


public class ElementUtils {
    public AppiumDriver driver;
    //public static int dat;

    public ElementUtils(AppiumDriver driver) {
        this.driver = driver;
    }

    public void sendKeys(WebElement element, String text, int timeout) {
        waitAndClickElement(element, timeout);
        element.clear();
        element.sendKeys(text);
    }

    // ✅ Method to get the current date in a specific format
    public static String getCurrentDate(String dateFormat) {
        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Create formatter with the provided date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);

        // Format and return the date as a string
        return currentDate.format(formatter);
    }

    public String getDateAfterDays(int daysToAdd) {
        return DateUtils.getDateAfterDays(daysToAdd, "dd/MM/yyyy");
    }
    // ✅ Method to click any date on the calendar except the one 5 days later


    public String clickDate() {
        // Get today's date and the date 5 days from today
        LocalDate today = LocalDate.now();
        String fiveDaysLater = getDateAfterDays(5);

        System.out.println("Today's date: " + today);
        System.out.println("Skipping the date: " + fiveDaysLater);

        String date = fiveDaysLater.substring(0, 2);
        int dat = Integer.parseInt(date);

        return date;
        // Define the XPath locator for the calendar dates (Modify if necessary)

    }


    public void scrollDown() {
        /*int screenHeight = driver.manage().window().getSize().height;
        int screenWidth = driver.manage().window().getSize().width;

        int startX = screenWidth / 2;
        int startY = (int) (screenHeight * 0.8);
        int endY = (int) (screenHeight * 0.2);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence scroll = new Sequence(finger, 1);
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
        scroll.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        scroll.addAction(finger.createPointerMove(Duration.ofMillis(600), PointerInput.Origin.viewport(), startX, endY));
        scroll.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(scroll)); */


//        Point p1 = emailId.getLocation();
//        int x = p1.getX();
//        int y = p1.getY();
//
//        JavascriptExecutor js = driver;
//        js.executeScript("window.scrollBy(0, "+y+")");


    }
    //Using resource ID
    public WebElement scrollToElementByResourceId(String resourceId) {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"" + resourceId + "\"))"));
    }

    // By using text
    public WebElement scrollToElementByText(String text) {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
    }


    public void waitAndClickElement(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

        // Wait until the element is visible
        wait.until(ExpectedConditions.visibilityOf(element));

        // Wait until the element is enabled
        wait.until(ExpectedConditions.elementToBeClickable(element));

        // Wait until the element is displayed
        wait.until(ExpectedConditions.visibilityOf(element));

        // Click the element once it is visible, enabled, and displayed
        if (element.isEnabled() && element.isDisplayed()) {
            element.click();
            System.out.println("Element clicked!");
        } else {
            System.out.println("Element is either not enabled or not displayed.");
        }
    }

}