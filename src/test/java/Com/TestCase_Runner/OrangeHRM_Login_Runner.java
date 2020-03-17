package Com.TestCase_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase.feature",
		tags = "@Tc_01",
		glue = "Com.Stepdefinition",
		monochrome = true
		)
	

public class OrangeHRM_Login_Runner {

}

