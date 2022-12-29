package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeaturesFiles/_04_Locations.feature"}, // buraya feature file :
        glue = {"StepDefinitions"} // Step definitions in klasoru yaziliyor.
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {

}
