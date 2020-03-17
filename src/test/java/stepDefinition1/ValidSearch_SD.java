package stepDefinition1;


import Pages1.ValidSearch;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidSearch_SD {
	ValidSearch obj = new ValidSearch();
	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.browserLaunch();
	}
	@When("^Open the OrangeHRM Home Page and click on the Directory Tab$")
	public void open_the_OrangeHRM_Home_Page_and_click_on_the_Directory_Tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.homePage("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^Enter the valid data$")
	public void enter_the_valid_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.ValidSearchMethod();
	}

	@Then("^Click on the Search button$")
	public void click_on_the_Search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.close();
	}
}
