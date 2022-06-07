package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CareersPage;

public class CareersSteps {
CareersPage careersPage = new CareersPage();

    @Given("^I navigate to Bjss site$")
    public void i_navigate_to_Bjss_site() throws Throwable {
        careersPage.LaunchURL();
    }

    @When("^I choose navigate to the careers page$")
    public void i_choose_navigate_to_the_careers_page() throws Throwable {
        careersPage.ClickCareerButton();
    }

    @Then("^I should see the careers page displayed$")
    public void i_should_see_the_careers_page_displayed() throws Throwable {
        careersPage.VerifyCareersPageIsDisplayed();
    }
}
