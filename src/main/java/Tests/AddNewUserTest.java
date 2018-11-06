package Tests;

import Utilities.TestBase;
import Utilities.TestUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewUserTest extends TestBase {

    @Test(description ="Add new user with admin role")
    public void createValidUser() throws InterruptedException {
        getDriver().get("https://opensource-demo.orangehrmlive.com/");
        loginPage.sanityTest();
        firstLevelMenuPage.pressAdminTab();
        addNewUserPage.pressAddButton();
        addNewUserPage.chooseUserRole("Admin");
        addNewUserPage.insertEmployeeName("Fiona Grace");
        Assert.assertTrue(addNewUserPage.getEmployeeNameTxt().contains(addNewUserPage.getEmployeeName()));
        addNewUserPage.insertUserName("Shlomiani");
        addNewUserPage.inserPassword("12121212");
        Assert.assertEquals(addNewUserPage.getPasswordStrengthLvl(),addNewUserPage.veryLow_strength);
        Assert.assertEquals(addNewUserPage.getPasswordHelpTxt(),addNewUserPage.passwordHelp);
        addNewUserPage.confirmPassword("12121212");
        addNewUserPage.pressSaveButton();
        addNewUserPage.assertData();
    }

}
