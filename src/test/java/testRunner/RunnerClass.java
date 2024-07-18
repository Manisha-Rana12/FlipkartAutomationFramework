package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\Manisha\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\flipkartprojectRun\\src\\test\\resources\\flipkartProject\\flipkart.feature"},
		glue = {"stepDefination"}
		)

public class RunnerClass extends AbstractTestNGCucumberTests{

	
}
