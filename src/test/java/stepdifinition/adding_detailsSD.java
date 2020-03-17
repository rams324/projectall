package stepdifinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Page.adding_details;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class adding_detailsSD 
{
	WebDriver driver;
	adding_details page2=new adding_details();
	
	@Given("^user launch the chrome browser2$")
	public void user_launch_the_chrome_browser2() 
	{
		page2.chromelaunching2() ;
	  
	}

	@When("^user open the orange hrm login page2$")
	public void user_open_the_orange_hrm_login_page2()
	{
		page2.orangeHRM_homePage2();
	}
	@Then("^login with valid details2$")
	public void login_with_valid_details2() throws IOException, InterruptedException 
	{
		page2.login_details2();
	}

//	@Then("^user enter the username and password with valid data1$")
//	public void user_enter_the_username_and_password_with_valid_data() throws IOException, InterruptedException
//	{
//		page2.usernamepassword1(1);
//
//	}

	@Then("^user is able to add the new user in the admin page$")
	public void user_is_able_to_add_the_new_user_in_the_admin_page()
	{
		page2.add_details();
	}

}
