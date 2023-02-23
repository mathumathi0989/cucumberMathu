package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
glue = "StepDefinitions",
plugin = "json:target/cucumber-report.json",
dryRun = false, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests  {

}
