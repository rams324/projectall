package stepdefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelUtility.LoginInvaliddata;

public class LoginInvalidStep extends LoginInvaliddata {
	WebDriver driver;
	pages.LoginInvalid plo=new pages.LoginInvalid();
	@Given("^the user launch the chrome browser$")
	public void the_user_launch_the_chrome_browser() throws Throwable {
	   plo.launch();
	}

	@When("^the user open the orange hrm login page$")
	public void the_user_open_the_orange_hrm_login_page() throws Throwable {
	    plo.Home_page();
	}

	@Then("^user enter the username and password with invalid data$")
	public void user_enter_the_username_and_password_with_invalid_data() throws Throwable {
	    plo.loginData(1);
	}

	@Then("^the user click the Login button$")
	public void the_user_click_the_Login_button() throws Throwable {
	    plo.submit();

	}

}
