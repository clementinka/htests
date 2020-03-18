package positionsTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PositionsTest extends AbstractParentTest {

    @Before
    public void preconditions() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        dashboardPage.leftMenu.clickOnMenuSettings();
        dashboardPage.leftMenu.clickOnSubMenuPositions();
        positionsPage.checkIsPositionPagePresent();

    }

    @Test
    public void positionsTest() {

        //Create Position
        positionsPage.clickOnCreatePositionButton();
        positionsPage.enterPositionName("PRManager");
        positionsPage.clickOnCreateButton();
        positionsPage.checkIsPositionNamePresent();

        //Edit Position
        positionsPage.clickOnDropdownMenuPosition();
        positionsPage.clickOnEditMenuPosition();
        positionsPage.enterPositionName("BipPRManager");
        positionsPage.clickOnSaveNameButton();
        positionsPage.checkIsEditedPositionNamePresent();

        //Delete Position
        positionsPage.clickOnDropdownMenuPosition();
        positionsPage.clickOnDeleteMenuPosition();
        positionsPage.clickOnDeleteButton();

    }
}