package Tests;

import Utilities.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstLevelTabsTest extends TestBase {

    @BeforeMethod
    public void beforeTabsTest() {
        getDriver().get("https://opensource-demo.orangehrmlive.com/");
        loginPage.sanityTest();
    }

    @Test(priority = 1)
    public void pressAdminTab() {
        firstLevelMenuPage.pressAdminTab();
    }

    @Test(priority = 2)
    public void pressPIMTab() {
        firstLevelMenuPage.pressPIMTab();
    }

    @Test(priority = 3)
    public void pressLeaveTab() {
        firstLevelMenuPage.pressLeaveTab();
    }

    @Test(priority = 4)
    public void pressTimeTab() {
        firstLevelMenuPage.pressTimeTab();
    }

    @Test(priority = 5)
    public void pressRecruitmentTab() {
        firstLevelMenuPage.pressRecruitmentTab();
    }

    @Test(priority = 6)
    public void pressPerformanceTab() {
        firstLevelMenuPage.pressPerformanceTab();
    }

    @Test(priority = 7)
    public void pressDashoardTab() {
        firstLevelMenuPage.pressDasboardTab();
    }
}
