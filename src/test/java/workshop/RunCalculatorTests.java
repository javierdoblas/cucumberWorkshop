package workshop;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"progress", "json:target/cucumber-report.json"})
public class RunCalculatorTests {
}

