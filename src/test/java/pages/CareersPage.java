package pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class CareersPage {

    By AllowAll = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By ClickCareersPage = By.xpath("//*[@id=\"hs_menu_wrapper_header_menu\"]/ul/li[6]/a");


    WebDriver driver = new ChromeDriver();
   String BaseUrl = "https://www.bjss.com/";

    public void LaunchURL (){
        driver.get(BaseUrl);
        driver.manage().window().maximize();
        driver.findElement(AllowAll).click();
        String ActualTitle = "World-Class Business Technology Consultancy | BJSS";
        String ExpectedTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle,ActualTitle);
}

    public void ClickCareerButton (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ClickCareersPage)).click();
}
 public void VerifyCareersPageIsDisplayed (){
        String ActualTitle = "Careers | Overview";
        String ExpectedTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(ExpectedTitle, ActualTitle);

 }
}
