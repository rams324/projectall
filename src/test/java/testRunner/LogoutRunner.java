package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/features/OrangeFeatures.feature",
		tags= "@tc_06",
		glue= "stepdefinition",
		monochrome = true 
		)
public class LogoutRunner {
	

}
