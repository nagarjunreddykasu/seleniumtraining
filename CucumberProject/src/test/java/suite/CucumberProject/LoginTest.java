package suite.CucumberProject;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	//Ctrl+Shift+o  to import all
	@Given("user navigates to the application")
	public void user_navigates_to_the_application() {
	   System.out.println("user navigates to the application");
	}

	@When("user validates the page title")
	public void user_validates_the_page_title() {
	   System.out.println("user validates the page title");
	}

	@And("user entered {word} username")
	public void user_entered_valid_username(String username) {
	   System.out.println("user entered "+username+" username");
	}

	@And("user entered {word} password")
	public void user_entered_valid_password(String password) {
	    System.out.println("user entered "+password+" password");
	}

	@Then("user {word} succesfully logged in")
	public void user_shouldbe_succesfully_logged_in(String validateLogin) {
	  System.out.println("user "+validateLogin+" succesfully logged in");
	}
	
	

}
