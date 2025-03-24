package pages;

import constant.ConstantClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ConfigReader;
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

    @FindBy(xpath = "//android.widget.TextView[@text=\"YOUR INFORMATION\"]/ancestor::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView")
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

    @FindBy(xpath = "//android.widget.TextView[@text=\"Help & FAQs\"]")
    public WebElement helpAndFAQ;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Frequently Asked Questions\"]")
    public WebElement validateHelpAndFAQ;

    @FindBy(xpath = " //android.widget.TextView[@text=\"Contact Us\"]")
    public WebElement contactUs;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Registered Office\"]")
    public WebElement validateContactUs;




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


    public void verifyQuestProfileButton() {
//        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Profile\"]"), ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.waitAndClickElement(profileButton, ConstantClass.MEDIUM_WAIT_5);
        if (profileButton.isEnabled()) {

            Assert.assertEquals(validateProfileText.getText(), ConfigReader.getProperty("Expected(ExpectedQuestProfile)"));
            System.out.println("Profile Button is working ");
        } else {

            System.out.println("Profile Button is not working ");
            Assert.fail();
        }
    }

    public void verifyLoginProfileButton() {
//        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Profile\"]"), ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.waitAndClickElement(profileButton, ConstantClass.MEDIUM_WAIT_5);
        if (profileButton.isEnabled()) {

            Assert.assertEquals(validateProfileText.getText(), ConfigReader.getProperty("Expected(ExpectedLoginProfile)"));
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


            try {
                if (aboutUs.isEnabled()) {
                    ElementUtils.waitAndClickElement(aboutUs, ConstantClass.MEDIUM_WAIT_5);
                    ElementUtils.waitForElementVisible(By.xpath("//android.widget.Image[@text=\"Indigo Logo Image\"]/ancestor::android.view.View/following-sibling::android.view.View/descendant::android.widget.ListView/descendant::android.view.View[@text=\"About Us\"]"), ConstantClass.LONG_WAIT_10);
                    Assert.assertEquals(validateAboutUs.isDisplayed(), true);
                    System.out.println("About us link is working ");
                } else {
                    System.out.println("About us link is not working ");
                    Assert.fail();
                }

            } catch (Exception e) {

                }

            finally {
              //  ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);
               driver.navigate().back();

            }

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
//        ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Profile\"]"), ConstantClass.LONG_WAIT_180);
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
        try {
            if (indigoBlueChipLink.isDisplayed()) {
                ElementUtils.waitAndClickElement(indigoBlueChipLink, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateIndigoBlueChipLink.isDisplayed(), true);
                System.out.println("Indigo BlueChip link is working ");
            } else {
                System.out.println("Indigo BlueChip link is not working ");
                Assert.fail();
            }

        } catch (Exception e) {

        }
        finally {
//            ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"About IndiGo BluChip\"]"),ConstantClass.LONG_WAIT_180);
            ElementUtils.waitAndClickElement(fullMenu,ConstantClass.LONG_WAIT_50);
//            ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Profile\"]"), ConstantClass.LONG_WAIT_180);

        }
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
//        ElementUtils.waitAndClickElement(profileButton,ConstantClass.MEDIUM_WAIT_5);
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
            System.out.println("Scratch Card link is working ");
        }
        else {
            System.out.println("Scratch Card link is not working ");
            Assert.fail();
        }
        try {
            ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);
        } catch (Exception e) {
            ElementUtils.waitAndClickElement(backButton, ConstantClass.MEDIUM_WAIT_5);
        }
    }


    public void displayFlightStatus() {
        if (flightStatus.isDisplayed()) {
            Assert.assertEquals(flightStatus.isDisplayed(), true);
            System.out.println("Flight Status link is Displayed ");
        } else {
            System.out.println("Flight Status link is not Displayed ");
            Assert.fail();
        }
    }


    public void enabledFlightStatus() {
        if (flightStatus.isEnabled()) {
            Assert.assertEquals(flightStatus.isEnabled(), true);
            System.out.println("Flight Status link is Enabled ");

        } else {
            System.out.println("Flight Status link is not Enabled");
            Assert.fail();
        }
    }


    public void workingFlightStatus(){
            try {
                if (flightStatus.isDisplayed()) {
                    ElementUtils.waitAndClickElement(flightStatus, ConstantClass.MEDIUM_WAIT_5);
                    ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Flight Status\"]"),ConstantClass.MEDIUM_WAIT_5);
            Assert.assertEquals(validateFlightStatus.isDisplayed(), true);
                    System.out.println("Flight Status link is working ");
                } else {
                    System.out.println("Flight Status link is not working ");
                    Assert.fail();
                }
            }
        catch(Exception e)
            {

            }
            finally {
//                ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Flight Status\"]"),ConstantClass.MEDIUM_WAIT_5);
//                ElementUtils.waitAndClickElement(backButton,ConstantClass.MEDIUM_WAIT_5);
                driver.navigate().back();
            }
    }



    public void displayHelpAndFAQ() {
        if (helpAndFAQ.isDisplayed()) {
            Assert.assertEquals(helpAndFAQ.isDisplayed(), true);
            System.out.println("Help&Faq link is Displayed ");
        } else {
            System.out.println("Help&Faq link is not Displayed ");
            Assert.fail();
        }
    }

    public void enabledHelpAndFAQ() {
        if (helpAndFAQ.isEnabled()) {
            Assert.assertEquals(helpAndFAQ.isEnabled(), true);
            System.out.println("Help&Faq link is Enabled ");

        } else {
            System.out.println("Help&Faq link is not Enabled");
            Assert.fail();
        }
    }


    public void workingHelpAndFaq() {
        try {
            if (helpAndFAQ.isDisplayed()) {
                ElementUtils.waitAndClickElement(helpAndFAQ, ConstantClass.MEDIUM_WAIT_5);
                ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Frequently Asked Questions\"]"), ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateHelpAndFAQ.isDisplayed(), true);
                System.out.println("Help&Faq link is working ");
            } else {
                System.out.println("Help&Faq link is not working ");
                Assert.fail();
            }
        } catch (Exception e) {
        } finally {
            driver.navigate().back();
        }

    }
        public void displayContactUs() {
            if (contactUs.isDisplayed()) {
                Assert.assertEquals(contactUs.isDisplayed(), true);
                System.out.println("ContactUs link is Displayed ");
            } else {
                System.out.println("ContactUs link is not Displayed ");
                Assert.fail();
            }
        }

        public void enabledContactUs() {
            if (contactUs.isEnabled()) {
                Assert.assertEquals(contactUs.isEnabled(), true);
                System.out.println("Contact Us link is Enabled ");

            } else {
                System.out.println("Contact Us link is not Enabled");
                Assert.fail();
            }
        }


    public void workingContactUs() {
        try {
            if (contactUs.isDisplayed()) {
                ElementUtils.waitAndClickElement(contactUs, ConstantClass.MEDIUM_WAIT_5);
               // ElementUtils.waitForElementVisible(By.xpath("//android.widget.TextView[@text=\"Frequently Asked Questions\"]"), ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateContactUs.isDisplayed(), true);
                System.out.println("ContactUs link is working ");
            } else {
                System.out.println("ContactUs link is not working ");
                Assert.fail();
            }
        } catch (Exception e) {
        } finally {
            driver.navigate().back();
        }
}}
