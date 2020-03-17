package stepDefinition1;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages1.LogIn;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_SD {

	WebDriver driver;
	LogIn lg = new LogIn();

	@Given("^the user launched the chromebrowser$")
	public void the_user_launched_the_chromebrowser() throws Throwable {
		lg.browserLaunch();
	}

	@When("^the user open the Demoblaze website$")
	public void the_user_open_the_Demoblaze_website() {
		lg.demoblaze_homePage("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws IOException {
		lg.userclick();
	}

	@Then("^the user enters the username and password clicks on login button$")
	public void the_user_enters_the_username_and_password() throws IOException, InterruptedException {
		for (int i = 1; i <= 3; i++) {
			lg.usernamepassword(i);			
			lg.browserLaunch();
			lg.demoblaze_homePage("https://opensource-demo.orangehrmlive.com/");
			lg.userclick();
		}
	}

}
