package com.automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
         (features = "src/test/resourcessrc/test/resources", 
         glue = { "com.automation" }, 
         tags = { "@automationPractice" }, 
         plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
         
         monochrome = true)
public class PracticeRunner {

}
