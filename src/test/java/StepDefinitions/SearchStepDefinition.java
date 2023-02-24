package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import WebDriver_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.searchPage;


public class SearchStepDefinition  {
	
	

	private static final Logger log = LogManager.getLogger("base");
	public searchPage s;
	private WebDriver driver = DriverManager.driver;;
	public  String modelnumber1;
	

	
	@Given("^Enter (.+) in the search textbox$")
	public void enter_in_the_search_textbox(String modelnumber) throws Throwable {
		log.info("given execution started");
		System.out.println("Model number is "+modelnumber);
		 s = new searchPage(driver);
		s.searchText(modelnumber);
		 modelnumber1 = modelnumber;
	}

	@When("I click on search button")
	public void i_click_on_search_button() throws Exception {
		System.out.println("click_on_search_button");
		log.info("when execution started");
		s.searchButton();
	}

	@Then("Results should be displayed")
	public void results_should_be_displayed() throws Exception {
		log.info("then execution started");
		System.out.println("results_should_be_displayed");
		try {
		Boolean results = driver.findElement(By.xpath("//ul[@id='browse-results']/li")).isDisplayed();
			System.out.println(results);
			if(results)
			{
				System.out.println("message started");
				Assert.assertEquals(s.searchpageValid(), modelnumber1);
				System.out.println("message verified");
				log.info("Got the product results");
				}
			
				  else { System.out.println("message started");
				  Assert.assertEquals(s.searchPageInvalid()
				  ,"Sorry, we couldn't find any matches for \""+modelnumber1+"\"" );
				  System.out.println("message verified"); }
			
		} catch (NoSuchElementException e) {
			System.out.println("message catch started");
			log.error("Search resuls not working");
			Assert.assertEquals(s.searchPageInvalid(),"Sorry, we couldn't find any matches for \""+modelnumber1+"\"" );
			System.out.println("message catch verified");
			log.info("Sorry, we couldn't find any matches for \""+modelnumber1+"\"");
		}
	}
	
	@And("Extract the search Product or search Message")
	public void extract_the_search_product_or_search_message() {
		System.out.println("extract_the_search_product_or_search_message");
	}

}
