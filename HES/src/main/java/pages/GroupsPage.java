package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class GroupsPage extends ParentPage {

    @FindBy(xpath = ".//div[@class='d-flex justify-content-between align-items-center mb-2']//div//button[@class='btn btn-primary'][1]")
    private WebElement addFromActiveDirectory;

    @FindBy(xpath = ".//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-header']")
    private WebElement addFromADWindow;

    @FindBy(xpath = ".//div[@class='modal-content']//div[@class='modal-body']//form/div[@class='form-group text-right mb-0']//button[@class='btn btn-secondary']")
    private WebElement cancelButton;

    @FindBy(xpath = ".//div[@class='modal-content']//div[@class='modal-body']//form//div[@class='form-group text-right mb-0']//button[@class='btn btn-primary button-min-width']")
    private WebElement connectButton;

    @FindBy(xpath = ".//form//div[@class='form-group'][1]//div[@class='validation-message']")
    private WebElement validationMessage;

    @FindBy(xpath = ".//form//div[@class='form-group'][1]//input[@id='userName']")
    private WebElement loginField;

    @FindBy(xpath = ".//form//div[@class='form-group'][2]//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//table[@class='table table-fixed table-hover border rounded mb-0 disable-selection']//thead//tr[@class='cursor-pointer']//th[@class='col-11']")
    private WebElement tableGroups;

    @FindBy(xpath = ".//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-body']//div[@class='table-responsive mb-3']//table[@class='table table-fixed table-hover border rounded mb-0 disable-selection']//tbody//tr[1]//td[@class='col-11']")
    private WebElement firstItemCheckBox;

    @FindBy(xpath = ".//div[@class='text-right']//button[@class='btn btn-primary button-min-width']")
    private WebElement addButton;

    @FindBy(xpath = ".//div[@class='modal-body']//div[@class='alert alert-warning d-flex']")
    private WebElement warningMessage;

    @FindBy(xpath = ".//div[@class='d-flex justify-content-between align-items-center mb-2']//div/button[@class='btn btn-primary'][2]")
    private WebElement createGroupButton;

    @FindBy(xpath = ".//div[@id='genericModalDialog']//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-header']")
    private WebElement createGroupWindow;

    @FindBy(xpath = ".//html//body//div//div[2]//div//div[5]//div//input")
    private WebElement searchBox;

    @FindBy(xpath = ".//div[@class='custom-content p-4']//div[@class='table-responsive mb-3']//table[@id='groups']//tbody/tr[@class='table-row ']//td[1]")
    private WebElement firstGroupInList;

    @FindBy(xpath = ".//div[@class='d-flex justify-content-end align-items-center mb-3']//button[@class='btn btn-light m-1 p-1'][3]")
    private WebElement deleteGroupButton;

    @FindBy(xpath = ".//div[@class='form-group text-right mb-0']//button[@class='btn btn-danger']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//div[@id='genericModalDialog']//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']/div[@class='modal-body']//div[@class='has-search-right my-2']//input[@class='form-control']")
    private WebElement searchBoxInWindow;

    @FindBy(xpath = ".//div[@id='genericModalDialog']//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']/div[@class='modal-body']//div[@class='has-search-right my-2']//div[@class='form-control-feedback']")
    private WebElement findButton;

    @FindBy(xpath = ".//html//body[@class='modal-open']//div[@class='d-flex']//div[@class='d-flex flex-column custom-main']//div[@class='custom-content p-4']//div[@id='genericModalDialog']//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-body']/div[@class='table-responsive mb-3']//table[@class='table table-fixed table-hover border rounded mb-0 disable-selection']//tbody//tr//td[@class='col-11']")
    private WebElement firstElementAfterSearch;

    @FindBy(xpath = ".//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-body']//form//div[@class='form-group'][1]//input[@id='apiKey']")
    private WebElement groupNameField;

    @FindBy(xpath = ".//div[@id='genericModalDialog']//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-body']//form//div[@class='form-group'][2]//input[@id='apiKey']")
    private WebElement groupEmailField;

    @FindBy(xpath = ".//div[@id='genericModalDialog']//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-body']//form//div[@class='form-group'][3]//textarea[@id='apiKey']")
    private WebElement groupDescriptionField;

    @FindBy(xpath = ".//div[@id='genericModalDialog']//div[@class='modal-dialog modal-dialog-scrollable modal-dialog-centered ']//div[@class='modal-content']//div[@class='modal-body']//form//div[@class='form-group text-right mb-0']//input[@class='btn btn-primary']")
    private WebElement createButton;

    @FindBy(xpath = ".//form//div[@class='form-group'][1]//div[@class='validation-message']")
    private WebElement warningMessageForGroupWithTheSameName;

    @FindBy(xpath = ".//table[@class='table table-fixed table-hover border rounded mb-0 disable-selection']//thead//tr[@class='cursor-pointer']//th[@class='col-1']//div[@class='custom-control custom-checkbox']")
    private WebElement allItemsCheckBox;

    @FindBy(xpath = ".//table[@id='groups']//tbody//tr[@class='table-row ']//td[3]")
    private WebElement employeesNum;

    @FindBy(xpath = ".//div[@class='modal-content']//div[@class='modal-body']//div[@class='mb-2 mx-2 custom-control custom-checkbox']//label[@class='custom-control-label disable-selection']")
    private WebElement checkBoxForCreateEmployee;

    @FindBy(xpath = ".//div[@class='d-flex justify-content-end align-items-center mb-3']//button[@class='btn btn-light m-1 p-1'][1]")
    private WebElement eyeButton;

    @FindBy(xpath = ".//div[@class='modal-content']//div[@class='modal-body']//div[@class='text-right']//button[@class='btn btn-secondary button-min-width']")
    private WebElement cancelAddingGroupFromADButton;

    public GroupsPage(WebDriver webDriver) {
        super(webDriver, "/Groups");
    }

    @Step
    public void clickAddFromADButton() {
        actionsWithOurElements.clickOnElement(addFromActiveDirectory);
    }

    @Step
    public boolean isWindowOpened() {
        return actionsWithOurElements.isElementDisplayed(addFromADWindow);
    }

    @Step
    public void clickOnCancelButton() {
        actionsWithOurElements.clickOnElement(cancelButton);
    }

    @Step
    public void clickConnectButton() {
        actionsWithOurElements.clickOnElement(connectButton);
    }

    @Step
    public boolean ifNotificationDisplayed() {
        return actionsWithOurElements.isElementDisplayed(validationMessage);
    }

    @Step
    public void enterLogin() {
        actionsWithOurElements.enterTextInInput(loginField, "Administrator");
    }

    @Step
    public void enterPassword() {
        actionsWithOurElements.enterTextInInput(passwordField, "1234567aA");
    }

    @Step
    public boolean isListLoaded() {
        return actionsWithOurElements.isElementDisplayed(tableGroups);
    }

    @Step
    public void checkFirstItem() {
        actionsWithOurElements.clickOnElement(firstItemCheckBox);
    }

    @Step
    public void uncheckFirstItem() {
        actionsWithOurElements.clickOnElement(firstItemCheckBox);
    }

    @Step
    public boolean ifElementUnchecked() {
        return actionsWithOurElements.isElementDisplayed(warningMessage);
    }

    @Step
    public void clickAddButton() {
        actionsWithOurElements.clickOnElement(addButton);
    }

    @Step
    public void clickCreateGroupButton() {
        actionsWithOurElements.clickOnElement(createGroupButton);
    }

    @Step
    public void clickCancelButton() {
        actionsWithOurElements.clickOnElement(cancelButton);
    }

    @Step
    public boolean ifCreateGroupWindowClosed() {
        return !(actionsWithOurElements.isElementDisplayed(createGroupWindow));
    }

    @Step
    public void searchInTableGroup(String groupNameForSearch) {
        String lastElementInList;
        lastElementInList = ".//table[@id='groups']//tbody//tr[@class='table-row '][10]//td[1]";
        actionsWithOurElements.clickOnElement(searchBox);
        actionsWithOurElements.enterTextInInput(searchBox, groupNameForSearch);
        actionsWithOurElements.waitUntilElementIsNotDisplayed(lastElementInList);
    }

    @Step
    public void clickOnFirstGroup() {
        actionsWithOurElements.clickOnElement(firstGroupInList);
    }

    @Step
    public void clickDeleteGroupButton() {
        actionsWithOurElements.clickOnElement(deleteGroupButton);
    }

    @Step
    public void clickDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    @Step
    public void searchDeletedGroup(String groupForSearch) {
        actionsWithOurElements.enterTextInInput(searchBoxInWindow, groupForSearch);
        actionsWithOurElements.clickOnElement(findButton);
    }

    @Step
    public boolean ifNewGroupExist() {
        return actionsWithOurElements.isElementDisplayed(firstGroupInList);
    }

    @Step
    public void checkFirstItemAfterSearch() {
        actionsWithOurElements.setStateToCheckBox(firstElementAfterSearch, "check");
    }

    @Step
    public void enterGroupName(String groupName) {
        actionsWithOurElements.enterTextInInput(groupNameField, groupName);
    }

    @Step
    public void enterGroupEmail(String groupEmail) {
        actionsWithOurElements.enterTextInInput(groupEmailField, groupEmail);
    }

    @Step
    public void enterGroupDescription(String groupDescription) {
        actionsWithOurElements.enterTextInInput(groupDescriptionField, groupDescription);
    }

    @Step
    public void clickCreateButton() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public boolean ifWarningMessageAppeared() {
        return actionsWithOurElements.isElementDisplayed(warningMessageForGroupWithTheSameName);
    }

    @Step
    public boolean ifGroupNameDisplayed(String groupName) {
        return actionsWithOurElements.isElementDisplayed(webDriver.findElement(By.xpath(".//*[text()[contains(.,'"+groupName+"')]]")));
    }

    @Step
    public boolean ifGroupEmailDisplayed(String groupEmail) {
        return actionsWithOurElements.isElementDisplayed(webDriver.findElement(By.xpath(".//*[text()[contains(.,'"+groupEmail+"')]]")));
    }

    @Step
    public boolean ifGroupDescriptionDisplayed(String groupDescription) {
        return actionsWithOurElements.isElementDisplayed(webDriver.findElement(By.xpath(".//*[contains(@title,'"+groupDescription+"')]")));
    }

    @Step
    public void checkAllItems() {
        actionsWithOurElements.clickOnElement(allItemsCheckBox);
    }

    @Step
    public boolean ifWindowClosed() {
        return !actionsWithOurElements.isElementDisplayed(addFromADWindow);
    }

    @Step
    public boolean checkIfNumberOfEmployeesIsNull() {
        String employeesNumber;

        employeesNumber = actionsWithOurElements.getElementValue(employeesNum);

        if (employeesNumber.equals("0")) {
            return true;
        } else {
            return false;
        }
    }

    @Step
    public void checkCreateEmployees() {
        actionsWithOurElements.clickOnElement(checkBoxForCreateEmployee);
    }

    @Step
    public boolean checkIfNumberOfEmployeesIsNotNull() {
        String employeesNumber;

        employeesNumber = actionsWithOurElements.getElementValue(employeesNum);

        if (employeesNumber.equals("0")) {
            return false;
        } else {
            return true;
        }
    }

    @Step
    public void clickOnEyeButton() {
        actionsWithOurElements.clickOnElement(eyeButton);
    }

    @Step
    public void previouslyDeleteTheGroupIfAvailable(String groupName) {
        searchInTableGroup(groupName);
        if (actionsWithOurElements.isElementDisplayed(firstGroupInList)) {

            clickOnFirstGroup();
            clickDeleteGroupButton();
            clickDeleteButton();
        } else {
            actionsWithOurElements.isElementDisplayed(createGroupButton);
        }
    }

    @Step
    public void clickCancelAddingGroupFromADButton() {
        actionsWithOurElements.clickOnElement(cancelAddingGroupFromADButton);
    }

    @Step
    public void doubleClickOnFirstGroup() {
        Actions action = new Actions(webDriver);
        action.moveToElement(webDriver.findElement(By.xpath(".//div[@class='custom-content p-4']//div[@class='table-responsive mb-3']//table[@id='groups']//tbody/tr[@class='table-row ']//td[1]"))).doubleClick().build().perform();
    }
}
