package stepDefinition1;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages1.DirectoryTab;

public class DirectoryTab_SD {
	WebDriver driver;
	DirectoryTab obj = new DirectoryTab();
	@Given("^Launch the chrome browser$")
	public void Launch_the_chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.browserLaunch();
	}

	@When("^Open the OrangeHRM Home Page$")
	public void open_the_OrangeHRM_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    obj.homePage("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("^Navigate to Directory Tab$")
	public void navigate_to_Directory_Tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("clicking Directory Tab");
	}

	@Then("^Click on the Directory Tab$")
	public void click_on_the_Directory_Tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   obj.DriverTab();
	}
	
	@Then("^Verify whether page is navigated or not$")
	public void verify_whether_page_is_navigated_or_not() throws Throwable{
		Assert.assertTrue(obj.verify());
		
	}
}
