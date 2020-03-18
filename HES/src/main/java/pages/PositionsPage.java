package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.pageElements.LeftMenu;
import parentPage.ParentPage;

public class PositionsPage extends ParentPage {

    @FindBy(xpath = ".//div/div[2]/div/div[3]/div[2]/div/table/tbody/tr[2]/td[3]/div/a/img")
    private WebElement dropdownMenuPosition;

    @FindBy(xpath = "//*[@id=\"positions\"]/tbody/tr[2]/td[3]/div/div/a[2]")
    private WebElement deleteMenuPosition;

    @FindBy(xpath = ".//input[@value ='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = ".//input[@placeholder ='Search' and @class='form-control']")
    private WebElement enterSearchPosition;

    @FindBy(xpath = ".//button[@data-title = 'Create position']")
    private WebElement createPositionButton;

    @FindBy(xpath = ".//input[@id = 'Position_Name']")
    private WebElement positionNameField;

    @FindBy(xpath = ".//input[@value = 'Create']")
    private WebElement createButton;

    @FindBy(xpath = "//*[@id='positions']/tbody/tr[2]/td[3]/div/div/a[1]")
    private WebElement editMenuLink;

    @FindBy(xpath = ".//input[@value = 'Save']")
    private WebElement saveNameButton;


    public LeftMenu leftMenu;


    public PositionsPage(WebDriver webDriver) {
        super(webDriver, "/Positions");
    }

    @Step
    public void clickOnDropdownMenuPosition() {
        actionsWithOurElements.clickOnElement(dropdownMenuPosition);
    }

    @Step
    public void clickOnDeleteMenuPosition() {
        actionsWithOurElements.clickOnElement(deleteMenuPosition);
    }

    @Step
    public void clickOnDeleteButton() {
        actionsWithOurElements.clickOnElement(deleteButton);
    }

    @Step
    public void enterPositionInToSearchField(String searchPosition) {
        actionsWithOurElements.enterTextInInput(enterSearchPosition, searchPosition);
    }

    @Step
    public void checkIsPositionIsNotPresent() {
        Assert.assertTrue("Deleted Position is present", webDriver.getPageSource().contains("No matching records found"));
    }

    @Step
    public void checkIsPositionPagePresent() {
        Assert.assertTrue("Created page is not displayed", webDriver.getPageSource().contains("Create position"));
    }

    @Step
    public void clickOnCreatePositionButton() {
        actionsWithOurElements.clickOnElement(createPositionButton);
    }

    @Step
    public void enterPositionName(String positionName) {
        actionsWithOurElements.enterTextInInput(positionNameField, positionName);
    }

    @Step
    public void clickOnCreateButton() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public void checkIsPositionNamePresent() {
        Assert.assertTrue("Created Position is not displayed", webDriver.getPageSource().contains("PRManager"));
    }

    @Step
    public void clickOnEditMenuPosition() {
        actionsWithOurElements.clickOnElement(editMenuLink);

    }

    @Step
    public void clickOnSaveNameButton() {
        actionsWithOurElements.clickOnElement(saveNameButton);
    }

    @Step
    public void checkIsEditedPositionNamePresent() {
        Assert.assertTrue("Created Position is not displayed", webDriver.getPageSource().contains("BipPRManager"));
    }

}
