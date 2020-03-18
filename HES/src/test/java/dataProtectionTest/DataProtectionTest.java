package dataProtectionTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Before;
import org.junit.Test;

public class DataProtectionTest extends AbstractParentTest {

    @Before
    public void preconditions(){
        loginPage.fillingLoginFormAndSubmitIt("admin@hideez.com", "admin");
        dashboardPage.checkCurrentUrl();
        dashboardPage.leftMenu.clickOnMenuSettings();
        dashboardPage.leftMenu.clickOnSubMenuDataProtection();
        dataProtectionPage.checkCurrentUrl();
        dataProtectionPage.turnOffDataProtectionIfEnabled();
    }

    @Test
    public void dataProtectionTest() {
        dataProtectionPage.clickOnEnableDataProtectionButton();
        dataProtectionPage.enterNewPassword("123007");
        dataProtectionPage.confirmPassword("123007");
        dataProtectionPage.clickEnableButton();
        checkExpectedResult("Can't enable data protection", dataProtectionPage.isDataProtectionEnabled());

        dataProtectionPage.clickOnChangeEncryptionPassword();
        dataProtectionPage.enterCurrentPassword("123007");
        dataProtectionPage.enterNewPasswordForChanging("123456");
        dataProtectionPage.confirmPasswordForChanging("123456");
        dataProtectionPage.clickChangeButton();
        checkExpectedResult("Can't change data protection password", dataProtectionPage.isPasswordChanged());

        dataProtectionPage.clickOnDisableDataProtectionButton();
        dataProtectionPage.enterCurrentEncryptionPassword("123456");
        dataProtectionPage.clickDisableButton();
        checkExpectedResult("Can't disable data protection", dataProtectionPage.isAbilityToEnableDataProtection());
    }
}