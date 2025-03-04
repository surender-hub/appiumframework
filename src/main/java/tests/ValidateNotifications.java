package tests;

import base.BaseTestLoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ValidateNotifications extends BaseTestLoginUser {
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

        String first = otp.substring(0, 1);
        String Secound = otp.substring(1, 2);
        String third = otp.substring(2, 3);
        String four = otp.substring(3, 4);
        String five = otp.substring(4, 5);
        String six = otp.substring(5, 6);


       List<WebElement>  otpFounds = driver.findElements(By.xpath("//android.view.View[@resource-id='otpField']//android.widget.EditText"));

       for(WebElement otpField2:otpFounds)
       {
           otpField2.sendKeys(first);
           otpField2.sendKeys(Secound);
           otpField2.sendKeys(third);
           otpField2.sendKeys(four);
           otpField2.sendKeys(five);
           otpField2.sendKeys(six);

       }


        // Enter OTP in the app's input field
        // WebElement otpField = driver.findElement("your.app.otp_field_id");
        //  otpField.sendKeys(otp);

        //driver.quit();
    }

}
