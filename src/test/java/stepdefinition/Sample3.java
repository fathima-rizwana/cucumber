package stepdefinition;

import java.util.List;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample3 {
	@When("user searches for products")
	public void user_searches_for_products(io.cucumber.datatable.DataTable Productdata) {
	    List<String> productname=Productdata.asList();
	    for(String product:productname)
	    {
	    	System.out.println(product);
	    }
	}

	@When("verify products displayed")
	public void verify_products_displayed() {
		System.out.println("verify product");
	    
	}

	@Then("close application")
	public void close_application() {
	    System.out.println("App closed");
	}


}
