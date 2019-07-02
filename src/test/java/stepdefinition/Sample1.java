package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sample1 {
	WebDriver driver;
	@Given("user opens login page in newtours application")
	public void user_opens_login_page_in_newtours_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	   // System.out.println("user opened the application");
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
		//System.out.println("user entered username and pwd");
		PageObject loginpage=PageFactory.initElements(driver,PageObject.class);
		loginpage.un.sendKeys("mercury");
		loginpage.pwd.sendKeys("mercury");
		//driver.findElement(By.name("userName")).sendKeys(string);
		//driver.findElement(By.name("password")).sendKeys(string2);
		

	}

	@When("Click submit button")
	public void click_submit_button() {
		//System.out.println("user clicked submit button");
		//driver.findElement(By.name("login")).click();
		PageObject loginpage=PageFactory.initElements(driver,PageObject.class);
		loginpage.ok.click();

	}

	@Then("verify login success")
	public void verify_login_success() {
		String title=driver.getTitle();
		Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		System.out.println("successful login");

	}
	
	
}
