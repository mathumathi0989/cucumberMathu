package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Constants.Constants;
import Utilities.CommonUtils;
import WebDriver_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.loginPage;
import pageObjects.searchPage;

public class LoginStepDefinition {

	private static final Logger log = LogManager.getLogger("base");
	public loginPage l;
	private WebDriver driver = DriverManager.driver;;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
	  l = new loginPage(driver);
	  l.siginLink();
	  log.info("user isin login page");
	  Thread.sleep(1000);  
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String userName, String password) throws Exception {
		//CommonUtils c = new CommonUtils();
		//c.getProp();
		l.login(Constants.userName, Constants.password);
		
	}

	@And("click on signin")
	public void click_on_signin() throws Exception {
		l.signInB();
		Thread.sleep(1000);
		log.info("user logged in");
	}

	@Then("user should be able to logged in")
	public void user_should_be_able_to_logged_in() {
		l.loggedIn();
		log.info("sigin In changed to account ");
		
	}

	@And("verify signin button changed to account")
	public void verify_signin_button_changed_to_account() {
	 String expectedText = "ACCOUNT";
	 Assert.assertEquals(expectedText, l.actualText);
	 System.out.println("account changed " +l.actualText);
	 
	}
	
}
