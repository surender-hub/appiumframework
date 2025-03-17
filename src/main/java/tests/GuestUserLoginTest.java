package tests;

import base.BaseTest;
import io.qameta.allure.*;
import listener.RetryAnalyzer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ConfigUatReader;
import utils.ElementUtils;

public class GuestUserLoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(GuestUserLoginTest.class);
    LoginPage loginPage;
    private ElementUtils elementUtils;
    String expectedText = "INDIGO BLUCHIP";


    @Test(priority = 1, description = "TC_001 - Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Enter Valid Mobile Number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid Mobile Number feature")
    @Story("Enter valid mobile number and click on Continue button")
    public void testEnterValidMobileNumberAndContinue() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("mobileNumber"));
        // loginPage.enterPassword("Bhagatsingh@1");
        loginPage.clickOnContinue();
        loginPage.verifyElementTextVisibility();
    }

 /*   @Test(priority = 2, description = "TC_002 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Enter Valid Email address")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Valid email feature")
    @Story("Enter valid email  and click on Continue button")
    public void testEnterValidEmailAndContinue() {
        loginPage = new LoginPage(driver);
        loginPage.enterValidEmailAddress(ConfigUatReader.getProperty("username"));
        loginPage.clickOnContinue();
        loginPage.verifyElementTextVisibility();
    }*/

    @Test(priority = 3, description = "TC_003 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Enter Invalid Mobile number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check invalid mobile number")
    @Story("Enter Invalid mobile number  and check error message is displayed")
    public void testInvalidMobileNumber() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("wrongMobileNumber"));
        loginPage.verifyInvalidNumberMessage();
    }

    @Test(priority = 4, description = "TC_004 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Enter Invalid email address")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check invalid email address")
    @Story("Enter Invalid email address   and check error message is displayed")
    public void testInvalidEmailFormat() {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("invalidUsername"));
        loginPage.verifyInvalidEmailMessage();
    }

    @Test(priority = 5, description = "TC_005 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Click on continue as a guest button")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check button clicking")
    @Story("Verify continue as a guest button clicked and redirected to Next screen")
    public void testContinueAsGuest() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnContinueAsGuestButton();
        loginPage.verifyContinueButtonClicking();
    }

    @Test(priority = 6, description = "TC_006 -Login page", groups = {"smoke"}, retryAnalyzer = RetryAnalyzer.class)
    @Description("Click Terms and Condition link text")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check button clicking")
    @Story("Verify terms and condition link text clicked and redirected to Next screen")
    public void testTermsAndConditionsLink() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnTermsAndConditionButton();
        loginPage.verifyTextInWebView();
    }

/*    @Test(priority = 7, description = "TC_007 - Login page")
    @Description("Enter Valid Mobile Number")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Check Otp after entering Mobile Number")
    @Story("Enter mobile number and click on Continue button")
    public void loginWithMobileNumber() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.enterMobileNumber("8265858568");
        loginPage.clickOnContinue();
        loginPage.enterPassword("Bhagatsingh@1");
        loginPage.clickOnLoginButton();
        //loginPage.enterOtpNumber("123456");
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        Thread.sleep(2000);
        driver.openNotifications();

        // Wait for notifications to load

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

        System.out.println("Retrieved OTP: " + otp);


        String first = otp.substring(0, 1);
        String Secound = otp.substring(1, 2);
        String third = otp.substring(2, 3);
        String four = otp.substring(3, 4);
        String five = otp.substring(4, 5);
        String six = otp.substring(5, 6);


        //  List<WebElement>  otpFounds = driver.findElements(By.xpath("//android.view.View[@resource-id='otpField']//android.widget.EditText"));


        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"first\"]")).sendKeys(first);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"second\"]")).sendKeys(Secound);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"third\"]")).sendKeys(third);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"fourth\"]")).sendKeys(four);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"fifth\"]")).sendKeys(five);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"sixth\"]")).sendKeys(six);


    }*/
    //loginPage.enterOTP(driver, "123456");
    // driver.findElement(By.xpath("//android.view.View[@resource-id='otpField']//android.widget.EditText[1]")).sendKeys("1");
    //loginPage.verifyElementTextVisibility();
}
//8130614096
//Curran@12345

