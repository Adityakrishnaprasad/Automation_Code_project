package TS5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TS5POC {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[normalize-space()='Customer Login']") private WebElement cuslogbtn;
	@FindBy(id="userSelect") private WebElement userdd;
	@FindBy(xpath="//button[normalize-space()='Login']") private WebElement loginbtnloc;
	
	
	public TS5POC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void cusloginbutton() {
		cuslogbtn.click();
	}
	
	public void yournamedd(String value) {
		
		Select s = new Select(userdd);
		s.selectByValue(value);
		
	}
	
	public void loginbtn() {
		loginbtnloc.click();
	}

}
