package bddOWN;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Utility {
	String strUserName,strPassword,strUrl;
	public Utility() {
		login2();
	}
	public void login2(){
	File file = new File("C:\\Users\\sdaniel\\Selenium\\bddOWN\\src\\test\\resources\\data.properties");
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
	strUserName = prop.getProperty("username");
	strPassword = prop.getProperty("password");

	}
}
 
