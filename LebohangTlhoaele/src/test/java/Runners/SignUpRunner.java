package Runners;

import StepDefinitions.SignUpStepDefinition;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/SignUpForFocusInsights.feature",
        plugin = {"pretty","html:results/html/signUpCucumber-pretty"},
        glue = {"StepDefinitions"}
)
public class SignUpRunner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void TearDown(){
        SignUpStepDefinition.tearDown();
    }
}
