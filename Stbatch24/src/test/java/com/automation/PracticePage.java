package com.automation;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	WebDriver driver;

	public PracticePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "(//*[contains(text(),'Dresses')])[5]")
	private WebElement Dresstab;

	public WebElement getDresstab() {
		return Dresstab;
	}

	public void setDresstab(WebElement dresstab) {
		Dresstab = dresstab;
	}
	
    @FindBy (how = How.XPATH, using = "//*[@class='product-container']/div[2]/div[1]/span[1]")
	private List<WebElement> resultset;

	public List<WebElement> getResultset() {
		 return resultset;
	 }

	public void setResultset(List<WebElement> resultset) {
		this.resultset = resultset;
	 }
	
	// @FindBy (how = How.XPATH, using = "(//*[contains(text(), 'Add to cart')])[4]")
	// private List<WebElement> secondhighest;

	// public List<WebElement> getSecondhighest() {
	//	return secondhighest;
	// }

	// public void setSecondhighest(List<WebElement> secondhighest) {
	//	this.secondhighest = secondhighest;
	// }
	
	
}

     
    
    