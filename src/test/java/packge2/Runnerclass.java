package packge2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/eg5.feature"},
                 glue="stepdefinition",plugin="junit:target/xmlreport.xml")
               	 //tags={"@smoke"}
                //tags={"~@smoke"}
                 //tags={"@smoke","@reg"}
                // tags={"@smoke,@reg"})


public class Runnerclass {
	
	
}
