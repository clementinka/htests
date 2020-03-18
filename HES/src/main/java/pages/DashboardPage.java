package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class DashboardPage extends ParentPage {

    @FindBy(xpath = ".//li[@class='breadcrumb-item active']")
    private WebElement dashboardAvatar;

    private String url = "http://hesautotest.hideez.com/";

    public LeftMenu leftMenu;

    @FindBy(xpath = ".//div[@class='card-col'][1]//div[@class='dashboard-card']")
    private WebElement hesDashboard;

    @FindBy(xpath = ".//div[@class='card-col'][1]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper border-right']//div[@class='dashboard-card-info__text font-weight-bold']")
    private WebElement hesVersion;

    @FindBy(xpath = ".//div[@class='card-col'][1]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__text']")
    private WebElement deviceTasks;

    @FindBy(xpath = ".//div[@class='card-col'][1]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__title']//a[@class='btn btn-outline-secondary']")
    private WebElement deviceTasksButton;

    @FindBy(xpath = ".//div[@class='card-col'][2]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper border-right']//div[@class='dashboard-card-info__text font-weight-bold']")
    private WebElement employees;

    @FindBy(xpath = ".//div[@class='dashboard-card-info__text font-weight-bold']")
    private WebElement numberRegistered;

    @FindBy(xpath = ".//div[@class='card-col'][2]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper border-right']//div[@class='dashboard-card-info__title']//a[@class='btn btn-outline-secondary']")
    private WebElement registeredButton;

    @FindBy(xpath = ".//div[@class='card-col'][2]//div[@class='dashboard-card']/div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__text']")
    private WebElement openedSessionsNumber;

    @FindBy(xpath = ".//div[@class='card-col'][2]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__title']//a[@class='btn btn-outline-secondary']")
    private WebElement openedSessionsButton;

    @FindBy(xpath = ".//div[@class='card-col'][3]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper border-right']//div[@class='dashboard-card-info__text font-weight-bold']")
    private WebElement numberOfRegisteredDevices;

    @FindBy(xpath = ".//div[@class='card-col'][3]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper border-right']//div[@class='dashboard-card-info__title']//a[@class='btn btn-outline-secondary']")
    private WebElement registeredDevicesButton;

    @FindBy(xpath = ".//div[@class='card-col'][3]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__text']")
    private WebElement inReserveDevices;

    @FindBy(xpath = ".//div[@class='card-col'][3]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__title']//a[@class='btn btn-outline-secondary']")
    private WebElement inReserveDevicesButton;

    @FindBy(xpath = ".//div[@class='card-col'][4]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper border-right']//div[@class='dashboard-card-info__text font-weight-bold']")
    private WebElement registeredWorkstationsNumber;

    @FindBy(xpath = ".//div[@class='card-col'][4]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper border-right']//div[@class='dashboard-card-info__title']//a[@class='btn btn-outline-secondary']")
    private WebElement registeredWorkstationsButton;

    @FindBy(xpath = ".//div[@class='card-col'][4]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__text']")
    private WebElement workstationsOnline;

    @FindBy(xpath = ".//div[@class='card-col'][4]//div[@class='dashboard-card']//div[@class='dashboard-card-body']//div[@class='dashboard-card-wrapper']//div[@class='dashboard-card-info__title']//a[@class='btn btn-outline-secondary']")
    private WebElement workstationsOnlineButton;

    @FindBy(xpath = ".//td[@class='dataTables_empty']")
    private WebElement noDataMessage;

    @FindBy(xpath = ".//div[@class='card-col'][1]//div[@class='dashboard-card']//div[@class='dashboard-card-notify-header']//div[@class='dashboard-card-list-wrapper']//div[@class='list-group list-group-horizontal-lines dashboard-card-list']//a[@class='list-group-item list-group-item-action d-flex justify-content-between align-items-center']")
    private WebElement longPendingTaskButton;

    @FindBy(xpath = ".//div[@class='card-col'][2]//div[@class='dashboard-card']//div[@class='dashboard-card-notify-header']//div[@class='dashboard-card-list-wrapper']//div[@class='list-group list-group-horizontal-lines dashboard-card-list']//a[@class='list-group-item list-group-item-action d-flex justify-content-between align-items-center']")
    private WebElement nonHideezUnlockButton;

    @FindBy(xpath = ".//*[contains(text(),'Low battery')]")
    private WebElement lowBatteryIndicatorButton;

    @FindBy(xpath = ".//*[contains(text(),'Device error')]")
    private WebElement deviceErrorIndicatorButton;

    @FindBy(xpath = ".//*[contains(text(),'License critical')]")
    private WebElement licenseCriticalButton;

    @FindBy(xpath = ".//*[contains(text(),'License expired')]")
    private WebElement licenseExpiredButton;

    @FindBy(xpath = ".//*[contains(text(),'Waiting for approval')]")
    private WebElement waitingForApprovalButton;

    public DashboardPage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    @Step
    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(dashboardAvatar);
    }

    @Step
    public void checkIsDashboardPagePresent() {
        Assert.assertTrue("DashboardPage is not displayed", isAvatarDisplayed());
    }

    @Step
    public void checkHesDisplayed() {
        actionsWithOurElements.isElementDisplayed(hesDashboard);
    }

    @Step
    public void checkHesVersionDisplayed() {
        actionsWithOurElements.isElementDisplayed(hesVersion);
    }

    @Step
    public void checkDeviceTasksDisplayed() {
        actionsWithOurElements.isElementDisplayed(deviceTasks);
    }

    @Step
    public void checkDeviceTasksButtonDisplayed() {
        actionsWithOurElements.isElementDisplayed(deviceTasksButton);
    }

    @Step
    public void clickDeviceTasksButton() {
        actionsWithOurElements.clickOnElement(deviceTasksButton);
    }

    @Step
    public void checkEmployeesDisplayed() {
        actionsWithOurElements.isElementDisplayed(employees);
    }

    @Step
    public void checkNumberRegisteredDisplayed() {
        actionsWithOurElements.isElementDisplayed(numberRegistered);
    }

    @Step
    public void checkRegistedButtonDisplayed() {
        actionsWithOurElements.isElementDisplayed(registeredButton);
    }

    @Step
    public void clickRegisteredButton() {
        actionsWithOurElements.clickOnElement(registeredButton);
    }

    @Step
    public void checkOpenedSessionsDisplayed() {
        actionsWithOurElements.isElementDisplayed(openedSessionsNumber);
    }

    @Step
    public void checkOpenedSessionsButtonDisplayed() {
        actionsWithOurElements.isElementDisplayed(openedSessionsButton);
    }

    @Step
    public void clickOpenedSessions() {
        actionsWithOurElements.clickOnElement(openedSessionsButton);
    }

    @Step
    public void checkRegisteredDevicesDisplayed() {
        actionsWithOurElements.isElementDisplayed(numberOfRegisteredDevices);
    }

    @Step
    public void checkRegisteredDevicesButtonDisplayed() {
        actionsWithOurElements.isElementDisplayed(registeredDevicesButton);
    }

    @Step
    public void clickRegisteredDevicesButton() {
        actionsWithOurElements.clickOnElement(registeredDevicesButton);
    }

    @Step
    public void checkInReserveDisplayed() {
        actionsWithOurElements.isElementDisplayed(inReserveDevices);
    }

    @Step
    public void checkInReserveButtonDisplayed() {
        actionsWithOurElements.isElementDisplayed(inReserveDevicesButton);
    }

    @Step
    public void clickInReserveButton() {
        actionsWithOurElements.clickOnElement(inReserveDevicesButton);
    }

    @Step
    public void checkRegisteredWorkstationsNumberDisplayed() {
        actionsWithOurElements.isElementDisplayed(registeredWorkstationsNumber);
    }

    @Step
    public void checkRegisteredWorkstationsButtonDisplayed() {
        actionsWithOurElements.isElementDisplayed(registeredWorkstationsButton);
    }

    @Step
    public void clickRegisteredWorkstationsButton() {
        actionsWithOurElements.clickOnElement(registeredWorkstationsButton);
    }

    @Step
    public void checkWorkstationsOnlineNumberDisplayed() {
        actionsWithOurElements.clickOnElement(workstationsOnline);
    }

    @Step
    public void checkWorkstationsOnlineButtonDisplayed() {
        actionsWithOurElements.isElementDisplayed(workstationsOnlineButton);
    }

    @Step
    public void clickWorkstationsOnlineButton() {
        actionsWithOurElements.clickOnElement(workstationsOnlineButton);
    }

    @Step
    public void openDeviceLongPendingTasksTable() {
        actionsWithOurElements.openLink(url+"Dashboard/DeviceTasks?handler=LongPending");
    }

    @Step
    public boolean checkIfLongPendingTasksNotAvailable() {
        if (actionsWithOurElements.isElementDisplayed(noDataMessage)) {
            actionsWithOurElements.openLink(url);
            return !actionsWithOurElements.isElementDisplayed(longPendingTaskButton);
        } else {
            actionsWithOurElements.openLink(url);
            return actionsWithOurElements.isElementDisplayed(longPendingTaskButton);
        }
    }

    public void openNonHideezUnlockTable() {
        actionsWithOurElements.openLink(url+"Audit/WorkstationSessions?handler=NonHideezUnlock");
    }

    public boolean checkIfNonHideezUnlockNotAvailable() {

        if (actionsWithOurElements.isElementDisplayed(noDataMessage)) {
            actionsWithOurElements.openLink(url);
            return !actionsWithOurElements.isElementDisplayed(nonHideezUnlockButton);
        } else {
            actionsWithOurElements.openLink(url);
            return actionsWithOurElements.isElementDisplayed(nonHideezUnlockButton);
        }
    }

    @Step
    public void openLowBatteryDevicesTable() {
        actionsWithOurElements.openLink(url+"Devices?handler=LowBattery");
    }

    @Step
    public boolean checkIfLowBatteryIndicatorIsTrue() {
        if (actionsWithOurElements.isElementDisplayed(noDataMessage)) {
            actionsWithOurElements.openLink(url);
            return !actionsWithOurElements.isElementDisplayed(lowBatteryIndicatorButton);
        } else {
            actionsWithOurElements.openLink(url);
            return actionsWithOurElements.isElementDisplayed(lowBatteryIndicatorButton);
        }
    }

    @Step
    public void openDeviceErrorTable() {
        actionsWithOurElements.openLink(url+"Devices?handler=DeviceError");
    }

    @Step
    public boolean checkIfDeviceErrorIndicatorIsTrue() {
        if (actionsWithOurElements.isElementDisplayed(noDataMessage)) {
            actionsWithOurElements.openLink(url);
            return !actionsWithOurElements.isElementDisplayed(deviceErrorIndicatorButton);
        } else {
            actionsWithOurElements.openLink(url);
            return actionsWithOurElements.isElementDisplayed(deviceErrorIndicatorButton);
        }
    }

    @Step
    public void openLicenseCriticalTable() {
        actionsWithOurElements.openLink(url+"Devices?handler=LicenseCritical");
    }

    @Step
    public boolean checkIfLicenseCriticalIndicatorIsTrue() {
        if (actionsWithOurElements.isElementDisplayed(noDataMessage)) {
            actionsWithOurElements.openLink(url);
            return !actionsWithOurElements.isElementDisplayed(licenseCriticalButton);
        } else {
            actionsWithOurElements.openLink(url);
            return actionsWithOurElements.isElementDisplayed(licenseCriticalButton);
        }
    }

    @Step
    public void openLicenseExpiredTable() {
        actionsWithOurElements.openLink(url+"Devices?handler=LicenseExpired");
    }

    @Step
    public boolean checkIfLicenseExpiredIndicatorIsTrue() {

        if (actionsWithOurElements.isElementDisplayed(noDataMessage)) {
            actionsWithOurElements.openLink(url);
            return !actionsWithOurElements.isElementDisplayed(licenseExpiredButton);
        } else {
            actionsWithOurElements.openLink(url);
            return actionsWithOurElements.isElementDisplayed(licenseExpiredButton);
        }
    }

    @Step
    public void openWaitingForApprovalTable() {
        actionsWithOurElements.openLink(url+"Workstations?handler=NotApproved");
    }

    @Step
    public boolean checkIfWaitingForApprovalIndicatorIsTrue() {

        if (actionsWithOurElements.isElementDisplayed(noDataMessage)) {
            actionsWithOurElements.openLink(url);
            return !actionsWithOurElements.isElementDisplayed(waitingForApprovalButton);
        } else {
            actionsWithOurElements.openLink(url);
            return actionsWithOurElements.isElementDisplayed(waitingForApprovalButton);
        }
    }
}
