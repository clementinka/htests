package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class GroupsDetailsPage extends ParentPage {

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement addEmployeeButton;

    @FindBy(xpath = ".//div[@class='modal-content']//div[@class='modal-header']")
    private WebElement popUpWindow;

    @FindBy(xpath = ".//div[@class='modal-body']//div[@class='form-group text-right mb-0']//button[@class='btn btn-primary']")
    private WebElement addButton;

    @FindBy(xpath = ".//div[@class='d-flex justify-content-between align-items-center details-card mb-2']//h1[@class='text-navyblue m-0 pl-3']")
    private WebElement groupName;

    @FindBy(xpath = ".//div[@class='pl-3'][1]//span[@class='font-weight-bold']")
    private WebElement groupEmail;

    @FindBy(xpath = ".//div[@class='pl-3'][2]//span[@class='font-weight-bold']")
    private WebElement groupDescription;

    @FindBy(xpath = ".//table[@id='groups']//tbody//tr//td[1]")
    private WebElement firstEmployee;

    @FindBy(xpath = ".//nav[@id='breadcrumb']//ol[@class='breadcrumb']//li[@class='breadcrumb-item']//a")
    private WebElement groupsButton;

    @FindBy(xpath = ".//table[@id='groups']//tbody//tr[2]//td[1]")
    private WebElement secondEmployee;

    @FindBy(xpath = ".//button[@class='btn btn-secondary']")
    private WebElement canceAddingEmployeeButton;

    @FindBy(xpath = ".//table[@id='employees']//tbody//tr[1]//td[@class='table-checkbox-column']//div[@class='custom-control custom-checkbox']")
    private WebElement firstEmployeeCheckBox;

    @FindBy(xpath = ".//table[@id='employees']//tbody//tr[2]//td[@class='table-checkbox-column']//div[@class='custom-control custom-checkbox']")
    private WebElement secondEmployeeCheckBox;

    @FindBy(xpath = ".//table[@id='employees']//tbody//tr[3]//td[@class='table-checkbox-column']//div[@class='custom-control custom-checkbox']")
    private WebElement thirdEmployeeCheckBox;

    public GroupsDetailsPage(WebDriver webDriver) {
        super(webDriver, "/Details");
    }


    @Step
    public void clickAddEmployeeButton() {
        actionsWithOurElements.clickOnElement(addEmployeeButton);
    }

    @Step
    public boolean ifPopUpWindowOpened() {
        return actionsWithOurElements.isElementDisplayed(popUpWindow);
    }


    @Step
    public void checkSpecifiedEmployee(String employeeName) {
        actionsWithOurElements.clickOnElement(webDriver.findElement(By.xpath(".//td[contains(.,'Alexandr Hamilton')]")));
    }

    @Step
    public void clickAdd() {
        actionsWithOurElements.clickOnElement(addButton);
    }


    @Step
    public boolean ifEmployeeAvailableInList(String employeeName) {
        return actionsWithOurElements.isElementDisplayed(webDriver.findElement(By.xpath(".//td[contains(.,'Alexandr Hamilton')]")));
    }

    @Step
    public boolean ifDetailsAreVisible() {

        return (actionsWithOurElements.isElementDisplayed(groupName))&&
                (actionsWithOurElements.isElementDisplayed(groupEmail))&&
                (actionsWithOurElements.isElementDisplayed(groupDescription));
    }

    @Step
    public boolean checkNumberOfEmployeesIsNull() {
        return !(actionsWithOurElements.isElementDisplayed(firstEmployee));
    }

    @Step
    public void clickBackToGroupsPage() {
        actionsWithOurElements.clickOnElement(groupsButton);
    }

    @Step
    public boolean checkNumberOfEmployeesIsNotNull() {
        return (actionsWithOurElements.isElementDisplayed(firstEmployee))&&(!(actionsWithOurElements.isElementDisplayed(secondEmployee)));
    }

    @Step
    public void clickCancelAddingEmployee() {
        actionsWithOurElements.clickOnElement(canceAddingEmployeeButton);
    }

    @Step
    public boolean ifPopUpWindowClosed() {
        return !(actionsWithOurElements.isElementDisplayed(popUpWindow));
    }

    @Step
    public void checkFirstThreeEmployees() {
        actionsWithOurElements.setStateToCheckBox(firstEmployeeCheckBox,"check");
        actionsWithOurElements.setStateToCheckBox(secondEmployeeCheckBox, "check");
        actionsWithOurElements.setStateToCheckBox(thirdEmployeeCheckBox, "check");
    }

    @Step
    public boolean checkThatFirstThreeEmployeesUnchecked() {
        try {
            actionsWithOurElements.setStateToCheckBox(firstEmployeeCheckBox,"check");
            actionsWithOurElements.setStateToCheckBox(secondEmployeeCheckBox, "check");
            actionsWithOurElements.setStateToCheckBox(thirdEmployeeCheckBox, "check");
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
