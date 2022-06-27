package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

import java.time.Duration;
import java.util.List;

public class SearchRoleFilterPage extends DriverUtil {

    By CountryFilter = By.xpath("//*[@id=\"filter--country\"]/select");
    By CityFilter = By.xpath("//*[@id=\"filter--location\"]/select");
    By TeamFilter = By.xpath("//*[@id=\"filter--team\"]/select");
    By EmploymentType = By.xpath("//*[@id=\"filter--type\"]/select");
    By ClickUpdateResults = By.xpath("//*[@id=\"form_id\"]/div[8]/div/div[1]/input");

    String ActualTitle = "Careers | Search";


    public void verifySearchJobPage () throws  InterruptedException{
        String ExpectedTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
    }

   public void EnterSearchCriteria (io.cucumber.datatable.DataTable SearchCriteria){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(CountryFilter)));

       Actions actions = new Actions(driver);
       actions.sendKeys(Keys.PAGE_UP).build().perform();

       List<List<String>> data = SearchCriteria.asLists(String.class);

        System.out.println(data.get(0).get(1));

       String ByCountry = data.get(1).get(1);
       String ByCity   = data.get(2).get(1);
       String ByTeam = data.get(3).get(1);
       String ByEmploymentType = data.get(4).get(1);

       Select country = new Select(driver.findElement(CountryFilter));
       country.selectByVisibleText(ByCountry);

       Select city = new Select(driver.findElement(CityFilter));
       city.selectByVisibleText(ByCity);

       Select team = new Select(driver.findElement(TeamFilter));
       team.selectByVisibleText(ByTeam);

       Select type = new Select(driver.findElement(EmploymentType));
       type.selectByVisibleText(ByEmploymentType);
    }

    public void ClickUpdateResults (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ClickUpdateResults)).click();
    }

}
