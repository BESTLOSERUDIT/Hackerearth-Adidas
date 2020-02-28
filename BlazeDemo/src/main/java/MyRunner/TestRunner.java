package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ={"src/test/java/Features/BlazeProductPurchase.feature"
			},		 				
        glue = {"stepDefinitions"},
        tags = {"@SmokeTest"},
        dryRun = false ,
        monochrome =true,
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class TestRunner {

}
