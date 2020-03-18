package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import io.qameta.allure.*;

import java.util.Arrays;
import java.util.Collection;

@Epic("HES Test Reports")
@Feature("LogOn")

@RunWith(Parameterized.class)

public class LoginTest extends AbstractParentTest {
    String login, pass;

    public LoginTest(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }


    @Parameterized.Parameters(name = "Parameters are *{0} and {1}")
    public static Collection PositiveTestData() {
        return Arrays.asList(new Object[][]{
                        {"Admin@hideez.com", "admin"},
                        {"ADMIN@HIDEEZ.COM", "admin"},  //LoginUppercase
                        {"admin@hideez.com", "admin"},  //LoginLowercase
                }

        );
    }


    @Description("Some detailed test description")
    @Story("Base support for bdd annotations")
    @Link("http://publicdemo.hideez.com")
    @Link(name = "allure", type = "mylink")
    @Issue("123")
    @Issue("432")
    @Severity(SeverityLevel.CRITICAL)

    @Test
    public void validTest() {
        loginPage.openPage();
        loginPage.checkCurrentUrl();
        Assert.assertTrue("LogIn button is displayed", loginPage.isPageLoaded());
        loginPage.enterLoginInToInputLogin(login);
        loginPage.enterPassInToInputPassword(pass);
        loginPage.clickOnButtonLogIn();
        dashboardPage.checkCurrentUrl();
        checkExpectedResult("Dashboard Avatar is not present", dashboardPage.isAvatarDisplayed());
        Assert.assertEquals(dashboardPage.getTitle(), "Dashboard - HES");

    }

}
