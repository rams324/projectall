package stepdifinition;

import org.openqa.selenium.WebDriver;

import Page.search;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchSD
{
	WebDriver driver;
	search page5=new search();
	

@Given("^user launch the chrome browser5(\\d+)$")
public void user_launch_the_chrome_browser5(int arg1)
{
	page5.chromelaunching5(); 
}

@When("^user open the orange hrm login page5(\\d+)$")
public void user_open_the_orange_hrm_login_page5(int arg1) 
{
	page5.orangeHRM_homePage5();
}

@Then("^login with valid details5(\\d+)$")
public void login_with_valid_details5() 
{
	page5.login_details5(); 
}
@Then("^searching for employee in the admin page$")
public void searching_for_employee_in_the_admin_page()
{
	page5.searching();
}
}
