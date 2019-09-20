package package1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//@CucumberOptions(monochrome=true,plugin= {"pretty","html:cucumber-html-reports"})
//@CucumberOptions(monochrome=true,plugin= {"pretty","junit:cucumber-html-reports.xml"})
//@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-html-reports.json"})
@CucumberOptions(tags="@smoke")
@RunWith(Cucumber.class)
public class Runner {

}
