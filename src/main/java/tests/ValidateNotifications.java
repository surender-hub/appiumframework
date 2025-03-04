package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ValidateNotifications extends BaseTest {
    @Test
    public void openNotification() throws InterruptedException {
        driver.openNotifications();

        Thread.sleep(2000); // Wait for notifications to load

        //Capture OTP from the first notification
        List<WebElement> notifications = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"android:id/message_text\" and contains(@text, 'is your One Time Password. OTP is valid for 5 minutes. Do not share this OTP with anyone. Regards, IndiGo')]"));
        String otp = null;

        for (WebElement notification : notifications) {
            String text = notification.getText();
            if (text.contains("OTP")) {
                otp = text.replaceAll("\\D+", ""); // Extract OTP digits
                break;
            }
        }

       // System.out.println("Retrieved OTP: " + otp);
        Assert.assertEquals(true,false);

        // Enter OTP in the app's input field
        // WebElement otpField = driver.findElement("your.app.otp_field_id");
        //  otpField.sendKeys(otp);

        //driver.quit();
    }

}
