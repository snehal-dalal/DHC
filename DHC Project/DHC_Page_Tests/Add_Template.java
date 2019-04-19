package DHC_Page_Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Add_Template extends Add_New_Project {
//select MCSA
  @Test(priority = 5)
  public void selecttemplate() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
	  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //select MCSA
	  driver.findElement(By.xpath("//div[3]/div/div/div/ul/li[5]")).click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	  //select scope A
	  driver.findElement(By.xpath("//label/span/input")).click();
	  //click on submit
	  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();	 
//select cust drawing
	  WebDriverWait wait1= new WebDriverWait(driver, 10);
      wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div"))).click();	
	 // driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //select cust drawing
	  driver.findElement(By.xpath("//div[3]/div/div/div/ul/li")).click();
	  //select scope A
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//label/span/input")).click();
	//click on submit
	  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();
//select letter
	 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  WebDriverWait wait2= new WebDriverWait(driver, 10);
      wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div"))).click();
	 // driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //select letter
	  driver.findElement(By.xpath("//div[3]/div/div/div/ul/li[2]")).click();
	  //select scope A
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//label/span/input")).click();
	//click on submit
	  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();
//select Tab Data
	 // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  WebDriverWait wait3= new WebDriverWait(driver, 10);
      wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div"))).click(); 
	 // driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div")).click();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  //select letter
	  driver.findElement(By.xpath("//div[3]/div/div/div/ul/li[3]")).click();
	  //select scope A
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//label/span/input")).click();
	//click on submit
	  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();	
//select CSA
	  //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  WebDriverWait wait4= new WebDriverWait(driver, 10);
      wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div"))).click();
	  //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //select CSA
	  driver.findElement(By.xpath("//div[3]/div/div/div/ul/li[4]")).click();  
	//select scope A
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//label/span/input")).click();
	driver.findElement(By.xpath("//div[2]/div/label/span/input")).click();
	//click on submit
	  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();
//select MA
	  WebDriverWait wait5= new WebDriverWait(driver, 50);
      wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div"))).click();
	 //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div")).click();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  //select ma
	  driver.findElement(By.xpath("//div[3]/div/div/div/ul/li[6]")).click();
	  //select scope A
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//label/span/input")).click();
	//click on submit
	  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();		  
//select CA
	 //driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	 WebDriverWait wait6= new WebDriverWait(driver, 60);
     wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div"))).click();
	// driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div")).click();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  //select ca
	  driver.findElement(By.xpath("//div[3]/div/div/div/ul/li[7]")).click();
	  //select scope A
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//label/span/input")).click();
	//click on submit
	  driver.findElement(By.xpath("//div[3]/div/button[2]")).click();

  }
}

