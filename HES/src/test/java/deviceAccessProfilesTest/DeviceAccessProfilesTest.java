package deviceAccessProfilesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeviceAccessProfilesTest extends AbstractParentTest {

    @Before
    public void preconditions() {

        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");
        dashboardPage.leftMenu.clickOnMenuSettings();
        dashboardPage.leftMenu.clickOnSubMenuDevAccessProfiles();
        deviceAccessProfilesPage.checkIsDeviceAccessProfilesPagePresent();
    }

    @Test
    public void createDeviceProfile() {

        deviceAccessProfilesPage.checkIsDeviceAccessProfilesPagePresent();
        deviceAccessProfilesPage.clickOnCreateProfilesButton();
        deviceAccessProfilesPage.enterDeviceProfileName("Simple profile");
        deviceAccessProfilesPage.clickOnButtonBondingCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonNewChannelCheckbox("check");
        deviceAccessProfilesPage.clickOnPinBondingCheckbox("check");
        deviceAccessProfilesPage.clickOnPinConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnPinNewChannelCheckbox("check");
        deviceAccessProfilesPage.clickOnServerConfirmConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnCreateButton();
        checkExpectedResult("Created DeviceProfile is not displayed",
                deviceAccessProfilesPage.ifProfilePresent("Simple profile"));
        deviceAccessProfilesPage.deleteCreatedProfile("Simple profile");

    }

    @Test
    public void editDeviceProfileName() {
        deviceAccessProfilesPage.createEmptyDeviceProfile("Simple profile");
        deviceAccessProfilesPage.filterByNewProfile("Simple profile");
        deviceAccessProfilesPage.clickOnDropdownMenu();
        deviceAccessProfilesPage.clickOnMenuEdit();
        deviceAccessProfilesPage.changeProfileName("Simple profile changed");
        deviceAccessProfilesPage.clickOnSaveButton();
        checkExpectedResult("Can't change device profile name",
                deviceAccessProfilesPage.ifProfilePresent("Simple profile changed"));
        deviceAccessProfilesPage.deleteCreatedProfile("Simple profile changed");
    }

    @Test
    public void editDeviceProfileSettings() {
        deviceAccessProfilesPage.createEmptyDeviceProfile("Simple profile");
        deviceAccessProfilesPage.filterByNewProfile("Simple profile");
        deviceAccessProfilesPage.clickOnDropdownMenu();
        deviceAccessProfilesPage.clickOnMenuEdit();
        deviceAccessProfilesPage.clickOnButtonBondingCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonConnectionCheckbox("check");
        deviceAccessProfilesPage.clickOnButtonNewChannelCheckbox("check");
        deviceAccessProfilesPage.clickOnSaveButton();
        deviceAccessProfilesPage.searchProfile("Simple profile");
        deviceAccessProfilesPage.openProfile();
        checkExpectedResult("Can't check Button states",
                deviceAccessProfilesPage.checkButtonStatesForProfile());
        deviceAccessProfilesPage.clickClose();
        deviceAccessProfilesPage.deleteCreatedProfile("Simple profile");
    }

    @Test
    public void deleteDeviceProfile() {
        deviceAccessProfilesPage.createEmptyDeviceProfile("Simple profile");
        deviceAccessProfilesPage.filterByNewProfile("Simple profile");
        deviceAccessProfilesPage.clickOnDropdownMenu();
        deviceAccessProfilesPage.clickOnMenuDelete();
        deviceAccessProfilesPage.clickOnDeleteButton();
        deviceAccessProfilesPage.searchProfile("Simple profile");
        checkExpectedResult("Can't delete the profile", deviceAccessProfilesPage.checkProfileDeleted());
    }

    @Test
    public void setProfileOnDevice() {
        deviceAccessProfilesPage.createEmptyDeviceProfile("Simple profile");
        deviceAccessProfilesPage.leftMenu.clickOnMenuDevices();
        devicesPage.searchSpecifiedDevice("ST10202190710000");
        devicesPage.clickOnDeviceCheckbox();
        devicesPage.clickOnSetProfileButton();
        devicesPage.clickOnProfileCheckbox("check");
        devicesPage.clickOnSetButton();
        devicesPage.searchSpecifiedDevice("ST10202190710000");
        devicesPage.clickOnOpenButton();
        checkExpectedResult("Can't set new profile for device", devicesPage.isNewProfilePresent());
        devicesPage.clickOnCloseButton();
        devicesPage.setDefaultProfileOnDevice();
        devicesPage.leftMenu.clickOnMenuSettings();
        devicesPage.leftMenu.clickOnSubMenuDevAccessProfiles();
        deviceAccessProfilesPage.deleteCreatedProfile("Simple profile");
    }

    @Test
    public void deleteProfileWhenSettedOnDevice() {
        deviceAccessProfilesPage.createEmptyDeviceProfile("Simple profile");
        deviceAccessProfilesPage.leftMenu.clickOnMenuDevices();
        devicesPage.searchSpecifiedDevice("ST10202190710000");
        devicesPage.clickOnDeviceCheckbox();
        devicesPage.clickOnSetProfileButton();
        devicesPage.clickOnProfileCheckbox("check");
        devicesPage.clickOnSetButton();
        devicesPage.leftMenu.clickOnMenuSettings();
        devicesPage.leftMenu.clickOnSubMenuDevAccessProfiles();
        deviceAccessProfilesPage.deleteCreatedProfilee("Simple profile");
        checkExpectedResult("Can delete profile when setted on device", deviceAccessProfilesPage.isAlertDisplayed());
        deviceAccessProfilesPage.clickClose();
        deviceAccessProfilesPage.leftMenu.clickOnMenuDevices();
        devicesPage.searchSpecifiedDevice("ST10202190710000");
        devicesPage.setDefaultProfileOnDevice();
        devicesPage.leftMenu.clickOnMenuSettings();
        devicesPage.leftMenu.clickOnSubMenuDevAccessProfiles();
        deviceAccessProfilesPage.deleteCreatedProfile("Simple profile");
    }
}