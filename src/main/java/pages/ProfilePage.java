package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ElementUtils;

public class ProfilePage {

    public AndroidDriver driver;

    public ProfilePage(AndroidDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//android.widget.TextView[@text=\"Profile\"]")
    public WebElement profileButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Flight Status\"]")
    public WebElement flightStatus;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Flight Status\"]")
    public WebElement validateFlightStatus;

    @FindBy(xpath = "//com.horcrux.svg.SvgView")
    public WebElement backButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Hello there\"]")
    public WebElement validateProfileText;

    @FindBy(xpath = "//android.widget.TextView[@text=\"About Us\"]")
    public WebElement aboutUs;

    @FindBy(xpath = "//android.widget.Image[@text=\"Indigo Logo Image\"]/ancestor::android.view.View/following-sibling::android.view.View/descendant::android.widget.ListView/descendant::android.view.View[@text=\"About Us\"]")
    public WebElement validateAboutUs;

    @FindBy(xpath = "//android.widget.TextView[@text=\"IndiGo BluChip\"]")
    public WebElement indigoBlueChipLink;

    @FindBy(xpath = "//android.widget.TextView[@text=\"DISCOVER\"]")
    public WebElement validateIndigoBlueChipLink;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Log Out\"]")
    public WebElement logout;

    @FindBy(xpath = "//android.widget.TextView[@text=\"My Scratch Card\"]")
    public WebElement myScratchCard;
    @FindBy(xpath = "//android.widget.TextView[@text=\"FULL MENU\"]")
    public WebElement fullMenu;



    //android.widget.Image[@text="Indigo Logo Image"]/ancestor::android.view.View/following-sibling::android.view.View/descendant::android.widget.ListView/descendant::android.view.View[@text="About Us"]

    ////android.widget.TextView[@text="IndiGo BluChip"]
    //android.widget.TextView[@text="About IndiGo BluChip"]
    //android.widget.TextView[@text="Tiers & Benefits"]
    //android.widget.TextView[@text="Terms & Conditions"]
    //android.widget.TextView[@text="FAQ"]
    //android.widget.TextView[@text="Join Program"]

    //android.widget.TextView[@text="Earn and Redeem"]
    ////android.widget.TextView[@text="DISCOVER"]
    //android.widget.TextView[@text="Earn and Redeem"]
    //android.widget.TextView[@text="Earn IndiGo BluChips"]
    //android.widget.TextView[@text="Redeem IndiGo BluChips"]
    //android.widget.TextView[@text="My Scratch Card"]
    //android.widget.TextView[@text="Contact Us"]
    //android.widget.TextView[@text="Help & FAQs"]


    public void displayProfileButton() {
        if (profileButton.isDisplayed()) {
            System.out.println("Profile Button is Displayed ");
            Assert.assertEquals(profileButton.isDisplayed(), true);
        } else {
            System.out.println("Profile Button is not Displayed ");
            Assert.fail();
        }
    }

    public void enabledProfileButton() {
        if (profileButton.isEnabled()) {

            Assert.assertEquals(profileButton.isEnabled(), true);
            System.out.println("Profile Button is Enabled ");

        } else {

            System.out.println("Profile  Button is not Enabled ");
            Assert.fail();
        }
    }


    public void clickProfileButton() {
        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Profile\"]"), ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.waitAndClickElement(profileButton, ConstantClass.MEDIUM_WAIT_5);
        if (profileButton.isEnabled()) {

           // Assert.assertEquals(validateProfileText.isDisplayed(), true);
            System.out.println("Profile Button is working ");
        } else {

            System.out.println("Profile Button is not working ");
            Assert.fail();
        }
    }

    public void displayAboutUs() {
        if (profileButton.isDisplayed()) {
            Assert.assertEquals(aboutUs.isDisplayed(), true);
            System.out.println("About us link is Displayed ");
        } else {
            System.out.println("About us link is not Displayed ");
            Assert.fail();
        }
    }

        public void workingAboutUsButton()
        {
            ElementUtils.waitAndClickElement(aboutUs, ConstantClass.MEDIUM_WAIT_5);
            try {
                ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);
            } catch (Exception e) {
                ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);

            }

