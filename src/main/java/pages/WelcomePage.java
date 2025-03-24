package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class WelcomePage {
    public AndroidDriver driver;


    public WelcomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFutureDate() throws InterruptedException {
        ElementUtils el = new ElementUtils(driver);
        String fututreDate = el.clickDate();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']")).click();
    }

    public String printFutureDate() throws InterruptedException {
        ElementUtils el = new ElementUtils(driver);
        String fututreDate = el.clickDate();
        Thread.sleep(2000);
        String fututreDate1 = driver.findElement(By.xpath("//android.widget.TextView[@text='" + fututreDate + "']")).getText();
        System.out.println(fututreDate1);
        return fututreDate1;

    }

    @FindBy(xpath = "//android.view.View[@resource-id=\"a\"]")
    public WebElement guestUser;


    public void clickLoginAsQuest() {
        System.out.println("Login page");
        ElementUtils.waitAndClickElement(guestUser, ConstantClass.LONG_WAIT_180);
        /*//ElementUtils utils = new ElementUtils(driver);
        LoginPage loginPage = new LoginPage(driver);
        LoginUserPage loginUserPage = new LoginUserPage(driver);
        loginPage.enterMobileNumber("8265858568");
        loginPage.clickOnContinue();
        Thread.sleep(2000);
        loginPage.enterPassword("Bhagatsingh@1");
        loginUserPage.loginButton();
        Thread.sleep(10000);*/
    }

    public void loginByOtp() throws InterruptedException {
        System.out.println("Login page");
        ElementUtils utils = new ElementUtils(driver);
        LoginPage loginPage = new LoginPage(driver);
        LoginUserPage loginUserPage = new LoginUserPage(driver);
        loginPage.enterMobileNumber("8265858568");
        loginPage.clickOnContinue();
        Thread.sleep(2000);
        loginPage.enterPassword("Bhagatsingh@1");
        loginUserPage.loginButton();
        Thread.sleep(20000);

//        String currentPackage = driver.getCurrentPackage();
//        boolean ele = driver.activateApp(currentPackage);
//        if(ele == true)
//        {
//            driver.activateApp(currentPackage);
//            loginPage.enterMobileNumber("9977141550");
//            loginPage.clickOnContinue();
//            Thread.sleep(2000);
//            loginPage.enterPassword("Sanu180295@");
//            loginUserPage.loginButton();
//            Thread.sleep(20000);
//        }
    }


    }

