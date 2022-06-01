package com.hrm;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
               features = "src/test/resources",
               glue= {"com.hrm"},
               tags= {"@Hrmfeature"},
               plugin = {"com.cucumber.listener.ExtentCucumberFormatter:BDDControlCenterTools/target/Reports/cucumber-report.html"},
               
               monochrome= true)
          
      public class HrmRunner {

}
