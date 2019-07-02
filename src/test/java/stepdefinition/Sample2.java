package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample2 {

	@Given("open newtours app")
	public void open_newtours_app() {
		System.out.println(" user opens app");
	    
	}

	@When("user enters un as {string} and pwd as {string}")
	public void user_enters_un_as_and_pwd_as(String string, String string2) {
		System.out.println("user enters un as "+string+"and pwd as"+string2);
	}

	@When("submit login form")
	public void submit_login_form() {
		System.out.println("user clicks on login ");
	}

	@Then("verify pass")
	public void verify_pass() {
		System.out.println("login pass ");
	}

	@Then("verify failure")
	public void verify_failure() {
		System.out.println("login fail ");
	}

}
