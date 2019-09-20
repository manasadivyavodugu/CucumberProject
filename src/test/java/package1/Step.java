package package1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


public class Step {

//	You can implement missing steps with the snippets below:

   /*		@Given("Enter user name in the userid field")
		public void enter_user_name_in_the_userid_field() {
         System.out.println("User name is entered");
		}

		@And("Enter password in the password field")
		public void enter_password_in_the_password_field() {
		System.out.println("Password is entered");
		}

		@When("Click on login buttin")
		public void click_on_login_buttin() {
		System.out.println("login button is clicked");
		}

		@Then("Home page is displayed")
		public void home_page_is_displayed() {
		System.out.println("Home page is displayed");
		}
   */
	
	@Given("Enter {string} and {string}")
	public void enter_user_name_in_the_userid_field(String x, String y) {
     System.out.println("User name is "+x+" "+"Password is "+y);
	}

	@When("Click on login buttin")
	public void click_on_login_buttin() {
	System.out.println("login button is clicked");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	System.out.println("Home page is displayed");
	}
	
	@Given("Enter credentials")
	public void enter_credentials() {
     System.out.println("User name and password details are entered");
	}

	@Then("Home page is not displayed")
	public void home_page_is_not_displayed() {
	System.out.println("Home page is not displayed");
	}
}
