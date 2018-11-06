package Tests;

import Utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignLeaveTest extends TestBase {

    @BeforeMethod
    public void beforeTabsTest() {
        getDriver().get("https://opensource-demo.orangehrmlive.com/");
        loginPage.sanityTest();
    }
    @Test
    public void openAssignLeave() throws InterruptedException {
        Thread.sleep(2000);
        dashboardPage.clickAssignLeave();
        Assert.assertEquals(dashboardPage.getAssignLeaveText(), "Assign Leave");
    }
}
