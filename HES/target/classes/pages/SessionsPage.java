package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class SessionsPage extends ParentPage {

    @FindBy(xpath = ".//table[@id='workstationSessions']//tbody//tr[@class='odd'][1]//td[3]")
    private WebElement firstElementInList;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting_desc']")
    private WebElement sortByStartDateButton;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting'][1]")
    private WebElement sortByEndDateButton;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting'][2]")
    private WebElement sortByDuration;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting'][3]")
    private WebElement sortByUnlockedBy;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting'][4]")
    private WebElement sortByWorkstation;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting'][5]")
    private WebElement sortBySession;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting'][6]")
    private WebElement sortByDevice;
    @FindBy(xpath = ".//table[@id='workstationSessions']//thead//tr//th[@class='sorting'][7]")
    private WebElement sortByEmployee;
    @FindBy(xpath = ".//tbody//tr[@class='even'][5]//td[2]")
    private WebElement lastElementInList;


    public SessionsPage(WebDriver webDriver) {
        super(webDriver, "/Audit/WorkstationSessions");
    }

    String firstDate;
    String firstDateAfterSorting;

    public String getFirstDate() {
        return firstDate;
    }

    public String firstDateAfterSorting() {
        return firstDateAfterSorting;
    }


    public void saveFirstDateInList() {
        String newValue;
        newValue = actionsWithOurElements.getElementValue(firstElementInList);
        this.firstDate = newValue;
    }

    public void clickOnSortByStartDate() {
        actionsWithOurElements.clickOnElement(sortByStartDateButton);
    }

    public void clickOnSortByEndDate() {
        actionsWithOurElements.clickOnElement(sortByEndDateButton);
    }

    public void saveFirstDateInListAfterSorting() {
        String newValue;
        newValue = actionsWithOurElements.getElementValue(firstElementInList);
        this.firstDateAfterSorting = newValue;
    }
    String lastDate;
    String lastDateAfterSorting;
    public String getLastDate() {
        return lastDate;
    }

    public String lastDateAfterSorting() {
        return lastDateAfterSorting;
    }


    public void saveLastDateInList() {
        String newValue;
        newValue = actionsWithOurElements.getElementValue(lastElementInList);
        this.lastDate = newValue;
    }
    public void saveLastDateInListAfterSorting() {
        String newValue;
        newValue = actionsWithOurElements.getElementValue(lastElementInList);
        this.lastDateAfterSorting = newValue;
    }


    public boolean ifElementsSorted() {
        return !(actionsWithOurElements.compareValues(lastDate,lastDateAfterSorting));
    }

    public void clickOnSortByDuration() {
        actionsWithOurElements.clickOnElement(sortByDuration);
    }

    public void clickOnSortByUnlockedBy() {
        actionsWithOurElements.clickOnElement(sortByUnlockedBy);
    }

    public void clickOnSortByWorkstation() {
        actionsWithOurElements.clickOnElement(sortByWorkstation);
    }

    public void clickOnSortBySession() {
        actionsWithOurElements.clickOnElement(sortBySession);
    }

    public void clickOnSortByDevice() {
        actionsWithOurElements.clickOnElement(sortByDevice);
    }


    public void clickOnSortByEmployee() {
        actionsWithOurElements.clickOnElement(sortByEmployee);
    }
}
