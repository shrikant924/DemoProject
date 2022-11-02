package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features =".//src/test/resources/Featurefiles/",
        glue = "StepDefinitions",
        plugin = {"pretty","html:Report/report.html"},
        dryRun = false,
        monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
