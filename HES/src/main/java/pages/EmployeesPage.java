package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;
import io.qameta.allure.Step;

public class EmployeesPage extends ParentPage {

    @FindBy(xpath = ".//button[@data-title= 'Create employee']")
    private WebElement buttonCreateEmployee;

    @FindBy(xpath = ".//input[@id='employee_first_name']")
    private WebElement enterFirstName;

    @FindBy(xpath = ".//input[@id='employee_last_name']")
    private WebElement enterLastName;

    @FindBy(xpath = ".//input[@name='Employee.Email']")
    private WebElement enterEmail;

    @FindBy(xpath = ".//input[@name='Employee.PhoneNumber']")
    private WebElement enterPhone;

    @FindBy(xpath = ".//div[@class='d-flex']//button[@class='btn btn-success btn-add open-second-modal-dialog']")
    private WebElement addCompany;

    @FindBy(xpath = ".//input[@id='Company_Name']")
    private WebElement enterNameCompany;

    @FindBy(xpath = ".//input[@type='submit' and @value = 'Create']")
    private WebElement buttonCreateOrgStructure;

    @FindBy(xpath = ".//div[@class='d-flex']//button[@id='add_position_btn']")
    private WebElement addDepartment;

    @FindBy(xpath = ".//input[@id='Department_Name']")
    private WebElement enterNameDepartment;

    @FindBy(xpath = ".//button[@data-title='Create position']")
    private WebElement addPosition;

    @FindBy(xpath = ".//input[@id='Position_Name']")
    private WebElement enterNamePosition;

    @FindBy(xpath = ".//button[@id='nextBtn']")
    private WebElement buttonNext;

    @FindBy(xpath = ".//*[@id='deviceId']")
    private WebElement deviceList;

    @FindBy(xpath = ".//*[@name='Wizard.DeviceId']//option[@value= 'ST10399999900004']")
    private WebElement addDeviceId;

    @FindBy(xpath = ".//*[@class='custom-control custom-switch']")
    private WebElement proximityCheckbox;

    @FindBy(xpath = ".//*[@id='workstationId']")
    private WebElement workstationList;

    @FindBy(xpath = ".//*[@id='workstationId']//option[@value='BEZTUZHEV-TESTW']")
    private WebElement selectWorkstation;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']")
    private WebElement accountTypeList;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']//option[@value='2']")
    private WebElement selectMicrosoftAccountType;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']//option[@value='1']")
    private WebElement selectDomainAccountType;

    @FindBy(xpath = ".//*[@id= 'workstation_account_type']//option[@value='0']")
    private WebElement selectLocalAccountType;

    @FindBy(xpath = ".//input[@id= 'login']")
    private WebElement enterAccountUserName;

    @FindBy(xpath = ".//input[@id= 'password']")
    private WebElement enterAccountUserPassword;

    @FindBy(xpath = ".//input[@id= 'confirmPassword']")
    private WebElement confirmAccountUserPassword;

    @FindBy(xpath = ".//div[@class='col']//*[@class='border rounded py-2 px-3']")
    private WebElement employeeBlock;

    @FindBy(xpath = ".//*[@data-title='Edit employee']")
    private WebElement editEmployeeLink;

    @FindBy(xpath = ".//input[@id='Employee_FirstName']")
    private WebElement editFirstName;

    @FindBy(xpath = ".//input[@id='Employee_LastName']")
    private WebElement editLastName;

    @FindBy(xpath = ".//input[@id='email']")
    private WebElement editEmail;

    @FindBy(xpath = ".//input[@id='Employee_PhoneNumber']")
    private WebElement editPhoneNumber;

    @FindBy(xpath = ".//*[@id='companies']")
    private WebElement companyList;

    @FindBy(xpath = ".//*[@id='companies']//option[text() ='Hideez']")
    private WebElement selectCompany;

    @FindBy(xpath = ".//*[@id='departments']")
    private WebElement departmentList;

    @FindBy(xpath = ".//*[@id='departments']/option[text() ='PR']")
    private WebElement selectDepartment;

