package Utils;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/src/test/java/FeatureFiles/MyKabinDashboard.feature"},
		glue = {"StepDef","Hooks"},    // here StepDef is Stepdefinations Folder name
		
		plugin = {"pretty"}
		)

public class MyKabinTestRunner {
	

}