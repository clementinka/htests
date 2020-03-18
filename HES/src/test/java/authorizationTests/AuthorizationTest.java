package authorizationTests;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class AuthorizationTest extends AbstractParentTest {

    @Test
    public void checkAuthorizationOnDashboard() {
        loginPage.openURL("http://hesautotest.hideez.com/");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnEmployees() {
        loginPage.openURL("http://hesautotest.hideez.com/Employees");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstations() {
        loginPage.openURL("http://hesautotest.hideez.com/Workstations");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnGroups() {
        loginPage.openURL("http://hesautotest.hideez.com/Groups");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSharedAccounts() {
        loginPage.openURL("http://hesautotest.hideez.com/SharedAccounts");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnTemplates() {
        loginPage.openURL("http://hesautotest.hideez.com/Templates");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnDevices() {
        loginPage.openURL("http://hesautotest.hideez.com/Devices");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstationEvents() {
        loginPage.openURL("http://hesautotest.hideez.com/Audit/WorkstationEvents");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstationSessions() {
        loginPage.openURL("http://hesautotest.hideez.com/Audit/WorkstationSessions");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnWorkstationSummaries() {
        loginPage.openURL("http://hesautotest.hideez.com/Audit/WorkstationSummaries");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnLogs() {
        loginPage.openURL("http://hesautotest.hideez.com/logs");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsAdministrators() {
        loginPage.openURL("http://hesautotest.hideez.com/Settings/Administrators");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsDataProtection() {
        loginPage.openURL("http://hesautotest.hideez.com/Settings/DataProtection");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsDeviceAccessProfiles() {
        loginPage.openURL("http://hesautotest.hideez.com/Settings/DeviceAccessProfiles");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsOrgStructure() {
        loginPage.openURL("http://hesautotest.hideez.com/Settings/OrgStructure");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsPositions() {
        loginPage.openURL("http://hesautotest.hideez.com/Settings/Positions");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsLicenseOrders() {
        loginPage.openURL("http://hesautotest.hideez.com/Settings/LicenseOrders");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnSettingsParameters() {
        loginPage.openURL("http://hesautotest.hideez.com/Settings/Parameters");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnDashboardDeviceTasks() {
        loginPage.openURL("http://hesautotest.hideez.com/Dashboard/DeviceTasks");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnDevicesImport() {
        loginPage.openURL("http://hesautotest.hideez.com/Devices/Import");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnProfileProfile() {
        loginPage.openURL("http://hesautotest.hideez.com/Identity/Account/Manage");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnProfilePassword() {
        loginPage.openURL("http://hesautotest.hideez.com/Identity/Account/Manage/ChangePassword");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnProfileTwoFactorAuthentication() {
        loginPage.openURL("http://hesautotest.hideez.com/Identity/Account/Manage/TwoFactorAuthentication");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }

    @Test
    public void checkAuthorizationOnPersonalData() {
        loginPage.openURL("http://hesautotest.hideez.com/Identity/Account/Manage/PersonalData");
        checkExpectedResult("Page loaded without authorization", loginPage.isPageLoaded());
    }
}