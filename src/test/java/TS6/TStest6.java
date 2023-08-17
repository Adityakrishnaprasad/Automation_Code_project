	package TS6;
	
	import java.time.Duration;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	
	import TS5.TS5POC;
	
	public class TStest6 {
		
		WebDriver driver;
		
		@BeforeTest
		
		void beforetest() {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		@Test
		
		void test() {
			
			TS5POC ts5 = new TS5POC(driver);
				   ts5.cusloginbutton();
				   ts5.yournamedd("5");
				   ts5.loginbtn();
			TS6POC ts6 = new TS6POC(driver);
			ts6.getDeposit1();
			ts6.getAmounttf();
			ts6.getDeposit2();
			 WebElement ele = ts6.getAlertmessage();
			 System.out.println(ele.isDisplayed());
			//Assert.assertEquals(ele, "Deposit Successful");
		}
		
		@AfterTest
		
		void teardown() {
			driver.quit();
		}
	
	}
