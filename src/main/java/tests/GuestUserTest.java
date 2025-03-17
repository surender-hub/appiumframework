package tests;

import base.BaseTestLoginUser;
import constant.ThreadWaitClass;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.BookPage;
import pages.WelcomePage;

public class GuestUserTest extends BaseTestLoginUser {

    private WelcomePage welcomePage;
    private BookPage bookPage;
    private ThreadWaitClass threadWaitClass;

    @Test(priority = 1, groups = {"smoke"}, description = "TC_01 - Verify the Continue as Quest Link is Displayed or not ")
    @Description("Verify Continue as Quest Link is visible for Guest user ")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("BookPage")
    @Story("Guest User should be able to see the Continue as Quest Link ")
    public void verifyContinueAsQuestLinkDisplay() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
        bookPage.displayLoginAsQuestLink();
    }


    @Test(priority = 2, groups = {"smoke","regression"}, description = "TC_02 - Verify the  Quest User Link is Working or not ")
    @Description("Verify Quest User Link is Working for the guest user")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("bookPage")
    @Story("Verify whether the Quest User Link is Working for the Guest user or not ")
    public void workingQuestUserLink() throws InterruptedException {
        welcomePage = new WelcomePage(driver);
        bookPage = new BookPage(driver);
           bookPage.workingQuestUserLink();
    }
}
