package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ConfigReader;
import utils.ElementUtils;

import java.util.List;
import java.util.NoSuchElementException;

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
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Close Location List\"]")
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
    @FindBy(xpath = "//android.widget.TextView[@text=\"View All Offer\"]")
    public WebElement viewAllOfferText;
    @FindBy(xpath = "(//android.widget.TextView[@text=\"Explore\"])[1]")
    public WebElement exploreText;
    @FindBy(xpath = "//android.widget.Button[@text=\"All Offers\"]")
    public WebElement allOfferText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"6E Guide to Get Inspired and Explore more...\"]")
    public WebElement guideText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"View more\"]")
    public WebElement viewMoreText;
    @FindBy(xpath = "(//android.widget.TextView[contains(@text, 'IndiGo Bolsters')])[2]")
    public WebElement verifyIndigoText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"Add more add-ons\n" + "to your journey\"]")
    public WebElement addMoreText;
    @FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup")
    public List<WebElement> subChildElements;


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
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
    }

    public void verifyBookFlightText() {
        ThreadWaitClass.customSleep(ConstantClass.SHORT_WAIT_2);
        Assert.assertTrue(verifyBookFlight.isDisplayed(), "Book a Flight text is not displayed!");
    }

    public void verifyStayText() {
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
        ElementUtils.waitAndClickElement(verifyBookFlight, ConstantClass.LONG_WAIT_180);
        Assert.assertTrue(fromText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifyWhereT() {
        Assert.assertTrue(whereText.isDisplayed(), "Book a Stay text is not displayed!");
    }

    public void verifySearchT() {
        Assert.assertTrue(searchText.isDisplayed(), "Book a Stay text is not displayed!");
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
    }

    public void pressWhereText() {
        ElementUtils.waitAndClickElement(whereText, ConstantClass.LONG_WAIT_180);
        Assert.assertTrue(verifyWhereAreYouText.isDisplayed(), "Search  text is not displayed!");
        try {
            ElementUtils.waitAndClickElement(closePopUp, ConstantClass.SHORT_WAIT_2);
        } catch (Exception e) {
            System.out.println("closePopUp not found, continuing...");
        }
        ElementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_180);
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
        Assert.assertTrue(whatsNewText.isDisplayed(), "Whats New text is not displayed!");
    }

    public void verifyAllOfferText() {
        ElementUtils.scrollToElementByText("View All Offer");
        Assert.assertTrue(viewAllOfferText.isDisplayed(), "View All Offers text is not displayed!");
    }

    public void verifyExploreText() {
        ElementUtils.scrollToElementByText("Embark on a journey of inspiration with IndiGo, where discovery meets the sky");
        Assert.assertTrue(exploreText.isDisplayed(), "View All Offers text is not displayed!");
    }

    public void pressAllOfferText() {
        ElementUtils.scrollToElementByText("View All Offer");
        ElementUtils.waitAndClickElement(viewAllOfferText, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(allOfferText.isDisplayed(), "View All Offers text is not displayed!");
        //elementUtils.waitAndClickElement(exploreButton, ConstantClass.LONG_WAIT_10);
        driver.navigate().back();
    }

    public void pressExploreText() {
        ElementUtils.scrollToElementByText("Embark on a journey of inspiration with IndiGo, where discovery meets the sky");
        ElementUtils.waitAndClickElement(exploreText, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(guideText.isDisplayed(), "View All Offers text is not displayed!");
        driver.navigate().back();
    }

    public void verifyViewMoreText() {
        ElementUtils.scrollToElementByText("View more");
        Assert.assertTrue(viewMoreText.isDisplayed(), "View More text is not displayed!");
    }

    public void pressViewMoreText() {
        ElementUtils.scrollToElementByText("View more");
        ElementUtils.waitAndClickElement(viewMoreText, ConstantClass.LONG_WAIT_10);
        Assert.assertTrue(verifyIndigoText.isDisplayed(), "View More text is not displayed!");
        driver.navigate().back();
    }

    public void verifyAddMoreText() {
        ElementUtils.scrollToElementByText("View more");
        Assert.assertTrue(addMoreText.isDisplayed(), "Add More text is not displayed!");
    }

    public void whatsNewImageLoading() {
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

}