package uk.co.cv_library.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.cv_library.pages.HomePage;

public class JobSearchTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on the accept cookies button$")
    public void iClickOnTheAcceptCookiesButton() {
    }

    @And("^I can enter the job title in job title field \"([^\"]*)\"$")
    public void iCanEnterTheJobTitleInJobTitleField(String jobTitle){
        // Write code here that turns the phrase above into concrete actions
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^i can enter the location in location field \"([^\"]*)\"$")
    public void iCanEnterTheLocationInLocationField(String location){
        // Write code here that turns the phrase above into concrete actions
        new HomePage().enterLocation(location);
    }

    @And("^i can enter the distance in the distance field \"([^\"]*)\"$")
    public void iCanEnterTheDistanceInTheDistanceField(String distance) {
        // Write code here that turns the phrase above into concrete actions
        new HomePage().selectDistance(distance);
    }

    @And("^i can click on the more search options button$")
    public void iCanClickOnTheMoreSearchOptionsButton() {
        new HomePage().clickOnMoreSearchOption();
    }

    @And("^i can enter min salary in the min salary field \"([^\"]*)\"$")
    public void iCanEnterMinSalaryInTheMinSalaryField(String minSalary) {
        // Write code here that turns the phrase above into concrete actions
        new HomePage().enterMinSalary(minSalary);
    }

    @And("^i can enter max salary in the max salary field \"([^\"]*)\"$")
    public void iCanEnterMaxSalaryInTheMaxSalaryField(String maxSalary) {
        // Write code here that turns the phrase above into concrete actions
        new HomePage().enterMaxSalary(maxSalary);
    }

    @And("^i can select the type of salary in the salary type field \"([^\"]*)\"$")
    public void iCanSelectTheTypeOfSalaryInTheSalaryTypeField(String salaryType) {
        // Write code here that turns the phrase above into concrete actions
        new HomePage().selectSalaryType(salaryType);
    }

    @And("^i can select the type of job term in the job type field \"([^\"]*)\"$")
    public void iCanSelectTheTypeOfJobTermInTheJobTypeField(String jobType) {
        // Write code here that turns the phrase above into concrete actions
        new HomePage().selectJobType(jobType);
    }

    @Then("^i can click on the find jobs button$")
    public void iCanClickOnTheFindJobsButton() {
        new HomePage().clickOnFindJobs();
    }
}
