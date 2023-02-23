package TestRunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.CommonUtils;
import WebDriver_Manager.DriverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
glue = "StepDefinitions",
plugin = "json:target/cucumber-report.json",
dryRun = false, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests  {

	public static WebDriver driver = null;

	private static final Logger log = LogManager.getLogger(TestRunner.class);
	
	@BeforeClass
	public WebDriver before_Scenario() {
		log.info("Execution Started");
	try {
		if(driver==null) {
			CommonUtils c = new CommonUtils();
			c.getProp();
		DriverManager dm = new DriverManager();
			dm.launchBrowser();
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
		return driver;
		}
	
	@AfterClass
	public void after_Scenario() {
		log.info("Execution Completed");
		driver.close();
	}
	
}
