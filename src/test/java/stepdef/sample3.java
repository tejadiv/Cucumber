package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sample3 {

@Given("user open signup page")
public void user_open_signup_page() {
   System.out.println("user opens the signup page");
}

@When("user enters fn as {string}")
public void user_enters_fn_as(String fn) {
	System.out.println("firstname: "+fn);
  
}

@When("user enters ln as {string}")
public void user_enters_ln_as(String ln) {
    System.out.println("lastname :"+ln);
}
@When("user enters dob as {string}")
public void user_enters_dob_as(String dob) {
	System.out.println("dob : "+dob);
    
}

@When("user enters psd as {string}")
public void user_enters_psd_as(String psd) {
   System.out.println("password : "+psd);
}

@When("user enters confirmpsd as {string}")
public void user_enters_confirmpsd_as(String confirmpsd) {
   System.out.println("confirm password : "+confirmpsd);
}

@Then("click signup button")
public void click_signup_button() {
   System.out.println("user clicks on signup button"); 
}

@Then("verify signup success message")
public void verify_signup_success_message() {
    System.out.println("signup verified");
}



}
