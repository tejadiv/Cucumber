package stepdef;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import gherkin.ast.DataTable;

public class sample5 {
	@When("user searches for the products")
	public void user_searches_for_the_products(io.cucumber.datatable.DataTable dataTable) {
	List<String> productsname=dataTable.asList();
	for(String products:productsname){
		System.out.println(products);
	}
	 
	}

	@When("verify the products")
	public void verify_the_products() {
System.out.println("user verifies the product");
	}

	@Then("close app")
	public void close_app() {
System.out.println("user closes the app");
	}


}
