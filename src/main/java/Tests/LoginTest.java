package Tests;

import Utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test(priority = 1)
    public  void test() throws InterruptedException {

        getDriver().get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        loginPage.insertUserName("Admin");
        loginPage.insertPassword("admin123");
        loginPage.pressLoginBtn();
    }

    @Test(priority = 2)
    public  void pressAdminTab() throws InterruptedException {
        getDriver().get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);
        loginPage.insertUserName("Admin");
        loginPage.insertPassword("admin123");
        loginPage.pressLoginBtn();
        firstLevelMenuPage.pressAdminTab();
    }
}
