package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Back {
	@Given("application displays welcome msg")
	public void application_displays_welcome_msg() {
	  System.out.println("welcome ");
	}

	@Given("user enter un and pwd")
	public void user_enter_un_and_pwd() {
		System.out.println("user enter un and pwd ");
	}

	@Given("click signin")
	public void click_signin() {
		System.out.println("user click signin ");
	}

	@When("user searches for phone")
	public void user_searches_for_phone() {
		System.out.println("user search for phone ");
	}

	@When("user adding the searched prod to cart")
	public void user_adding_the_searched_prod_to_cart() {
		System.out.println("add to cart ");
	}

	@When("user performing payment using netbanking")
	public void user_performing_payment_using_netbanking() {
		System.out.println("perform payment ");
	}

	@When("user performing logout")
	public void user_performing_logout() {
		System.out.println("logout from app ");
	}

}
