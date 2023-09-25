package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@Test",features="src/test/resources/features",glue = "steps",
        plugin = { "pretty", "json:target/reports/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
