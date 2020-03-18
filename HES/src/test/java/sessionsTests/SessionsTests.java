package sessionsTests;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class SessionsTests extends AbstractParentTest {

    @Before
    public void preconditions(){
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.leftMenu.clickOnMenuAudit();
        dashboardPage.leftMenu.clickOnSubMenuSessions();
        sessionsPage.checkCurrentUrl();
    }

    @Test
    public void sortByStartDate(){
        sessionsPage.saveFirstDateInList();
        sessionsPage.clickOnSortByStartDate();
        sessionsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sort by start date doesn't work", sessionsPage.ifElementsSorted());
    }

    @Test
    public void sortByEndDate(){
        sessionsPage.saveFirstDateInList();
        sessionsPage.clickOnSortByEndDate();
        sessionsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sort by end date doesn't work", sessionsPage.ifElementsSorted());
    }

    @Test
    public void sortByDuration(){
        sessionsPage.saveFirstDateInList();
        sessionsPage.clickOnSortByDuration();
        sessionsPage.saveFirstDateInListAfterSorting();
        checkExpectedResult("Sort by duration doesn't work", sessionsPage.ifElementsSorted());
    }
//
//    @Test
//    public void sortByUnlockedBy(){
//        sessionsPage.saveFirstDateInList();
//        sessionsPage.clickOnSortByUnlockedBy();
//        sessionsPage.saveFirstDateInListAfterSorting();
//        checkExpectedResult("Sort by Unlocked By doesn't work", sessionsPage.ifElementsSorted());
//    }

//    @Test
//    public void sortByWorkstation(){
//        sessionsPage.saveLastDateInList();
//        sessionsPage.clickOnSortByWorkstation();
//        sessionsPage.saveLastDateInListAfterSorting();
//        checkExpectedResult("Sort by workstation doesn't work", sessionsPage.ifElementsSorted());
//    }

//    @Test
//    public void sortBySession(){
//        sessionsPage.saveLastDateInList();
//        sessionsPage.clickOnSortBySession();
//        sessionsPage.saveLastDateInListAfterSorting();
//        checkExpectedResult("Sort by session doesn't work", sessionsPage.ifElementsSorted());
//    }

//    @Test
//    public void sortByDevice(){
//        sessionsPage.saveLastDateInList();
//        sessionsPage.clickOnSortByDevice();
//        sessionsPage.saveLastDateInListAfterSorting();
//        checkExpectedResult("Sort by device doesn't work", sessionsPage.ifElementsSorted());
//    }
//
//    @Test
//    public void sortByEmployee(){
//        sessionsPage.saveLastDateInList();
//        sessionsPage.clickOnSortByEmployee();
//        sessionsPage.saveLastDateInListAfterSorting();
//        checkExpectedResult("Sort by employee doesn't work", sessionsPage.ifElementsSorted());
//    }
}
