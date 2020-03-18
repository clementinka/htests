package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DataProtectionPage extends ParentPage {

    @FindBy(xpath = ".//button[@class='btn btn-primary']")
    private WebElement enableDataProtection;

    @FindBy(xpath = ".//input[@id='NewPassword_Password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//input[@id='NewPassword_ConfirmPassword']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = ".//input[@class='btn btn-primary']")
    private WebElement enableButton;

    @FindBy(xpath = ".//p[1]//button[@class='btn btn-primary']")
    private WebElement disableDataProtection;

    @FindBy(xpath = ".//p[2]//button[@class='btn btn-primary']")
    private WebElement changeEncryptionPassword;

    @FindBy(xpath = ".//input[@id='ChangePassword_OldPassword']")
    private WebElement currentPasswordField;

    @FindBy(xpath = ".//input[@id='ChangePassword_NewPassword']")
    private WebElement newPasswordField;

    @FindBy(xpath = ".//input[@id='ChangePassword_ConfirmPassword']")
    private WebElement confirmNewPasswordField;

    @FindBy(xpath = ".//div[@id='changeEncryptionPassword']//div[@class='profile-fill-card']//form//div[@class='form-group m-0']//input[@class='btn btn-primary']")
    private WebElement changeDataProtectionButton;

    @FindBy(xpath = ".//html//body//div[@class='d-flex']//div[@class='d-flex flex-column custom-main']//div[@class='custom-content p-4']//div[@id='success-alert']")
    private WebElement allert;

    @FindBy(id = "CurrentPassword_Password")
    private WebElement dataProtectionPasswordField;

    @FindBy(xpath = ".//div[@class='profile-fill-card']//form//div[@class='form-group m-0']//input[@class='btn btn-danger']")
    private WebElement disableButton;

    @FindBy(xpath = ".//h1[@class='text-navyblue']")
    private WebElement dataProtectionHeader;

    @FindBy(xpath = ".//*[contains(text(),'Disable data protection')]")
    private WebElement disableDataProtectionTest;


    public DataProtectionPage(WebDriver webDriver) {
        super(webDriver, "/Settings/DataProtection");
    }

    @Step
    public void clickOnEnableDataProtectionButton() {
        actionsWithOurElements.isElementDisplayed(dataProtectionHeader);
        actionsWithOurElements.isElementDisplayed(enableDataProtection);
        actionsWithOurElements.clickOnElement(enableDataProtection);
    }

    @Step
    public void enterNewPassword(String newPassword) {
        actionsWithOurElements.isElementDisplayed(passwordField);
        actionsWithOurElements.clickOnElement(passwordField);
        actionsWithOurElements.enterTextInInput(passwordField, newPassword);
    }

    @Step
    public void confirmPassword(String newPassword) {
        actionsWithOurElements.isElementDisplayed(confirmPasswordField);
        actionsWithOurElements.clickOnElement(confirmPasswordField);
        actionsWithOurElements.enterTextInInput(confirmPasswordField, newPassword);
    }

    @Step
    public void clickEnableButton() {
        actionsWithOurElements.isElementDisplayed(enableButton);
        actionsWithOurElements.clickOnElement(enableButton);
    }

    @Step
    public boolean isDataProtectionEnabled() {
        return actionsWithOurElements.isElementDisplayed(disableDataProtection);
    }

    @Step
    public void clickOnChangeEncryptionPassword() {
        actionsWithOurElements.isElementDisplayed(dataProtectionHeader);
        actionsWithOurElements.isElementDisplayed(changeEncryptionPassword);
        actionsWithOurElements.clickOnElement(changeEncryptionPassword);
        actionsWithOurElements.isElementDisplayed(currentPasswordField);
    }

    @Step
    public void enterCurrentPassword(String currentPassword) {
        actionsWithOurElements.isElementDisplayed(currentPasswordField);
        actionsWithOurElements.clickOnElement(currentPasswordField);
        actionsWithOurElements.enterTextInInput(currentPasswordField, currentPassword);
    }

    @Step
    public void enterNewPasswordForChanging(String newPassword) {
        actionsWithOurElements.isElementDisplayed(newPasswordField);
        actionsWithOurElements.clickOnElement(newPasswordField);
        actionsWithOurElements.enterTextInInput(newPasswordField, newPassword);
    }

    @Step
    public void confirmPasswordForChanging(String confirmPassword) {
        actionsWithOurElements.isElementDisplayed(confirmNewPasswordField);
        actionsWithOurElements.clickOnElement(confirmNewPasswordField);
        actionsWithOurElements.enterTextInInput(confirmNewPasswordField, confirmPassword);
    }

    public void clickChangeButton() {
        actionsWithOurElements.isElementDisplayed(changeDataProtectionButton);
        actionsWithOurElements.clickOnElement(changeDataProtectionButton);
    }

    @Step
    public boolean isPasswordChanged() {
        return !actionsWithOurElements.isElementDisplayed(changeDataProtectionButton);
    }

    @Step
    public void clickOnDisableDataProtectionButton() {
        actionsWithOurElements.isElementDisplayed(dataProtectionHeader);
        actionsWithOurElements.isElementDisplayed(disableDataProtection);
        actionsWithOurElements.clickOnElement(disableDataProtection);
    }

    @Step
    public void enterCurrentEncryptionPassword(String dataProtectionPassword) {
        actionsWithOurElements.isElementDisplayed(dataProtectionPasswordField);
        actionsWithOurElements.clickOnElement(dataProtectionPasswordField);
        actionsWithOurElements.enterTextInInput(dataProtectionPasswordField, dataProtectionPassword);
    }

    @Step
    public void clickDisableButton() {
        actionsWithOurElements.isElementDisplayed(disableButton);
        actionsWithOurElements.clickOnElement(disableButton);
    }

    @Step
    public boolean isAbilityToEnableDataProtection() {
        return (actionsWithOurElements.isElementDisplayed(enableDataProtection));
    }

    @Step
    public void turnOffDataProtectionIfEnabled() {

        while (actionsWithOurElements.isElementDisplayed(disableDataProtectionTest)) {

            if (actionsWithOurElements.isElementDisplayed(disableDataProtectionTest)) {
                clickOnDisableDataProtectionButton();
                enterCurrentEncryptionPassword("123456");
                clickDisableButton();
            }
            if (actionsWithOurElements.isElementDisplayed(disableDataProtectionTest)) {
                clickOnDisableDataProtectionButton();
                enterCurrentEncryptionPassword("123007");
                clickDisableButton();
            }
            else {
                actionsWithOurElements.isElementDisplayed(enableDataProtection);
            }
        }
    }
}