package Com.Stepdefinition;

import Com.pages.recruit_vacancies_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class recruit_vacancies_step 
{
	recruit_vacancies_page b = new recruit_vacancies_page();
	@Given("^User launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
	   b.ChromeLaunch();
	}

	@When("^User open the orange hrm login page$")
	public void user_open_the_orange_hrm_login_page() throws Throwable {
	    b.OrangeHRM_Homepage();
	}

	@Then("^User enter the username and password with valid data$")
	public void user_enter_the_username_and_password_with_valid_data() throws Throwable {
	  b.LoginDetails();
	}

	@Then("^User submit the details$")
	public void user_submit_the_details() throws Throwable {
	    b.submit();
	}

	@Then("^User searching the vacancies$")
	public void user_searching_the_vacancies() throws Throwable {
	    b.Search_item();
	}
}
