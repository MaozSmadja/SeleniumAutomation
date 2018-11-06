package Pages.UserManagementPage;

import PageObject.Admin_UserManagement_PO.AddNewUserPO;
import Utilities.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class AddNewUserPage extends PageBase {


    final public String veryLow_strength = "Very Weak";
    final public String passwordHelp = "For a strong password, please use a hard to guess combination of text with upper and lower case characters, symbols and numbers";

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------

    AddNewUserPO addNewUserPO = new AddNewUserPO();
    String employeeName;
    String userName;
    String role;
    String status;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public AddNewUserPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, addNewUserPO);
    }

    //Press "add" new user button
    public void pressAddButton() {
        addNewUserPO.addBtn.click();
    }
    //Choose user role, Admin/Ess
    public void chooseUserRole(String role) {
        Select rolesList = new Select(addNewUserPO.userRole);
        setRole(role);
        rolesList.selectByVisibleText(getRole());
    }
    //Insert employee name
    public void insertEmployeeName(String employeeName) throws InterruptedException {
        setEmployeeName(employeeName);
        addNewUserPO.employeeName.sendKeys(employeeName);
        addNewUserPO.employeeNamefromList.click();
    }

    //Get employee name for verify
    public String getEmployeeNameTxt() {
        String str = addNewUserPO.employeeName.getAttribute("value");
        return str;
    }
    //Insert user name
    public void insertUserName(String userName) {
        setUserName(userName);
        addNewUserPO.userNameField.sendKeys(getUserName());
    }
    //Choose user status
    public void chooseStatus(String Enabled_Disabled) {
        Select statusFromList = new Select(addNewUserPO.userStatus);
        setStatus(employeeName);
        statusFromList.selectByValue(getStatus());
    }
    //Insert password
    public void inserPassword(String pass) {
        addNewUserPO.passwordField.sendKeys(pass);
    }
    //Confirm password
    public void confirmPassword(String pass) {
        addNewUserPO.confirmPasswordField.sendKeys(pass);
    }
    //Press save button at the end
    public void pressSaveButton() {
        addNewUserPO.saveBtn.click();
    }
    //Get password strength level
    public String getPasswordStrengthLvl() {
//        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(true);", addNewUserPO.passwordStrength);
//        String str = addNewUserPO.passwordStrength.getAttribute("innerText");
        String str = getDriver().findElement(By.xpath("//span[text()='Very Weak']")).getText();

        return str;
    }
    //Get password help
    public String getPasswordHelpTxt() {
        String str = addNewUserPO.passwordLevelHelp.getText();
        return str;
    }
    //Assert the user created in the DB, running on the table looking for the user created.
    public void assertData() {
        List tr_rows = getDriver().findElements(By.xpath("//*/tbody/tr"));
        int tr_rowsSize = tr_rows.size();
        List td_rows = getDriver().findElements(By.xpath("//*/tbody/td"));
        int td_rowsSize = td_rows.size();
        String sRow = "1";
        String sCol = "2";
        for (int i = 1; i <= tr_rowsSize; i++) {
            String sValue = getDriver().findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]//a")).getText();
            if (sValue.equalsIgnoreCase(getUserName())) {
                for (int j = 2; j <= td_rowsSize; j++) {
                    String sColumnValue = getDriver().findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                    switch (j) {
                        case 3:
                            Assert.assertEquals(sColumnValue, getRole());
                            break;
                        case 4:
                            Assert.assertEquals(sColumnValue, getEmployeeName());
                            break;
                        case 5:
                            Assert.assertEquals(sColumnValue, getStatus());
                            break;
                    }
                    System.out.println(sColumnValue);
                }
                break;
            }
        }

    }
}
