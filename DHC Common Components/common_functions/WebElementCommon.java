package common_functions;

import org.openqa.selenium.WebElement;

public class WebElementCommon {
	public static boolean isPresent(WebElement ele) {
		boolean isDisp= false;
		if (ele.isDisplayed()){
			isDisp=true;
		}
		return isDisp;
	}
	
public static boolean isClicked (WebElement ele) {
	boolean isClick= false;
	if(isPresent(ele)) {
	if (ele.isEnabled()){
		isClick=true;
	}
}
	return isClick;
    }
}

