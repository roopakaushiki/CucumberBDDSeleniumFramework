package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is available on Login Page$")
	public void user_is_available_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); //launch chrome
		driver.get("https://classic.crmpro.com/index.html");
		
	}
	/*
	@When("^Title of Login Page is Free CRM$")
	public void title_of_Login_Page() {
	   String title = driver.getTitle();
	   System.out.println(title);
	  // String str = "CRMPRO - CRM software for customer relationship management, sales, and support.";
	//Assert.assertEquals(title, str);
	}*/
	
	@When("^Title of Login Page$")
	public void title_of_Login_Page() throws InterruptedException {
		 String title = driver.getTitle();
		
		  System.out.println(title);
	}
	
	
	
	@Then("^user enters username$")
	public void user_enters_username()  {
		driver.findElement(By.name("username")).sendKeys("naveenautomation");
		driver.findElement(By.name("password")).sendKeys("test@123");
	    
	}
	
	@Then("^user enters password$")
	public void user_enters_password() {
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
	   
	}
	
	@Then("^user is on home page$")
	public void user_is_om_home_page() {
	String title =	driver.getTitle();
	System.out.println("Home Page title is :" +title);
	Assert.assertEquals("CRMPRO", title);
	}

}
