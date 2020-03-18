package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class OrgStructurePage extends ParentPage {

    @FindBy(xpath = ".//*[@data-title = 'Create company']")
    private WebElement orgStructureAvatar;

    @FindBy(xpath = ".//table[@id='aac46d03-1840-4770-9a18-39bdfe2ee969']//tbody//tr[@class='odd']//td[3]")
    private WebElement dropdownMenuDepartment;

    @FindBy(xpath = ".//div[@class='dropdown-menu dropdown-menu-right shadow animated--fade-in show']//a[@class='dropdown-item open-modal-dialog'][2]")
    private WebElement deleteMenuDepartment;

    @FindBy(xpath = ".//input[@class='btn btn-danger']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//div[@class='col-auto p-1'][2]")
    private WebElement dropdownMenuCompany;

    @FindBy(xpath = ".//a[@class='dropdown-item open-modal-dialog'][2]")
    private WebElement deleteMenuCompany;

    @FindBy(xpath = ".//button[@data-title='Create company']")
    private WebElement createCompanyButton;

    @FindBy(xpath = ".//input[@id='Company_Name']")
    private WebElement enterCompanyName;

    @FindBy(xpath = ".//input[@value='Create']")
    private WebElement createButton;

    @FindBy(xpath = ".//div[@class='dropdown-menu dropdown-menu-left shadow show']//img[@src='/svg/action/edit.svg']")
    private WebElement editMenuCompany;

    @FindBy(xpath = ".//input[@value='Save']")
    private WebElement saveName;

    @FindBy(xpath = ".//button[@data-title='Create department']")
    private WebElement createDepartmentButton;

    @FindBy(xpath = ".//select[@id='companyId']")
    private WebElement selectCompanyFromList;

    @FindBy(xpath = ".//input[@id='Department_Name']")
    private WebElement enterDepartmentName;

    @FindBy(xpath = ".//tr[@class ='odd']//*[@data-action = 'EditDepartment']")
    private WebElement editMenuDepartment;


    public LeftMenu leftMenu;

    public OrgStructurePage(WebDriver webDriver) {
        super(webDriver, "/OrgStructure");
    }

    @Step
    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(orgStructureAvatar);
    }

    @Step
    public void checkIsOrgStructurePagePresent() {
        Assert.assertTrue("OrgStructurePage is not displayed", isAvatarDisplayed());
    }

    @Step
    public void clickOnDropdownMenuDepartment() {
        actionsWithOurElements.clickOnElement(dropdownMenuDepartment);
    }

    @Step
    public void clickOnDeleteMenuDepartment() {
        actionsWithOurElements.clickOnElement(deleteMenuDepartment);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    @Step
    public void clickOnDropdownMenuCompany() {
        actionsWithOurElements.clickOnElement(dropdownMenuCompany);
    }

    @Step
    public void clickOnDeleteMenuCompany() {
        actionsWithOurElements.clickOnElement(deleteMenuCompany);
    }

    @Step
    public void checkIsCompanyIsNotPresent() {
        Assert.assertTrue("Deleted Company is present", webDriver.getPageSource().contains("Hideez"));
    }

    @Step
    public void clickOnCreateCompanyButton() {
        actionsWithOurElements.clickOnElement(createCompanyButton);
    }

    @Step
    public void enterCompanyName(String employeePhone) {
        actionsWithOurElements.enterTextInInput(enterCompanyName, employeePhone);
    }

    @Step
    public void clickOnCreateButton() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public void checkIsCompanyNamePresent() {
        Assert.assertTrue("Added Company is not displayed", webDriver.getPageSource().contains("Hideez"));
    }

    @Step
    public void clickOnEditMenuCompany() {
        actionsWithOurElements.clickOnElement(editMenuCompany);
    }

    @Step
    public void clickOnSaveNameButton() {
        actionsWithOurElements.clickOnElement(saveName);
    }

    @Step
    public void checkIsEditedCompanyNamePresent() {
        Assert.assertTrue("Added Company is not displayed", webDriver.getPageSource().contains("1Hideez"));
    }

    @Step
    public void clickOnCreateDepartmentButton() {
        actionsWithOurElements.clickOnElement(createDepartmentButton);
    }

    @Step
    public void selectCompanyFromList() {
        actionsWithOurElements.clickOnElement(selectCompanyFromList);
    }

    @Step
    public void enterDepartmentNameInField(String departmentName) {
        actionsWithOurElements.enterTextInInput(enterDepartmentName, departmentName);
    }

    @Step
    public void checkIsDepartmentNamePresent() {
        Assert.assertTrue("Added Department is not displayed", webDriver.getPageSource().contains("PRManager"));
    }

    @Step
    public void clickOnEditMenuDepartment() {
        actionsWithOurElements.clickOnElement(editMenuDepartment);
    }

    @Step
    public void checkIsEditedDepartmentNamePresent() {
        Assert.assertTrue("Edited Department is not displayed", webDriver.getPageSource().contains("1PRManager"));
    }

}
