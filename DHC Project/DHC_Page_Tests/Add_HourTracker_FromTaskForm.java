package DHC_Page_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Add_HourTracker_FromTaskForm extends Add_New_Project {
  @Test
public void HourTracker() {
	// Add hour tracker entry
		  //driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	     WebDriverWait wait1= new WebDriverWait(driver, 40);
	    // wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[2]"))).click();
	     wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[2]/i\\"))).click();
		  //click + icon
		 // driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/div[2]")).click();
		  //click on scope field
		 // driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		  WebDriverWait wait2= new WebDriverWait(driver, 10);
	      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"react-select-12--value\\\"]/div[2]/input"))).click();
		  //driver.findElement(By.xpath("//*[@id=\"react-select-12--value\"]/div[2]/input")).click();
		  //select scope A
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//div[2]/div[3]/div/div/div/div/div/div")).click();
		  // enter hour
		  driver.findElement(By.xpath("//div[2]/div[4]/div[2]/div/div/div[2]/input")).sendKeys("2.5");
		  //enter note
		  driver.findElement(By.xpath("//div[5]/div/div/input")).sendKeys("Automate note");
		  //click on submit
		  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();
		 
		  
  }
}