    @FindBy(xpath = ".//*[@id='Employee_PositionId']")
    private WebElement positionList;

    @FindBy(xpath = ".//*[@id='Employee_PositionId']/option[text() ='PRManager']")
    private WebElement selectPosition;

    @FindBy(xpath = ".//input[@value='Save']")
    private WebElement saveButton;

    @FindBy(xpath = ".//a[@id='dropdownMenuLink']")
    private WebElement dropdownMenuEmployee;

    @FindBy(xpath = ".//img[@src='/svg/action/details.svg']")
    private WebElement detailsMenuEmployee;

    @FindBy(xpath = ".//tr[@class ='odd']//*[@id = 'dropdownMenuLink']")
    private WebElement dropdownMenuAccount;

    @FindBy(xpath = ".//tr[@class ='odd']//a[@data-title='Delete account']")
    private WebElement deleteMenuAccount;

    @FindBy(xpath = ".//input[@value='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//img[@src='/svg/action/delete.svg']")
    private WebElement removeDeviceButton;

    @FindBy(xpath = ".//a[@data-title = 'Delete employee']")
    private WebElement deleteEmployeeLink;

    public LeftMenu leftMenu;

    @FindBy(xpath = ".//div[@id='employees_wrapper']//div[@class='row'][2]//div[@class='col-sm-12']")
    private WebElement employeesTable;

    public EmployeesPage(WebDriver webDriver) {
        super(webDriver, "/Employees");
    }

    @Step
    public void clickOnCreateEmployeeButton() {
        actionsWithOurElements.clickOnElement(buttonCreateEmployee);
    }

    @Step
    public void enterFirstNameInToInputField(String employeeFirstName) {
        actionsWithOurElements.enterTextInInput(enterFirstName, employeeFirstName);
    }

    @Step
    public void enterLastNameInToInputField(String employeeLastName) {
        actionsWithOurElements.enterTextInInput(enterLastName, employeeLastName);
    }

    @Step
    public void enterEmailInToInputField(String employeeEmail) {
        actionsWithOurElements.enterTextInInput(enterEmail, employeeEmail);
    }

    @Step
    public void enterPhoneInToInputField(String employeePhone) {
        actionsWithOurElements.enterTextInInput(enterPhone, employeePhone);
    }

    @Step
    public void clickOnAddCompanyButton() {
        actionsWithOurElements.clickOnElement(addCompany);
    }

    @Step
    public void enterCompanyInToInputField(String nameCompany) {
        actionsWithOurElements.enterTextInInput(enterNameCompany, nameCompany);
    }

    @Step
    public void clickOnCreateOrgStructureButton() {
        actionsWithOurElements.clickOnElement(buttonCreateOrgStructure);
    }

    @Step
    public void clickOnAddDepartmentButton() {
        actionsWithOurElements.clickOnElement(addDepartment);
    }

    @Step
    public void enterDepartmentInToInputField(String nameDepartment) {
        actionsWithOurElements.enterTextInInput(enterNameDepartment, nameDepartment);
    }

    @Step
    public void clickOnAddPositionButton() {
        actionsWithOurElements.clickOnElement(addPosition);
    }

    @Step
    public void enterPositionInToInputField(String namePosition) {
        actionsWithOurElements.enterTextInInput(enterNamePosition, namePosition);
    }

    @Step
    public void clickOnNextButton() {
        actionsWithOurElements.clickOnElement(buttonNext);
    }

    @Step
    public void clickOnDeviceList() {
        actionsWithOurElements.clickOnElement(deviceList);
    }

    @Step
    public void clickOnDeviceId() {
        actionsWithOurElements.clickOnElement(addDeviceId);
    }

