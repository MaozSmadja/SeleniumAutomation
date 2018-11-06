package PageObject;

import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject  {


    @FindBy(id = "txtUsername")
    public WebElement userNameInput;

    @FindBy(id ="txtPassword")
    public WebElement passwordInput;

    @FindBy(id = "btnLogin")
    public WebElement loginBtn;


}
