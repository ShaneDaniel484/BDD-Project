package paraBank;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class parabankStepDefinition {
	
	parabankBase parabase = new parabankBase();
	parabankRegisterActions registerAction = new parabankRegisterActions();
	parabankUtility pbu = new parabankUtility();
	
	@Given("user is on parabank page")
	public void user_is_on_parabank_page() {
	    parabase.openPage(pbu.strUrl);
	}
	
	@When("user clicks on register link")
	public void user_clicks_on_register_link()  {
	    registerAction.clickRgstlink();
	}
	

	@When("user enters the firstname")
	public void user_enters_the_firstname() {
	    registerAction.setFirstname(pbu.strFirstname);
	}

	@When("user enters the lastname")
	public void user_enters_the_lastname() {
		registerAction.setlastname(pbu.strLastname);
	}

	@When("user enter the address")
	public void user_enter_the_address() {
		registerAction.setAddress(pbu.strAddress);
	}

	@When("user enter the city")
	public void user_enter_the_city() {
		registerAction.setCity(pbu.strCity);
	}

	@When("user enter the state")
	public void user_enter_the_state() {
		registerAction.setState(pbu.strState);
	}

	@When("user enter the zipcode")
	public void user_enter_the_zipcode() {
		registerAction.setZipcode(pbu.strZipcode);
	}

	@When("user enter the phone")
	public void user_enter_the_phone() {
		registerAction.setPhone(pbu.strPhone);
	}

	@When("user enter the ssn")
	public void user_enter_the_ssn() {
		registerAction.setSsn(pbu.strSsn);
	}

	@When("user enter the username")
	public void user_enter_the_username() {
		registerAction.setUsername(pbu.strUsername);
	}

	@When("user enter the password")
	public void user_enter_the_password() {
		registerAction.setPassword(pbu.strPassword);
	}

	@When("user enter the confirmpassword")
	public void user_enter_the_confirmpassword() {
		registerAction.setConfirmpassword(pbu.strConfirmpassword);
	}

	@When("user clicks register")
	public void user_clicks_register() {
	    registerAction.clickRegister();
	}
	
	@Then("user gets confirmation messege")
	public void user_gets_confirmation_messege() {
	    //Assert.assertEquals(registerAction.registerAssert(),"Your account was created successfully. You are now logged in.");
	}
	
	@Given("user is on webpage {string}")
	public void user_is_on_webpage(String string) {
		parabase.openPage(pbu.strUrl);
	}

	@When("user give id {string}")
	public void user_give_id(String name) {
	    registerAction.id(name);
	}

	@When("user give pass {string}")
	public void user_give_pass(String pass) {
		registerAction.pass(pass);
	}

	@Then("click log")
	public void click_log() {
		registerAction.login();
	}



}
