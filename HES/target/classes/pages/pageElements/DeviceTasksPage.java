package pages.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class DeviceTasksPage extends ParentPage {
    @FindBy(xpath = ".//div[@id='deviceTasks_wrapper']//div[@class='row'][2]//div[@class='col-sm-12']")
    private WebElement deviceTasksTable;

    public DeviceTasksPage(WebDriver webDriver) {
        super(webDriver, "/Dashboard/DeviceTasks");
    }

    public boolean checkPageOpened() {
        return actionsWithOurElements.isElementDisplayed(deviceTasksTable);
    }
}
