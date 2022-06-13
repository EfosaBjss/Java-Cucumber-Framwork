package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NavigateToPagesPage;

public class NavigateToPagesSteps {
    NavigateToPagesPage navigateToPagesPage = new NavigateToPagesPage();


    @Given("I navigate to the BJSS site")
    public void i_navigate_to_the_bjss_site() {
        navigateToPagesPage.LaunchURL();

    }
    @Given("I navigate to the  below pages by clicking the tabs")
    public void i_navigate_to_the_below_pages_by_clicking_the_tabs(io.cucumber.datatable.DataTable dataTable) {
        navigateToPagesPage.NavigateToPages(dataTable);

    }
    @Then("the career page should be displayed")
    public void the_career_page_should_be_displayed() {
        navigateToPagesPage.VerifyCareersPageIsDisplayed();

    }


    @Given("I am on the careers page")
    public void i_am_on_the_careers_page() throws InterruptedException {
        navigateToPagesPage.VerifyUserIsOnCareersPage();
    }

    @And("I click the life button")
    public void i_click_the_life_button() {
        navigateToPagesPage.ClickLifeLink();
    }

    @When("I click the explore roles button")
    public void i_click_the_explore_roles_button() throws InterruptedException {
        navigateToPagesPage.ClickExploreRolesLink();
    }

    @Then("I should be on the join the BJSS team page")
    public void i_should_be_on_the_join_the_bjss_team_page() {
        navigateToPagesPage.VerifyJobSearchPage();
    }

}
