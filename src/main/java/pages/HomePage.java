package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    public AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

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

    public void displayMyTripButton() {
        if (myTripsButton.isDisplayed()) {
            System.out.println("My Trips Button is Displayed ");
        } else {
            System.out.println("My Trips Button is not Displayed ");
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
        if (myTripsButton.isEnabled()) {
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
        }

        else {

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
        if (LeisureRadioButton.isEnabled()) {
            LeisureRadioButton.click();

            System.out.println("Leisure radio Button is Select ");
        }

        else {
            System.out.println("Leisure radio  is not Select ");
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
        if (workRadioButton.isEnabled()) {
            workRadioButton.click();
            System.out.println("Work radio Button is Selected ");
        }
        else {
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
        if (medicalRadioButton.isEnabled()) {
            medicalRadioButton.click();
            System.out.println("Medical radio Button is Selected ");
        }
        else {
            System.out.println("Medical radio  is not Selected ");
            Assert.fail();
        }
}}