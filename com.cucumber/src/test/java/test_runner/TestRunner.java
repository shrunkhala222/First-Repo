package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features =  ".\\src\\test\\resources\\Features",
		glue= {"step_definition"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
