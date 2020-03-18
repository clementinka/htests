package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SummariesPage extends ParentPage {
    @FindBy(xpath = ".//li[@class='nav-item'][2]//a[@id='by-employees']")
    private WebElement employeesTab;
    @FindBy(xpath = ".//table[@id='sessionsSummary']//thead//tr//th[@class='sorting'][1]")
    private WebElement firstColumnName;
    @FindBy(xpath = ".//li[@class='nav-item'][3]//a[@id='by-departments']")
    private WebElement departmentsTab;
    @FindBy (xpath = ".//li[@class='nav-item'][4]//a[@id='by-workstations']")
    private WebElement workstationsTab;

    public SummariesPage(WebDriver webDriver) {
        super(webDriver, "/Audit/WorkstationSummaries");
    }

    @Step
    public void clickOnByEmployeesTab() {
        actionsWithOurElements.clickOnElement(employeesTab);
    }

    @Step
    public boolean ifEmployeesTabOpened() {
        return actionsWithOurElements.compareValues("Employee",actionsWithOurElements.getElementValue(firstColumnName));
    }

    @Step
    public boolean ifDaysAndEmployeesTabOpened() {
        return actionsWithOurElements.compareValues("Date",actionsWithOurElements.getElementValue(firstColumnName));
    }

    @Step
    public void clickOnByDepartmentsTab() {
        actionsWithOurElements.clickOnElement(departmentsTab);
    }

    @Step
    public boolean ifDepartmentsTabOpened() {
        return actionsWithOurElements.compareValues("Company",actionsWithOurElements.getElementValue(firstColumnName));
    }

    @Step
    public void clickOnByWorkstationsTab() {
        actionsWithOurElements.clickOnElement(workstationsTab);
    }

    @Step
    public boolean ifWorkstationsTabOpened() {
        return actionsWithOurElements.compareValues("Workstation",actionsWithOurElements.getElementValue(firstColumnName));
    }
}
