package summariesTests;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class SummariesSortTests extends AbstractParentTest {

    @Before
    public void preconditions() {

        loginPage.openPage();
        loginPage.checkCurrentUrl();
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.leftMenu.clickOnMenuAudit();
        dashboardPage.leftMenu.clickOnSubMenuSummaries();
        summariesPage.checkCurrentUrl();
    }

    @Test
    public void switchOnByEmployees() {

        summariesPage.clickOnByEmployeesTab();
        checkExpectedResult("Can't switch on By employees tab", summariesPage.ifEmployeesTabOpened());
    }

    @Test
    public void daysAndEmployeesTabOpened() {

        checkExpectedResult("can't load the table", summariesPage.ifDaysAndEmployeesTabOpened());
    }

    @Test
    public void switchToDepartmentsTab() {

        summariesPage.clickOnByDepartmentsTab();
        checkExpectedResult("Can't switch on By Departments Tab", summariesPage.ifDepartmentsTabOpened());
    }

    @Test
    public void switchToWorkstationsTab() {

        summariesPage.clickOnByWorkstationsTab();
        checkExpectedResult("Can't switch on By WorkstationsTab", summariesPage.ifWorkstationsTabOpened());
    }
}
