package com.cucumber.runner;
 
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features", glue= {""}, tags= {"@Test"})
public class TestRunner {
	
	
	

}