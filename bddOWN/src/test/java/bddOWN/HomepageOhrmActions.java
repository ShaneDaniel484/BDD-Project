package bddOWN;

import org.openqa.selenium.support.PageFactory;

public class HomepageOhrmActions {
	HomepageOhrmLocators HomepageOhrmLocators = null;
	
	public HomepageOhrmActions() {
		this.HomepageOhrmLocators = new HomepageOhrmLocators();
		PageFactory.initElements(OhrmBase.getDriver(), HomepageOhrmLocators);
	}
	
	public String dashboardTxt() {
		return HomepageOhrmLocators.dashboardText.getText();
	}
}
