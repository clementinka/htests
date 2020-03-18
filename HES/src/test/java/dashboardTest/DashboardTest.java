package dashboardTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class DashboardTest extends AbstractParentTest {
    @Before
    public void dashboardPrecondition() {

        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.checkIsDashboardPagePresent();
    }

    @Test
    public void hesMainIndicators() {

        dashboardPage.checkHesDisplayed();
        dashboardPage.checkHesVersionDisplayed();
        dashboardPage.checkDeviceTasksDisplayed();
        dashboardPage.checkDeviceTasksButtonDisplayed();
        dashboardPage.clickDeviceTasksButton();
        checkExpectedResult("Can't open device tasks", deviceTasksPage.checkPageOpened());
    }

    @Test
    public void hesLongPendingTasksAvailability() {

        dashboardPage.openDeviceLongPendingTasksTable();
        checkExpectedResult("The indicator and table are different", dashboardPage.checkIfLongPendingTasksNotAvailable());
    }

    @Test
    public void employeesMainIndicators() {

        dashboardPage.checkEmployeesDisplayed();
        dashboardPage.checkNumberRegisteredDisplayed();
        dashboardPage.checkRegistedButtonDisplayed();
        dashboardPage.clickRegisteredButton();
        checkExpectedResult("Can't open emloyees table", employeesPage.checkPageOpened());
        employeesPage.clickBack();
        dashboardPage.checkCurrentUrl();

        dashboardPage.checkOpenedSessionsDisplayed();
        dashboardPage.checkOpenedSessionsButtonDisplayed();
        dashboardPage.clickOpenedSessions();
        checkExpectedResult("Can't open workstations sessions", workstationSessionsPage.checkPageOpened());
        workstationSessionsPage.clickBack();
        dashboardPage.checkCurrentUrl();
    }

    @Test
    public void nonHideezUnlockIndicator() {
        dashboardPage.openNonHideezUnlockTable();
        checkExpectedResult("The indicator and table are different", dashboardPage.checkIfNonHideezUnlockNotAvailable());
    }

    @Test
    public void devicesMainIndicators() {

        dashboardPage.checkRegisteredDevicesDisplayed();
        dashboardPage.checkRegisteredDevicesButtonDisplayed();
        dashboardPage.clickRegisteredDevicesButton();
        checkExpectedResult("Can't open devices page ", devicesPage.checkPageOpened());
        devicesPage.clickBack();
        dashboardPage.checkCurrentUrl();

        dashboardPage.checkInReserveDisplayed();
        dashboardPage.checkInReserveButtonDisplayed();
        dashboardPage.clickInReserveButton();
        checkExpectedResult("Can't open devices in reserve table", devicesPage.checkInReserveDevicesOpened());
        devicesPage.clickBack();
        dashboardPage.checkCurrentUrl();
    }

    @Test
    public void lowBatteryIndicator(){
        dashboardPage.openLowBatteryDevicesTable();
        checkExpectedResult("The indicator and table are different", dashboardPage.checkIfLowBatteryIndicatorIsTrue());
    }

    @Test
    public void deviceError() {
        dashboardPage.openDeviceErrorTable();
        checkExpectedResult("The indicator and table are different", dashboardPage.checkIfDeviceErrorIndicatorIsTrue());
    }


    @Test
    public void licenseCritical() {
        dashboardPage.openLicenseCriticalTable();
        checkExpectedResult("The indicator and table are different", dashboardPage.checkIfLicenseCriticalIndicatorIsTrue());
    }

    @Test
    public void licenseExpired() {
        dashboardPage.openLicenseExpiredTable();
        checkExpectedResult("The indicator and table are different", dashboardPage.checkIfLicenseExpiredIndicatorIsTrue());
    }




    @Test
    public void workstationsMainIndicators() {

        dashboardPage.checkRegisteredWorkstationsNumberDisplayed();
        dashboardPage.checkRegisteredWorkstationsButtonDisplayed();
        dashboardPage.clickRegisteredWorkstationsButton();
        checkExpectedResult("Can't open workstations page", workstationsPage.checkWorkstationsPageLoaded());
        workstationsPage.clickBack();
        dashboardPage.checkCurrentUrl();

        dashboardPage.checkWorkstationsOnlineNumberDisplayed();
        dashboardPage.checkWorkstationsOnlineButtonDisplayed();
        dashboardPage.clickWorkstationsOnlineButton();
        checkExpectedResult("Can't open online workstations page", workstationsPage.checkWorkstationsOnlinePageLoaded());
        workstationsPage.clickBack();
        dashboardPage.checkCurrentUrl();
    }


    @Test
    public void waitingForApproval() {
        dashboardPage.openWaitingForApprovalTable();
        checkExpectedResult("The indicator and table are different", dashboardPage.checkIfWaitingForApprovalIndicatorIsTrue());
    }
}