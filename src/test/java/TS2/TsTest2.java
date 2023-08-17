package TS2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TsTest2 {
 WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/addCust");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
  }

  @Test
  public void Test() {
	  
	TsClassTwo tt = new TsClassTwo(driver);
	tt.getFirstName().sendKeys("aditya");
	tt.getLastName().sendKeys("kittu");
	tt.getPostcode().sendKeys("123456");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	tt.getAddCustbtn().click();
	  
  }
  
  
  @AfterMethod
  public void afterMethod() {
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  driver.switchTo().alert().accept();
	  driver.quit();
  }

}
