package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features"},glue={"definitions"},monochrome=true,plugin={"pretty","html:target/cucumber-report.html"})
public class JUnitRunner {

}
