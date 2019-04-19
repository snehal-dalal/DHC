package common_functions;

import org.openqa.selenium.WebDriver;

public class WebBrowser {
	public static boolean verifyTitle(WebDriver driver, String title) {
	boolean isMatch= false;
	if(driver.getTitle().equals(title)) {
		isMatch=true;
	}
	return isMatch;
	}

}
