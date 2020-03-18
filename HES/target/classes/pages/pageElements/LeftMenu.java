package pages.pageElements;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Link;

@FindBy(xpath = ".//*[@class='navigation-menu__body']")

public class LeftMenu extends CommonActionWithElements {

    @FindBy(xpath = ".//img[@class='icon-dashboard i-sidebar']")
    private Link menuDashboard;

    @FindBy(xpath = ".//img[@class='icon-employees i-sidebar']")
    private WebElement menuEmployees;

    @FindBy(xpath = ".//img[@class='icon-computers i-sidebar']")
    private Link menuWorkstations;

    @FindBy(xpath = ".//img[@class='icon-shared-accounts i-sidebar']")
    private Link menuSharedAccounts;

    @FindBy(xpath = ".//img[@class='icon-templates i-sidebar']")
    private Link menuTemplates;

    @FindBy(xpath = ".//img[@class='icon-devices i-sidebar']")
    private Link menuDevices;

    @FindBy(xpath = ".//img[@class='icon-audit i-sidebar']")
    private Link menuAudit;

    @FindBy(xpath = ".//ul[@class='nav nav-pills flex-column expand-pills']//li[@class='nav-item'][1]//a[@class='nav-link']")
    private Link subMenuEvents;

    @FindBy(xpath = ".//a[@href='/Audit/WorkstationSessions']")
    private Link subMenuSessions;

    @FindBy(xpath = ".//a[@href='/Audit/WorkstationSummaries']")
    private Link subMenuSummaries;

    @FindBy(xpath = ".//img[@class='icon-settings i-sidebar']")
    private Link menuSettings;

    @FindBy(xpath = ".//a[@href='/Settings/Administrators']")
    private Link subMenuAdministrators;

    @FindBy(xpath = ".//a[@href='/Settings/DeviceAccessProfiles']")
    private Link subMenuDevAccessProfiles;

    @FindBy(xpath = ".//ul[@class='nav nav-pills flex-column expand-pills']//li[@class='nav-item'][4]//a[@class='nav-link']")
    private Link subMenuOrgStructure;

    @FindBy(xpath = ".//a[@href='/Settings/Positions']")
    private Link subMenuPositions;

    @FindBy(xpath = ".//a[@href='/Settings/DataProtection']")
    private Link subMenuDataProtection;

    @FindBy(xpath = ".//a[@href='/Groups']")
    private WebElement menuGroups;

    public void clickOnMenuDashboard() {
        actionsWithOurElements.clickOnElement(menuDashboard);
    }

    public void clickOnMenuEmployees() {
        actionsWithOurElements.clickOnElement(menuEmployees);
    }

    public void clickOnMenuWorkstations() {
        actionsWithOurElements.clickOnElement(menuWorkstations);
    }

    public void clickOnMenuSharedAccounts() {
        actionsWithOurElements.clickOnElement(menuSharedAccounts);
    }

    public void clickOnMenuTemplates() {
        actionsWithOurElements.clickOnElement(menuTemplates);
    }

    public void clickOnMenuDevices() {
        actionsWithOurElements.clickOnElement(menuDevices);
    }

    public void clickOnMenuAudit() {
        actionsWithOurElements.clickOnElement(menuAudit);
    }

    public void clickOnSubMenuEvents() {
        actionsWithOurElements.clickOnElement(subMenuEvents);
    }

    public void clickOnSubMenuSessions() {
        actionsWithOurElements.clickOnElement(subMenuSessions);
    }

    public void clickOnSubMenuSummaries() {
        actionsWithOurElements.clickOnElement(subMenuSummaries);
    }

    @Step
    public void clickOnMenuSettings() {
        actionsWithOurElements.clickOnElement(menuSettings);
    }

    public void clickOnSubMenuAdministrators() {
        actionsWithOurElements.clickOnElement(subMenuAdministrators);
    }

    public void clickOnSubMenuDevAccessProfiles() {
        actionsWithOurElements.clickOnElement(subMenuDevAccessProfiles);
    }

    public void clickOnSubMenuOrgStructure() {
        actionsWithOurElements.clickOnElement(subMenuOrgStructure);
    }

    public void clickOnSubMenuPositions() {
        actionsWithOurElements.clickOnElement(subMenuPositions);
    }

    @Step
    public void clickOnSubMenuDataProtection() {
        actionsWithOurElements.clickOnElement(subMenuDataProtection);
    }

    public void clickOnMenuGroups() {
        actionsWithOurElements.clickOnElement(menuGroups);
    }
}
