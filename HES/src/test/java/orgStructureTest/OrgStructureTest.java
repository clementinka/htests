package orgStructureTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OrgStructureTest extends AbstractParentTest {


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
        dashboardPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.checkIsOrgStructurePagePresent();
    }

    @Test
    public void orgStructureTest() {
//        //Create Company
//        orgStructurePage.clickOnCreateCompanyButton();
//        orgStructurePage.enterCompanyName("Hideez");
//        orgStructurePage.clickOnCreateButton();
//        orgStructurePage.checkIsCompanyNamePresent();

        //Edit Company
        orgStructurePage.clickOnDropdownMenuCompany();
        orgStructurePage.clickOnEditMenuCompany();
        orgStructurePage.enterCompanyName("1Hideez");
        orgStructurePage.clickOnSaveNameButton();
        orgStructurePage.checkIsEditedCompanyNamePresent();

        //Create Department
        orgStructurePage.clickOnCreateDepartmentButton();
        orgStructurePage.selectCompanyFromList();
        orgStructurePage.enterDepartmentNameInField("PRManager");
        orgStructurePage.clickOnCreateButton();
        orgStructurePage.checkIsDepartmentNamePresent();

        //Edit Department
        orgStructurePage.clickOnDropdownMenuDepartment();
        orgStructurePage.clickOnEditMenuDepartment();
        orgStructurePage.enterDepartmentNameInField("1PRManager");
        orgStructurePage.clickOnSaveNameButton();
        orgStructurePage.checkIsEditedDepartmentNamePresent();

        //Delete Department
        orgStructurePage.clickOnDropdownMenuDepartment();
        orgStructurePage.clickOnDeleteMenuDepartment();
        orgStructurePage.clickOnDeleteButton();

        //Delete Company
        orgStructurePage.clickOnDropdownMenuCompany();
        orgStructurePage.clickOnDeleteMenuCompany();
        orgStructurePage.clickOnDeleteButton();
        orgStructurePage.checkIsCompanyIsNotPresent();

    }
}
