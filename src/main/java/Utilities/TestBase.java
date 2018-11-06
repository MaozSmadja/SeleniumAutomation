package Utilities;

import PageObject.Admin_UserManagement_PO.AddNewUserPO;
import Pages.DashboardPage.DashboardPage;
import Pages.FirstLevelMenuPage;
import Pages.LoginPage;
import Pages.UserManagementPage.AddNewUserPage;
import org.apache.commons.logging.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {

    private static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    protected LoginPage loginPage;
    protected FirstLevelMenuPage firstLevelMenuPage;
    protected DashboardPage dashboardPage;
    private WebDriverWait wait;
    protected AddNewUserPage addNewUserPage;
    public TestUtils testUtils;
    static Logger log = LogManager.getLogger(Log.class);


    public WebDriver getDriver() {
        //Get driver from ThreadLocalMap
        return driver.get();
    }

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void createInstance(String browser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        switch (browser) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");

                caps.setCapability("browserName", browser);
                log.info("Executing on firefox");
                driver.set(new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), caps));
                System.out.println("firefox started in session id " + Thread.currentThread().getId());
                break;

            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
                caps.setCapability("browserName", browser);
                log.info("Executing on chrome");
                driver.set(new RemoteWebDriver(new URL("http://localhost:4545/wd/hub"), caps));
                System.out.println("Chrome started in session id " + Thread.currentThread().getId());
                break;
        }
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(getDriver(), 180);
        loginPage = new LoginPage(getDriver());
        firstLevelMenuPage = new FirstLevelMenuPage(getDriver());
        dashboardPage = new DashboardPage(getDriver());
        addNewUserPage = new AddNewUserPage(getDriver());
        testUtils = new TestUtils();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }

    @AfterSuite
    public void teart() {
        driver.remove();
    }
//

}

