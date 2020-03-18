package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;
import io.qameta.allure.Step;


public class LoginPage extends ParentPage {
    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/Identity/Account/Login?ReturnUrl=%2F");
    }

    public String url = "http://hesautotest.hideez.com/";

    @FindBy(xpath = ".//input[@id='Input_Email']")
    private static WebElement inputLogin;

    @FindBy(xpath = ".//input[@id='Input_Password']")
    private static WebElement inputPassword;

    @FindBy(xpath = ".//button[@type='submit']")
    private static WebElement loginButton;

    @FindBy(xpath = ".//span[@id='Input_Email-error']")
    private WebElement errorMessageEmail;

    @FindBy(xpath = ".//span[@id='Input_Password-error']")
    private WebElement errorMessagePassword;

    @FindBy(xpath = ".//li[text()='The Email field is required.']")
    private WebElement errorMessageOverFieldsEmail;

    @FindBy(xpath = ".//li[text()='The Password field is required.']")
    private WebElement errorMessageOverFieldsPassword;

    @FindBy(xpath = ".//li[text()='Invalid login attempt.']")
    private WebElement errorMessageInvalidLogin;

    @FindBy(xpath = ".//span[@id='Input_Email-error']")
    private WebElement errorMessageNotValidLogin;

    @FindBy(xpath = ".//li[text()='The Email field is not a valid e-mail address.']")
    private WebElement errorMessageOverFieldsNotValidLogin;

    @Step
    public void openPage() {
        try {
            webDriver.get(url);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    @Step
    public void enterLoginInToInputLogin(String login) {
        actionsWithOurElements.enterTextInInput(inputLogin, login);
    }

    @Step
    public void enterPassInToInputPassword(String password) {
        actionsWithOurElements.enterTextInInput(inputPassword, password);
    }

    @Step
    public void clickOnButtonLogIn() {
        actionsWithOurElements.clickOnElement(loginButton);
    }

    @Step
    public boolean isPageLoaded() {
        return loginButton.isDisplayed();
    }

    @Step
    public String getErrorMessageTextEmail() {
        return errorMessageEmail.getText();
    }

    @Step
    public String getErrorMessageTextPassword() {
        return errorMessagePassword.getText();
    }

    @Step
    public String getErrorMessageTextOverFieldsEmail() {
        return errorMessageOverFieldsEmail.getText();
    }

    @Step
    public String getErrorMessageTextOverFieldsPassword() {
        return errorMessageOverFieldsPassword.getText();
    }

    @Step
    public String getErrorMessageTextInvalidLogin() {
        return errorMessageInvalidLogin.getText();
    }

    @Step
    public String getErrorMessageTextNotValidLogin() {
        return errorMessageNotValidLogin.getText();
    }

    @Step
    public String getErrorMessageTextOverFieldsNotValidLogin() {
        return errorMessageNotValidLogin.getText();
    }

    @Step
    public void fillingLoginFormAndSubmitIt(String login, String pass) {
        openPage();
        enterLoginInToInputLogin(login);
        enterPassInToInputPassword(pass);
        clickOnButtonLogIn();
    }

    @Step
    public void openURL(String url) {
        try {
            webDriver.get(url);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }
}




