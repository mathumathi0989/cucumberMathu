package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {

	@Given("^Enter (.+) in the search textbox$")
	public void enter_in_the_search_textbox(String modelnumber) throws Throwable {
		System.out.println("Model number is "+modelnumber);
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		System.out.println("click_on_search_button");
	}

	@Then("Results should be displayed")
	public void results_should_be_displayed() {
		System.out.println("results_should_be_displayed");
	}
	@And("Extract the search Product or search Message")
	public void extract_the_search_product_or_search_message() {
		System.out.println("extract_the_search_product_or_search_message");
	}

}
