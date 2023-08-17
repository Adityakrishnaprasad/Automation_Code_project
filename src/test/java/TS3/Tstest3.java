package TS3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tstest3 {
	WebDriver driver;
	
	
	@BeforeTest
	
	void beforetest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/openAccount");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
   
	@Test
	
	void test() {
		TS3POC ts3 = new TS3POC(driver);
	    ts3.getuserddloc("5");
		ts3.getcurrencyddloc("Rupee");
		ts3.getsubmitbutton();
		
		//ts3.alertpopup();
		
	}
	
	@AfterTest
	
	void teardown() {
		
		driver.quit();
	}
}
