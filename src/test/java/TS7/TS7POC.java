package TS7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TS7POC {
	@FindBy(xpath="//button[normalize-space()='Transactions']") private WebElement Transactionbtn;
	@FindBy(xpath="//span[.='aditya kittu']") private WebElement text;
	
	
	public TS7POC(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getTransactionbtn() {
		return Transactionbtn;
	}
	public WebElement getText() {
		return text;
	}
	
}
