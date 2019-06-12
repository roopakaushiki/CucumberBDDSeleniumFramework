package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features ="D:/FreeCrmBDDFramework/src/main/java/Feature/login.feature",
		glue= {"stepdefinitions"},
		//format= {"pretty","html::test-output"}
		dryRun = true
		)





public class TestRunner {

}
