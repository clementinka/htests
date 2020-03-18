package templatesTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class TemplatesTest extends AbstractParentTest {
    @Before
    public void precondition() {

        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.leftMenu.clickOnMenuTemplates();
        templatesPage.checkCurrentUrl();
        templatesPage.clearAllTemplates();

    }

    @Test
    public void cancelButton() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.clickOnCancelButton();
        checkExpectedResult("Can't cancel creating template", templatesPage.isCreateTemplateWindowPresent());
    }

    @Test
    public void closeWindowButton() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.clickOnCloseWindowButton();
        checkExpectedResult("Can't close create template window", templatesPage.isCreateTemplateWindowPresent());
    }

    @Test
    public void deleteTemplate() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("New Template for deleting");
        templatesPage.clickCreate();
        templatesPage.deleteNewTemplate();
        templatesPage.searchCreatedTemplate("New Template with Url");
        checkExpectedResult("Can't delete template", !(templatesPage.isTemplatePresent()));
    }

    @Test
    public void createTemplateUrl() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("New Template with Url");
        templatesPage.enterUrls("my.hideez.com");
        templatesPage.clickCreate();
        templatesPage.searchCreatedTemplate("New Template with Url");
        checkExpectedResult("Can't find new created template", templatesPage.isTemplatePresent());
        templatesPage.deleteNewTemplate();
    }

    @Test
    public void createTemplateApps() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("New Template with App");
        templatesPage.enterApps("skype");
        templatesPage.clickCreate();
        templatesPage.searchCreatedTemplate("New Template with App");
        checkExpectedResult("Can't find new created template", templatesPage.isTemplatePresent());
        templatesPage.deleteNewTemplate();
    }

    @Test
    public void editTemplateName() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("New Template for edit");
        templatesPage.enterUrls("my.hideez.com");
        templatesPage.enterApps("skype");
        templatesPage.clickCreate();
        templatesPage.searchCreatedTemplate("New Template for edit");
        templatesPage.editTemplateName("New Template Name after edit");
        templatesPage.searchCreatedTemplate("New Template Name after edit");
        checkExpectedResult("Can't find template with changed name", templatesPage.isTemplatePresent());
        templatesPage.deleteNewTemplate();
    }

    @Test
    public void editTemplateUrls() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("New Template for edit");
        templatesPage.enterUrls("my.hideez.com");
        templatesPage.enterApps("skype");
        templatesPage.clickCreate();
        templatesPage.searchCreatedTemplate("New Template for edit");
        templatesPage.editTemplateUrl("new.my.hideez.com");
        templatesPage.searchCreatedTemplate("new.my.hideez.com");
        checkExpectedResult("Can't find template with changed url", templatesPage.isTemplatePresent());
        templatesPage.deleteNewTemplate();
    }

    @Test
    public void editTemplateApps() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("New Template for edit");
        templatesPage.enterUrls("my.hideez.com");
        templatesPage.enterApps("skype");
        templatesPage.clickCreate();
        templatesPage.searchCreatedTemplate("New Template for edit");
        templatesPage.editTemplateApp("skype, slack");
        templatesPage.searchCreatedTemplate("skype, slack");
        checkExpectedResult("Can't find template with changed app", templatesPage.isTemplatePresent());
        templatesPage.deleteNewTemplate();
    }

    @Test
    public void sortTemplatesByName() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("ATemplate");
        templatesPage.clickCreate();
        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("ZTemplate");
        templatesPage.clickCreate();
        templatesPage.checkFirstTemplate("ATemplate");
        templatesPage.checkSecondTemplate("ZTemplate");
        templatesPage.clickSortByName();
        checkExpectedResult("The sort doesn't work properly", templatesPage.ifElementWereSorted("ZTemplate", "ATemplate"));
        templatesPage.searchCreatedTemplate("ATemplate");
        templatesPage.deleteNewTemplate();
        templatesPage.searchCreatedTemplate("ZTemplate");
        templatesPage.deleteNewTemplate();
    }

    @Test
    public void sortTemplatesByUrls() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("ATemplate");
        templatesPage.enterUrls("zatemplate.com");
        templatesPage.clickCreate();
        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("ZTemplate");
        templatesPage.enterUrls("aztemplate.com");
        templatesPage.clickCreate();
        templatesPage.checkFirstTemplateUrls("zatemplate.com");
        templatesPage.checkSecondTemplateUrls("aztemplate.com");
        templatesPage.clickSortByUrls();
        checkExpectedResult("The url sort doesn't work properly", templatesPage.ifElementWereSorted("aztemplate.com", "zatemplate.com"));
        templatesPage.searchCreatedTemplate("ATemplate");
        templatesPage.deleteNewTemplate();
        templatesPage.searchCreatedTemplate("ZTemplate");
        templatesPage.deleteNewTemplate();
    }

    @Test
    public void sortTemplatesByApps() {

        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("ATemplate");
        templatesPage.enterApps("zatemplateapp");
        templatesPage.clickCreate();
        templatesPage.clickOnCreateTemplateButton();
        templatesPage.enterNameOfTemplate("ZTemplate");
        templatesPage.enterApps("aztemplateapp");
        templatesPage.clickCreate();
        templatesPage.checkFirstTemplateApps("zatemplateapp");
        templatesPage.checkSecondTemplateApps("aztemplateapp");
        templatesPage.clickSortByApps();
        checkExpectedResult("The app sort doesn't work properly", templatesPage.ifElementWereSorted("aztemplateapp", "zatemplateapp"));
        templatesPage.searchCreatedTemplate("ATemplate");
        templatesPage.deleteNewTemplate();
        templatesPage.searchCreatedTemplate("ZTemplate");
        templatesPage.deleteNewTemplate();
    }

//    @Test
//    public void showDifferentNumberOfEntries() {
//
//        templatesPage.createTestTemplates(100);
//        templatesPage.chooseTwentyFiveEntries();
//        checkExpectedResult("Can't see the 25th element", templatesPage.ifTwentyFifthElementsPresent());
//        templatesPage.chooseFiftyEntries();
//        checkExpectedResult("Can't see the 50th element", templatesPage.ifFiftyElementsPresent());
//        templatesPage.chooseOneHundredEntries();
//        checkExpectedResult("Can't see the 100th element", templatesPage.ifOneHundredElementsPresent());
//        templatesPage.deleteTestTemplates(100);
//    }

}
