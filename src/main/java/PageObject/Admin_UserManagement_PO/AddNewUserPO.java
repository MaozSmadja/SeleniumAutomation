package PageObject.Admin_UserManagement_PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPO {


    @FindBy(id = "menu_admin_UserManagement")
    protected WebElement userManagementBTN;

    @FindBy(id = "btnAdd")
    public WebElement addBtn;

    @FindBy(id = "systemUser_userType")
    public WebElement userRole;

    @FindBy(xpath = "//*[@id='systemUser_employeeName_empName']")
    public WebElement employeeName;

    @FindBy(xpath = "//*[@class='ac_results']//strong")
    public WebElement employeeNamefromList;

    @FindBy(id = "systemUser_userName")
    public WebElement userNameField;

    @FindBy(id = "systemUser_status")
    public WebElement userStatus;

    @FindBy(id = "systemUser_password")
    public WebElement passwordField;

    @FindBy(id = "systemUser_confirmPassword")
    public WebElement confirmPasswordField;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    @FindBy(xpath = "//*[@id='systemUser_password_strength_meter']")
    public WebElement passwordStrength;

    @FindBy(xpath = "//strong[text()='Fi']/following-sibling::text()[1]")
    public WebElement chooseFiona;

    @FindBy(xpath = "//*[@class='helpText'][2]//span")
    public WebElement passwordLevelHelp;
}
