package paraBank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class parabankUtility {
	String strUrl,strFirstname,strLastname,strAddress,strCity,strState,strZipcode,strPhone,strSsn,strUsername,strPassword,strConfirmpassword;
	public parabankUtility() {
		register();
	}
	public void register(){
	File file = new File("C:\\Users\\sdaniel\\Selenium\\paraBank\\src\\test\\resources\\parabankData.properties");
	FileInputStream fileInput = null;
	try {
		fileInput = new FileInputStream(file);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	Properties prop = new Properties();
	try {
		prop.load(fileInput);
	}catch(IOException e) {
		e.printStackTrace();
	}
	strUrl = prop.getProperty("url");
	strFirstname=prop.getProperty("firstname");
	strLastname=prop.getProperty("lastname");
	strAddress=prop.getProperty("address");
	strCity=prop.getProperty("city");
	strState=prop.getProperty("state");
	strZipcode=prop.getProperty("zipcode");
	strPhone=prop.getProperty("phone");
	strSsn=prop.getProperty("ssn");
	strUsername = prop.getProperty("username");
	strPassword = prop.getProperty("password");
	strConfirmpassword=prop.getProperty("confirmpassword");

	}
}
 
