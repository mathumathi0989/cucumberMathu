package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import WebDriver_Manager.DriverManager;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	private WebDriver driver = DriverManager.driver;
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
		
	}
	
}
