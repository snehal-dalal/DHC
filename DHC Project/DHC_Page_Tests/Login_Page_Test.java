package DHC_Page_Tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Page_Test {
	
	public String baseUrl= "https://dhc-new-testing.herokuapp.com";
	public WebDriver driver;
	
	
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	
	
	 @Test(priority = 1)
	    public void firstlogin() {
    	 System.out.println("Application login");
          driver.findElement (By.id("email")).sendKeys("amit@coditas.com");
	   	  driver.findElement (By.id("password")).sendKeys("admin");
	   	  driver.findElement (By.xpath("//*[@id=\"app\"]/div/div[3]/form/button")).click(); 
	    	 
	     }
	     
	     @Test(priority = 2)
	     public void microsoftlogin() {
	    	 System.out.println("microsoft login");
	    	 
	//ENter microsoft emailId    	 
	    	 WebDriverWait wait= new WebDriverWait(driver, 15);
	    	    wait.until(ExpectedConditions.elementToBeClickable(By.name("loginfmt"))).sendKeys("dhccontacts@charlesengineering.com");
	//Click Next     
	    	 driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
	//Enter password    	 
	    	 WebDriverWait wait3= new WebDriverWait(driver, 15);
	    	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"i0118\"]"))).sendKeys("HUbI@DN&NLEIfrq2");
	//Click next    	  
	    	 WebDriverWait wait1=new WebDriverWait(driver, 20);
	    		wait.until(ExpectedConditions.elementToBeClickable(By.id("idSIButton9"))).click();;
	 //Click Yes   	
	    	 WebDriverWait wait2=new WebDriverWait(driver, 20);
		    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"idSIButton9\"]"))).click();;
		    	
	    	 
	     }
}


