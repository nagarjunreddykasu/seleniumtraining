package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features"},glue={"definitions"},monochrome=true,plugin={"pretty","html:target/cucumber-report.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
