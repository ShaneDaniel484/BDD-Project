package bddOWN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class parabankloginlocators {
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")
	WebElement name;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")
	WebElement pass;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")
	WebElement loginbutton;
}
