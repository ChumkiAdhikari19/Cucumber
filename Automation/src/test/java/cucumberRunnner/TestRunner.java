package cucumberRunnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/features",
			glue= "stepDefinations", stepNotifications = true, tags = "@MobileTest",dryRun=true,monochrome=true,
			plugin={"pretty","html:target/cucumber"})  //"json.target/cucumber.json" //"junit:target/cukes.xml"
	public class TestRunner {
}