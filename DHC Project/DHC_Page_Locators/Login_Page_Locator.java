package DHC_Page_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Locator {
//https:seleniumqtpautomation.000webhostapp.com/final.html

   WebDriver driver= null;
   public Login_Page_Locator(WebDriver driver) {
	   this.driver = driver;
	   PageFactory.initElements(this.driver,this);
   }
   /*
    * Email WebElement
    * @param : amit@coditas.com
    * @Return : WebElement
    */
   @FindBy(id = "email") 
   private WebElement email;
   
   public WebElement getemail() {
	   return email;
   }
   
   /*
    * password name WebElement
    * @param : admin
    * @Return : WebElement
    */
   @FindBy(id = "password") 
   private WebElement password;
   
   public WebElement getpassword() {
	   return password;
   }
    
   /*
    * login button  WebElement
    * @param : none
    * @Return : WebElement
    */
   @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/form/button") 
   private WebElement loginBtn;
   
   public WebElement loginBtn() {
	   return loginBtn;
   }
   /*Microsoft signin page
    * Email  WebElement
    * @param : dhccontacts@charlesengineering.com
    * @Return : WebElement
    */
   @FindBy(name = "loginfmt") 
   private WebElement signin;
   
   public WebElement signinBtn() {
	   return signin;
   }
   
   /*Microsoft login
    * Next button  WebElement
    * @param : none
    * @Return : WebElement
    */
   @FindBy(xpath = "//*[@id=\\\"idSIButton9\\") 
   private WebElement next;
   
   public WebElement nextBtn() {
	   return next;
   
   }
   
   /*Microsoft login
    * password WebElement
    * @param : HUbI@DN&NLEIfrq2
    * @Return : WebElement
    */
   @FindBy(xpath = "//*[@id=\\\"i0118\\") 
   private WebElement password2;
   
   public WebElement password() {
	   return password;
   }
   
   /*Microsoft login
    * Next button WebElement
    * @param : 
    * @Return : WebElement
    */
   @FindBy(xpath = "//*[@id=\\\"i0118\\") 
   private WebElement nextBtn;
   
   public WebElement nexnextBtn() {
	   return nexnextBtn(); 
   
   }
   
   /*Microsoft login
    * yes button WebElement
    * @param : HUbI@DN&NLEIfrq2
    * @Return : WebElement
    */
   @FindBy(xpath = "//*[@id=\\\"i0118\\") 
   private WebElement yesBtn;
   
   public WebElement yesBtn() {
	   return yesBtn;
   }
   
   
}