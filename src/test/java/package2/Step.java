package package2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;


public class Step {


	
	@Given("I want to create an Account")
	public void i_want_to_create_an_Account() {
	     System.out.println("Create an Account");
		}
	@When("I Enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dt) {
    // System.out.println("User name and password details are entered");
		List<Map<String, String>> list = dt.asMaps(String.class, String.class);
		for(int i=0; i<list.size(); i++) 
		{
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("password"));
			
		}
	}


	@Then("I verify my acocunt")
	public void i_verify_my_acocunt() {
	System.out.println("Home page is displayed");
	}
	
}
