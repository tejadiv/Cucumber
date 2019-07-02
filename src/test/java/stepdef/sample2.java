package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample2 {

	@Given("user opens login page in newtours app")
	public void user_opens_login_page_in_newtours_app() {
	    System.out.println();
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String un, String psd) {
	  System.out.println("username is "+un+"password is "+psd);
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
	   System.out.println("Submit"); 
	}

	@Then("verify login  success")
	public void verify_login_success() {
	  System.out.println("Passed"); 
	}

	@Then("verify login  failure")
	public void verify_login_failure() {
	    System.out.println("Failure");
	}



}
