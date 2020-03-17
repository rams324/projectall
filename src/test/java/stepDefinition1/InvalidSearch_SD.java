package stepDefinition1;

import Pages1.InvalidSearch;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidSearch_SD {
	InvalidSearch obj =new InvalidSearch();
	@Given("^Launch the Chrome browser$")
	public void Launch_the_Chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.browserLaunch();
	}
	@When("^Open the OrangeHRM Home Page and click on the directory Tab$")
	public void open_the_OrangeHRM_Home_Page_and_click_on_the_directory_Tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.homePage("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^Enter the valid Data$")
	public void enter_the_valid_Data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.InvalidSearchMethod();
	}

	@Then("^Click on the Search Button$")
	public void click_on_the_Search_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.close();
	}
}
