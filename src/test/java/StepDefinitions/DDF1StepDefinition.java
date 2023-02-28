package StepDefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DDF1StepDefinition {

	
	 @When("^Demo user enters credentials$")
	    public void demo_user_enters_credentials(DataTable userCred) {
		 for (Map<String, String> data : userCred.asMaps(String.class, String.class)) {
				System.out.println(data.get("userName"));
				System.out.println(data.get("password"));
		 }
	    }
	 
}
