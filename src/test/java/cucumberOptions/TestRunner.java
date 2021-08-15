package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber; 

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Customer.feature",   //path of the feature file
		glue="stepDefinations",
		monochrome=true,
		plugin={"pretty","html:target/cucumber"}) //path of the java implimentation package name 
public class TestRunner {
}
