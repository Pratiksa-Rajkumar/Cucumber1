package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//tags= {"@login"},
//tags= {"@regression"},
//tags= {"@login,@regression"}//OR 

//plugin="html:target\\htmlreport"
plugin="json:target\\Jsonreport.json")
//plugin="junit:target\\XMLreport.xml")
public class RunCukesTest {
}
