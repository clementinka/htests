package pages.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class WorkstationSessionsPage extends ParentPage {
    @FindBy(xpath = ".//div[@id='content']//div[@id='workstationSessions_wrapper']//div[@class='row'][2]//div[@class='col-sm-12']")
    private WebElement workstationSessionsTable;

    public WorkstationSessionsPage(WebDriver webDriver) {
        super(webDriver, "/Audit/WorkstationSessions");
    }

    public boolean checkPageOpened() {
        return actionsWithOurElements.isElementDisplayed(workstationSessionsTable);
    }

    public void clickBack() {
        actionsWithOurElements.goBackInBrowser();
    }
}
