package Pages.DashboardPage;

import PageObject.Dashboard_PO.AssignLeavePO;
import PageObject.Dashboard_PO.DashboardPO;
import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends PageBase {

    private DashboardPO dashboardPO = new DashboardPO();
    private AssignLeavePO assignLeavePO = new AssignLeavePO();

    public DashboardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, dashboardPO);
        PageFactory.initElements(driver, assignLeavePO);

    }

    public void clickAssignLeave() {
        dashboardPO.assignLeave.click();
    }

    public void clickLeaveList() {
        dashboardPO.leaveListBtn.click();
    }

    public void clickTimesheets() {
        dashboardPO.timeSheetsBtn.click();
    }

    public String getAssignLeaveText() {
        String str = wait.until(ExpectedConditions.visibilityOf(assignLeavePO.assignLeaveTXT)).getText();
        return str;
    }


}
