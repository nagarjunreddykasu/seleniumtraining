package definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpTest {
	
	//Hooks
	
	/*@Before
	public void setUp(){
		System.out.println("setup method code");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown method code");
	}*/
	
	//Tagged Hooks
	
	@Before("@regression")
	public void beforeHook(){
		System.out.println("beforeTaggedHook code");
	}
	
	@After("@regression")
	public void afterHook(){
		System.out.println("afterTaggedHook code");
	}
	
	/*@BeforeStep
	public void beforeStep(){
		System.out.println("beforeStep method code");
	}
	
	@AfterStep
	public void afterStep(){
		System.out.println("afterStep method code");
	}*/
	
	
	@Given("user navigates to Sign Up page")
	public void user_navigates_to_sign_up_page() {
	   System.out.println("user navigates to Sign Up page");
	}

	@When("user validates Sign Up page title")
	public void user_validates_sign_up_page_title() {
	 System.out.println("user validates Sign Up page title");
	}

	@And("user clicked on Register button without entering mandatory fields")
	public void user_clicked_on_register_button_without_entering_mandatory_fields() {
	   System.out.println("user clicked on Register button without entering mandatory fields");
	}

	@Then("verify validation message")
	public void verify_validation_message() {
	  System.out.println("verify validation message");
	}

	@And("user entered data in all mandatory fields")
	public void user_entered_data_in_all_mandatory_fields() {
	    System.out.println("user entered data in all mandatory fields");
	}

	@And("user clicked on Register button")
	public void user_clicked_on_register_button() {
	   System.out.println("user clicked on Register button");
	}

	@Then("user shouldbe successfully registered")
	public void user_shouldbe_successfully_registered() {
	   System.out.println("user shouldbe successfully registered");
	}

}
