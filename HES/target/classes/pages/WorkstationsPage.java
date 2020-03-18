package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class WorkstationsPage extends ParentPage {

    @FindBy(xpath = ".//div[@id='workstations_wrapper']//div[@class='row'][2]//div[@class='col-sm-12']")
    private WebElement workstationTable;

    public WorkstationsPage(WebDriver webDriver) {
        super(webDriver, "/Workstations");
    }

    public boolean checkWorkstationsPageLoaded() {
        return actionsWithOurElements.isElementDisplayed(workstationTable);
    }

    public void clickBack() {
        actionsWithOurElements.goBackInBrowser();
    }

    public boolean checkWorkstationsOnlinePageLoaded() {
        return actionsWithOurElements.isElementDisplayed(workstationTable);
    }
}
