package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class TemplatesPage extends ParentPage {

    @FindBy(xpath = ".//button[@class='btn btn-primary open-modal-dialog']")
    private WebElement createTemplateButton;
    @FindBy(id = "Template_Name")
    private WebElement templateNameField;
    @FindBy(id = "Template_Urls")
    private WebElement templateUrlsField;
    @FindBy(id = "Template_Apps")
    private WebElement templateAppsField;
    @FindBy(xpath = ".//input[@class='btn btn-primary']")
    private WebElement createButton;
    @FindBy(xpath = ".//input[@id='searchbox']")
    private WebElement searchField;
    @FindBy(xpath = ".//*[@id='templates']/thead/tr/th[2]")
    private WebElement findButton;
    @FindBy(xpath = ".//td[@class='sorting_1']")
    private WebElement newTemplate;
    @FindBy(xpath = ".//tbody//tr[@class='odd']//td[5]")
    private WebElement dropDownMenu;
    @FindBy(xpath = ".//a[@class='dropdown-item open-modal-dialog'][2]")
    private WebElement deleteButton;
    @FindBy(xpath = ".//input[@class='btn btn-danger']")
    private WebElement confirmDeletingButton;
    @FindBy(xpath = ".//a[@class='dropdown-item open-modal-dialog'][1]")
    private WebElement editButton;
    @FindBy(xpath = ".//tr[@class='odd'][1]//td[@class='sorting_1']")
    private WebElement firstString;
    @FindBy(xpath = ".//table[@id='templates']//thead//tr//th[@class='sorting_asc']")
    private WebElement sortByName;
    @FindBy(xpath = ".//tr[@class='even'][1]//td[@class='sorting_1']")
    private WebElement secondString;
    @FindBy(xpath = ".//table[@id='templates']//tbody//tr[@class='odd']//td[3]")
    private WebElement firstStringUrl;
    @FindBy(xpath = ".//table[@id='templates']//tbody//tr[@class='even']//td[3]")
    private WebElement secondStringUrl;
    @FindBy(xpath = ".//table[@id='templates']//thead//tr//th[@class='sorting'][1]")
    private WebElement sortByUrls;
    @FindBy(xpath = ".//table[@id='templates']//tbody//tr[@class='odd']//td[4]")
    private WebElement firstStringApp;
    @FindBy(xpath = ".//table[@id='templates']//tbody//tr[@class='even']//td[4]")
    private WebElement secondStringApp;
    @FindBy(xpath = ".//table[@id='templates']//thead//tr//th[@class='sorting'][2]")
    private WebElement sortByApps;
    @FindBy(xpath = ".//button[@class='btn btn-secondary']")
    private WebElement cancelButton;
    @FindBy(xpath = ".//div[@id='modalDialog']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']/div[@class='modal-header']//button[@class='close']/span")
    private WebElement closeWindowButton;
    @FindBy(xpath = ".//div[@class='modal-content']//div[@class='modal-header']")
    private WebElement createTemplateWindow;
    @FindBy(xpath = ".//div[@id='entries_place']//select[@class='custom-select form-control']")
    private WebElement numberOfEntries;
    @FindBy(xpath = ".//select[@class='custom-select form-control']//option[2]")
    private WebElement twentyFiveEntries;
    @FindBy(xpath = ".//tbody//tr[@class='odd'][13]//td[@class='sorting_1']")
    private WebElement twentyFifthElements;
    @FindBy(xpath = ".//tbody//tr[@class='even'][25]//td[@class='sorting_1']")
    private WebElement fiftyElements;
    @FindBy(xpath = ".//select[@class='custom-select form-control']//option[3]")
    private WebElement fiftyEntries;
    @FindBy(xpath = ".//select[@class='custom-select form-control']//option[4]")
    private WebElement oneHundredEntries;
    @FindBy(xpath = ".//tbody//tr[@class='even'][50]//td[@class='sorting_1']")
    private WebElement oneHundredElements;
    @FindBy(xpath = ".//table[@id='templates']//tbody//tr[@class='odd']//td[@class='sorting_1']")
    private WebElement firstTemplateInTheTable;

    public TemplatesPage(WebDriver webDriver) {
        super(webDriver, "/Templates");
    }

    @Step
    public void clickOnCreateTemplateButton() {
        actionsWithOurElements.clickOnElement(createTemplateButton);
    }

    @Step
    public void enterNameOfTemplate(String templateName) {
        actionsWithOurElements.enterTextInInput(templateNameField, templateName);
    }

    @Step
    public void enterUrls(String urls) {
        actionsWithOurElements.enterTextInInput(templateUrlsField, urls);
    }

    @Step
    public void enterApps(String apps) {
        actionsWithOurElements.enterTextInInput(templateAppsField, apps);
    }

    @Step
    public void clickCreate() {
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public void searchCreatedTemplate(String templateToFind) {
        actionsWithOurElements.enterTextInInput(searchField, templateToFind);
        actionsWithOurElements.clickOnElement(findButton);
    }

    @Step
    public boolean isTemplatePresent() {
        return actionsWithOurElements.isElementDisplayed(newTemplate);
    }

    @Step
    public void deleteNewTemplate() {
        actionsWithOurElements.clickOnElement(dropDownMenu);
        actionsWithOurElements.clickOnElement(deleteButton);
        actionsWithOurElements.clickOnElement(confirmDeletingButton);
    }

    @Step
    public void editTemplateName(String newTemplateName) {
        actionsWithOurElements.clickOnElement(dropDownMenu);
        actionsWithOurElements.clickOnElement(editButton);
        actionsWithOurElements.enterTextInInput(templateNameField, newTemplateName);
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public void editTemplateUrl(String newTemplateUrl) {
        actionsWithOurElements.clickOnElement(dropDownMenu);
        actionsWithOurElements.clickOnElement(editButton);
        actionsWithOurElements.enterTextInInput(templateUrlsField, newTemplateUrl);
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public void editTemplateApp(String newTemplateApp) {
        actionsWithOurElements.clickOnElement(dropDownMenu);
        actionsWithOurElements.clickOnElement(editButton);
        actionsWithOurElements.enterTextInInput(templateAppsField, newTemplateApp);
        actionsWithOurElements.clickOnElement(createButton);
    }

    @Step
    public void clickSortByName() {
        actionsWithOurElements.clickOnElement(sortByName);
    }

    @Step
    public boolean checkFirstTemplate(String templateName) {
        return actionsWithOurElements.compareValues(actionsWithOurElements.getElementValue(firstString), templateName);
    }

    @Step
    public boolean checkSecondTemplate(String templateName) {
        return actionsWithOurElements.compareValues(actionsWithOurElements.getElementValue(secondString), templateName);
    }

    @Step
    public boolean ifElementWereSorted(String firstTemplate, String secondTemplate) {
        return (checkFirstTemplate(firstTemplate) && checkSecondTemplate(secondTemplate));
    }

    @Step
    public boolean checkFirstTemplateUrls(String templateUrl) {
        return actionsWithOurElements.compareValues(actionsWithOurElements.getElementValue(firstStringUrl), templateUrl);
    }

    @Step
    public boolean checkSecondTemplateUrls(String templateUrl) {
        return actionsWithOurElements.compareValues(actionsWithOurElements.getElementValue(secondStringUrl), templateUrl);
    }

    @Step
    public void clickSortByUrls() {
        actionsWithOurElements.clickOnElement(sortByUrls);
    }

    @Step
    public boolean checkFirstTemplateApps(String firstTemplateApp) {
        return actionsWithOurElements.compareValues(actionsWithOurElements.getElementValue(firstStringApp), firstTemplateApp);
    }

    @Step
    public boolean checkSecondTemplateApps(String secondTemplateApp) {
        return actionsWithOurElements.compareValues(actionsWithOurElements.getElementValue(secondStringApp), secondTemplateApp);
    }

    @Step
    public void clickSortByApps() {
        actionsWithOurElements.clickOnElement(sortByApps);
    }

    @Step
    public void clickOnCancelButton() {
        actionsWithOurElements.clickOnElement(cancelButton);
    }

    @Step
    public void clickOnCloseWindowButton() {
        actionsWithOurElements.clickOnElement(closeWindowButton);
    }

    @Step
    public boolean isCreateTemplateWindowPresent() {
        return !(actionsWithOurElements.isElementDisplayed(createTemplateWindow));
    }

    @Step
    public void createTestTemplates(int n) {
        for (int i = 0; i < n; i++) {
            clickOnCreateTemplateButton();
            enterNameOfTemplate("template"+(i+1));
            clickCreate();
        }
    }

    @Step
    public void deleteTestTemplates(int m) {
        for (int i = 0; i < m; i++) {
            deleteNewTemplate();
        }
    }

    @Step
    public void clickOnNumberOfEntries() {
        actionsWithOurElements.clickOnElement(numberOfEntries);
    }

    @Step
    public void chooseTwentyFiveEntries() {
        actionsWithOurElements.clickOnElement(twentyFiveEntries);
    }

    @Step
    public boolean ifTwentyFifthElementsPresent() {
        return actionsWithOurElements.isElementDisplayed(twentyFifthElements);
    }

    @Step
    public boolean ifFiftyElementsPresent() {
        return actionsWithOurElements.isElementDisplayed(fiftyElements);
    }

    @Step
    public void chooseFiftyEntries() {
        actionsWithOurElements.clickOnElement(fiftyEntries);
    }

    @Step
    public void chooseOneHundredEntries() {
        actionsWithOurElements.clickOnElement(oneHundredEntries);
    }

    @Step
    public boolean ifOneHundredElementsPresent() {
        return actionsWithOurElements.isElementDisplayed(oneHundredElements);
    }

    public void clearAllTemplates() {
        while (actionsWithOurElements.isElementDisplayed(firstTemplateInTheTable)) {
            deleteNewTemplate();
        }
    }
}
