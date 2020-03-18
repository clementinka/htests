package suits;

import administratorsTest.AdministratorsTest;
import authorizationTests.AuthorizationTest;
import dashboardTest.DashboardTest;
import dataProtectionTest.DataProtectionTest;
import deviceAccessProfilesTest.DeviceAccessProfilesTest;
import eventsTests.EventsTests;
import groupsTest.GroupsTest;
import loginTest.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sessionsTests.SessionsTests;
import sharedAccountTest.SharedAccountsTest;
import summariesTests.SummariesSortTests;
import templatesTest.TemplatesTest;


@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
//                AdministratorsTest.class,
                AuthorizationTest.class,
//                DashboardTest.class,
//                DataProtectionTest.class,
//                EventsTests.class,
                GroupsTest.class,
//                LoginTest.class,
//                SessionsTests.class,
//                SharedAccountsTest.class,
//                SummariesSortTests.class,
//                TemplatesTest.class,
//                DeviceAccessProfilesTest.class
        }
)

public class RegressionSuite {

}
