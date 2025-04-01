package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ConfigIndigoReader;
import utils.ElementUtils;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckinPage {

    public AndroidDriver driver;
    private ElementUtils elementUtils;

    @FindBy(xpath = "//android.widget.TextView[@text=\"CheckIn\"]")
    private WebElement checkinMenuBtn;

    @FindBy(xpath = "//android.widget.TextView[@text='Email us']/ancestor::*[position()=2]")
    private WebElement elementToSearch;

    @FindBy(xpath = "//android.view.View[@text='Click here to start']")
    private WebElement chat_link;

    @FindBy(xpath = "//android.widget.TextView[@text=\"I'm 6Eskai, your Smart Assistant!\"]")
    private WebElement skai_Assistant;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Check-in\"]")
    private WebElement page_title;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Go Back\"]")
    private WebElement back_arrow;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'keep booking on goIndiGo.in')]")
    private WebElement explore_page;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Chatbot\"]")
    private WebElement chatBot_logo;

    @FindBy(xpath = "//android.widget.TextView[@text=\"I'm 6Eskai, your Smart Assistant!\"]")
    private WebElement smart_assistant;

    @FindBy(xpath = "//com.horcrux.svg.SvgView")
    private WebElement chatBotBackArrow;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Go Back\"]/com.horcrux.svg.SvgView")
    private WebElement checkinBackArrow;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Important Information\"]/ancestor::*[position()=3]/following-sibling::android.view.ViewGroup")
    private WebElement msg;

    @FindBy(xpath = "//android.view.View[@content-desc=\"\uE934\"]")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Check what's mandatory and know our safety measures.Click here\"]")
    private WebElement bannerMsg;

    @FindBy(xpath = "//android.widget.Button[@text=\"\uE911\"]")
    private WebElement bannerMsgCrossIcon;

    public CheckinPage(AndroidDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }


    public void clickOnCheckinMenu() {
        ElementUtils.waitAndClickElement(checkinMenuBtn, ConstantClass.MEDIUM_WAIT_5);
    }

    public void moveToText(String text) {
        ElementUtils.scrollToEndAndCheck(text);
    }



    public void verifyAllFAQ() throws InterruptedException {

        String faqStr = ConfigIndigoReader.getProperty("FAQ");
        String[] faqArray = faqStr.split(";");

        String[][] faqData = {
                {"What is smart check-in for IndiGo flights?", "Smart check-in"},
                {"How can I change my booking?", "Manage Booking"},
                {"Where can I access the option to change flights?", "Change Flight"},
                {"Can I change my origin and destination if I opt to change flight?","change your origin"},
                {"Can I alter my name in case I am not able and transfer my flight to another person?","No, altering the name"},
                {"What options do I have to manage my booking?","manage your IndiGo flight booking"},
                {"What can I do if IndiGo cancels or changes my booking?","flight is cancelled"},
                {"What is Schedule Web Check-in?","check-in process"} };

        ElementUtils.slightScrollUntilElementFound(elementToSearch, faqData);
    }


    public void verifyChatLink() {
        Assert.assertTrue(chat_link.isDisplayed());
    }

    public void clickVerifyLink() throws Exception{
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        chat_link.click();
        ElementUtils.waitForWebElementVisible(skai_Assistant,ConstantClass.MEDIUM_WAIT_5);
        Assert.assertTrue(skai_Assistant.isDisplayed());
    }

    public void verifypageTitle() {
        Assert.assertTrue(page_title.isDisplayed());
    }

    public void verifyBackArrowClickable() throws Exception{
        back_arrow.click();
        Thread.sleep(3000);
        Assert.assertTrue(explore_page.isDisplayed());
    }

    public void verifyBackArrowVisible() {
        Assert.assertTrue(checkinBackArrow.isDisplayed());
    }

    public void verifyChatBot() {
        //chatBot_logo.click();
        ElementUtils.waitAndClickElement(chatBot_logo,ConstantClass.MEDIUM_WAIT_5);
        Assert.assertTrue(smart_assistant.isDisplayed());
    }

    public void verifyReturn() throws Exception{
        chatBot_logo.click();
        Thread.sleep(3000);
        chatBotBackArrow.click();
        Thread.sleep(3000);
        Assert.assertTrue(page_title.isDisplayed());
    }

    public void verifyCheckinMenuSelected() throws Exception{
        chatBot_logo.click();
        Thread.sleep(3000);
        chatBotBackArrow.click();
        Thread.sleep(3000);
        String isSelected = checkinMenuBtn.getAttribute("selected");
        Assert.assertEquals(isSelected, "true", "Check-in menu is NOT selected!");
    }

    public void clickImportantInformationMsg() {
        msg.click();
        Assert.assertTrue(hamburgerMenu.isDisplayed());
    }

    public void checkBannerMessage() {
        msg.click();
        Assert.assertTrue(bannerMsg.isDisplayed());
    }

    public boolean clickCrossIcon() throws Exception {
        msg.click();
        Thread.sleep(3000);
        bannerMsgCrossIcon.click();
        Thread.sleep(5000);

        try {
            return bannerMsg.isDisplayed();
        } catch (Exception e) {
            return false;
        }

    }


}
