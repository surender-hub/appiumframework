package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static base.BaseTest.driver;


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
        System.out.println("Future  date: " + fiveDaysLater);

        String date = fiveDaysLater.substring(0, 2);
        int dat = Integer.parseInt(date);

        return date;
        // Define the XPath locator for the calendar dates (Modify if necessary)

    }

    public String clickReturnDate() {
        // Get today's date and the date 8 days from today
        LocalDate today = LocalDate.now();
        String fiveDaysLater = getDateAfterDays(8);

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
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        // System.out.println("Element clicked successfully!");
    }
       /* long endTime = System.currentTimeMillis() + (timeout * 1000);
        while (System.currentTimeMillis() < endTime) {
            try {
                WebElement element = driver.findElement(locator); // Try to find the element dynamically

                if (element != null) {
                    element.click();  // Click the element immediately if found
                    System.out.println("Element clicked successfully!");
                    return;  // Exit after clicking
                }
            } catch (NoSuchElementException | ElementClickInterceptedException | StaleElementReferenceException e) {
                // Ignore exceptions and keep retrying
            }
        }
        System.out.println("Element not found within timeout.");*/


    public void waitFprElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); // Replace with the element locator

    }
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//    //wait.until(ExpectedConditions.visibilityOf(element));
//    wait.until(ExpectedConditions.elementToBeClickable(element));
//}

}