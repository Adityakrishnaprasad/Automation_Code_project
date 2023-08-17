package TS3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TS3POC {
	WebDriver driver;
	
	@FindBy(id="userSelect") private WebElement userddloc;
	@FindBy(id="currency") private WebElement currencyddloc;
	@FindBy(xpath="//button[normalize-space()='Process']") private WebElement submitbtnloc;
	
	public TS3POC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getuserddloc(String value) {
		Select s = new Select(userddloc);
		s.selectByValue(value);
	}
	
	public void getcurrencyddloc(String text) {
		Select s = new Select(currencyddloc);
		//s.selectByValue(text);
		s.selectByVisibleText("Rupee");
	}
    
	public WebElement getsubmitbutton() {
		submitbtnloc.click();
		return submitbtnloc;
	}
	
	//public void alertpopup() {
	//	driver.switchTo().alert().accept();
	//}
	
	
}
