package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ConfigUatReader;
import utils.ElementUtils;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ExplorePage {
    public AndroidDriver driver;
    public ElementUtils elementUtils;
    public LoginUserPage loginUserPage;


    public ExplorePage(AndroidDriver driver) {
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
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Close Airport List\"]") //this is without login
    //android.view.ViewGroup[@content-desc="Close Airport List"]   this is after login
    public WebElement closePopUp;

    @FindBy(xpath = "//android.widget.TextView[@text=\"From\"]")
    public WebElement fromText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Where to?\"]")
    public WebElement whereText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Search by place/airport\"]")
    public WebElement searchText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Where are you going to?\"]")
    public WebElement verifyWhereAreYouText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Search by destination/property name\"]")
    public WebElement verifyDesText;

    @FindBy(xpath = "//android.widget.TextView[@text=\"One click away\"]")
    public WebElement clickAwayText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Find flights at lowest fare\"]")
    public WebElement lowestFareText;
    @FindBy(xpath = "//com.horcrux.svg.CircleView")
    public WebElement svgView;

    @FindBy(xpath = "//android.widget.TextView[@text=\"What's new?\"]")
    public WebElement whatsNewText;
    //@FindBy(xpath = "(//android.view.ViewGroup//android.widget.TextView)[3]")
    //@FindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup")
    @FindBy(xpath = "//android.widget.TextView[@text=\"View All Offer\"]")
    public WebElement viewAllOfferText;
    @FindBy(xpath = "(//android.widget.TextView[@text=\"Explore\"])[1]")
    public WebElement exploreText;
    @FindBy(xpath = "//android.widget.Button[@text=\"All Offers\"]")
    public WebElement allOfferText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Hey there, Welcome onboard let's get started with booking.\"]")
    public WebElement heyThereText;

    @FindBy(xpath = "//android.widget.TextView[@text=\"6E Guide to Get Inspired and Explore more...\"]")
    public WebElement guideText;
    @FindBy(xpath = "//android.widget.Button[@text=\"All Offers\"]")
    public WebElement allOffers;
    @FindBy(xpath = "//android.widget.TextView[@text=\"View more\"]")
    public WebElement viewMoreText;
    @FindBy(xpath = "//android.widget.Image[@text=\"Indigo Logo Image\"]")
    public WebElement verifyIndigoLogo;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Home\"]")
    public WebElement HomeText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Add more add-ons\n" + "to your journey\"]")
    public WebElement addMoreText;
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup")
    public List<WebElement> subChildElements;
    @FindBy(xpath = "//android.widget.TextView[contains(@text, 'Book flights')]")
    public WebElement bookFlightText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"View All Offer\"]")
    public WebElement allOffersT;

    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup")
    public List<WebElement> exclusiveImages;
    @FindBy(id = "(//android.view.View[@text=\"CULTURE AND HERITAGE\"])[1]")
    public WebElement cultureHeritage;
    @FindBy(id = "(//android.widget.Image[@text=\"Indigo Logo Image\"]")
    public WebElement indigoLogoImage;
    @FindBy(id = "//android.widget.Button[contains(@text, 'Get to Know Us')]")
    public WebElement getToKnowUsText;
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")
    public List<WebElement> siblingElements;
    @FindBy(id = "//android.widget.TextView[contains(@text, 'XL seat')]")
    public WebElement xlSeatText;
    public By xlSeatXpath = By.xpath("//android.widget.TextView[contains(@text, 'XL seat')]");
    public By bonusXpath = By.xpath("//android.widget.TextView[contains(@text, 'Bonus IndiGo')]");
    public By logoImageXpath = By.xpath("//android.widget.Image[@text=\"Indigo Logo Image\"]");
    public By spitiXpath = By.xpath("(//android.widget.TextView[contains(@text, 'SPITI')])[1]");

    List<String> cityCodes = List.of("SPT", "BOM", "CNN", "GOA", "HYD", "AGR", "JLR", "IXA", "DED", "DHM");
    @FindBy(id = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.HorizontalScrollView")
    public WebElement horizontalScrollView;
    public By horiScroll = By.xpath("//android.widget.FrameLayout[@resource-id=\\\"android:id/content\\\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.HorizontalScrollView");
    @FindBy(id = "(//android.widget.TextView[contains(@text, 'SPITI')])[1]")
    public WebElement citySpiti;




    public void loginUser() {
        LoginPage loginPage = new LoginPage(driver);
        loginUserPage = new LoginUserPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("loginMobileNumber"));
        loginPage.clickOnContinue();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        loginPage.enterPassword(ConfigUatReader.getProperty("loginPassword"));
        loginUserPage.loginButton();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
    }

    public void pressExploreButton() {
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(whatsNewText.isDisplayed(), "Not redirected to Explore page");
    }

    public void verifyBookFlightText() {
        ThreadWaitClass.customSleep(ConstantClass.SHORT_WAIT_2);
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(verifyBookFlight.isDisplayed(), "Whats New text is not displayed!");
    }

    public void verifyStayText() {
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(verifyBookStay.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void pressBookStay() {
        ElementUtils.waitAndClickElement(verifyBookStay, ConstantClass.LONG_WAIT_180);
        try {
            ElementUtils.waitAndClickElement(closePopUp, ConstantClass.SHORT_WAIT_2);
        } catch (Exception e) {
            System.out.println("closePopUp not found, continuing...");
        }
        Assert.assertTrue(verifySearchText.isDisplayed(), "Search  text is not displayed!");
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);


    }

    public void pressBookFlight() {
        ElementUtils.waitAndClickElement(verifyBookFlight, ConstantClass.LONG_WAIT_180);
        try {
            ElementUtils.waitAndClickElement(closePopUp, ConstantClass.SHORT_WAIT_2);
        } catch (Exception e) {
            System.out.println("closePopUp not found, continuing...");
        }
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(whereText.isDisplayed(), "From  text is not displayed!");
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
    }

    public void verifyFromT() {
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(fromText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifyWhereT() {
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(whereText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifySearchT() {
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(searchText.isDisplayed(), "Book a Stay text is not displayed!");
        //ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
    }

    public void pressWhereText() {
        ElementUtils.waitAndClickElement(whereText, ConstantClass.LONG_WAIT_10);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        Assert.assertTrue(verifyWhereAreYouText.isDisplayed(), "Search  text is not displayed!");
        try {
            ElementUtils.waitAndClickElement(closePopUp, ConstantClass.SHORT_WAIT_2);
        } catch (Exception e) {
            System.out.println("closePopUp not found, continuing...");
        }
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
    }

    public void verifyWhereTInStay() {
        Assert.assertTrue(whereText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifyDesTInStay() {
        Assert.assertTrue(verifyDesText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifyClickAway() {
        Assert.assertTrue(clickAwayText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifyLowestFare() {
        Assert.assertTrue(lowestFareText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifySvgView() {
        Assert.assertTrue(svgView.isDisplayed(), "Book a Stay text is not displayed!");
    }


    public void verifyWhatsNewText() {
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
        Assert.assertTrue(whatsNewText.isDisplayed(), "Whats New text is not displayed!");
    }

    public void verifyAllOfferText() {
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        ElementUtils.scrollToEndAndCheck("meets the sky");
        Assert.assertTrue(viewAllOfferText.isDisplayed(), "View All Offers text is not displayed!");
    }

    public void verifyExploreText() {
        //ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
        ElementUtils.scrollToEndAndCheck("meets the sky");
        Assert.assertTrue(exploreText.isDisplayed(), "View All Offers text is not displayed!");
    }

    public void pressAllOfferText() {
        // ElementUtils.scrollToElementContainingText(driver, "View");
        // ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
        //ElementUtils.scrollToElementByText("View All Offer");
        // ElementUtils.scrollToEndAndCheck("meets the sky");
        ElementUtils.waitAndClickElement(allOffersT, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(verifyIndigoLogo.isDisplayed(), "View More text is not displayed!");
        driver.navigate().back();
    }


    public void pressExploreText() {
        //ElementUtils.waitAndClickElement(exploreText, ConstantClass.LONG_WAIT_10);
        //ElementUtils.scrollToEndAndCheck("meets the sky");
        ElementUtils.waitAndClickElement(exploreText, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(guideText.isDisplayed(), "View All Offers text is not displayed!");
        driver.navigate().back();
    }

    public void verifyViewMoreText() {
        //ElementUtils.waitAndClickElement(exploreText, ConstantClass.LONG_WAIT_10);
        ElementUtils.scrollToEndAndCheck("View more");
        Assert.assertTrue(viewMoreText.isDisplayed(), "View More text is not displayed!");
    }

    public void pressViewMoreText() {
        // ElementUtils.waitAndClickElement(exploreText, ConstantClass.LONG_WAIT_10);
        ElementUtils.scrollToEnd();
        ElementUtils.waitAndClickElement(viewMoreText, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(HomeText.isDisplayed(), "Home text is not displayed!");
        driver.navigate().back();
    }

    public void verifyAddMoreText() {
        //ElementUtils.waitAndClickElement(exploreText, ConstantClass.LONG_WAIT_10);
        //ElementUtils.scrollToElementByText("View more");
        Assert.assertTrue(addMoreText.isDisplayed(), "Add More text is not displayed!");
    }

    public void whatsNewImageLoading() {
        //ElementUtils.waitAndClickElement(exploreText, ConstantClass.LONG_WAIT_10);
        ElementUtils.scrollToElementByText("Find exclusive offers and the best deals available for you.");
        for (WebElement subChild : subChildElements) {
            try {
                // Find the image element within each subchild
                WebElement imageElement = subChild.findElement(By.className("android.widget.ImageView"));

                int imageWidth = imageElement.getSize().getWidth();
                int imageHeight = imageElement.getSize().getHeight();

                // Validate the image dimensions
                Assert.assertTrue(imageWidth > 0 && imageHeight > 0,
                        "Image in sub child is not loaded correctly. Width: " + imageWidth + ", Height: " + imageHeight);

                System.out.println("Image loaded correctly with Width: " + imageWidth + ", Height: " + imageHeight);

            } catch (NoSuchElementException e) {
                Assert.fail("No image element found in subchild: " + subChild.toString());
            }
        }
    }

    // Method to click on a specific index and assert condition
    public void clickOnIndex(int index) {
        System.out.println("🔍 Clicking element at index: " + index);
        System.out.println("Total elements found: " + subChildElements.size());
        subChildElements.get(index).click();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        WebElement logoImageText = elementUtils.waitForElementVisibility(logoImageXpath, ConstantClass.SHORT_WAIT_2_SEC);
        Assert.assertTrue(logoImageText.isDisplayed(), "Indigo Logo is not displayed!");
        driver.navigate().back();
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.view.View[@text=\"CULTURE AND HERITAGE\"])[1]")));
        Assert.assertTrue(element.isDisplayed(), "Culture and Heritage  text is not displayed!");
        driver.navigate().back();*/
    }

    public void clickOnIndexOne(int index) {
        System.out.println("🔍 Clicking element at index: " + index);
        subChildElements.get(index).click();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        WebElement logoImageText = elementUtils.waitForElementVisibility(logoImageXpath, ConstantClass.SHORT_WAIT_2_SEC);
        Assert.assertTrue(logoImageText.isDisplayed(), "Indigo Logo is not displayed!");
        driver.navigate().back();
    }

    public void clickOnIndexTwo(int index) {
        System.out.println("🔍 Clicking element at index: " + index);
        subChildElements.get(index).click();
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        WebElement logoImageText = elementUtils.waitForElementVisibility(logoImageXpath, ConstantClass.SHORT_WAIT_2_SEC);
        Assert.assertTrue(logoImageText.isDisplayed(), "Indigo Logo is not displayed!");
        driver.navigate().back();
    }

    public void checkXlSeatText() {
        WebElement xlSeatText = elementUtils.waitForElementVisibility(xlSeatXpath, ConstantClass.SHORT_WAIT_2_SEC);
        Assert.assertTrue(xlSeatText.isDisplayed(), "XL Seat text is not displayed!");

      /*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement xlSeatText = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//android.widget.TextView[contains(@text, 'XL seat')]")));
        Assert.assertTrue(xlSeatText.isDisplayed(), "XL Seat text is not displayed!");*/

    }

    public void checkBonusText() {
        WebElement bonusText = elementUtils.waitForElementVisibility(bonusXpath, ConstantClass.SHORT_WAIT_2_SEC);
        Assert.assertTrue(bonusText.isDisplayed(), "Bonus text is not displayed!");
    }

    public void checkXlSeatTextClickable() {
        WebElement xlSeatText = elementUtils.waitForElementVisibility(xlSeatXpath, ConstantClass.SHORT_WAIT_2_SEC);
        ElementUtils.waitAndClickElement(xlSeatText,ConstantClass.LONG_WAIT_10);
        WebElement logoImageText = elementUtils.waitForElementVisibility(logoImageXpath, ConstantClass.SHORT_WAIT_2_SEC);
        Assert.assertTrue(logoImageText.isDisplayed(), "Indigo Logo is not displayed!");
        driver.navigate().back();
    }
    public void checkBonusIndigoTextClickable() {
        WebElement bonusText = elementUtils.waitForElementVisibility(bonusXpath, ConstantClass.SHORT_WAIT_2_SEC);
        ElementUtils.waitAndClickElement(bonusText,ConstantClass.LONG_WAIT_10);
        WebElement logoImageText = elementUtils.waitForElementVisibility(logoImageXpath, ConstantClass.SHORT_WAIT_2_SEC);
        Assert.assertTrue(logoImageText.isDisplayed(), "Indigo Logo is not displayed!");
        driver.navigate().back();
    }

    public void checkSpitiText() {
        String firstCity = cityCodes.get(0);  // Get the first element "SPT"
        By firstCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        WebElement spitiText = elementUtils.waitForElementVisibility(firstCityXpath, ConstantClass.SHORT_WAIT_4_SEC);
        Assert.assertTrue(spitiText.isDisplayed(), "City Spiti is not displayed!");
        System.out.println("Displayed : " + firstCity);
    }
    public void checkBomText() {
        String firstCity = cityCodes.get(1);  // Get the first element "SPT"
        By secondCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        WebElement bomText = elementUtils.waitForElementVisibility(secondCityXpath, ConstantClass.SHORT_WAIT_4_SEC);
        Assert.assertTrue(bomText.isDisplayed(), "City BOM is not displayed!");
        System.out.println("Displayed : " + firstCity);
    }
    public void checkCnnText() {
        String firstCity = cityCodes.get(2);  // Get the first element "SPT"
        By secondCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        WebElement bomText = elementUtils.waitForElementVisibility(secondCityXpath, ConstantClass.SHORT_WAIT_4_SEC);
        Assert.assertTrue(bomText.isDisplayed(), "City CNN is not displayed!");
        System.out.println("Displayed : " + firstCity);
    }
    public void checkGoaText() {
        String firstCity = cityCodes.get(3);  // Get the first element "SPT"
        By secondCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        WebElement bomText = elementUtils.waitForElementVisibility(secondCityXpath, ConstantClass.SHORT_WAIT_4_SEC);
        Assert.assertTrue(bomText.isDisplayed(), "City GOA is not displayed!");
        System.out.println("Displayed : " + firstCity);
    }
    public void checkHydText() {
        String firstCity = cityCodes.get(4);  // Get the first element "SPT"
        By secondCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        WebElement bomText = elementUtils.waitForElementVisibility(secondCityXpath, ConstantClass.SHORT_WAIT_4_SEC);
        Assert.assertTrue(bomText.isDisplayed(), "City HYD is not displayed!");
        System.out.println("Displayed : " + firstCity);
    }
    public void checkAgrText() {
        String firstCity = cityCodes.get(5);  // Get "AGR"
        By agrCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");

        int maxScrolls = 5; // Maximum number of scrolls to avoid infinite loop
        int currentScroll = 0;
        boolean isDisplayed = false;

        while (currentScroll < maxScrolls) {
            try {
                // Wait for element visibility
                WebElement agrText = elementUtils.waitForElementVisibility(agrCityXpath, 4);
                Assert.assertTrue(agrText.isDisplayed(), "City AGR is not displayed!");
                System.out.println("Displayed: " + firstCity);
                isDisplayed = true;
                break;
            } catch (Exception e) {
                // Scroll horizontally if not found
                System.out.println("AGR not visible, scrolling right... Attempt: " + (currentScroll + 1));
                horizontalScrollRight();
                currentScroll++;
            }
        }

        if (!isDisplayed) {
            Assert.fail("City AGR is not displayed after scrolling!");
        }
    }

    // Method to perform horizontal scroll to the right
    private void horizontalScrollRight() {
        // Find the scrollable view (Replace with your actual scroll view ID)
        WebElement scrollView = driver.findElement(By.id("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.HorizontalScrollView"));

        int startX = (int) (scrollView.getSize().width * 0.8);  // Start from 80% of the width
        int endX = (int) (scrollView.getSize().width * 0.2);    // End at 20% of the width
        int startY = scrollView.getLocation().y + (scrollView.getSize().height / 2); // Mid Y

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction
                .press(PointOption.point(startX, startY)) // Press at start point
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // Wait
                .moveTo(PointOption.point(endX, startY)) // Move to end point
                .release() // Release the touch
                .perform();
    }
       /* By secondCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        WebElement bomText = elementUtils.waitForElementVisibility(secondCityXpath, ConstantClass.SHORT_WAIT_4_SEC);
        Assert.assertTrue(bomText.isDisplayed(), "City AGR is not displayed!");
        System.out.println("Displayed : " + firstCity);
    }
*/

    public void clickSpitiClickable() {
        String firstCity = cityCodes.get(0);  // Get the first element "SPT"
        By firstCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        driver.findElement(firstCityXpath).click();
        System.out.println("Clicked on: " + firstCity);
        WebElement spitiText = elementUtils.waitForElementVisibility(spitiXpath, ConstantClass.SHORT_WAIT_4_SEC);
        Assert.assertTrue(spitiText.isDisplayed(), "City Spiti is not displayed!");
        driver.navigate().back();
    }









    // Method to perform horizontal swipe
    private void horizontalSwipe(WebElement scrollView) {
        int startX = (int) (scrollView.getSize().width * 0.8);  // Start from 80% of the width
        int endX = (int) (scrollView.getSize().width * 0.2);    // End at 20% of the width
        int startY = scrollView.getLocation().y + (scrollView.getSize().height / 2); // Mid Y

        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction
                .press(PointOption.point(startX, startY))  // Press at start point
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))) // Wait
                .moveTo(PointOption.point(endX, startY))  // Move to end point
                .release()  // Release the touch
                .perform();
    }
    public void scrollAndClickByIndexAgr() {
        String firstCity = cityCodes.get(5);  // Get the first element "SPT"
        By firstCityXpath = By.xpath("//android.widget.TextView[contains(@text, '" + firstCity + "')]");
        driver.findElement(firstCityXpath).click();
        System.out.println("Clicked on: " + firstCity);

    }

}