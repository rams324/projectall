package Com.Stepdefinition;

import org.openqa.selenium.WebDriver;

import Com.Excel_Utility.Excel_Utility;
import Com.pages.OrangeHRM_Login_pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Login_step extends Excel_Utility {
	WebDriver driver;
	OrangeHRM_Login_pages login = new OrangeHRM_Login_pages(driver);
	@Given("^user launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
	   login.ChromeLaunch();
	}
	@When("^user open the orange hrm login page$")
	public void user_open_the_orange_hrm_login_page() throws Throwable {
	  login.OrangeHRM_Homepage();
	}

	@Then("^user enter the username and password with valid data$")
	public void user_enter_the_username_and_password_with_valid_data() throws Throwable {
	   login.LoginDetails(1);
	}

	@Then("^user submit the details$")
	public void user_submit_the_details() throws Throwable {
	 login.submit();
	}

}
	