    @Step
    public void proximityCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(proximityCheckbox, expectedState);
    }

    @Step
    public void clickOnWorkstationList() {
        actionsWithOurElements.clickOnElement(workstationList);
    }

    @Step
    public void clickOnWorkstation() {
        actionsWithOurElements.clickOnElement(selectWorkstation);
    }

    @Step
    public void clickOnAccountTypeList() {
        actionsWithOurElements.clickOnElement(accountTypeList);
    }

    @Step
    public void selectMicrosoftAccountType() {
        actionsWithOurElements.clickOnElement(selectMicrosoftAccountType);
    }

    @Step
    public void enterAccountUserNameInToInputField(String userName) {
        actionsWithOurElements.enterTextInInput(enterAccountUserName, userName);
    }

    @Step
    public void enterAccountUserPasswordInToInputField(String userPassword) {
        actionsWithOurElements.enterTextInInput(enterAccountUserPassword, userPassword);
    }

    @Step
    public void confirmAccountUserPassword(String confirmPassword) {
        actionsWithOurElements.enterTextInInput(confirmAccountUserPassword, confirmPassword);
    }

    @Step
    public void checkIsFullNamePresent() {
        Assert.assertTrue("Added fullname is not displayed", webDriver.getPageSource().contains("Bob Brown"));
    }

    @Step
    public void checkIsWindowsAccountPresent() {
        Assert.assertTrue("Added account is not displayed", webDriver.getPageSource().contains("TestUnlockAccount"));
    }

    @Step
    public void checkIsDeviceIdPresent() {
        Assert.assertTrue("Added device is not displayed", webDriver.getPageSource().contains("ST10399999900004"));
    }

    @Step
    public void checkIsWorkstationIdPresent() {
        Assert.assertTrue("Added workstation is not displayed", webDriver.getPageSource().contains("BEZTUZHEV-TESTW"));
    }

    @Step
    public void clickOnDropdownMenuEmployee() {
        actionsWithOurElements.clickOnElement(dropdownMenuEmployee);
    }

    @Step
    public void clickOnEditEmployeeLink() {
        actionsWithOurElements.clickOnElement(editEmployeeLink);
    }

    @Step
    public void editFirstName(String firstName) {
        actionsWithOurElements.enterTextInInput(editFirstName, firstName);
    }

    @Step
    public void editLastName(String lastName) {
        actionsWithOurElements.enterTextInInput(editLastName, lastName);
    }

    @Step
    public void editEmail(String emailField) {
        actionsWithOurElements.enterTextInInput(editEmail, emailField);
    }

    @Step
    public void editPhoneNumber(String phoneNumberField) {
        actionsWithOurElements.enterTextInInput(editPhoneNumber, phoneNumberField);
    }

    @Step
    public void clickOnCompanyList() {
        actionsWithOurElements.clickOnElement(companyList);
    }

    @Step
    public void clickOnCompany() {
        actionsWithOurElements.clickOnElement(selectCompany);
    }

    @Step
    public void clickOnDepartmentList() {
        actionsWithOurElements.clickOnElement(departmentList);
    }

    @Step
    public void clickOnDepartment() {
        actionsWithOurElements.clickOnElement(selectDepartment);
    }

    @Step
    public void clickOnPositionList() {
        actionsWithOurElements.clickOnElement(positionList);
    }

    @Step
    public void clickOnPosition() {
        actionsWithOurElements.clickOnElement(selectPosition);
    }

    @Step
    public void clickOnSaveButton() {
        actionsWithOurElements.clickOnElement(saveButton);
    }

    @Step
    public void clickOnDeleteMenuAccount() {
        actionsWithOurElements.clickOnElement(deleteMenuAccount);
    }

    @Step
    public void clickOnDetailsLink() {
        actionsWithOurElements.clickOnElement(detailsMenuEmployee);
    }

    @Step
    public void clickOnRemoveDeviceButton() {
        actionsWithOurElements.clickOnElement(removeDeviceButton);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    @Step
    public void clickOnDeleteEmployeeLink() {
        actionsWithOurElements.clickOnElement(deleteEmployeeLink);
    }

    @Step
    public void clickOnDropdownMenuAccount() {
        actionsWithOurElements.clickOnElement(dropdownMenuAccount);
    }

    @Step
    public boolean checkPageOpened() {
        return actionsWithOurElements.isElementDisplayed(employeesTable);
    }

    @Step
    public void clickBack() {
        actionsWithOurElements.goBackInBrowser();
    }
}
