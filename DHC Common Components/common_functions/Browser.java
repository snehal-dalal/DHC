package common_functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	public static WebDriver getBrowser(String browserName) {
		WebDriver driver=null;
		switch(browserName.toUpperCase()) {
		case "IE": driver=new InternetExplorerDriver();
		break;
		case "Firefox": driver=new FirefoxDriver();
		break;
		case "Chrome": driver=new ChromeDriver();
		
		}
		return driver;
		
	}

}
