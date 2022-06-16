package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\S.Radha\\eclipse-workspace\\Sample\\src\\test\\resources\\FeatureFiles\\fb.feature",glue="org.stepdefinition",dryRun=false)
public class RunAll {
	
}
