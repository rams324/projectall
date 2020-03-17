package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Links;

public class LinkStep {
	WebDriver driver;
	Links l=new Links();
	@Given("^user launch the chrome Browser$")
	public void user_launch_the_chrome_Browser() throws Throwable {
		l.launchbrowser();
	   
	}

	@When("^user open the orangehrm Login page$")
	public void user_open_the_orangehrm_Login_page() throws Throwable {
		l.log_page();
	   
	}

	@Then("^user enter the username and password with Valid data$")
	public void user_enter_the_username_and_password_with_Valid_data() throws Throwable {
		l.loginData();
	  
	}

	@Then("^user click the Login Button$")
	public void user_click_the_Login_Button() throws Throwable {
		l.submit();

	   
	}

	@Then("^user  click Leave link in the dash borad page$")
	public void user_click_Leave_link_in_the_dash_borad_page() throws Throwable {
		l.click();
	   
	}


}
