package testRunner2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features =  ".\\src\\test\\resources\\Features\\Googlesearch.feature",
		glue= {"step_definition_2"}
		)
public class testrunner2 extends AbstractTestNGCucumberTests{

}
