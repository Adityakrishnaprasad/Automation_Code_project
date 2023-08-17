package TS2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TsClassTwo {
	
	@FindBy(xpath="//input[@placeholder='First Name']") private WebElement FirstName;
	@FindBy(xpath="//input[@placeholder='Last Name']") private WebElement LastName;
	@FindBy(xpath="//input[@placeholder='Post Code']") private WebElement Postcode;
	@FindBy(xpath="//button[@type='submit']") private WebElement AddCustbtn;
	
	
	public TsClassTwo(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getPostcode() {
		return Postcode;
	}
	public WebElement getAddCustbtn() {
		return AddCustbtn;
	}


}
