package paraBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class parabankRegisterActions {
	WebDriver driver;
	registerpageLocators registerlocator = null;
	String url,firstname,lastname,address,city,state,zipcode,phone,ssn,username,password;
	
	public parabankRegisterActions() {
		this.registerlocator = new registerpageLocators();
		PageFactory.initElements(parabankBase.getDriver(), registerlocator);
	}
	
	public void clickRgstlink() {
		registerlocator.regstlink.click();
	}
	
	public void setFirstname(String firstname) {
		registerlocator.firstname.sendKeys(firstname);
	}
	
	public void setlastname(String lastname) {
		registerlocator.lastname.sendKeys(lastname);
	}
	
	public void setAddress(String address) {
		registerlocator.address.sendKeys(address);
	}
	
	public void setCity(String city) {
		registerlocator.city.sendKeys(city);
	}
	
	public void setState(String state) {
		registerlocator.state.sendKeys(state);
	}
	
	public void setZipcode(String zipcode) {
		registerlocator.zipcode.sendKeys(zipcode);
	}
	
	public void setPhone(String phone) {
		registerlocator.phone.sendKeys(phone);
	}

	public void setSsn(String ssn) {
		registerlocator.ssn.sendKeys(ssn);
	}

	public void setUsername(String username) {
		registerlocator.username.sendKeys(username);
	}

	public void setPassword(String password) {
		registerlocator.password.sendKeys(password);
	}

	public void setConfirmpassword(String confirmpassword) {
		registerlocator.confirmpassword.sendKeys(confirmpassword);
	}
	
	public void clickRegister() {
		registerlocator.registerbutton.click();
	}
	
	public String registerAssert() {
		return registerlocator.confirmmsg.getText();
	}
	
	public void id(String name) {
		registerlocator.name.sendKeys(name);
	}
	
	public void pass(String pass) {
		registerlocator.pass.sendKeys(pass);
	}
	
	public void login() {
		registerlocator.loginbutton.click();
	}
		
}
