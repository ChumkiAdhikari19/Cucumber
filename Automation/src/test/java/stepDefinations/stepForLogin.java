package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepForLogin {

	 @Given("^User is on Landing page$")
	    public void user_is_on_landing_page() throws Throwable {
		  System.out.println("navigated to login url");
	        
	    }
	 
	 @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
		 
	        System.out.println("deciding the browser to open");
	    }

	    @When("^Browser is triggers$")
	    public void browser_is_triggers() throws Throwable {
	        
	    	System.out.println("Browser is triggered");
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	        
	    	System.out.println("Browser is started");
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	        System.out.println("logged successfully");
	    	
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("validate hoomepage");
	    }
	    
	    
	       
	    	@When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	        public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);
	            
	        }
	    

	    	 @Then("^Cards disaplayed are \"([^\"]*)\"$")
	    	    public void cards_disaplayed_are_something(String strArg1) throws Throwable {
	    	        System.out.println(strArg1);
	    	 }
	    	 
	    	 @When("^User signup with following details$")   //data table or data driven testing
	    	    public void user_signup_with_following_details(DataTable data) throws Throwable {  //it will take all required data like datadriven
	    		 
	    		List<List<String>> obj=data.asLists();
	    		System.out.println(obj.get(0).get(0));    //first it will go clm 2nd it will go to row
	    		System.out.println(obj.get(0).get(1));
	    		System.out.println(obj.get(0).get(2));
	    		System.out.println(obj.get(0).get(3));
	    		System.out.println(obj.get(0).get(4));
	    	    }
	    	 
	    	 @When("^User login in to application with (.+) and password (.+)$")
	    	    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
	    	      System.out.println(username);
	    	      System.out.println(password);
	    	    }
	    	 
	    	

}
