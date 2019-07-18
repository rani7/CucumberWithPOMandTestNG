package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Ranita\\workspace\\CucumberWithPOM\\src\\main\\java\\com\\qa\\feature\\freeCRM.feature",
		glue={"com/qa/stepDefinitions"},
		format={"pretty","html:test-output", "json:json_xml/cucumber.xml", "junit:junit_xml/cucumber.xml"}, 
		dryRun = false	
		)

public class TestRunner {

}
