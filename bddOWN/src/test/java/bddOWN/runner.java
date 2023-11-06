package bddOWN;
 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/loginOHRM.feature", glue = "bddOWN", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
 
public class runner {
 
}
 