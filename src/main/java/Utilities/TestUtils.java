package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestUtils extends TestBase{

    public  void takeScreenShot(String result) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formater = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss");

        try {
            File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\screenshot\\" + result + "_" + formater.format(calendar.getTime()) + ".png"));
        } catch (Exception e) {
            log.info("Exception while taking screenshot: "+e.getMessage());
        }
    }

    public String getTxt(WebElement element){
        String str = element.getText();
        return str;
    }

}
