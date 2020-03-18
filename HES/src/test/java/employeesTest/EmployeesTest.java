package employeesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;
import io.qameta.allure.*;


@Epic("Allure examples")
@Feature("Junit 4 support")

public class EmployeesTest extends AbstractParentTest {

    @Description("Some detailed test description")
    @Story("Base support for bdd annotations")
    @Link("http://test.hideez.com")
    @Link(name = "allure", type = "mylink")
    @Issue("123")
    @Issue("432")
    @Severity(SeverityLevel.CRITICAL)

    @Test

    public void addEmployee() {
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
//        dashboardPage.checkCurrentUrl();
//        dashboardPage.leftMenu.clickOnMenuEmployees();
//        employeesPage.checkCurrentUrl();
//        employeesPage.clickOnCreateEmployeeButton();
//
//
//        //WIZARD
//        //----------START WIZARD---------------------------------
//
//
//        //Profile
//        employeesPage.enterFirstNameInToInputField("Bob");
//        employeesPage.enterLastNameInToInputField("Brown");
//        employeesPage.enterEmailInToInputField("brown@gmail.com");
//        employeesPage.enterPhoneInToInputField("+38-095-520-69-96");
//        employeesPage.clickOnAddCompanyButton();
//        employeesPage.enterCompanyInToInputField("Hideez");
//        employeesPage.clickOnCreateOrgStructureButton();
//        employeesPage.clickOnAddDepartmentButton();
//        employeesPage.enterDepartmentInToInputField("PR");
//        employeesPage.clickOnCreateOrgStructureButton();
//        employeesPage.clickOnAddPositionButton();
//        employeesPage.enterPositionInToInputField("PRManager");
//        employeesPage.clickOnCreateOrgStructureButton();
//        employeesPage.clickOnNextButton();
//
//        //Device
//        employeesPage.clickOnDeviceList();
//        employeesPage.clickOnDeviceId();
//        employeesPage.proximityCheckbox("check");
//        employeesPage.clickOnWorkstationList();
//        employeesPage.clickOnWorkstation();
//        employeesPage.clickOnNextButton();
//
//        //Windows Account
//        employeesPage.clickOnAccountTypeList();
//        employeesPage.selectMicrosoftAccountType();
//        employeesPage.enterAccountUserNameInToInputField("TestUnlockAccount");
//        employeesPage.enterAccountUserPasswordInToInputField("123007");
//        employeesPage.confirmAccountUserPassword("123007");
//        employeesPage.clickOnNextButton();
//
//        //Overview
//        employeesPage.checkIsFullNamePresent();
//        employeesPage.checkIsWindowsAccountPresent();
//        employeesPage.checkIsDeviceIdPresent();
//        employeesPage.checkIsWorkstationIdPresent();
//        employeesPage.clickOnNextButton();
//
//        //-------END WIZARD-------------------------
//
//
//        //Edit Employee
//        employeesPage.clickOnDropdownMenuEmployee();
//        employeesPage.clickOnEditEmployeeLink();
//        employeesPage.editFirstName("1Bob");
//        employeesPage.editLastName("1Brown");
//        employeesPage.editEmail("1brown@gmail.com");
//        employeesPage.editPhoneNumber("+38-095-edited");
//        employeesPage.clickOnCompanyList();
//        employeesPage.clickOnCompany();
//        employeesPage.clickOnDepartmentList();
//        employeesPage.clickOnDepartmentList();
//        employeesPage.clickOnDepartment();
//        employeesPage.clickOnPositionList();
//        employeesPage.clickOnPosition();
//        employeesPage.clickOnSaveButton();
//
//        //Delete Personal Account
//        employeesPage.clickOnDropdownMenuEmployee();
//        employeesPage.clickOnDetailsLink();
//        employeesPage.clickOnDropdownMenuAccount();
//        employeesPage.clickOnDeleteMenuAccount();
//        employeesPage.clickOnDeleteButton();
//
//
//        //Delete Device
//        employeesPage.clickOnRemoveDeviceButton();
//        employeesPage.clickOnDeleteButton();
//
//        //Delete Employee
//        employeesPage.leftMenu.clickOnMenuDashboard();
//        employeesPage.leftMenu.clickOnMenuEmployees();
//        employeesPage.clickOnDropdownMenuEmployee();
//        employeesPage.clickOnDeleteEmployeeLink();
//        employeesPage.clickOnDeleteButton();

        //Delete Department
        employeesPage.leftMenu.clickOnMenuSettings();
        employeesPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.clickOnDropdownMenuDepartment();
        orgStructurePage.clickOnDeleteMenuDepartment();
        orgStructurePage.clickOnDeleteButton();

        //Delete Company
        employeesPage.leftMenu.clickOnMenuSettings();
        employeesPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.clickOnDropdownMenuCompany();
        orgStructurePage.clickOnDeleteMenuCompany();
        orgStructurePage.clickOnDeleteButton();

        //Delete Position
        orgStructurePage.leftMenu.clickOnMenuSettings();
        orgStructurePage.leftMenu.clickOnSubMenuPositions();
        positionsPage.clickOnDropdownMenuPosition();
        positionsPage.clickOnDeleteMenuPosition();
        positionsPage.clickOnDeleteButton();

        positionsPage.enterPositionInToSearchField("PRManager");
        positionsPage.checkIsPositionIsNotPresent();
        positionsPage.leftMenu.clickOnMenuSettings();
        positionsPage.leftMenu.clickOnSubMenuOrgStructure();
        orgStructurePage.checkIsCompanyIsNotPresent();

    }

}