package TS6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS6POC {
	
	WebDriver driver;
	
	
	//locators
	
	@FindBy(xpath="//button[@ng-class='btnClass2']") private WebElement deposit1;
	@FindBy(xpath="//input[@placeholder='amount']") private WebElement amounttf;
	@FindBy(xpath="//button[@type='submit']") private WebElement deposit2;
	@FindBy(xpath="//span[.='Deposit Successful']") private WebElement alertmessage;
	
	
	//constructor

	public TS6POC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	
	//action methods

	public WebElement getDeposit1() {
		deposit1.click();
		return deposit1;
	}


	public WebElement getAmounttf() {
		amounttf.sendKeys("10000");
		return amounttf;
	}


	public WebElement getDeposit2() {
		deposit2.click();
		return deposit2;
	}
	
	public WebElement getAlertmessage() {
		
		return alertmessage;
	}

	

}
