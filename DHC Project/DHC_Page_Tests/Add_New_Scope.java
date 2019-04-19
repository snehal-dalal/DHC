package DHC_Page_Tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Add_New_Scope extends Add_New_Project {
	//colapse status from main page
	/*
	@Test(priority= 6)
  public void collapsestatus() {
	  
	  driver.findElement(By.xpath("//div[2]/div/div/div/div/div")).click();
	  
	} 
	//close project after creating
	@Test(priority= 5)
	
	public void closeproject() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[2]/div/i")).click();
		////div[3]/div/i
		///html/body/div[2]/div/i
	}
	//open 1st project from active group and add new scope scope */
	
	@Test(priority=7)
	public void openandaddnewscope() throws InterruptedException {
		driver.findElement(By.xpath("//div[3]/div/button")).click();		
		driver.findElement(By.xpath("//h3")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"6M4GrfGkw\"]/div[4]/div[1]/i/svg")).click();
		////*[@id="6M4GrfGkw"]/div[4]/div[1]/i/svg
		////*[@id=\"dqywLaYyh\"]/div[4]/div[1]/i/svg
		////*[@id="YCO8TtWdn"]/div[4]/div[1]/i/svg
		////*[@id="YCO8TtWdn"]/div[4]/div[1]/i
		//Thread.sleep(10000);
		//driver.findElement(By.className("ant-col-12 ant-col-offset-1")).click();
		//ant-col-12 ant-col-offset-1
		//anticon anticon-plus-circle color-priamry icon-large cursor-pointer
	}
	
	
}

