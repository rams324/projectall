package stepdifinition;



import org.openqa.selenium.WebDriver;

import Page.Login_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginstepdef 
{
	WebDriver driver;
	Login_page page1=new Login_page();
	
	@Given("^user launch the chrome browser1$")
	public void user_launch_the_chrome_browser1() 
	{
		page1.chromelaunching1();
	  
	}

	@When("^user open the orange hrm login page1$")
	public void user_open_the_orange_hrm_login_page1()
	{
		page1.orangeHRM_homePage1();
	}

	@Then("^login with enter details$")
	public void login_with_enter_details() 
	{
		page1.enter_details() ;
	}
}
