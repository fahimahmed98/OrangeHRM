package com.batch24.ruuner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources",
		glue= {"com.batch24.runner"},
		tags= {"@Stbatch24"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome= true
		
		
		)

public class Fahim24Runner {
	 
	
	
	
	

}
