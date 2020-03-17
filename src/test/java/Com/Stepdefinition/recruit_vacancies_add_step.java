package Com.Stepdefinition;

import Com.pages.recruit_vacancies_add_pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class recruit_vacancies_add_step 
{
	recruit_vacancies_add_pages c = new recruit_vacancies_add_pages();
	@Given("^User Launch the Chrome browser$")
	public void user_Launch_the_Chrome_browser() throws Throwable {
	    c.ChromeLaunch();
	}

	@When("^User Open the Orange hrm login page$")
	public void user_Open_the_Orange_hrm_login_page() throws Throwable {
	   c.OrangeHRM_Homepage();
	}

	@Then("^User Enter the Username and password with valid data$")
	public void user_Enter_the_Username_and_password_with_valid_data() throws Throwable {
	   c.LoginDetails();
	}

	@Then("^user Should Submit the details$")
	public void user_Should_Submit_the_details() throws Throwable {
	    c.submit();
	}

	@Then("^user Searching the Candidate details$")
	public void user_Searching_the_Candidate_details() throws Throwable {
	   c.Search_item();
	}

	@Then("^add candidate details$")
	public void add_candidate_details() throws Throwable {
	    c.add_candidate();
	}

}
