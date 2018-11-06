package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstLevelMenuPageObject {

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement adminTab;

    @FindBy(id = "menu_admin_viewAdminModule")
    public WebElement pimTab;

    @FindBy(id = "menu_leave_viewLeaveModule")
    public WebElement leaveTab;

    @FindBy(id = "menu_time_viewTimeModule")
    public WebElement timeTab;

    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    public WebElement recruitmentTab;

    @FindBy(id = "menu__Performance")
    public WebElement performanceTab ;

    @FindBy(id = "menu_dashboard_index")
    public WebElement dashboardTab ;
}
