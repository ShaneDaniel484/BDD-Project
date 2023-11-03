package paraBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerpageLocators {
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/p[2]/a")
	WebElement regstlink;
	
	@FindBy(name="customer.firstName")
	WebElement firstname;
	
	@FindBy(name="customer.lastName")
	WebElement lastname;
	
	@FindBy(name="customer.address.street")
	WebElement address;
	
	@FindBy(name="customer.address.city")
	WebElement city;
	
	@FindBy(name="customer.address.state")
	WebElement state;
	
	@FindBy(name="customer.address.zipCode")
	WebElement zipcode;
	
	@FindBy(name="customer.phoneNumber")
	WebElement phone;
	
	@FindBy(name="customer.ssn")
	WebElement ssn;
	
	@FindBy(name="customer.username")
	WebElement username;
	
	@FindBy(name="customer.password")
	WebElement password;
	
	@FindBy(name="repeatedPassword")
	WebElement confirmpassword;
	
	@FindBy(xpath = "(//input[@class='button'])[2]")
	WebElement registerbutton;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/p")
	WebElement confirmmsg;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/form/div[1]/input")
	WebElement name;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/form/div[2]/input")
	WebElement pass;
	
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")
	WebElement loginbutton;
}
