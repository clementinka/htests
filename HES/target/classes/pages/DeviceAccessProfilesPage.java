
package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class DeviceAccessProfilesPage extends ParentPage {

    @FindBy(xpath = ".//*[@data-title = 'Create profile']")
    private WebElement createProfilesButton;

    @FindBy(xpath = ".//*[@id = 'DeviceAccessProfile_Name']")
    private WebElement profileName;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the device button confirmation for connecting the device to the computer for the first time.']")
    private WebElement buttonBondingCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the device button confirmation for connecting the device to the computer that is already bonded with the computer. ']")
    private WebElement buttonConnectionCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the device button confirmation when an application is getting access to the device’s storage.']")
    private WebElement buttonNewChannelCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the PIN-code for connecting the device to the computer for the first time.']")
    private WebElement pinBondingCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the PIN-code for connecting the device to the computer that is already bonded with the computer.']")
    private WebElement pinConnectionCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Request the PIN-code when an application is getting access to the device’s storage.']")
    private WebElement pinNewChannelCheckbox;

    @FindBy(xpath = ".//td[@class='text-center']//div[@title='Require the server confirmation for connecting the device to the computer that is already bonded with the computer.']")
    private WebElement serverConfirmConnectionCheckbox;

    @FindBy(xpath = ".//input[@value='Create']")
    private WebElement createButton;

    @FindBy(xpath = ".//tbody//tr[@class='row-dblclick odd']//td[6]")
    private WebElement dropdownMenu;

    @FindBy(xpath = ".//a[@class='dropdown-item open-modal-dialog'][1]")
    private WebElement menuEdit;

    @FindBy(xpath = ".//input[@value='Save']")
    private WebElement saveButton;

    @FindBy(xpath = ".//div[@class='dropdown-menu dropdown-menu-right shadow show']//a[@class='dropdown-item open-modal-dialog'][2]")
    private WebElement menuDelete;

    @FindBy(xpath = ".//input[@value='Delete']")
    private WebElement deleteButton;

    public LeftMenu leftMenu;
    @FindBy(xpath = ".//input[@id='searchbox']")
    private WebElement searchField;
    @FindBy(xpath = ".//div[@class='col-auto p-1'][2]//button[@class='btn btn-primary open-modal-dialog']")
    private WebElement searchButton;
    @FindBy(xpath = ".//a[@class='dropdown-item open-modal-dialog'][2]")
    private WebElement deleteDeviceProfileButton;
    @FindBy(xpath = ".//input[@class='btn btn-danger']")
    private WebElement confirmDeletingButton;
    @FindBy(xpath = ".//tbody//tr[@class='row-dblclick odd']//td[@class='cell-ellipsis sorting_1']")
    private WebElement deviceProfile;
    @FindBy(xpath = ".//tbody//tr[1]//td[@class='text-center'][1]//span[@class='badge badge-success']")
    private WebElement buttonBondingCheckboxYes;
    @FindBy(xpath = ".//tbody//tr[1]//td[@class='text-center'][2]//span[@class='badge badge-success']")
    private WebElement buttonConnectionCheckboxYes;
    @FindBy(xpath = ".//tbody//tr[1]//td[@class='text-center'][3]//span[@class='badge badge-success']")
    private WebElement buttonNewChannelCheckboxYes;

    @FindBy(xpath = ".//tbody//tr[@class='row-dblclick odd']//td[@class='cell-ellipsis sorting_1']")
    private WebElement element;
    @FindBy(xpath = ".//tbody//tr[@class='row-dblclick odd']//td[@class='cell-ellipsis sorting_1']")
    private WebElement deletedProfileElement;
    @FindBy(xpath = ".//div[@id='modalBody']//div[@class='text-right']//button[@class='btn btn-secondary']")
    private WebElement closeButton;

    public DeviceAccessProfilesPage(WebDriver webDriver) {
        super(webDriver, "/DeviceAccessProfiles");
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createProfilesButton);
    }

    public void checkIsDeviceAccessProfilesPagePresent() {
        Assert.assertTrue("DeviceAccessProfiles Page is not displayed", isAvatarDisplayed());
    }

    @Step
    public void clickOnCreateProfilesButton() {
        actionsWithOurElements.clickOnElement(createProfilesButton);
    }

    @Step
    public void enterDeviceProfileName(String deviceProfileName) {
        actionsWithOurElements.enterTextInInput(profileName, deviceProfileName);
    }

    @Step
    public void clickOnButtonBondingCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(buttonBondingCheckbox, expectedState);
    }

    @Step
    public void clickOnButtonConnectionCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(buttonConnectionCheckbox, expectedState);
    }

    @Step
    public void clickOnButtonNewChannelCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(buttonNewChannelCheckbox, expectedState);
    }

    @Step
    public void clickOnPinBondingCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(pinBondingCheckbox, expectedState);
    }

    @Step
    public void clickOnPinConnectionCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(pinConnectionCheckbox, expectedState);
    }

    @Step
    public void clickOnPinNewChannelCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(pinNewChannelCheckbox, expectedState);
    }

    @Step
    public void clickOnServerConfirmConnectionCheckbox(String expectedState) {
        actionsWithOurElements.setStateToCheckBox(serverConfirmConnectionCheckbox, expectedState);
    }

    @Step
    public void clickOnCreateButton() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public boolean ifProfilePresent(String deviceAccessProfileName) {
        WebElement deviceAccessProfile = webDriver.findElement(By.xpath("//*[contains(text(),'" + deviceAccessProfileName + "')]"));
        return actionsWithOurElements.isElementDisplayed(deviceAccessProfile);
    }

    @Step
    public void clickOnDropdownMenu() {
        actionsWithOurElements.clickOnElement(dropdownMenu);
    }

    @Step
    public void clickOnMenuEdit() {
        actionsWithOurElements.clickOnElement(menuEdit);
    }

    @Step
    public void clickOnSaveButton() {
        actionsWithOurElements.clickOnElement(saveButton);
    }

    @Step
    public void clickOnMenuDelete() {
        actionsWithOurElements.clickOnElement(menuDelete);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    @Step
    public void createEmptyDeviceProfile(String name) {
        clickOnCreateProfilesButton();
        enterDeviceProfileName(name);
        clickOnCreateButton();
    }

    @Step
    public void filterByNewProfile(String profileName) {
        actionsWithOurElements.enterTextInInput(searchField, profileName);
    }

    public void clickOnDeleteTestProfileButton() {
        actionsWithOurElements.clickOnElement(deleteDeviceProfileButton);
    }

    public void clickOnConfirmDeletingButton() {
        actionsWithOurElements.clickOnElement(confirmDeletingButton);
    }

    public void changeProfileName(String newDeviceProfileName) {
        enterDeviceProfileName(newDeviceProfileName);
    }


    public boolean isButtonBondingCheckboxYes() {
        return actionsWithOurElements.isElementDisplayed(buttonBondingCheckboxYes);
    }

    public boolean isButtonConnectionCheckboxYes() {
        return actionsWithOurElements.isElementDisplayed(buttonConnectionCheckboxYes);
    }

    public boolean isButtonNewChannelCheckboxYes() {
        return actionsWithOurElements.isElementDisplayed(buttonNewChannelCheckboxYes);
    }

    public boolean checkButtonStatesForProfile() {
        return (isButtonBondingCheckboxYes() & isButtonConnectionCheckboxYes() & isButtonNewChannelCheckboxYes());
    }
    public void searchProfile(String profileName){
        actionsWithOurElements.enterTextInInput(searchField, profileName);
    }

    public void openProfile() {

        Actions action = new Actions(webDriver);
        action.moveToElement(webDriver.findElement(By.xpath(".//tbody//tr[@class='row-dblclick odd']//td[@class='cell-ellipsis sorting_1']"))).doubleClick().perform();

    }

    public boolean checkProfileDeleted() {
        return !actionsWithOurElements.isElementDisplayed(deletedProfileElement);
    }

    public void deleteCreatedProfile(String simple_profile) {
        filterByNewProfile(simple_profile);
        clickOnDropdownMenu();
        clickOnMenuDelete();
        clickOnDeleteButton();
    }

    public void deleteCreatedProfilee(String simple_profile) {
        filterByNewProfile(simple_profile);
        clickOnDropdownMenu();
        clickOnMenuDelete();
    }

    public boolean isAlertDisplayed() {
        return actionsWithOurElements.isElementDisplayed(webDriver.findElement(By.xpath(".//*[contains(text(), 'The device access profile Simple profile was applied, apply another profile before deleting.')]")));
    }

    public void clickClose() {
        actionsWithOurElements.clickOnElement(closeButton);
    }
}