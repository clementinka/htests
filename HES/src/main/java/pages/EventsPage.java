package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class EventsPage extends ParentPage {

    private String firstString;
    private String firstStrongAfterSort;

    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting_desc']")
    private WebElement sortByDateButton;
    @FindBy(xpath = ".//table[@id='workstationEvents']//tbody//tr[@class='odd'][1]//td[@class='sorting_1']")
    private WebElement firstItemInTable;
    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting'][1]")
    private WebElement sortByEventButton;
    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting'][2]")
    private WebElement sortBySeverityButton;
    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting'][3]")
    private WebElement sortByNoteButton;
    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting'][4]")
    private WebElement sortByWorkstationButton;
    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting'][5]")
    private WebElement sortBySessionButton;
    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting'][6]")
    private WebElement sortByDeviceButton;
    @FindBy(xpath = ".//table[@id='workstationEvents']//thead//tr//th[@class='sorting'][7]")
    private WebElement sortByEmployeeButton;

    public EventsPage(WebDriver webDriver) {

        super(webDriver, "/Audit/WorkstationEvents");
    }

    public String getFirstString() {
        return firstString;
    }

    public String getFirstStrongAfterSort() {
        return firstStrongAfterSort;
    }

    public void saveFirstDateInList() {
        String newValue;
        newValue = actionsWithOurElements.getElementValue(firstItemInTable);
        this.firstString = newValue;
    }

    public void clickOnSortByDateButton() {
        actionsWithOurElements.clickOnElement(sortByDateButton);
    }

    public void saveFirstDateInListAfterSorting() {
        String newValue;
        newValue = actionsWithOurElements.getElementValue(firstItemInTable);
        this.firstStrongAfterSort = newValue;
    }

    public boolean ifElementsSorted() {
        return !(actionsWithOurElements.compareValues(firstString, firstStrongAfterSort));
    }

    public void clickOnSortByEventButton() {

        actionsWithOurElements.clickOnElement(sortByEventButton);
    }

    public void clickOnSortBySeverityButton() {

        actionsWithOurElements.clickOnElement(sortBySeverityButton);
    }

    public void clickOnSortByNoteButton() {

        actionsWithOurElements.clickOnElement(sortByNoteButton);
    }

    public void clickOnSortByWorkstationButton() {
        actionsWithOurElements.clickOnElement(sortByWorkstationButton);
    }

    public void clickOnSortBySessionButton() {
        actionsWithOurElements.clickOnElement(sortBySessionButton);
    }

    public void clickOnSortByDeviceButton() {
        actionsWithOurElements.clickOnElement(sortByDeviceButton);
    }

    public void clickOnSortByEmployeeButton() {
        actionsWithOurElements.clickOnElement(sortByEmployeeButton);
    }
}
