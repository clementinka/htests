package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class AdministratorsPage extends ParentPage {

    @FindBy(xpath = ".//button[@data-title= 'Invite admin']")
    private WebElement inviteAdminButton;

    @FindBy(xpath = ".//input[@id= 'Input_Email']")
    private WebElement emailField;

    @FindBy(xpath = ".//input[@value= 'Invite']")
    private WebElement inviteButton;

    @FindBy(xpath = ".//table[@id='users']//tbody//tr[@class='odd']//td[5]")
    private WebElement adminDropdownMenu;

    @FindBy(xpath = ".//tbody//tr[@class='odd']//td[5]//div[@class='dropdown no-arrow show']//div[@class='dropdown-menu dropdown-menu-right shadow animated--fade-in show']//a[@class='dropdown-item open-modal-dialog']")
    private WebElement deleteItem;

    @FindBy(xpath = ".//input[@class='btn btn-danger']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//input[@id='searchbox']")
    private WebElement seacrhBox;

    public AdministratorsPage(WebDriver webDriver) {
        super(webDriver, "/Administrators");
    }

    public boolean isAvatarDisplayed() {
        return actionsWithOurElements.isElementDisplayed(inviteAdminButton);
    }

    public void checkIsAdministratorsPagePresent() {
        Assert.assertTrue("Administrators Page is not displayed", isAvatarDisplayed());
    }

    @Step
    public void clickOnInviteAdminButton() {
        actionsWithOurElements.clickOnElement(inviteAdminButton);
    }

    @Step
    public void enterEmail(String email) {
        actionsWithOurElements.enterTextInInput(emailField, email);
    }

    @Step
    public void clickOnInviteButton() {
        actionsWithOurElements.clickOnElement(inviteButton);
    }

    @Step
    public void clickOnAdminDropdownMenu() {
        actionsWithOurElements.clickOnElement(adminDropdownMenu);
    }

    @Step
    public void clickOnDeleteItem() {
        actionsWithOurElements.clickOnElement(deleteItem);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    @Step
    public void checkIsDeletedAdminNotPresent() {
        Assert.assertTrue("Created Position is not displayed", !webDriver.getPageSource().contains("admhideeztest@gmail.com"));
    }

    @Step
    public void searchSpecifiedAdmin(String adminEmail) {
        actionsWithOurElements.enterTextInInput(seacrhBox, adminEmail);
    }
}
