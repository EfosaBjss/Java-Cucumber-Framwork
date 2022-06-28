package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtil {

    public static WebDriver driver;

    public void setDriver(String Browser){
       if(driver == null){
            if(Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
            }
            driver = new ChromeDriver();
           }
    }

    public void closeDriver (){
        driver.quit();
    }
}
