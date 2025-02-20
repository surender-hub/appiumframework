package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

public AndroidDriver driver;

    public HomePage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
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

    @FindBy(xpath = "//android.widget.TextView[@text=\"CheckIn\"]")
    public WebElement checkInButton;



    public void displayMyTripButton()
    {
        if(myTripsButton.isDisplayed() )
        {
            System.out.println("My Trips Button is Displayed ");
        }
        else {
            System.out.println("My Trips Button is not Displayed ");
            Assert.fail();
        }
    }

    public void enabledMyTripButton()
    {
        if(myTripsButton.isEnabled() )
        {
            System.out.println("My Trips Button is Enabled ");
        }
        else {

            System.out.println("My Trips Button is not Enabled ");
            Assert.fail();
        }
    }


    public void clickMyTripButton()
    {
        if(myTripsButton.isEnabled() )
        {
            myTripsButton.click();
          boolean  button=validateMyTripsButton.isDisplayed();
          Assert.assertEquals(button,true);
            System.out.println("My Trips Button is working ");
        }
        else {

            System.out.println("My Trips Button is not working ");
            Assert.fail();
        }
    }



    public void displayBookButton()
    {
        if(bookButton.isDisplayed() )
        {
            System.out.println("Book Button is Displayed ");
        }
        else {
            System.out.println("Book Button is not Displayed ");
            Assert.fail();
        }
    }



    public void enabledBookButton()
    {
        if(bookButton.isEnabled() )
        {
            System.out.println("Book Button is Enabled ");
        }
        else {

            System.out.println("Book  Button is not Enabled ");
            Assert.fail();
        }
    }


    public void clickBookButton()
    {
        if(bookButton.isEnabled() )
        {
            bookButton.click();
            boolean  button=validatebookButton.isDisplayed();
            Assert.assertEquals(button,true);
            System.out.println("Book Button is working ");
        }
        else {

            System.out.println("Book Button is not working ");
            Assert.fail();
        }
    }



    public void displayCheckInButton()
    {
        if(checkInButton.isDisplayed() )
        {
            System.out.println("CheckIn Button is Displayed ");
        }
        else {
            System.out.println("CheckIn Button is not Displayed ");
            Assert.fail();
        }
    }

    public void enabledCheckInButton()
    {
        if(checkInButton.isEnabled() )
        {
            System.out.println("CheckIn Button is Enabled ");
        }
        else {

            System.out.println("CheckIn  Button is not Enabled ");
            Assert.fail();
        }
    }

    public void clickCheckInButton()
    {
        if(checkInButton.isEnabled() )
        {
            checkInButton.click();
            boolean  button=checkInButton.isDisplayed();
           Assert.assertEquals(button,true);
            System.out.println("CheckIn Button is working ");
        }
        else {

            System.out.println("CheckIn Button is not working ");
            Assert.fail();
        }
    }

}
