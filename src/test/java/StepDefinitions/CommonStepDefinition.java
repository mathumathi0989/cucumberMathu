package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Constants.Constants;
import Utilities.CommonUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepDefinition {

	public static WebDriver driver;
	
	@BeforeClass
	public WebDriver before_Scenario() {
	try {
		if(driver==null) {
			CommonUtils c = new CommonUtils();
			c.getProp();
		
			launchBrowser();
			}
	} catch (Exception e) {
		e.printStackTrace();
	}
		return driver;
		}
	
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Constants.url);
		System.out.println("url is printed"+Constants.url);
		driver.manage().window().maximize();
	}
	
	
	
	@AfterClass
	public void after_Scenario() {
		driver.close();
	}
	
	
	
	
	
}
