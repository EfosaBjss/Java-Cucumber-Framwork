package util;

import org.openqa.selenium.WebDriver;

public class DriverUtil {

    public WebDriver driver;

    public void setDriver(String Browser){
       if(driver == null){
            if(Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\chromedriver.exe");
            }
         // WebDriver driver = new ChromeDriver();
           }
    }
}
