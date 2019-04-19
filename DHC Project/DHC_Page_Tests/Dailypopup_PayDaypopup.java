package DHC_Page_Tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Dailypopup_PayDaypopup {
	public String baseUrl= "https://dhc-new-testing.herokuapp.com";
	public WebDriver driver;
 
  @BeforeTest
  public void launchBrowser() {
			driver = new ChromeDriver();
			driver.get(baseUrl);
			driver.manage().window().maximize();
		}
  
 //Daily pop up 
  @Test(priority = 1)
     public void dailypopup() throws InterruptedException {
 	 Thread.sleep(15000); 
 //click on calendar
 	 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/span/div/input")).click();
 	 
 // select date 12
 	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/table/tbody/tr[3]/td[3]/div")).click();
 	 Thread.sleep(20000);
 	 
 //click on + icon
 	 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/i")).click();
 	 
 //check Other option on hour tracker window
 	 driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/label[1]/span/input")).click();
 	 
 //click on other dropdown
 	 driver.findElement(By.xpath("//*[@id=\"react-select-4--value\"]/div[1]")).click();
 	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 //select option from dropdown 
 	 driver.findElement(By.xpath("//*[@id=\"react-select-4--value\"]/div[1]")).click();


 // Clicking on submit
 	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/div/button[2]")).click();
  }
  
}
