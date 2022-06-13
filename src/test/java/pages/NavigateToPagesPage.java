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
    By ClickLifeButton = By.xpath("//*[@id=\"hs_cos_wrapper_module_16385730801841\"]/nav/div/div[2]/ul/li[3]/a");
    By ClickExploreButton = By.cssSelector("#hs_cos_wrapper_module_16385751852013 > div > div > div.md\\:pr-12.md\\:w-2\\/3.w-full.up-when-in.relative.z-10.active > a");



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

      // clicking on the insights tab
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ClickInsightsTab)).click();
        String ActualTitle = "Insights | BJSS";
        String ExpectedTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println(insightsTab);

        //clicking on Your Industry tab
        driver.findElement(ClickYourIndustryTab).click();
        boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Industry Expertise | BJSS");
        Assert.assertTrue(verifyTitle);
        System.out.println(industryTab);

        //clicking on contact tab
        driver.findElement(ClickContactTab).click();
        verifyTitle = driver.getTitle().equalsIgnoreCase("Contact BJSS | BJSS");
        Assert.assertTrue(verifyTitle);
        System.out.println(contactsTab);

        //clicking on About Bjss Tab
        driver.findElement(ClickAboutBJSSTab).click();
        verifyTitle = driver.getTitle().equalsIgnoreCase("About BJSS - Why Choose Us | BJSS");
        Assert.assertTrue(verifyTitle);
        System.out.println(aboutBJSS);

        //clicking on careers tab
        driver.findElement(ClickCareersTab).click();
        String Actual_Title = "Careers | Overview";
        String Expected_Title = driver.getTitle();
        Assert.assertEquals(Expected_Title, Actual_Title);
        System.out.println(careersTab);

    }

    // asserting that we are on the career page by verifying title
 public void VerifyCareersPageIsDisplayed (){
        String ActualTitle = "Careers | Overview";
        String ExpectedTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        Assert.assertEquals(ExpectedTitle, ActualTitle);

 }

    public void VerifyUserIsOnCareersPage() throws InterruptedException{
        boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Careers | Overview");
        if (verifyTitle){System.out.println("career page is verified");
        }else {System.out.println("cannot verify career page");}
        Thread.sleep(3000);

    }

    public void ClickLifeLink (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ClickLifeButton)).click();
    }

    public void ClickExploreRolesLink () throws InterruptedException {
        driver.findElement(ClickExploreButton).click();
        Thread.sleep(3000);
    }

    public void VerifyJobSearchPage (){
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = "Careers | Search";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println(driver.getTitle());
    }
}
