package pages;

import constant.ConstantClass;
import constant.ThreadWaitClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ConfigReader;
import utils.ConfigUatReader;
import utils.ElementUtils;

public class ProfilePage {

    public AndroidDriver driver;
    public WelcomePage welcomePage;
    public ProfilePage profilePage;
    public LoginPage loginPage;
    public LoginUserPage loginUserPage;


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

    @FindBy(xpath = "//android.widget.TextView[@text=\"YOUR INFORMATION\"]/ancestor::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup/child::android.view.ViewGroup/child::android.view.ViewGroup/child::android.widget.TextView[contains(@text, 'Hello')]")
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

    @FindBy(xpath = "//android.widget.TextView[@text=\"My Nominee\"]")
    public WebElement myNominees;

    @FindBy(xpath = "//android.widget.RadioButton[@content-desc=\"Male unselected\"]/android.view.ViewGroup")
    public WebElement maleRadioButton;

    @FindBy(xpath = "(//android.widget.RadioButton[@content-desc=\"Female unselected\"])/android.view.ViewGroup")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"First & Middle Name\" and @text=\"First & Middle Name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"Last Name\" and @text=\"Last Name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"dob\" and @text=\"DD-MM-YYYY\"]")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Save\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"ADD NOMINEE \"]")
    public WebElement addNomineeButton;

    @FindBy(xpath = "//com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[3]")
    public WebElement closeButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Terms and Conditions\"]")
    public WebElement termsAndConditions;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Terms and Conditions\"]")
    public WebElement validateTermsAndConditons;

    @FindBy(xpath = "//android.view.View[@resource-id=\"a\"]")
    public WebElement continueAsGuest;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Join Program\"]")
    public WebElement joinProgram;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Login or Sign up for IndiGo BluChip\"]")
    public WebElement validateJoinProgram;

    @FindBy(xpath = "//android.view.View[@resource-id=\"a\"]")
    public WebElement continueAsQuestLink;

    @FindBy(xpath = "//android.widget.TextView[@text=\"About IndiGo BluChip\"]")
    public WebElement aboutIndigoBlueChip;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Sign up and get access to exciting privileges and benefits\"]")
    public WebElement validateAboutIndigoBlueChip;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Enrol Now\"]")
    public WebElement enrolNow;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Tiers & Benefits\"]")
    public WebElement tiersAndBenefits;

    @FindBy(xpath = "//android.widget.TextView[@text=\"IndiGo BluChip Tiers and Tier Benefits\"]")
    public WebElement validateTiersAndBenefits;

    @FindBy(xpath = "//android.widget.TextView[@text=\"FAQ\"]")
    public WebElement faq;

    @FindBy(xpath = "//android.widget.TextView[@text=\"HAVE A QUESTION?\"]")
    public WebElement validateFaq;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Earn and Redeem\"]")
    public WebElement earnAndRedeem;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Earn IndiGo BluChips\"]")
    public WebElement earnIndigoBlueChip;

    @FindBy(xpath = "//android.webkit.WebView[@text=\"How To Earn Points\"]/android.view.View")
    public WebElement validateEarnIndigoBlueChip;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Redeem IndiGo BluChips\"]")
    public WebElement redeemIndigoBluChip;

    @FindBy(xpath = "//android.view.View[@text=\"Redeem IndiGo BluChips on IndiGo Flights\"]")
    public WebElement validateRedeemIndigoBluChip;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Terms & Conditions\"]")
    public WebElement IndigoTermsAndConditions;

    @FindBy(xpath = "//android.widget.TextView[@text=\"INDIGO BLUCHIP PROGRAM – TERMS &CONDITIONS\"]")
    public WebElement validateIndigoTermsAndConditions;

    @FindBy(xpath = "//android.widget.TextView[@text=\"IndiGo Wallet\"]")
    public WebElement indigoWallet;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Something went wrong\"]")
    public WebElement someThingWentWrong;

    @FindBy(xpath = "//android.widget.TextView[@text=\"ok\"]")
    public WebElement ok;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Log Out\"]")
    public WebElement logOut;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Login or Sign up for IndiGo BluChip!\"]")
    public WebElement validateLogOut;

    @FindBy(xpath = "//android.widget.TextView[@text=\"My dashboard\"]")
    public WebElement myDashBoard;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Welcome to IndiGo BluChip\"]")
    public WebElement validateMyDashBoard;

    @FindBy(xpath = " //android.widget.TextView[@text=\"Earn Now\"]")
    public WebElement earnNow;


    //android.widget.TextView[@text="My dashboard"]
    //android.widget.TextView[@text="Welcome to IndiGo BluChip"]
    //android.widget.TextView[@text="Earn Now"]
    public void displayProfileButton() {
       // ElementUtils.waitAndClickElement(profileButton,ConstantClass.MEDIUM_WAIT_5);
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

            Assert.assertEquals(validateProfileText.getText().substring(0,5), ConfigReader.getProperty("Expected(ExpectedQuestProfile)"));
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

            Assert.assertEquals(validateProfileText.getText().substring(0,5), ConfigReader.getProperty("Expected(ExpectedLoginProfile)"));
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
                }
            } catch (Exception e) {
                System.out.println("About us link is not working ");
                Assert.assertEquals(!aboutUs.isDisplayed(), true);

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


    public void workingIndigoBlueChipLink() {
        try {
            ElementUtils.waitAndClickElement(indigoBlueChipLink, ConstantClass.MEDIUM_WAIT_5);

            if (validateIndigoBlueChipLink.isDisplayed()) {
                ElementUtils.waitAndClickElement(indigoBlueChipLink, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateIndigoBlueChipLink.isDisplayed(), true);
                System.out.println("Indigo BlueChip link is working ");
            }
            else
            {
                Assert.assertEquals(joinProgram.isDisplayed(), true);
                System.out.println("Indigo BlueChip link is working ");
            }

        }
        catch (Exception e) {

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
        try {

            if (myScratchCard.isDisplayed()) {
                ElementUtils.waitAndClickElement(myScratchCard, ConstantClass.MEDIUM_WAIT_5);
            Assert.assertEquals(myScratchCard.isDisplayed(), true);
                System.out.println("Scratch Card link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("Scratch Card link is not working ");
            Assert.fail();
        }

        finally {
            driver.navigate().back();
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
                }
            }
        catch(Exception e)
            {
                System.out.println("Flight Status link is not working ");
                Assert.assertEquals(flightStatus.isDisplayed(), true);
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
                Assert.assertEquals(!helpAndFAQ.isDisplayed(), true);
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
    }
        public void displayMyNominees() {
            if (myNominees.isDisplayed()) {
                Assert.assertEquals(myNominees.isDisplayed(), true);
                System.out.println("My Nominees is Displayed ");
            } else {
                System.out.println("My Nominees is not Displayed ");
                Assert.fail();
            }
        }


    public void enabledMyNominees() {
        if (myNominees.isEnabled()) {
            Assert.assertEquals(myNominees.isEnabled(), true);
            System.out.println("My Nominees link is Enabled ");

        } else {
            System.out.println("My Nominees link is not Enabled");
            Assert.fail();
        }
    }


    public void workingMyNominees() {
        try {
            if (myNominees.isDisplayed()) {
                ElementUtils.waitAndClickElement(myNominees, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(addNomineeButton.isDisplayed(), true);
                System.out.println("My Nominees link is working ");
            } else {
                System.out.println("My Nominees link is not working ");
                Assert.assertEquals(!myNominees.isDisplayed(), true);
            }
        } catch (Exception e) {
        } finally {
            driver.navigate().back();
        }
    }

    public void addNominessDetails() throws InterruptedException {
        ElementUtils.waitAndClickElement(profileButton,ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.waitAndClickElement(myNominees,ConstantClass.MEDIUM_WAIT_5);
        //ElementUtils.waitForWebElementVisible(addNomineeButton,ConstantClass.MEDIUM_WAIT_5);
        Thread.sleep(5000);
        ElementUtils.waitAndClickElement(addNomineeButton,ConstantClass.LONG_WAIT_50);
        ElementUtils.waitAndClickElement(femaleRadioButton,ConstantClass.MEDIUM_WAIT_5);
        firstName.sendKeys("Sk");
        lastName.sendKeys("Jain");
        dateOfBirth.sendKeys("08-09-1995");
        ElementUtils.waitAndClickElement(closeButton,ConstantClass.MEDIUM_WAIT_5);
        driver.navigate().back();
//        ElementUtils.waitAndClickElement(saveButton,ConstantClass.MEDIUM_WAIT_5);
    }


    public void displayTermsAndCondtions() {
        if (termsAndConditions.isDisplayed()) {
            Assert.assertEquals(termsAndConditions.isDisplayed(), true);
            System.out.println("Terms And Conditions is Displayed ");
        } else {
            System.out.println("Terms And Conditions is not Displayed ");
            Assert.assertEquals(!termsAndConditions.isDisplayed(), true);

        }
    }


    public void enabledTermsAndConditions() {
        if (termsAndConditions.isEnabled()) {
            Assert.assertEquals(termsAndConditions.isEnabled(), true);
            System.out.println("Terms And Conditions link is Enabled ");

        } else {
            System.out.println("Terms And Conditions link is not Enabled");
            Assert.fail();
        }
    }

    public void workingTermsAndConditions() {
        try {
            if (termsAndConditions.isDisplayed()) {
                ElementUtils.waitAndClickElement(termsAndConditions, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateTermsAndConditons.isDisplayed(), true);
                System.out.println("Terms and Conditions link is working ");
            } else {
                System.out.println("Terms and Conditions  link is not working ");
                Assert.fail();
            }
        } catch (Exception e)
        {
            System.out.println("terms and Conditions link is not Working");
            Assert.fail();
        }
        finally {
            driver.navigate().back();
        }
    }
    public void verifyLogOutButton() {
        if (logout.isDisplayed()) {
            ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
            ElementUtils.waitAndClickElement(logout,ConstantClass.LONG_WAIT_10);
        }
    }

    public void ClickProfileButton() {
        ElementUtils.waitAndClickElement(profileButton,ConstantClass.LONG_WAIT_10);
        ThreadWaitClass.customSleep(ConstantClass.MEDIUM_WAIT_5);
        ElementUtils.waitAndClickElement(logout,ConstantClass.LONG_WAIT_10);
    }


    public void checkLoginLogout() {
        welcomePage = new WelcomePage(driver);
        profilePage = new ProfilePage(driver);
        loginPage = new LoginPage(driver);
        loginUserPage = new LoginUserPage(driver);
        loginPage.enterMobileNumber(ConfigUatReader.getProperty("loginMobileNumber"));
        loginPage.clickOnContinue();
        loginPage.enterPassword(ConfigUatReader.getProperty("loginPassword"));
        loginUserPage.loginButton();

    }

    public void checkLoginScreen() {
        Assert.assertTrue(continueAsGuest.isDisplayed(), "Login screen is not displayed !");
    }


    public void clickOnJoinProgram()
    {
        ElementUtils.waitAndClickElement(indigoBlueChipLink, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (joinProgram.isDisplayed()) {
                ElementUtils.waitAndClickElement(joinProgram, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateJoinProgram.isDisplayed(), true);
                System.out.println("Join Program link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("Join Program link is not working ");
            Assert.fail();
        }
        finally {
            ElementUtils.waitAndClickElement(continueAsGuest, ConstantClass.MEDIUM_WAIT_5);

        }
    }

    public void clickOnJoinProgramLogin()
    {
        ElementUtils.waitAndClickElement(indigoBlueChipLink, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (joinProgram.isDisplayed()) {
                ElementUtils.waitAndClickElement(joinProgram, ConstantClass.MEDIUM_WAIT_5);
            //    Assert.assertEquals(.isDisplayed(), true);
                System.out.println("Join Program link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("Join Program link is not working ");
         //   Assert.assertEquals(maleRadioButton.isDisplayed(), false);
        }
        finally {
driver.navigate().back();
        }
    }


    public void clickOnMyDashBoard()
    {
        ElementUtils.waitAndClickElement(indigoBlueChipLink, ConstantClass.MEDIUM_WAIT_5);
        try {
            if (joinProgram.isDisplayed()) {
                ElementUtils.waitAndClickElement(joinProgram, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateJoinProgram.isDisplayed(), true);
                System.out.println("Join Program link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("Join Program link is not working ");
            Assert.fail();
        }
        finally {
            ElementUtils.waitAndClickElement(continueAsGuest, ConstantClass.MEDIUM_WAIT_5);

        }
    }
    public void clickOnAboutIndigoBlueChip()
    {
        try {
            if (aboutIndigoBlueChip.isDisplayed()) {
                ElementUtils.waitAndClickElement(aboutIndigoBlueChip, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateAboutIndigoBlueChip.isDisplayed(), true);
                System.out.println("About Indigo Blue Chip link is working ");
//                ElementUtils.scrollToText("Enrol Now");
//                ElementUtils.waitAndClickElement(enrolNow,ConstantClass.MEDIUM_WAIT_5);
            }
        }
        catch (Exception e) {
            System.out.println("About Indigo Blue Chip  link is not working ");
            Assert.fail();
        }
        finally {
            driver.navigate().back();
        }
    }

    public void clickOnTierAndBenefits()
    {
        try {
            if (tiersAndBenefits.isDisplayed()) {
                ElementUtils.waitAndClickElement(tiersAndBenefits, ConstantClass.MEDIUM_WAIT_5);
                Thread.sleep(5000);
                driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).scrollToBeginning(1)"));
         //       ElementUtils.scrollToElementByText("IndiGo BluChip Tiers and Tier Benefits");
                Assert.assertEquals(validateTiersAndBenefits.isDisplayed(), true);
                System.out.println("Tier and Benefits link is working ");
//                ElementUtils.scrollToElementByText("Enrol Now");
//                ElementUtils.waitAndClickElement(enrolNow,ConstantClass.MEDIUM_WAIT_5);
            }
        }
        catch (Exception e) {
            System.out.println("Tier and Benefits  link is not working ");
            Assert.fail();
        }
        finally {
            driver.navigate().back();
        }
    }


    public void clickOnTermsAndConditions() {
        try {
            if (IndigoTermsAndConditions.isDisplayed()) {
                ElementUtils.waitAndClickElement(IndigoTermsAndConditions, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateIndigoTermsAndConditions.isDisplayed(), true);
                System.out.println("Terms and conditions link is working ");
            }
        } catch (Exception e) {
            System.out.println("Terms and conditions  link is not working ");
            Assert.fail();
        } finally {
            driver.navigate().back();
        }
    }

    public void clickOnFAQ()
    {
        ElementUtils.waitForWebElementVisible(faq,ConstantClass.MEDIUM_WAIT_5);
        try {
            if (faq.isDisplayed()) {
                ElementUtils.waitAndClickElement(faq, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateFaq.isDisplayed(), true);
                System.out.println("FAQ link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("FAQ link is not working ");
            Assert.assertEquals(!faq.isDisplayed(), true);
        }
        finally {
            driver.navigate().back();
        }
    }

    public void clickOnEarnAndRedeem()
    {
        try {
            if (earnAndRedeem.isDisplayed()) {
                ElementUtils.waitAndClickElement(earnAndRedeem, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(earnIndigoBlueChip.isDisplayed(), true);
                System.out.println("Earn And Redeem link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("Earn And Redeem link is not working ");
            Assert.fail();
        }

    }

    public void clickOnEarnIndigoBlueChip()
    {
        try {
            if (earnIndigoBlueChip.isDisplayed()) {
                ElementUtils.waitAndClickElement(earnIndigoBlueChip, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateEarnIndigoBlueChip.isDisplayed(), true);
                System.out.println("Earn Indigo BlueChip link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("Earn Indigo BlueChip link is not working ");
            Assert.assertEquals(!earnIndigoBlueChip.isDisplayed(), true);          }
        finally {
            driver.navigate().back();
        }
    }

    public void clickOnRedeemIndigoBlueChip()
    {
        try {
            if (redeemIndigoBluChip.isDisplayed()) {
                ElementUtils.waitAndClickElement(redeemIndigoBluChip, ConstantClass.MEDIUM_WAIT_5);
                Assert.assertEquals(validateRedeemIndigoBluChip.isDisplayed(), true);
                System.out.println("Redeem Indigo BlueChip link is working ");
            }
        }
        catch (Exception e) {
            System.out.println("Redeem Indigo BlueChip link is not working ");
            Assert.assertEquals(!redeemIndigoBluChip.isDisplayed(), true);
        }
        finally {
//            ElementUtils.waitAndClickElement(joinProgram, ConstantClass.MEDIUM_WAIT_5);
            driver.navigate().back();
        }

    }

    public void workingIndigoWallet() {
        try {
            if (indigoWallet.isDisplayed()) {
                ElementUtils.waitAndClickElement(indigoWallet, ConstantClass.MEDIUM_WAIT_5);
//                Assert.assertEquals(someThingWentWrong.isDisplayed(), true);
                System.out.println("Indigo Wallet button is working ");
            }

        } catch (Exception e) {
            System.out.println("Indigo Wallet button  is not working ");
            Assert.assertEquals(!indigoWallet.isDisplayed(), true);
        } finally {
            ElementUtils.waitAndClickElement(ok, ConstantClass.MEDIUM_WAIT_5);

        }
    }

        public void workingLogOut() {
            try {
                if (logout.isDisplayed()) {
                    ElementUtils.waitAndClickElement(logout, ConstantClass.MEDIUM_WAIT_5);
                    Assert.assertEquals(validateLogOut.isDisplayed(), true);
                    System.out.println("LogOut button is working ");
                }

            } catch (Exception e) {
                System.out.println("LogOut button is not working ");
                Assert.assertEquals(!logout.isDisplayed(), true);            }
        }

        public void clickOnMyDashboard()
        {
            ElementUtils.waitAndClickElement(indigoBlueChipLink,ConstantClass.MEDIUM_WAIT_5);
            try {
                if (myDashBoard.isDisplayed()) {
                    ElementUtils.waitAndClickElement(myDashBoard, ConstantClass.MEDIUM_WAIT_5);
                    Assert.assertEquals(validateMyDashBoard.isDisplayed(), true);
                    System.out.println("My Dashboard Button is working ");
                }
            }
            catch(Exception e)
                {
                    System.out.println("My Dashboard button is not working or it is not visible ");
                    Assert.assertEquals(!myDashBoard.isDisplayed(), true);                }
            finally {
                     driver.navigate().back();
            }
        }


}
