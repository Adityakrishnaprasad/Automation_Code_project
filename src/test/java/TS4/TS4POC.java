package TS4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS4POC {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Search Customer']") private WebElement searchloc;
	
	
	//constructor
	public TS4POC(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	//action methods
	
	public WebElement getSearchloc() {
		searchloc.sendKeys("Neville");
		return searchloc;
	}
	

}
