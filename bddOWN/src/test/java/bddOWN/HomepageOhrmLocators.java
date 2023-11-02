package bddOWN;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageOhrmLocators {
	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement dashboardText;
}
