package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DDFStepDefinition {

	@Given("Demo Open website")
	public void open_website() {
	  System.out.println("Website opened");
	}

	@Then("Demo user logged in")
	public void user_logged_in() {
	System.out.println("user logged in ");
	}



	
	 @When("^Demo user enters (.+) and (.+)$")
	    public void demo_user_enters_and(String uname, String password)  {
		System.out.println("with example keyword");
		System.out.println(uname);
		System.out.println(password);
    }




	
	
}
