package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBorad;

public class DashBoradStep {
	WebDriver driver;
	DashBorad dash=new DashBorad(driver);
	@Given("^user launch the Chrome browser$")
	public void user_launch_the_Chrome_browser()  {
	   dash.launch();
	}

	@When("^user open the orangehrm login page$")
	public void user_open_the_orangehrm_login_page()  {
	  dash.Home_page();
	}

	@Then("^the user enter the username and password with valid data$")
	public void the_user_enter_the_username_and_password_with_valid_data() throws InterruptedException, IOException  {
	  dash.loginData();
	}

	@Then("^user click the login button$")
	public void user_click_the_login_button() throws InterruptedException  {
		dash.submit();
	    
	}

	@Then("^take the screenshot of the dashboard page$")
	public void take_the_screenshot_of_the_dashboard_page() throws IOException, InterruptedException  {
	   dash.Dashboard_Screenshot("C:\\Screenshot\\.png");

	}
	
}