package Pages;

import PageObject.LoginPageObject;
import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends PageBase {

    LoginPageObject loginPageObject = new LoginPageObject();

    public LoginPage(WebDriver  driver) {
        super(driver);
        PageFactory.initElements(driver, loginPageObject);
    }

    public void insertUserName(String userName) {
        loginPageObject.userNameInput.sendKeys(userName);
    }

    public void insertPassword(String password) {
        loginPageObject.passwordInput.sendKeys(password);
    }

    public void pressLoginBtn() {
        loginPageObject.loginBtn.click();
    }

    public void sanityTest() {
        loginPageObject.userNameInput.sendKeys("Admin");
        loginPageObject.passwordInput.sendKeys("admin123");
        loginPageObject.loginBtn.click();
    }
}
