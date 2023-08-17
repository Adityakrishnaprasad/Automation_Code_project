package TS1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	WebDriver driver;
	@BeforeTest
	
		void start() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
		}
	
	@Test
	
	   void test() {
		
		TSPOC tc = new TSPOC(driver);
		tc.getBMLogbtn().click();
		tc.getAddCustbtn().click();
		
		
		
	   }
	
	@AfterTest
	
	void tear() {
		String acttitle = driver.getTitle();
		Assert.assertEquals(acttitle, "XYZ Bank");
		
		driver.quit();
	}

}
