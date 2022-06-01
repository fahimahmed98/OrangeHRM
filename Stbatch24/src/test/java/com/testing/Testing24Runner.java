package com.testing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
               features = "src/test/resources",
               glue= {"com.testing"},
               tags= {"@Savagefamtesting"},
               plugin = {"com.cucumber.listener.ExtentCucumberFormatter:BDDControlCenterTools/target/Reports/cucumber-report.html"},
               
               monochrome= true)
public class Testing24Runner {

}