//            try {
//                if (aboutUs.isEnabled()) {
//                    ElementUtils.waitForElementVisible(By.xpath("//android.widget.Image[@text=\"Indigo Logo Image\"]/ancestor::android.view.View/following-sibling::android.view.View/descendant::android.widget.ListView/descendant::android.view.View[@text=\"About Us\"]"), ConstantClass.LONG_WAIT_10);
//                    Assert.assertEquals(validateAboutUs.isDisplayed(), true);
//                    System.out.println("About us link is working ");
//
//                } else {
//
//                    System.out.println("About us link is not working ");
//                    Assert.fail();
//                }
//                ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"About IndiGo BluChip\"]"), ConstantClass.LONG_WAIT_180);
//                ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);
//
//
//            } catch (Exception e) {
//                if (aboutUs.isEnabled()) {
//                    ElementUtils.waitForElementVisible(By.xpath("//android.widget.Image[@text=\"Indigo Logo Image\"]/ancestor::android.view.View/following-sibling::android.view.View/descendant::android.widget.ListView/descendant::android.view.View[@text=\"About Us\"]"), ConstantClass.LONG_WAIT_10);
//                    Assert.assertEquals(validateAboutUs.isDisplayed(), true);
//                    System.out.println("About us link is working ");
//                }
//            }

        }
    public void enabledAboutUs() {
        if (aboutUs.isEnabled()) {
            Assert.assertEquals(aboutUs.isEnabled(), true);
            System.out.println("About Us is Enabled ");

        } else {

            System.out.println("About Us is not Enabled");
            Assert.fail();
        }
    }

    public void displayIndigoBlueChip() {
        ElementUtils.waitAndClickElement(profileButton,ConstantClass.MEDIUM_WAIT_5);
        if (indigoBlueChipLink.isDisplayed()) {
            Assert.assertEquals(indigoBlueChipLink.isDisplayed(), true);
            System.out.println("Indigo Blue Chip link is Displayed ");
        } else {
            System.out.println("Indigo Blue Chip link is not Displayed ");
            Assert.fail();
        }
    }





    public void enabledIndigoBlueChip() {
        if (indigoBlueChipLink.isEnabled()) {
            Assert.assertEquals(indigoBlueChipLink.isEnabled(), true);
            System.out.println("About Us is Enabled ");

        } else {
            System.out.println("About Us is not Enabled");
            Assert.fail();
        }
    }


    public void workingAboutIndigoBlueChipLink() {
       ElementUtils.waitAndClickElement(profileButton, ConstantClass.MEDIUM_WAIT_5);
        if (indigoBlueChipLink.isDisplayed())
        {
            ElementUtils.waitAndClickElement(indigoBlueChipLink, ConstantClass.MEDIUM_WAIT_5);
            Assert.assertEquals(validateIndigoBlueChipLink.isDisplayed(), true);
            System.out.println("Indigo BlueChip link is working ");
        }
        else {
            System.out.println("Indigo BlueChip link is not working ");
            Assert.fail();
        }
        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"About IndiGo BluChip\"]"),ConstantClass.LONG_WAIT_180);
        ElementUtils.waitAndClickElement(fullMenu,ConstantClass.MEDIUM_WAIT_5);
    }

    public void clickOnProfileButton()
    {
        ElementUtils.waitAndClickElement(profileButton,ConstantClass.MEDIUM_WAIT_5);
    }

    public void clickOnLogOutButton()
    {
        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Log Out\"]"),ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.waitAndClickElement(logout,ConstantClass.MEDIUM_WAIT_5);
    }


    public void displayScratchCard() {
        ElementUtils.waitAndClickElement(profileButton,ConstantClass.MEDIUM_WAIT_5);
        if (myScratchCard.isDisplayed()) {

            Assert.assertEquals(myScratchCard.isDisplayed(), true);
            System.out.println("Scratch Card link is Displayed ");
        } else {
            System.out.println("Scratch Card link is not Displayed ");
            Assert.fail();
        }
    }


    public void enabledScratchCard() {
        if (myScratchCard.isEnabled()) {
            Assert.assertEquals(myScratchCard.isEnabled(), true);
            System.out.println("Scratch Card link is Enabled ");

        } else {
            System.out.println("Scratch Card link is not Enabled");
            Assert.fail();
        }
    }


    public void workingScratchCardLink() {

        if (myScratchCard.isDisplayed())
        {
            ElementUtils.waitAndClickElement(myScratchCard, ConstantClass.MEDIUM_WAIT_5);
//            Assert.assertEquals(myScratchCard.isDisplayed(), true);
            System.out.println("Indigo BlueChip link is working ");
        }
        else {
            System.out.println("Indigo BlueChip link is not working ");
            Assert.fail();
        }
        try {
            ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);
        } catch (Exception e) {
            ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);
        }
    }
}
