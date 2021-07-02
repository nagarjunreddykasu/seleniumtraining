package suite.CucumberProject;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
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

	/*@And("user entered \"{word}\" username")
	public void user_entered_valid_username(String username) {
	   System.out.println("user entered "+username+" username");
	}

	@And("user entered \"{word}\" password")
	public void user_entered_valid_password(String password) {
	    System.out.println("user entered "+password+" password");
	}

	@Then("user \"{word}\" succesfully logged in")
	public void user_shouldbe_succesfully_logged_in(String validateLogin) {
	  System.out.println("user "+validateLogin+" succesfully logged in");
	}*/
	
	@And("user entered valid username")
	public void user_entered_valid_username() {
	   System.out.println("user entered valid username");
	}

	@And("user entered valid password")
	public void user_entered_valid_password() {
	    System.out.println("user entered valid password");
	}
	/*@And("user selects Age category")
	public void user_selects_age_category(List<String> list) {
	    //System.out.println("user entered "+password+" password");
		for(int i=1;i<list.size();i++){
			System.out.println("@And -- user selects age category: "+list.get(i));
		}
		
	}*/
	
	@And("user selects Age category")
	public void user_selects_age_category(DataTable table) {
		List<Map<String,String>> list=  table.asMaps(String.class,String.class);
		for(int i=0;i<list.size();i++){
			System.out.println("@And -- user selects Age category: "+list.get(i).get("Age")+" Location is: "+list.get(i).get("Location"));
		}
		
	}
	//user selects Age category
	@Then("user shouldbe succesfully logged in")
	public void user_shouldbe_succesfully_logged_in() {
	  System.out.println("user shouldbe succesfully logged in");
	}
	
	

}
