package pages;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ElementUtils;

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

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"Round trip unselected\"]/android.view.ViewGroup")
    public WebElement roundRadioButton;

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"Multi city unselected\"]/android.view.ViewGroup")
    public WebElement multiCityRadioButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Book a Stay\"]")
    public WebElement bookastaybutton;

    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Who you are travelling with?\"]/com.horcrux.svg.SvgView"))
    public WebElement passengerSelectionButton;


    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Choose your Currency\"]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/"))
    public WebElement chooseCurrencyButton;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Who are you travelling with?\"]"))
    public WebElement verifyPassengerSelectionButton;


    @FindBy(xpath = ("//android.view.ViewGroup[@content-desc=\"Close Add Passenger Bottom Sheet\"]/com.horcrux.svg.SvgView"))
    public WebElement closeSelectionButton;

    @FindBy(xpath = ("//android.widget.EditText[@text=\"Search\"]"))
    public WebElement verifyCurrencyButton;

    @FindBy(xpath = ("//android.widget.TextView[@text=\"Discover and book a perfect stay from over 7 lakh hotels worldwide!\"]"))
    public WebElement verifyBookStay;

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

    public void clickOnBookStayButton() {
        bookastaybutton.click();
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
            Assert.fail();
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
            myTripsButton.click();
            boolean button = validateMyTripsButton.isDisplayed();
            Assert.assertEquals(button, true);
            System.out.println("My Trips Button is working ");
        } else {

            System.out.println("My Trips Button is not working ");
            Assert.fail();
        }
    }


    public void displayBookButton() {
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
        if (bookButton.isEnabled()) {
            bookButton.click();
            boolean button = validatebookButton.isDisplayed();
            Assert.assertEquals(button, true);
            System.out.println("Book Button is working ");
        } else {

            System.out.println("Book Button is not working ");
            Assert.fail();
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
            checkInButton.click();
            boolean button = checkInButton.isDisplayed();
            Assert.assertEquals(button, true);
            System.out.println("CheckIn Button is working ");
        } else {

            System.out.println("CheckIn Button is not working ");
            Assert.fail();
        }
    }


    public void displayProfileButton() {
        if (profileButton.isDisplayed()) {
            System.out.println("Profile Button is Displayed ");
        } else {
            System.out.println("Profile Button is not Displayed ");
            Assert.fail();
        }
    }

    public void enabledProfileButton() {
        if (profileButton.isEnabled()) {
            System.out.println("Profile Button is Enabled ");
        } else {

            System.out.println("Profile  Button is not Enabled ");
            Assert.fail();
        }
    }


    public void clickProfileButton() {
        if (profileButton.isEnabled()) {
            profileButton.click();
            boolean button = validateProfileText.isDisplayed();
            Assert.assertEquals(button, true);
            System.out.println("Profile Button is working ");
        } else {

            System.out.println("Profile Button is not working ");
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
            exploreButton.click();

            System.out.println("Explore Button is working ");
        } else {

            System.out.println("Explore Button is not working ");
            Assert.fail();
        }
    }

    public void displayLeisureButton() {
        if (LeisureRadioButton.isDisplayed()) {
            System.out.println("Leisure Button is Displayed ");
        } else {
            System.out.println("Leisure Button is not Displayed ");
            Assert.fail();
        }
    }


    public void workingLeisureButton() {
        if (LeisureRadioButton.isDisplayed()) {
            ElementUtils ec = new ElementUtils(driver);
            ec.scrollToElementByText("Leisure");
            LeisureRadioButton.click();
            System.out.println("Leisure radio Button is Select ");
        } else {
            System.out.println("Leisure radio  is not Select ");
            Assert.fail();
        }
    }

    public void workingMultiCityButton() {
        if (multiCityRadioButton.isDisplayed()) {
            multiCityRadioButton.click();

            System.out.println("MultiCity radio Button is Select ");
        } else {
            System.out.println("MultiCity radio Button is not Select ");
            Assert.fail();
        }
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
            ElementUtils ec = new ElementUtils(driver);
            ec.scrollToElementByText("Work");
            workRadioButton.click();
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
            ElementUtils ec = new ElementUtils(driver);
            ec.scrollToElementByText("Medical");
            medicalRadioButton.click();
            System.out.println("Medical radio Button is Selected ");
        } else {
            System.out.println("Medical radio  is not Selected ");
            Assert.fail();
        }


    }

    public void displayRoundCityButton() {
        if (roundRadioButton.isDisplayed()) {
            System.out.println("RoundTrip Radio Button is Displayed ");
        } else {
            System.out.println("RoundTrip Radio Button is not Displayed ");
            Assert.fail();
        }
    }

    public void selectRoundRadioButton() {
        if (roundRadioButton.isDisplayed()) {
            roundRadioButton.click();
            System.out.println("RoundTrip radio Button is Selected ");
        } else {
            System.out.println("RoundTrip radio  is not Selected ");
            Assert.fail();
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
                passengerSelectionButton.click();
                Assert.assertEquals(verifyPassengerSelectionButton.isDisplayed(), true);
                System.out.println("Passenger Selection Button is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("Passenger Selection Button is Not Working ");
        }
    }


    public void displayClosePassengerSelectionButton() {
        passengerSelectionButton.click();
        if (closeSelectionButton.isDisplayed()) {
            Assert.assertEquals(true, closeSelectionButton.isDisplayed());
            System.out.println("Close Passenger Selection Button  is Displayed ");
        } else {
            System.out.println("Close Passenger Selection Button is not Displayed ");
            Assert.fail();
        }
    }

    public void workingClosePassengerSelectionButton() {

        passengerSelectionButton.click();
        try {
            if (closeSelectionButton.isDisplayed()) {

                closeSelectionButton.click();
                Assert.assertEquals(bookButton.isDisplayed(), true);
                System.out.println("Close Passenger Selection Button is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("Close Passenger Selection Button is Not Working ");
        }
    }


    public void displayChooseCurrencyButton() {

        if (chooseCurrencyButton.isDisplayed())
        {
            Assert.assertEquals(true, chooseCurrencyButton.isDisplayed());
            System.out.println("Choose Currency Button  is Displayed ");
        }

        else
        {
            System.out.println("Choose Currency Button is not Displayed ");
            Assert.fail();
        }
    }

    public void workingChooseCurrencySelectionButton() {
        chooseCurrencyButton.click();
        try {
            if (chooseCurrencyButton.isDisplayed()) {
                chooseCurrencyButton.click();
                Assert.assertEquals(verifyCurrencyButton.isDisplayed(), true);
                System.out.println("Choose Currency Button  is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("Choose Currency Button Button is Not Working ");
        }
    }


    public void displayLoginAsQuestLink() {
        if (guestUser.isDisplayed())
        {
            Assert.assertEquals(true, guestUser.isDisplayed());
            System.out.println("Quest User Link  is Displayed ");
        }
        else
        {
            System.out.println("Quest User Link  is not Displayed ");
            Assert.fail();
        }
    }


    public void workingQuestUserLink() {
        guestUser.click();
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
        if (flyingFrom.isDisplayed())
        {
            Assert.assertEquals(true, flyingFrom.isDisplayed());
            System.out.println("Flying From Link  is Displayed ");
        }
        else
        {
            System.out.println("Flying From Link  is not Displayed ");
            Assert.fail();
        }
    }

    public void workingFlyingFromLink() {
        flyingFrom.click();
        try {
            if (validateFlyingFrom.isDisplayed()) {
                Assert.assertEquals(validateFlyingFrom.isDisplayed(), true);
                System.out.println("Flying From Link is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("Flying From Link is Not Working ");
        }
        closeButtonFlyingFrom.click();
    }



    public void displayGoingToLink() {
        if (goingTo.isDisplayed())
        {
            Assert.assertEquals(true, goingTo.isDisplayed());
            System.out.println("Going To Link is Displayed ");
        }

        else
        {
            System.out.println("Going To Link is not Displayed ");
            Assert.fail();
        }
    }


    public void workingGoingToLink() {
        goingTo.click();
        try {
            if (validateGoingTo.isDisplayed()) {
                Assert.assertEquals(validateGoingTo.isDisplayed(), true);
                System.out.println("GoingTo Link is Working ");
            }
        } catch (Exception e) {
            Assert.fail();
            System.out.println("GoingTo Link is Not Working ");
        }
        closeButtonFlyingFrom.click();
    }

}