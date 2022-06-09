package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
}
