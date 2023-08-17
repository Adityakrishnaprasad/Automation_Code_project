package TS5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TSTest5 {
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  
  @Test
  public void test() {
	  
	   TS5POC ts5 = new TS5POC(driver);
	   ts5.cusloginbutton();
	   ts5.yournamedd("5");
	   ts5.loginbtn();
	   String act_title = driver.getTitle();
	   System.out.println(act_title);
	   Assert.assertEquals(act_title, "XYZ Bank");
	  
  }
  
  
  
  @AfterTest
  public void afterTest() {
	 
	  driver.quit();
  }

}
