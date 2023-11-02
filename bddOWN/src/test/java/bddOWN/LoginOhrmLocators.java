package bddOWN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginOhrmLocators {
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement loginButton;
}
