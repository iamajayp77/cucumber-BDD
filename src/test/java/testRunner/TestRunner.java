package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features={"src/test/java/feature"},
		glue={"stepDefination"},
		plugin="html:Report/HTMLRep.html",
		monochrome=true,
		dryRun= false
		//tags= {"@SmokeTest and not @SanityTest"}
)

public class TestRunner 
{
	
	



}
