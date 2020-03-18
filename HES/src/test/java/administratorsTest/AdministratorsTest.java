package administratorsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AdministratorsTest extends AbstractParentTest {



    @Before
    public void preconditions(){

        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        dashboardPage.leftMenu.clickOnMenuSettings();
        dashboardPage.leftMenu.clickOnSubMenuAdministrators();
        administratorsPage.checkIsAdministratorsPagePresent();
    }
    @Test
    public void administratorsTest() {

        administratorsPage.clickOnInviteAdminButton();
        administratorsPage.enterEmail("admhideeztest@gmail.com");
        administratorsPage.clickOnInviteButton();
        administratorsPage.searchSpecifiedAdmin("admhideeztest@gmail.com");
        administratorsPage.clickOnAdminDropdownMenu();
        administratorsPage.clickOnDeleteItem();
        administratorsPage.clickOnDeleteButton();
        administratorsPage.checkIsDeletedAdminNotPresent();
    }
}
