package com.hrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HrmSteps {

	WebDriver driver;
	HrmPage obj;

	@Given("^User visit OrangeHRM home page$")
	public void user_visit_OrangeHRM_home_page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe\\");
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		obj = new HrmPage(driver);
	}

	@When("^User type Username$")
	public void user_type_Username() throws Throwable {

		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		obj.getUsername().sendKeys("Admin");
		
	}

	@When("^User also type Password$")
	public void user_also_type_Password() throws Throwable {

		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        obj.getPassword().sendKeys("admin123");
	}

	@Then("^User click on the Login button$")
	public void user_click_on_the_Login_button() throws Throwable {

		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		obj.getLogin().click();

	}

	@Then("^User verify Welcome screen$")
	public void user_verify_Welcome_screen() throws Throwable {
    
	}

}
