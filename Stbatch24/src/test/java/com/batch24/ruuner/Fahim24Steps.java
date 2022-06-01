package com.batch24.ruuner;

//import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fahim24Steps {
	WebDriver driver;
	Fahim24Runner obj;
	
	@Given("^user go to OrangeHRm home page$")
	public void user_go_to_OrangeHRm_home_page() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
    
	@When("^user type Username$")
	public void user_type_Username() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		

	}

	@When("^user also type the password$")
	public void user_also_type_the_password() throws Throwable {
	  
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    
	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	  
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("^user verify the welcomme screen$")
	public void user_verify_the_welcomme_screen() throws Throwable {
	  
	    String expected= "Welcome";
	    String actual = driver.findElement(By.id("Welcome")).getText();
	    Assert.assertTrue("Welcome message is not found", actual.contains(expected));
	}



}
