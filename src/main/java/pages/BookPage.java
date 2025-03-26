package pages;

import constant.ConstantClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ConfigReader;
import utils.ElementUtils;
import utils.LogUtils;


public class BookPage {

    public AndroidDriver driver;

    public BookPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.view.View[@resource-id=\"a\"]")
    public WebElement guestUser;

    @FindBy(xpath = "//android.widget.TextView[@text=\"My Trips\"]")
    public WebElement myTripsButton;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"My Trips\"])[1]")
    public WebElement validateMyTripsButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Book\"]")
    public WebElement bookButton;

    @FindBy(xpath = "(//android.widget.TextView[@text=\"Book\"])[1]")
    public WebElement validatebookButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Profile\"]")
    public WebElement profileButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Hello there\"]")
    public WebElement validateProfileText;
    @FindBy(xpath = "//android.widget.TextView[@text=\"CheckIn\"]")
    public WebElement checkInButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Explore\"]")
    public WebElement exploreButton;

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"Leisure unselected\"]/android.view.ViewGroup")
    public WebElement LeisureRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"Work unselected\"]/android.view.ViewGroup")
    public WebElement workRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"Medical unselected\"]/android.view.ViewGroup")
    public WebElement medicalRadioButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Round trip\"]/preceding-sibling::android.view.ViewGroup")
    public WebElement roundRadioButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Round trip\"]/preceding-sibling::android.view.ViewGroup")
    public WebElement returnButton;

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"Multi city unselected\"]/android.view.ViewGroup")
    public WebElement multiCityRadioButton;
    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"One way unselected\"]/android.view.ViewGroup")
    public WebElement oneWay;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Book a Stay\"]")
    public WebElement bookastaybutton;

    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Who you are travelling with?\"]/com.horcrux.svg.SvgView"))
    public WebElement passengerSelectionButton;

    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Choose your Currency\"]/com.horcrux.svg.SvgView"))
    public WebElement chooseCurrencyButton;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Who are you travelling with?\"]"))
    public WebElement verifyPassengerSelectionButton;

    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Close Add Passenger Bottom Sheet\"]/com.horcrux.svg.SvgView"))
    public WebElement closeSelectionButton;

    @FindBy(xpath = ("//android.widget.EditText[@text=\"Search\"]"))
    public WebElement verifyCurrencyButton;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Discover and book a perfect stay from over 7 lakh hotels worldwide!\"]"))
    public WebElement verifyBookStay;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Search\"]"))
    public WebElement searchButton;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Flying from?\"]/following-sibling::android.widget.TextView[1]"))
    public WebElement flyingFrom;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Where are you flying from?\"]"))
    public WebElement validateFlyingFrom;

    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Close Airport List\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[2]"))
    public WebElement closeButtonFlyingFrom;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Going to?\"]/following-sibling::android.widget.TextView[1]"))
    public WebElement goingTo;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Where are you going to?\"]"))
    public WebElement validateGoingTo;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Departure\"]/following-sibling::android.widget.TextView[1]"))
    public WebElement selectDepartureDateLink;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Select Departure Date\"]"))
    public WebElement validateDepartureDateLink;

    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Close Calender\"]/com.horcrux.svg.SvgView"))
    public WebElement closeDateLink;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Travellers + Special Fares\"]/following-sibling::android.widget.TextView[1]"))
    public WebElement selectPassengerLink;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"ADD PROMO CODE \"]"))
    public WebElement addPromoCode;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Apply\"]"))
    public WebElement validatePromoCodeLink;

    @FindBy(xpath = ("//android.widget.TextView[contains(@text,\"Choose your preferred flight from \")]"))
    public WebElement validateSearchButton;
    ;
    @FindBy(xpath = ("//android.widget.TextView[@text=\"Recent Searches\"]"))
    public WebElement recentSearchButton;

    @FindBy(xpath = ("//android.widget.RadioButton[@content-desc=\"IndiGo BluChips unselected\"]/android.view.ViewGroup"))
    public WebElement indigoBlueChipsRadioButton;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"ADD NOMINEE\"]"))
    public WebElement addNominee;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Add upto 5 Nominees\"]"))
    public WebElement validateAddNominee;


    public void clickOnBookStayButton() {
        bookastaybutton.click();
    }


    public void clickOnBookPage() {
        bookButton.click();
    }

    public void displayMyTripButton() {
        if (myTripsButton.isDisplayed()) {
            System.out.println("My Trips Button is Displayed ");
        } else {
            System.out.println("My Trips Button is not Displayed ");
            Assert.fail();
        }
    }

    public void displayMultiCityRadioButton() {
        if (multiCityRadioButton.isDisplayed()) {
            System.out.println("MultiCity Button is Displayed ");
        } else {
            System.out.println("MultiCity  Button is not Displayed ");
            //Assert.fail();
        }
    }

    public void enabledMyTripButton() {
        if (myTripsButton.isEnabled()) {
            System.out.println("My Trips Button is Enabled ");
        } else {

            System.out.println("My Trips Button is not Enabled ");
            Assert.fail();
        }
    }

    public void clickMyTripButton() {
        if (myTripsButton.isDisplayed()) {
            ElementUtils.waitAndClickElement(myTripsButton, ConstantClass.MEDIUM_WAIT_5);
            Assert.assertEquals(validateMyTripsButton.isDisplayed(), true);
            System.out.println("My Trips Button is working ");

        } else {

            System.out.println("My Trips Button is not working ");
            Assert.fail();
        }
    }


    public void displayBookButton() {
//        ElementUtils.waitAndClickElement(bookButton,ConstantClass.MEDIUM_WAIT_5);
        if (bookButton.isDisplayed()) {
            System.out.println("Book Button is Displayed ");
        } else {
            System.out.println("Book Button is not Displayed ");
            Assert.fail();
        }
    }

    public void enabledBookButton() {
        if (bookButton.isEnabled()) {
            System.out.println("Book Button is Enabled ");
        } else {

            System.out.println("Book  Button is not Enabled ");
            Assert.fail();
        }
    }

    public void clickBookButton() {

        try {
            if (bookButton.isDisplayed()) {
                ElementUtils.waitAndClickElement(bookButton, ConstantClass.MEDIUM_WAIT_5);
                boolean button = validatebookButton.isDisplayed();
                Assert.assertEquals(button, true);
                System.out.println("Book Button is working ");
            } else {
                System.out.println("Book Button is not working ");
                Assert.fail();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void displayCheckInButton() {
        if (checkInButton.isDisplayed()) {
            System.out.println("CheckIn Button is Displayed ");
        } else {
            System.out.println("CheckIn Button is not Displayed ");
            Assert.fail();
        }
    }

    public void enabledCheckInButton() {
        if (checkInButton.isEnabled()) {
            System.out.println("CheckIn Button is Enabled ");
        } else {

            System.out.println("CheckIn  Button is not Enabled ");
            Assert.fail();
        }
    }

    public void clickCheckInButton() {
        if (checkInButton.isEnabled()) {
            ElementUtils.waitAndClickElement(checkInButton, ConstantClass.MEDIUM_WAIT_5);
            System.out.println("CheckIn Button is working ");
            Assert.assertEquals(checkInButton.isDisplayed(), true);

        } else {

            System.out.println("CheckIn Button is not working ");
            Assert.fail();
        }
    }





    public void displayExploreButton() {
        if (exploreButton.isDisplayed()) {
            System.out.println("explore Button is Displayed ");
        } else {
            System.out.println("explore Button is not Displayed ");
            Assert.fail();
        }
    }


    public void enabledExploreButton() {
        if (exploreButton.isEnabled()) {
            System.out.println("Explore Button is Enabled ");
        } else {

            System.out.println("Explore  Button is not Enabled ");
            Assert.fail();
        }
    }

    public void clickExploreButton() {
        if (exploreButton.isEnabled()) {
            ElementUtils.waitAndClickElement(exploreButton, ConstantClass.MEDIUM_WAIT_5);
            System.out.println("Explore Button is working ");
        } else {

            System.out.println("Explore Button is not working ");
            Assert.fail();
        }
    }

    public void displayLeisureButton() throws InterruptedException {
        ElementUtils.waitAndClickElement(bookButton, ConstantClass.MEDIUM_WAIT_5);
        Thread.sleep(5000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Search\"))"));
        if (LeisureRadioButton.isDisplayed()) {
            Assert.assertEquals(LeisureRadioButton.isDisplayed(), true);
            System.out.println("Leisure Button is Displayed ");
        } else {
            System.out.println("Leisure Button is not Displayed ");
            Assert.fail();
        }
    }


    public void workingLeisureButton() throws InterruptedException {
        Thread.sleep(5000);
        if (LeisureRadioButton.isDisplayed()) {
            ElementUtils.waitAndClickElement(LeisureRadioButton, ConstantClass.MEDIUM_WAIT_5);
            System.out.println("Leisure radio Button is Select ");
        } else {
            System.out.println("Leisure radio  is not Select ");
            Assert.fail();
        }

    }

    public void workingMultiCityButton() {
        if (multiCityRadioButton.isDisplayed()) {
            //ElementUtils.waitAndClickElement(multiCityRadioButton, ConstantClass.MEDIUM_WAIT_5);
            System.out.println("MultiCity radio Button is Select ");
        } else {
            System.out.println("MultiCity radio Button is not Select ");
            //Assert.fail();
        }
        oneWay.click();
    }


    public void displayWorkButton() {

        if (workRadioButton.isDisplayed()) {
            System.out.println("Work Radio Button is Displayed ");
        } else {
            System.out.println("Work Radio Button is not Displayed ");
            Assert.fail();
        }
    }


    public void workRadioButton() {
        if (workRadioButton.isDisplayed()) {
            ElementUtils.waitAndClickElement(workRadioButton, ConstantClass.MEDIUM_WAIT_5);
            System.out.println("Work radio Button is Selected ");
        } else {
            System.out.println("Work radio  is not Selected ");
            Assert.fail();
        }
    }

    public void displayMedicalButton() {
        if (medicalRadioButton.isDisplayed()) {
            System.out.println("Medical Radio Button is Displayed ");
        } else {
            System.out.println("Medical Radio  Button is not Displayed ");
            Assert.fail();
        }
    }


    public void workMedicalRadioButton() {
        if (medicalRadioButton.isDisplayed()) {
            ElementUtils.waitAndClickElement(medicalRadioButton, ConstantClass.MEDIUM_WAIT_5);
            System.out.println("Medical radio Button is Selected ");
        } else {
            System.out.println("Medical radio  is not Selected ");
            Assert.fail();
        }


    }

    public void displayRoundCityButton() {
//        ElementUtils.scrollToElementByText("Book a Stay");
        if (roundRadioButton.isDisplayed()) {
            System.out.println("RoundTrip Radio Button is Displayed ");
        } else {
            System.out.println("RoundTrip Radio Button is not Displayed ");
           // Assert.fail();
        }
    }

    public void selectRoundRadioButton() {
        if (roundRadioButton.isDisplayed()) {
            ElementUtils.waitAndClickElement(roundRadioButton, ConstantClass.LONG_WAIT_50);
            Assert.assertEquals(returnButton.isDisplayed(),true);
            System.out.println("RoundTrip radio Button is Selected ");
        } else {
            System.out.println("RoundTrip radio  is not Selected ");
           // Assert.fail();
        }

    }

    public void displayPassengerSelectionButton() {
        if (passengerSelectionButton.isDisplayed()) {
            System.out.println("Passenger Selection Button  is Displayed ");
        } else {
            System.out.println("Passenger Selection Button is not Displayed ");
            Assert.fail();
        }
    }

    public void workingPassengerSelectionButton() {
        try {
            if (passengerSelectionButton.isDisplayed()) {
                ElementUtils.waitAndClickElement(passengerSelectionButton, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(verifyPassengerSelectionButton.isDisplayed(), true);
                System.out.println("Passenger Selection Button is Working ");
            }
        } catch (Exception e) {
            System.out.println("Passenger Selection Button is Not Working ");
            Assert.fail();
        }
    }


    public void displayClosePassengerSelectionButton() {
        if (closeSelectionButton.isDisplayed()) {
            ElementUtils.waitAndClickElement(closeSelectionButton, ConstantClass.MEDIUM_WAIT_5);
            Assert.assertEquals(true, closeSelectionButton.isDisplayed());
            System.out.println("Close Passenger Selection Button  is Displayed ");
        } else {
            System.out.println("Close Passenger Selection Button is not Displayed ");
            Assert.fail();
        }
    }

    public void workingClosePassengerSelectionButton() {
        try {
            if (closeSelectionButton.isDisplayed()) {
                ElementUtils.waitAndClickElement(closeSelectionButton, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(bookButton.isDisplayed(), true);
                System.out.println("Close Passenger Selection Button is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("Close Passenger Selection Button is Not Working ");
        }
    }


    public void displayChooseCurrencyButton() throws InterruptedException {
        if (chooseCurrencyButton.isDisplayed()) {
            Assert.assertEquals(true, chooseCurrencyButton.isDisplayed());
            System.out.println("Choose Currency Button  is Displayed ");
        } else {
            System.out.println("Choose Currency Button is not Displayed ");
            Assert.fail();
        }
    }

    public void workingChooseCurrencySelectionButton() {
        try {
            if (chooseCurrencyButton.isDisplayed()) {
                ElementUtils.waitAndClickElement(chooseCurrencyButton, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(verifyCurrencyButton.isDisplayed(), true);
                System.out.println("Choose Currency Button  is Working ");
            }
        } catch (Exception e) {
            System.out.println("Choose Currency Button Button is Not Working ");
            Assert.fail();

        }
        driver.navigate().back();
    }


    public void displayLoginAsQuestLink() {
        if (guestUser.isDisplayed()) {
            Assert.assertEquals(guestUser.isDisplayed(), true);
            System.out.println("Quest User Link  is Displayed ");
        } else {
            System.out.println("Quest User Link  is not Displayed ");
            Assert.fail();
        }
    }


    public void workingQuestUserLink() {
        ElementUtils.waitAndClickElement(guestUser, ConstantClass.MEDIUM_WAIT_5);

        try {
            if (bookButton.isDisplayed()) {
                Assert.assertEquals(bookButton.isDisplayed(), true);
                System.out.println("Quest User Link  is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("Quest User Link is Not Working ");
        }
    }

    public void displayFlyingFromLink() {

        if (flyingFrom.isDisplayed()) {
            Assert.assertEquals(true, flyingFrom.isDisplayed());
            System.out.println("Flying From Link  is Displayed ");
        } else {
            System.out.println("Flying From Link  is not Displayed ");
            Assert.fail();
        }
    }

    public void workingFlyingFromLink() {
        ElementUtils.waitAndClickElement(flyingFrom, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (validateFlyingFrom.isDisplayed()) {
                Assert.assertEquals(validateFlyingFrom.getText(), ConfigReader.getProperty("Expected(FlyingFromLink)"));
                System.out.println("Flying From Link is Working ");
            }
        } catch (Exception e) {
            System.out.println("Flying From Link is Not Working ");
            Assert.fail();

        }
        closeButtonFlyingFrom.click();
    }


    public void displayGoingToLink() {
        if (goingTo.isDisplayed()) {
            Assert.assertEquals(true, goingTo.isDisplayed());
            System.out.println("Going To Link is Displayed ");
        } else {
            System.out.println("Going To Link is not Displayed ");
            Assert.fail();
        }
    }


    public void workingGoingToLink() {
        ElementUtils.waitAndClickElement(bookButton,ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.scrollToElementByText("Book a Stay");
        ElementUtils.waitAndClickElement(goingTo, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (validateGoingTo.isDisplayed()) {
                Assert.assertEquals(validateGoingTo.getText(), ConfigReader.getProperty("Expected(GoingToLink)"));
                System.out.println("Going To Link is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("GoingTo Link is Not Working ");
        }
        closeButtonFlyingFrom.click();
    }

    public void displayDepartureDateLink() {
        if (selectDepartureDateLink.isDisplayed()) {
            Assert.assertEquals(true, selectDepartureDateLink.isDisplayed());
            System.out.println("Select Departure Date Link is Displayed ");
        } else {
            System.out.println("Select Departure Date Link is not Displayed ");
            Assert.fail();
        }
    }


    public void workingDepartureDateLink() {
        ElementUtils.waitAndClickElement(selectDepartureDateLink, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (validateDepartureDateLink.isDisplayed()) {
                Assert.assertEquals(validateDepartureDateLink.getText(), ConfigReader.getProperty("Expected(SelectDepartureDate)"));
                System.out.println("Validate Departure Link is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("Validate Departure  Link is Not Working ");
        }
        driver.navigate().back();
    }


    public void displayPassengerSelectionLink() {
        if (selectPassengerLink.isDisplayed()) {
            Assert.assertEquals(true, selectPassengerLink.isDisplayed());
            System.out.println("Select Passenger Link is Displayed ");
        } else {
            System.out.println("Select Passenger Link is not Displayed ");
            Assert.fail();
        }
    }


    public void workingSelectionPassengerLink() {
        ElementUtils.waitAndClickElement(selectPassengerLink, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (verifyPassengerSelectionButton.isDisplayed()) {
                Assert.assertEquals(verifyPassengerSelectionButton.getText(), ConfigReader.getProperty("Expected(PassengerSelectionLink)"));
                System.out.println("Passenger Selection Link is Working ");
            }
        } catch (Exception e) {
            System.out.println("Passenger Selection Link is Not Working ");
            Assert.fail();

        }
        driver.navigate().back();
    }


    public void displayPromCodeLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Search\"))"));
        if (addPromoCode.isDisplayed()) {
            Assert.assertEquals(true, addPromoCode.isDisplayed());
            System.out.println("Add Promo Code is Displayed ");
        } else {
            System.out.println("Add Promo Code is not Displayed ");
            Assert.fail();
        }
    }


    public void workingPromoCodeLink() throws InterruptedException {
        ElementUtils.waitAndClickElement(addPromoCode, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (validatePromoCodeLink.getText().contains("Apply")) {
                Assert.assertEquals(validatePromoCodeLink.getText(), ConfigReader.getProperty("Expected(PromoCode)"));
                System.out.println("Add Promo Code Link is Working ");
            }

        } catch (Exception e) {
            System.out.println("Add Promo Code Link is Not Working ");
            Assert.fail();
        }
        driver.navigate().back();
    }


    public void displaySearchLink() {
        ElementUtils.waitAndClickElement(bookButton,ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.scrollToEnd();
        if (searchButton.isDisplayed()) {
            Assert.assertEquals(true, searchButton.isDisplayed());
            System.out.println("Search Button is Displayed ");
        } else {
            System.out.println("Search Button is not Displayed ");
            Assert.fail();
        }
    }


    public void workingSearchLink() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        ValidFarePage validFarePage = new ValidFarePage(driver);
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Book a Stay\"))"));
        searchPage.clickOnTo();
        searchPage.searchPlace("Mumbai");
        LogUtils.info("Select Destination city");
        searchPage.clickOnMumbaiFlight();
        validFarePage.clickOnFutureDate(3);
        ElementUtils.scrollToElementByText("Search");
        ElementUtils.waitAndClickElement(searchButton, ConstantClass.MEDIUM_WAIT_5);
        Thread.sleep(5000);
        try {
            if (validateSearchButton.isDisplayed()) {
                Assert.assertTrue(validateSearchButton.getText().contains(ConfigReader.getProperty("Expected(ValidateSearch)")));
                System.out.println("Search Link is Working ");
            }

        } catch (Exception e) {
            System.out.println("Search Link is Not Working ");
            Assert.fail();
        }
        driver.navigate().back();
    }


    public void displayRecentSearchesLink() throws InterruptedException {
        ElementUtils.scrollToEnd();
        if (recentSearchButton.isDisplayed()) {
            Assert.assertEquals(true, recentSearchButton.isDisplayed());
            System.out.println("Recent Search Button is Displayed ");
        } else {
            System.out.println("Recent Search Button is not Displayed ");
            Assert.fail();
        }
    }


    public void workingRecentSearchesLink() throws InterruptedException {
        ElementUtils.scrollToEnd();
        ElementUtils.waitAndClickElement(recentSearchButton, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (validateSearchButton.isDisplayed()) {
                Assert.assertTrue(validateSearchButton.getText().contains(ConfigReader.getProperty("Expected(ValidateSearch)")));
                System.out.println("Recent Search Link is Working ");
            }

        } catch (Exception e) {
            System.out.println("Recent Search Link is Not Working ");
            Assert.fail();
        }
        driver.navigate().back();
    }


    public void verifyIndigoBlueChipsIsDisabled() {
        if (indigoBlueChipsRadioButton.isDisplayed()) {
            Assert.assertEquals(indigoBlueChipsRadioButton.isSelected(), false);
            System.out.println("Working");
        } else {
            System.out.println("Not working");
            Assert.fail();
        }
    }


    public void displayAddNomineeLink() throws InterruptedException {
        ElementUtils.scrollToEnd();
        if (addNominee.isDisplayed()) {
            Assert.assertEquals(true, addNominee.isDisplayed());
            System.out.println("Add Nominee is Displayed ");
        } else {
            System.out.println(" Add Nominee Link is not Displayed ");
            Assert.fail();
        }
    }


    public void workingAddNomineeLink() throws InterruptedException {
        ElementUtils.scrollToEnd();
        ElementUtils.waitAndClickElement(addNominee, ConstantClass.MEDIUM_WAIT_5);

        try {
            Thread.sleep(5000);
            System.out.println(validateAddNominee.getText());
            if (validateAddNominee.getText().contains("Add upto")) {
                Assert.assertEquals(validateAddNominee.getText(), ConfigReader.getProperty("Expected(AddNominee)"));
                System.out.println("Add Nominee Link is Working ");
            }

        } catch (Exception e) {
            System.out.println("Add Nominee Link is Not Working ");
            Assert.fail();
        }
        finally {
            driver.navigate().back();
        }
    }

    public void displayReturnLink() {
        if (returnButton.isDisplayed()) {
            Assert.assertEquals(true, returnButton.isDisplayed());
            System.out.println("Return Button is Displayed ");
        } else {
            System.out.println("Return Button is not Displayed ");
            Assert.fail();
        }
    }


    public void workingReturnLink() throws InterruptedException {
        try {
            if (returnButton.isDisplayed()) {
                ElementUtils.waitAndClickElement(returnButton, ConstantClass.MEDIUM_WAIT_5);
               // Assert.assertEquals(validateAddNominee.getText(), ConfigReader.getProperty("Expected(AddNominee)"));
                System.out.println("Return button  is Working ");
            }

        } catch (Exception e) {
            System.out.println("Return button  is Not Working ");
            Assert.fail();
        }
        finally {
            driver.navigate().back();
        }
    }
}