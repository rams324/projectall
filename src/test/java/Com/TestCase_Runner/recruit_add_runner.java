package Com.TestCase_Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="src/main/resources/feature/testcase.feature",
		tags = "@Tc_04",
		glue = "Com.Stepdefinition",
		monochrome = true
		)
public class recruit_add_runner {

}
