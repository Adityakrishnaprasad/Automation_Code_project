package TS1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//open XYZ banking application,click on bank manager login and click on add on customer 
public class TSPOC {
	
	//elements
	@FindBy(xpath="//button[normalize-space()='Bank Manager Login']") private WebElement BMLogbtn;
	@FindBy(xpath="//button[@ng-class='btnClass1']") private WebElement AddCustbtn;
	
	//constructor
	public TSPOC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//methods
	
	public WebElement getBMLogbtn() {
		return BMLogbtn;
	}

	public WebElement getAddCustbtn() {
		return AddCustbtn;
	}

	
	
	
	

}
