package PageObject.Dashboard_PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPO {


    @FindBy(xpath = "//span[contains(@class, 'quickLinkText') and text() = 'Assign Leave']")
    public WebElement assignLeave;

    @FindBy(xpath = "//span[contains(@class, 'quickLinkText') and text() = 'Leave List']")
    public WebElement leaveListBtn;

    @FindBy(xpath = "//span[contains(@class, 'quickLinkText') and text() = 'Timesheets']")
    public WebElement timeSheetsBtn;




}
