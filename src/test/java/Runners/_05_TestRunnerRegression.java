package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",// hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        // or yerine and yazılırsa hem smoke hem de regression tag i olanları çalıştırıyor
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {

}
