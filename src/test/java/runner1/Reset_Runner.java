package runner1;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resourses/feature/orng.feature",
		plugin = {"pretty","html:reports/cucumber-html-report"},
		tags = {"@TC_20"},
		glue = {"stepDefinition"},
		monochrome = true
		)

public class Reset_Runner {

}
