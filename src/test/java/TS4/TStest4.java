package TS4;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TStest4 {
  WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  
  @Test
  public void test() {
	  
	  TS4POC ts4 = new TS4POC(driver);
	  ts4.getSearchloc();
	  boolean ele = ts4.getSearchloc().isDisplayed();
	  Assert.assertEquals(ele, true);
  }
  

  @AfterTest
  public void afterTest() {
	  
  }

}
