package utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ElementUtils {
    public  static AndroidDriver driver;
    private static WebElement element;
    private static int timeout;
    //public static int dat;

    public ElementUtils(AndroidDriver driver) {
        ElementUtils.driver = driver;
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

public static String  getText(WebElement element)
  {
    return element.getText();
    }

    //Using resource ID
    public static void scrollToElementByResourceId(String resourceId) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().resourceId(\"" + resourceId + "\"))"));
    }

    // By using text
    public  static WebElement scrollToElementByText(String text) {
        return driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
    }

    public static void scrollToElementAndClickByText(String text) {
        try {
            // Scroll to the element by text
            WebElement element = driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                            ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));

            // Wait until the element is clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));

            // Click the element
            //element.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element with text \"" + text + "\" not found.");
        } catch (TimeoutException e) {
            System.out.println("Element with text \"" + text + "\" is not clickable.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

   /* public  static void waitAndClickElement(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(timeout));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        // System.out.println("Element clicked successfully!");
    }
*/

    public static void waitAndClickElement(WebElement element, int timeout) {
        try {
            // Check if the element is present in the DOM
            if (element == null || !element.isDisplayed()) {
                throw new NoSuchElementException("Element is not present in the DOM.");
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();

        } catch (NoSuchElementException | TimeoutException e) {
            throw new NoSuchElementException("Element not found or not clickable within timeout.");
        }
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


    public static void waitForElementVisible(By locator,int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(timeOut));
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)); // Replace with the element locator
    }

    public static void scrollToEnd()
    {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
    }


    public static void scrollToText( String text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text('"+text+"'))"));
    }

    public void attachTextToAllureReport(String name, String content) {
        Allure.addAttachment(name, new ByteArrayInputStream(content.getBytes()));
    }


    public static void scrollAndClickByText(String text) {
        try {
            // Scroll until the element with the given text is visible
            WebElement element = driver.findElement(
                    AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                            ".scrollIntoView(new UiSelector().textContains(\"" + text + "\"))"));
            // Click the element once it is visible
            element.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element with text \"" + text + "\" not found.");
        }
    }
}