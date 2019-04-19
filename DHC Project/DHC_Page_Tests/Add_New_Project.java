package DHC_Page_Tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Add_New_Project {

	public String baseUrl= "https://dev.projectlistpro.com";
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
          driver.findElement (By.id("email")).sendKeys("nick@charlesengineering.com");
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
 /*
 @Test(priority = 3)
 
 //Daily pop up 
	        public void dailypopup() throws InterruptedException {
	    	 //Thread.sleep(15000); 
	    	 
 //click on calendar
	    	 //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/span/div/input")).click();
	    	 
// select date 
	    	 //driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/table/tbody/tr[3]/td[3]/div")).click();
	    	 //driver.findElement(By.xpath("//tr[5]/td[2]/div")).click();
	    	 //Thread.sleep(20000);
	    	 
 //click on + icon
	    	 WebDriverWait wait2= new WebDriverWait(driver,20);
	    	 wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/div/i"))).click();
	    	 
//check Other option on hour tracker window	  
	    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	 driver.findElement(By.xpath("//input[@value='on']")).click();
	    	// /html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/label[1]/span
//click on other dropdown
	    	 driver.findElement(By.xpath("//*[@id=\"react-select-4--value\"]/div[1]")).click();
	    	
//select "DHC" option from dropdown 
	
	    	//for bid: // xpath position: //div[2]/div/div/div/div[2]/div/div/div/div/div[3]
	    	//for DHC:	//xpath position: //div[2]/div/div/div/div[2]/div/div/div/div/div[2]
	    	 
	    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	 driver.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div[3]")).click();
//increase hour
	    	 driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/span")).click();
//click on submit
	    	 driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/div[3]/div/button[2]")).click();

// Click on submit
	    	
	    	 //WebDriverWait wait= new WebDriverWait(driver, 15);
	    	  //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div/button[2]")).click();
	    	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     Thread.sleep(10000);    	 
	    	driver.findElement(By.xpath("//div[3]/div/button[2]")).click();
	     }    			
	    			
	     
 @Test(priority = 4)
	     	 
         public void AddNewProject() throws InterruptedException {
//click on +icon from Active group	    	 
	       WebDriverWait wait=new WebDriverWait(driver, 20);
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div/div[4]/div/div[3]/div[1]/div/div[1]/div/div/i"))).click();
	    		
//click on contractor and enter name GME, Inc	        
	       WebDriverWait wait1= new WebDriverWait(driver, 10);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span/div[2]/div/div/div"))).click();	
          // Thread.sleep(10000);

           driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div[2]/input")).sendKeys("Re");	  
        // //*[@id="react-select-5--value"]/div[2]/input
           ////*[@id=\"react-select-2--value\"]/div[2]/input
           ////*[@id="react-select-2--value"]/div[2]/input
           Thread.sleep(10000);
	       driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div")).click();
    		
//enter project name	    		
        	driver.findElement(By.name("projectName")).sendKeys("Automate project");
        	
//enter city
        	driver.findElement(By.name("city")).sendKeys("Pune ");
        	
// select state dropdown      	
        	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[1]/div[2]/div[2]/div/div/div/span/div[2]/div/span/span")).click();
        	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        	driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/div[2]")).click();
        	
//Enter additional note      	
        	driver.findElement(By.name("additionalNote")).sendKeys("Automated Additional notes");
        	
//Enter scope definition
        	driver.findElement(By.name("definition")).clear();
        	driver.findElement(By.name("definition")).sendKeys("Automated scope definition");
        	
//Enter scope note
        	driver.findElement(By.name("note")).sendKeys("AutoScopeNote");
        	
// select itemtype   	
        	driver.findElement(By.xpath("//div[3]/div/div/div/div/div/span/div[2]/div/div/div")).click(); 
        	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//div[2]/div/div/div/div/div[5]")).click()
            ;
//Enter cost       	
        	driver.findElement(By.xpath("//span/div/div[2]/input")).sendKeys("150");
        	
//click submit button      	
        	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div[3]/div/button[2]")).click();
	*/
//open 1st project from active group and add new scope scope */
	
	@Test(priority=7)
	public void openandaddnewscope() throws InterruptedException {
		/*driver.findElement(By.xpath("//div[3]/div/button")).click();		
		driver.findElement(By.xpath("//h3")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"6M4GrfGkw\"]/div[4]/div[1]/i/svg")).click();
        	*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(.,'Golden State Boring')]")).click();
        	}

	     }


