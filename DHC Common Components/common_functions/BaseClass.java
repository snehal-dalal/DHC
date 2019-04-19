package common_functions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	public static WebDriver driver=null;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = LocalDriverFactory.createInstance("chrome");
	  driver.get("https://dhc-new-testing.herokuapp.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}