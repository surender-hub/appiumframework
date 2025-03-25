package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ConfigUatReader;
import utils.ElementUtils;

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
            subChildElements.get(index).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Assertion logic based on index
            if (index == 0) {
                // Check for cultureHeritage element
                wait.until(ExpectedConditions.visibilityOf(cultureHeritage));
                if (cultureHeritage.isDisplayed()) {
                    System.out.println("✅ Assertion Passed: CULTURE AND HERITAGE is visible at index " + index);
                } else {
                    System.out.println("❌ Assertion Failed: CULTURE AND HERITAGE is NOT visible at index " + index);
                }
                driver.navigate().back();
            } /*else if (index == 1) {
                // Check for indigoLogoImage element
                wait.until(ExpectedConditions.visibilityOf(indigoLogoImage));
                if (indigoLogoImage.isDisplayed()) {
                    System.out.println("✅ Assertion Passed: INDIGO LOGO is visible at index " + index);
                } else {
                    System.out.println("❌ Assertion Failed: INDIGO LOGO is NOT visible at index " + index);
                }
            } else if (index == 2) {
                // Check for indigoLogoImage element
                wait.until(ExpectedConditions.visibilityOf(indigoLogoImage));
                if (indigoLogoImage.isDisplayed()) {
                    System.out.println("✅ Assertion Passed: INDIGO LOGO is visible at index " + index);
                } else {
                    System.out.println("❌ Assertion Failed: INDIGO LOGO is NOT visible at index " + index);
                }
            } *//* else if (index >= 2 && index <= 4) {
                // For indexes 2, 3, and 4 you can add custom assertions if needed.
                // Here we just print a message.
                System.out.println("ℹ️ No specific assertion defined for index " + index + ". Proceeding without assertion.");
            }*//*
            // Navigate back after assertion
            driver.navigate().back();
            ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);

        } catch (Exception e) {
            System.out.println("⚠️ Error on element at index " + index + ": " + e.getMessage());
        }*/

    }
}