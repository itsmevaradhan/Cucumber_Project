package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions
(
		features ="src/test/resources/Feature/login.feature",
		glue= {"org.steps","org.hooks"},
		dryRun =false,
		snippets =SnippetType.CAMELCASE,
//		tags = "@knight",
		plugin = {"pretty","html:report/cucumber -result.html","json:target/cucumber-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)
public class RunnerClass extends AbstractTestNGCucumberTests
{
	
}

