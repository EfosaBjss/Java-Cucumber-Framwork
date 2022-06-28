package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchRoleFilterPage;

public class SearchRoleFilterSteps {
    SearchRoleFilterPage searchRoleFilterPage = new SearchRoleFilterPage();

    @Given("I am on the search job page via life - explore roles")
    public void i_am_on_the_search_job_page_via_life_explore_roles() throws InterruptedException {
        searchRoleFilterPage.verifySearchJobPage();

    }
    @And("I enter the below searchCriteria")
    public void i_enter_the_below_search_criteria(io.cucumber.datatable.DataTable SearchCriteria) {
        searchRoleFilterPage.EnterSearchCriteria(SearchCriteria);

    }

    @When("I click on the update results button")
    public void i_click_on_the_update_results_button() {
        searchRoleFilterPage.ClickUpdateResults();

    }

    @Then("the results should be updated")
    public void the_results_should_be_updated() {
        searchRoleFilterPage.VerifyResults();

    }

}
