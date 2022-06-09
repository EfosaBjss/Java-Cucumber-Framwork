package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class NavigateToPagesPage {

    By AllowAll = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By ClickCareersTab = By.xpath("//*[@id=\"hs_menu_wrapper_header_menu\"]/ul/li[6]/a");
    By ClickInsightsTab = By.xpath("//*[@id=\"hs_menu_wrapper_header_menu\"]/ul/li[5]/a");
    By ClickYourIndustryTab = By.xpath("//*[@id=\"hs_menu_wrapper_header_menu\"]/ul/li[3]/a");
    By ClickContactTab = By.xpath("//*[@id=\"hs_menu_wrapper_header_menu\"]/ul/li[7]/a");
    By ClickAboutBJSSTab = By.xpath("//*[@id=\"hs_menu_wrapper_header_menu\"]/ul/li[1]/a");



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

    public void NavigateToPages(io.cucumber.datatable.DataTable dataTable){
        List<String> data = dataTable.asList();

        String insightsTab = data.get(1);
        String industryTab = data.get(2);
        String contactsTab = data.get(3);
        String aboutBJSS = data.get(4);
        String careersTab = data.get(5);

        System.out.println(data.get(0));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ClickInsightsTab)).click();
        String ActualTitle = "Insights | BJSS";
        String ExpectedTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println(insightsTab);

        driver.findElement(ClickYourIndustryTab).click();
        boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Industry Expertise | BJSS");
        Assert.assertTrue(verifyTitle);
        System.out.println(industryTab);

        driver.findElement(ClickContactTab).click();
        verifyTitle = driver.getTitle().equalsIgnoreCase("Contact BJSS | BJSS");
        Assert.assertTrue(verifyTitle);
        System.out.println(contactsTab);

        driver.findElement(ClickAboutBJSSTab).click();
        verifyTitle = driver.getTitle().equalsIgnoreCase("About BJSS - Why Choose Us | BJSS");
        Assert.assertTrue(verifyTitle);
        System.out.println(aboutBJSS);

        driver.findElement(ClickCareersTab).click();
        String Actual_Title = "Careers | Overview";
        String Expected_Title = driver.getTitle();
        Assert.assertEquals(Expected_Title, Actual_Title);
        System.out.println(careersTab);

    }

 public void VerifyCareersPageIsDisplayed (){
        String ActualTitle = "Careers | Overview";
        String ExpectedTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(ExpectedTitle, ActualTitle);

 }
}
