package sharedAccountTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;


public class SharedAccountsTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.checkIsDashboardPagePresent();
        dashboardPage.leftMenu.clickOnMenuSharedAccounts();
        sharedAccountsPage.checkCurrentUrl();
        sharedAccountsPage.checkIsCreateSharedAccountsButtonPresent();
        sharedAccountsPage.deleteTestAccountsIfPresent();
    }


    @Test
    public void createWebSharedAccount() {
        sharedAccountsPage.clickOnCreateSharedAccountsButton();
        sharedAccountsPage.enterNameShAcc("hes auto test web account");
        sharedAccountsPage.enterUrlsShAcc("http://192.168.10.203:80/");
        sharedAccountsPage.enterLoginShAcc("admin@hideez.com");
        sharedAccountsPage.enterPasswordShAcc("admin");
        sharedAccountsPage.confirmPasswordShAcc("admin");
        sharedAccountsPage.enterOTPShAcc("KN726EWRNWGWGM7ZNPWYJI6MQYKEJFKP");
        sharedAccountsPage.clickOnCreateButton();
        sharedAccountsPage.enterInSearchFieldShAccName("hes auto test web account");
        checkExpectedResult("Can't find created account",
                sharedAccountsPage.checkIsShAccPresent("hes auto test web account"));
        sharedAccountsPage.clickOnDropdownMenu();
        sharedAccountsPage.clickOnDeleteShAccLink();
        sharedAccountsPage.clickOnDeleteButton();
    }

    @Test
    public void createAppSharedAccount() {
        sharedAccountsPage.clickOnCreateSharedAccountsButton();
        sharedAccountsPage.enterNameShAcc("hes auto test app account");
        sharedAccountsPage.enterAppShAcc("hesautotest");
        sharedAccountsPage.enterLoginShAcc("admin@hideez.com");
        sharedAccountsPage.enterPasswordShAcc("admin");
        sharedAccountsPage.confirmPasswordShAcc("admin");
        sharedAccountsPage.enterOTPShAcc("KN726EWRNWGWGM7ZNPWYJI6MQYKEJFKP");
        sharedAccountsPage.clickOnCreateButton();
        sharedAccountsPage.enterInSearchFieldShAccName("hes auto test app account");
        checkExpectedResult("Can't find created account",
                sharedAccountsPage.checkIsShAccPresent("hes auto test app account"));
        sharedAccountsPage.clickOnDropdownMenu();
        sharedAccountsPage.clickOnDeleteShAccLink();
        sharedAccountsPage.clickOnDeleteButton();
    }

    @Test
    public void createWindowsSharedAccount() {
        sharedAccountsPage.clickOnCreateSharedAccountsButton();
        sharedAccountsPage.switchOnWindowsAccount();
        sharedAccountsPage.switchOnUrlAppAccount();
        sharedAccountsPage.switchOnWindowsAccount();
        sharedAccountsPage.enterNameWinShAcc("my PC hes auto test");
        sharedAccountsPage.selectTypeDomain();
        sharedAccountsPage.enterDomainName("Test domain name");
        sharedAccountsPage.enterUserName("UserName");
        sharedAccountsPage.enterPassword("12345678");
        sharedAccountsPage.enterConfirmPassword("12345678");
        sharedAccountsPage.clickCreateWinAccButton();
        sharedAccountsPage.enterInSearchFieldShAccName("my PC hes auto test");
        checkExpectedResult("Can't find created windows account",
                sharedAccountsPage.checkIsShAccPresent("my PC hes auto test"));
        sharedAccountsPage.clickOnDropdownMenu();
        sharedAccountsPage.clickOnDeleteShAccLink();
        sharedAccountsPage.clickOnDeleteButton();
    }


//    @Test
//    public void editSharedAccount() {
//        sharedAccountsPage.createTestSharedAccount("Account for editing auto");
//        sharedAccountsPage.enterInSearchFieldShAccName("Account for editing auto");
//        sharedAccountsPage.
//    }
//
//    @Test
//    public void fun() {
//
//        //Edit Shared Account
//        sharedAccountsPage.clickOnDropdownMenu();
//        sharedAccountsPage.clickOnEditShAccLink();
//        sharedAccountsPage.enterNameShAcc("my");
//        sharedAccountsPage.enterUrlsShAcc("gmail.com");
//        sharedAccountsPage.enterLoginShAcc("hideeztest@gmail.com");
//        sharedAccountsPage.clickOnSaveButton();
//        sharedAccountsPage.checkIsShAccNameWasEdited();
//        sharedAccountsPage.checkIsShAccUrlWasEdited();
//        sharedAccountsPage.checkIsShAccLoginWasEdited();
//
//        //Edit Password ShaAcc
//        sharedAccountsPage.clickOnDropdownMenu();
//        sharedAccountsPage.clickOnEditPassLink();
//        sharedAccountsPage.enterPasswordShAcc("123456AA");
//        sharedAccountsPage.confirmPasswordShAcc("123456AA");
//        sharedAccountsPage.clickOnSaveButton();
//
//        //Edit OTP ShAcc
//        sharedAccountsPage.clickOnDropdownMenu();
//        sharedAccountsPage.clickOnEditOtpLink();
//        sharedAccountsPage.enterOTPShAcc("AA726EWRNWGWGM7ZNPWYJI6MQYKEJFAA");
//        sharedAccountsPage.clickOnSaveButton();
//
//        //Delete Shared Account
//        sharedAccountsPage.clickOnDropdownMenu();
//        sharedAccountsPage.clickOnDeleteShAccLink();
//        sharedAccountsPage.clickOnDeleteButton();
//        sharedAccountsPage.enterInSearhFieldShAccName("my");
//        sharedAccountsPage.checkIsShAccNotPresent();
//    }
}