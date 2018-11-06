package Pages;

import PageObject.FirstLevelMenuPageObject;
import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstLevelMenuPage extends PageBase {

    private FirstLevelMenuPageObject firstLevelMenuPageObject = new FirstLevelMenuPageObject();

    public FirstLevelMenuPage(WebDriver  driver) {
        super(driver);
        PageFactory.initElements(driver, firstLevelMenuPageObject);
    }

    public void pressAdminTab() {
        wait.until(ExpectedConditions.visibilityOf(firstLevelMenuPageObject.adminTab)).click();
//        firstLevelMenuPageObject.adminTab.click();
    }

    public void pressPIMTab() {
        firstLevelMenuPageObject.pimTab.click();
    }

    public void pressLeaveTab() {
        firstLevelMenuPageObject.leaveTab.click();
    }

    public void pressTimeTab() {
        firstLevelMenuPageObject.timeTab.click();
    }

    public void pressRecruitmentTab() {
        firstLevelMenuPageObject.recruitmentTab.click();
    }

    public void pressPerformanceTab() {
        firstLevelMenuPageObject.performanceTab.click();
    }

    public void pressDasboardTab() {
        firstLevelMenuPageObject.dashboardTab.click();
    }

}
