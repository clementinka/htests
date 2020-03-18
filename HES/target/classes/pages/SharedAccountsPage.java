package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class SharedAccountsPage extends ParentPage {

    @FindBy(xpath = ".//button[@data-action='CreateSharedAccount']")
    private WebElement createSharedAccountsButton;

    @FindBy(xpath = ".//input[@id ='SharedAccount_Name']")
    private WebElement nameSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='SharedAccount_Urls']")
    private WebElement urlsSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='SharedAccount_Login']")
    private WebElement loginSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='AccountPassword_Password']")
    private WebElement passwordSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='AccountPassword_ConfirmPassword']")
    private WebElement confirmPasswordSharedAccountsField;

    @FindBy(xpath = ".//input[@id ='AccountPassword_OtpSecret']")
    private WebElement otpSharedAccountsField;

    @FindBy(xpath = ".//input[@value ='Create']")
    private WebElement createButton;

    @FindBy(xpath = ".//img[@src ='/svg/action/more.svg']")
    private WebElement dropdownMenu;

    @FindBy(xpath = ".//a[@data-action='EditSharedAccount']")
    private WebElement editShAccLink;

    @FindBy(xpath = ".//input[@value='Save']")
    private WebElement saveButton;

    @FindBy(xpath = ".//a[@data-action='EditSharedAccountPwd']")
    private WebElement editShAccPassLink;

    @FindBy(xpath = ".//a[@data-action='EditSharedAccountOtp']")
    private WebElement editShAccOtpLink;

    @FindBy(xpath = ".//a[@data-action='DeleteSharedAccount']")
    private WebElement deleteShAccLink;

    @FindBy(xpath = ".//input[@id ='searchbox']")
    private WebElement enterSearchShAcc;

    @FindBy(xpath = ".//input[@value='Delete']")
    private WebElement deleteShAccButton;


    public LeftMenu leftMenu;

    @FindBy(xpath = ".//input[@id='SharedAccount_Apps']")
    private WebElement appsSharedAccountsField;

    @FindBy(xpath = ".//li[@class='nav-item'][2]//a[@id='pills-workstation-tab']")
    private WebElement windowsAccountButton;

    @FindBy(xpath = ".//a[@id='pills-webapp-tab']")
    private WebElement webAppAccountButton;

    @FindBy(xpath = ".//input[@id='WorkstationAccount_Name']")
    private WebElement winAccName;

    @FindBy(xpath = ".//*[@id='workstation_account_type']//option[2]")
    private WebElement domainAccount;

    @FindBy(xpath = ".//input[@id='domain']")
    private WebElement domainNameField;

    @FindBy(xpath = ".//input[@id='login']")
    private WebElement userNameField;

    @FindBy(xpath = ".//input[@id='WorkstationAccount_Password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//input[@id='WorkstationAccount_ConfirmPassword']")
    private WebElement confirmPasswordField;

    @FindBy(xpath = ".//*[@id='pills-workstation']//form//div[7]//input")
    private WebElement createWinButton;

    public SharedAccountsPage(WebDriver webDriver) {
        super(webDriver, "/SharedAccounts");
    }

    @Step
    public boolean isButtonDisplayed() {
        return actionsWithOurElements.isElementDisplayed(createSharedAccountsButton);
    }

    @Step
    public void checkIsCreateSharedAccountsButtonPresent() {
        Assert.assertTrue("CreateSharedAccountsButton is not displayed", isButtonDisplayed());
    }

    @Step
    public void clickOnCreateSharedAccountsButton() {
        actionsWithOurElements.clickOnElement(createSharedAccountsButton);
    }

    @Step
    public void enterNameShAcc(String firstName) {
        actionsWithOurElements.enterTextInInput(nameSharedAccountsField, firstName);
    }

    @Step
    public void enterUrlsShAcc(String urls) {
        actionsWithOurElements.enterTextInInput(urlsSharedAccountsField, urls);
    }

    @Step
    public void enterLoginShAcc(String login) {
        actionsWithOurElements.enterTextInInput(loginSharedAccountsField, login);
    }

    @Step
    public void enterPasswordShAcc(String password) {
        actionsWithOurElements.enterTextInInput(passwordSharedAccountsField, password);
    }

    @Step
    public void confirmPasswordShAcc(String confirmPass) {
        actionsWithOurElements.enterTextInInput(confirmPasswordSharedAccountsField, confirmPass);
    }

    @Step
    public void enterOTPShAcc(String otp) {
        actionsWithOurElements.enterTextInInput(otpSharedAccountsField, otp);
    }

    @Step
    public void clickOnCreateButton() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public boolean checkIsShAccPresent(String accountName) {
        return actionsWithOurElements.isElementDisplayed(webDriver.findElement(By.xpath(".//*[contains(text(),'" + accountName + "')]")));
    }

    @Step
    public void clickOnDropdownMenu() {
        actionsWithOurElements.clickOnElement(dropdownMenu);
    }

    @Step
    public void clickOnEditShAccLink() {
        actionsWithOurElements.clickOnElement(editShAccLink);
    }

    @Step
    public void checkIsShAccNameWasEdited() {
        Assert.assertTrue("Edited shared account Name is present", webDriver.getPageSource().contains("my"));
    }

    @Step
    public void checkIsShAccUrlWasEdited() {
        Assert.assertTrue("Edited shared account Url is present", webDriver.getPageSource().contains("gmail.com"));
    }

    @Step
    public void checkIsShAccLoginWasEdited() {
        Assert.assertTrue("Edited shared account Login is present", webDriver.getPageSource().contains("hideeztest@gmail.com"));
    }

    @Step
    public void clickOnSaveButton() {
        actionsWithOurElements.clickOnElement(saveButton);
    }

    @Step
    public void clickOnEditPassLink() {
        actionsWithOurElements.clickOnElement(editShAccPassLink);
    }

    @Step
    public void clickOnEditOtpLink() {
        actionsWithOurElements.clickOnElement(editShAccOtpLink);
    }

    @Step
    public void clickOnDeleteShAccLink() {
        actionsWithOurElements.clickOnElement(deleteShAccLink);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteShAccButton);
    }

    @Step
    public void enterInSearchFieldShAccName(String nameSharedAccounts) {
        actionsWithOurElements.enterTextInInput(enterSearchShAcc, nameSharedAccounts);
    }

    @Step
    public void checkIsShAccNotPresent() {
        Assert.assertTrue("Deleted shared account is not present", webDriver.getPageSource().contains("No data available in table"));
    }

    @Step
    public void enterAppShAcc(String appName) {
        actionsWithOurElements.enterTextInInput(appsSharedAccountsField, appName);
    }

    @Step
    public void switchOnWindowsAccount() {
        actionsWithOurElements.clickOnElement(windowsAccountButton);
    }

    @Step
    public void switchOnUrlAppAccount() {
        actionsWithOurElements.clickOnElement(webAppAccountButton);
    }

    @Step
    public void enterNameWinShAcc(String windowsAccountName) {
        actionsWithOurElements.enterTextInInput(winAccName, windowsAccountName);
    }

    @Step
    public void selectTypeDomain() {
        actionsWithOurElements.clickOnElement(domainAccount);
    }

    @Step
    public void enterDomainName(String domainName) {
        actionsWithOurElements.enterTextInInput(domainNameField, domainName);
    }

    @Step
    public void enterUserName(String userName) {
        actionsWithOurElements.enterTextInInput(userNameField, userName);
    }

    @Step
    public void enterPassword(String password) {
        actionsWithOurElements.enterTextInInput(passwordField, password);
    }

    @Step
    public void enterConfirmPassword(String password) {
        actionsWithOurElements.enterTextInInput(confirmPasswordField, password);
    }

    @Step
    public void clickCreateWinAccButton() {
        actionsWithOurElements.clickOnElement(createWinButton);
    }

    @Step
    public void deleteTestAccountsIfPresent() {
        enterInSearchFieldShAccName("hes auto test");
        while (actionsWithOurElements.isElementDisplayed(dropdownMenu)) {
            clickOnDropdownMenu();
            clickOnDeleteShAccLink();
            clickOnDeleteButton();
        }
    }
}