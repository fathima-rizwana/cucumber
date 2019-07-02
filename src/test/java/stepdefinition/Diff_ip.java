package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Diff_ip {
	@Given("user opens signup page")
	public void user_opens_signup_page() {
	    System.out.println("user opens app ");
	}

	@When("user enters fn {string}")
	public void user_enters_fn(String string) {
		System.out.println("user enters first name "+string);
	}

	@When("user enters ln {string}")
	public void user_enters_ln(String string) {
		System.out.println("user enters lastname "+string);
	}

	@When("user enters dob {string}")
	public void user_enters_dob(String string) {

		System.out.println("user enters dob "+string);
	}

	@When("user enters pwd {string}")
	public void user_enters_pwd(String string) {
		System.out.println("user enters pwd "+string);
	}

	@When("user enters confirm pwd {string}")
	public void user_enters_confirm_pwd(String string) {
		System.out.println("user enters confirm pwd "+string);
	}

	@Then("click signup button")
	public void click_signup_button() {
		System.out.println("user clicks signup ");
	}

	@Then("verify signup success msg")
	public void verify_signup_success_msg() {
		System.out.println("signup success ");
	}

}
