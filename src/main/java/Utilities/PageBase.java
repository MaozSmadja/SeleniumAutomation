package Utilities;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.FileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase extends TestBase {

  public WebDriverWait wait;

    public PageBase(WebDriver  driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,120);

    }
}

