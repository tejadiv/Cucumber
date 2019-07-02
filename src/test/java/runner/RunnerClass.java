package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/sample5.feature"},
                         glue="stepdef",
                        plugin="html:target/htmlreport")
                        // plugin="json:target/cucumber.json"
                         //plugin="junit:target/xmlreport.xml",
                        // tags={"@smoke"}
                        // tags={"@smoke,@regression"})
                         //tags={"@smoke","@regression"})
                        		// tags={"~@regression"})
                        		// tags={"~@regression"})
public class RunnerClass {

}
