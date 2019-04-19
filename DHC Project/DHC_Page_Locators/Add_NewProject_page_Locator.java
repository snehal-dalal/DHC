package DHC_Page_Locators;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Add_NewProject_page_Locator {
	 WebDriver driver= null;
	   public Add_NewProject_page_Locator(WebDriver driver) {
		   this.driver = driver;
		   PageFactory.initElements(this.driver,this);
	   }
	   /*
	    * WebElement: +icon from Active group
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "//*[@id=\\\"app\\\"]/div/div[4]/div/div[3]/div[1]/div/div[1]/div/div/i") 
	   private WebElement Addicon;
	   
	   public WebElement Addicon() {
		   return Addicon;
	   }
	   
	   /*
	    * WebElement: contractor
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "/html/body/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div/div/span/div[2]/div/span/span") 
	   private WebElement contractor;
	   
	   public WebElement contractor() {
		   return contractor;
	   }
	   /*
	    * WebElement: projectName
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement projectName;
	   
	   public WebElement projectName() {
		   return projectName;
	   }


	   /*
	    * WebElement: state
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement state;
	   
	   public WebElement state() {
		   return state;
	   }
	   
	   /*
	    * WebElement: city
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement city;
	   
	   public WebElement city() {
		   return city;
	   }


	   /*
	    * WebElement: additional notes
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement additionalNote;
	   
	   public WebElement additionalNote() {
		   return additionalNote;
	   }

	   /*
	    * WebElement: scopeDescription
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement scopeDescription;
	   
	   public WebElement scopeDescription() {
		   return scopeDescription;
	   }

	   
	   /*
	    * WebElement: scopeNote
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement scopeNote;
	   
	   public WebElement scopeNote() {
		   return scopeNote;
	   }   
	   
	   /*1
	    * WebElement: itemType
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement itemType;
	   
	   public WebElement itemType() {
		   return itemType;
	   }    
	   
	   /*
	    * WebElement: cost
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement cost;
	   
	   public WebElement cost() {
		   return cost;
	   }  
	   
	   /*
	    * WebElement: dueDate
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement dueDate;
	   
	   public WebElement dueDate() {
		   return dueDate;
	   }     
	   
	   
	   /*
	    * WebElement: customerContact
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement customerContact;
	   
	   public WebElement customerContact() {
		   return customerContact;
	   }  
	   
	   /*
	    * WebElement: engineer
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement engineer;
	   
	   public WebElement engineer() {
		   return engineer;
	   }  
	   /*
	    * WebElement: engineerstatus
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement engineerstatus;
	   
	   public WebElement engineerstatus() {
		   return engineerstatus;
	   }  
	   /*
	    * WebElement: engineerUH
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement engineerUH;
	   
	   public WebElement engineerUH() {
		   return engineerUH;
	   }  
	   /*
	    * WebElement: engineerNUH
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement engineerNUH;
	   
	   public WebElement engineerNUH() {
		   return engineerNUH;
	   }  
	   /*
	    * WebElement: drafter
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement drafter;
	   
	   public WebElement drafter() {
		   return drafter;
	   }  
	   /*
	    * WebElement: drafterstatus
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement drafterstatus;
	   
	   public WebElement drafterstatus() {
		   return drafterstatus;
	   }  
	   /*
	    * WebElement: drafterUH
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement drafterUH;
	   
	   public WebElement drafterUH() {
		   return drafterUH;
	   }  
	   /*
	    * WebElement: drafterNUH
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement drafterNUH;
	   
	   public WebElement drafterNUH() {
		   return drafterNUH;
	   }  
	   /*
	    * WebElement: submit
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement submit;
	   
	   public WebElement submit() {
		   return submit;
	   }   
	   /*
	    * WebElement: cancel
	    * @param : none
	    * @Return : WebElement
	    */
	   @FindBy(xpath = "") 
	   private WebElement cancel;
	   
	   public WebElement cancel() {
		   return drafterNUH;
	   }  
}
