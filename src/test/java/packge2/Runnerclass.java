package packge2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/eg1.feature"},
                 glue="stepdefinition",plugin="json:target/cucumber.json")
               	 //tags={"@smoke"}
                //tags={"~@smoke"}
                 //tags={"@smoke","@reg"}
                // tags={"@smoke,@reg"})


public class Runnerclass {
	
	
}
