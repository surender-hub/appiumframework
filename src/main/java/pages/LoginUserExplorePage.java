package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ConfigReader;
import utils.ElementUtils;

public class LoginUserExplorePage {
    public AndroidDriver driver;
    public ElementUtils elementUtils;

    public LoginUserExplorePage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Explore\"]")
    public WebElement exploreButton;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Book a flight\"]")
    public WebElement verifyBookFlight;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Book a Stay\"]")
    public WebElement verifyBookStay;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Search\"]")
    public WebElement verifySearchText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"One way\"]")
    public WebElement verifyOneWayText;


    public void loginUser() {
        LoginPage loginPage = new LoginPage(driver);
        LoginUserPage loginUserPage = new LoginUserPage(driver);
        loginPage.enterMobileNumber(ConfigReader.getProperty("loginMobileNumber"));
        loginPage.clickOnContinue();
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
        loginPage.enterPassword(ConfigReader.getProperty("loginPassword"));
        loginUserPage.loginButton();
        ThreadWaitClass.customSleep(ConstantClass.LONG_WAIT_10);
    }

    public void pressExploreButton() {
        elementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
    }
    public void verifyBookFlightText() {
        Assert.assertTrue(verifyBookFlight.isDisplayed(), "Book a Flight text is not displayed!");
    }
    public void verifyStayText() {
        Assert.assertTrue(verifyBookStay.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void pressBookStay() {
        elementUtils.waitAndClickElement(verifyBookStay, ConstantClass.LONG_WAIT_180);
        Assert.assertTrue(verifySearchText.isDisplayed(), "Search  text is not displayed!");
        elementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
    }

    public void pressBookFlight() {
        elementUtils.waitAndClickElement(verifyBookFlight, ConstantClass.LONG_WAIT_180);
        Assert.assertTrue(verifyOneWayText.isDisplayed(), "Search  text is not displayed!");
        elementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
    }
}