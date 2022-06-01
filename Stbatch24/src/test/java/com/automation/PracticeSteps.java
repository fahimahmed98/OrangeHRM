package com.automation;

import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeSteps {
	WebDriver driver;
	PracticePage pf;
	ArrayList<String> price;
	
	@Given("^user go to automationpractice site$")
	public void user_go_to_automationpractice_site() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		pf= new PracticePage(driver);
		
	}

	@When("^user click on the dress tab$")
	public void user_click_on_the_dress_tab() throws Throwable {
	    
		//driver.findElement(By.xpath("(//*[contains(text(),'Dresses')])[5]")).click();
	    pf.getDresstab().click();
	}

	@When("^user ccapture all dress price from resultset$")
	public void user_ccapture_all_dress_price_from_resultset() throws Throwable {
	    //List<WebElement> allDresses  =  driver.findElements(By.xpath("//*[@class='product-container']/div[2]/div[1]/span[1]"));
	    ArrayList<Double> price = new ArrayList<Double>();
	    for(int i=0; i< pf.getResultset().size(); i++) {
	    price.add(Double.parseDouble(pf.getResultset().get(i).getText().replace("$", "")))	;
	    } 
	    System.out.println(price);
	    
	}
	

	@When("^user add to the cart the second highest price dress$")
	public void user_add_to_the_cart_the_second_highest_price_dress() throws Throwable {
		//Collections.sort(price, Collections.reverseOrder());
		//System.out.println(price);
		//System.out.println(price.get(1));
	  
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1500)", "");
	    
	    WebElement secDress = driver.findElement(By.xpath("(//*[contains(text(),'$30.50')])[2]"));	    
	    Actions act = new Actions(driver);
	    act.moveToElement(secDress).perform();
	    
	    //driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/div[2]/a[1]/span")).click();
	    WebElement AddCart = driver.findElement(By.xpath("//*[@class='right-block']/div[@class='content_price']/span[contains(text(),'"+price.get(1)+"')]//following::div[1]/a[1]"));
	    AddCart.click();
	    WebElement preChe= driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
	    
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf(preChe)).click();
		
	}
	    
	
	@Then("^user verify the total price including shipping$")
	public void user_verify_the_total_price_including_shipping() throws Throwable {
		String bfConv = ((String) price.get(1)).replace("$", "");
		Double bfint = Double.parseDouble(bfConv)+2;
		String afint= "$"+bfint.toString();
		System.out.println("try convert"+afint);
		
		
	    String totalPrice = driver.findElement(By.xpath("//*[@id='total_price_container']")).getText().trim();
	    String capDress = "$"+bfint.toString();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1500)", "");
	    
	    Assert.assertTrue(totalPrice.contains(capDress));
	    System.out.println(totalPrice);
	    
	}
	    
	}


