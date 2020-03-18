package eventsTests;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class EventsTests extends AbstractParentTest {

    @Before
    public void preconditions() {

        loginPage.openPage();
        loginPage.checkCurrentUrl();
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.leftMenu.clickOnMenuAudit();
        dashboardPage.leftMenu.clickOnSubMenuEvents();
        eventsPage.checkCurrentUrl();
    }

    @Test
    public void sortByDate() {

        eventsPage.saveFirstDateInList();
        eventsPage.clickOnSortByDateButton();
        eventsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sorting by date doesn't work", eventsPage.ifElementsSorted());
    }

    @Test
    public void sortByEvent() {

        eventsPage.saveFirstDateInList();
        eventsPage.clickOnSortByEventButton();
        eventsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sorting by event doesn't work", eventsPage.ifElementsSorted());
    }

    @Test
    public void sortBySeverity() {

        eventsPage.saveFirstDateInList();
        eventsPage.clickOnSortBySeverityButton();
        eventsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sorting by severity doesn't work", eventsPage.ifElementsSorted());
    }

    @Test
    public void sortByNote() {

        eventsPage.saveFirstDateInList();
        eventsPage.clickOnSortByNoteButton();
        eventsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sorting by note doesn't work", eventsPage.ifElementsSorted());
    }

    @Test
    public void sortBySession() {

        eventsPage.saveFirstDateInList();
        eventsPage.clickOnSortBySessionButton();
        eventsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sorting by session doesn't work", eventsPage.ifElementsSorted());
    }

    @Test
    public void sortByDevice() {

        eventsPage.saveFirstDateInList();
        eventsPage.clickOnSortByDeviceButton();
        eventsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sorting by device doesn't work", eventsPage.ifElementsSorted());
    }

//    @Test
//    public void sortByEmployee() {
//
//        eventsPage.saveFirstDateInList();
//        eventsPage.clickOnSortByEmployeeButton();
//        eventsPage.saveFirstDateInListAfterSorting();
//        checkExpectedResult("Sorting by employee doesn't work", eventsPage.ifElementsSorted());
//    }


    @Test
    public void sortByWorkstation() {

        eventsPage.saveFirstDateInList();
        eventsPage.clickOnSortByWorkstationButton();
        eventsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sorting by workstation doesn't work", eventsPage.ifElementsSorted());
    }
}
