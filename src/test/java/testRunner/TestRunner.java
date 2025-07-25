package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".\\Features\\",
        glue = "stepDefinitions",
        monochrome = true,
        tags= "@Blaze",
        plugin = {"pretty","html:test-output"}
        
    	
)
public class TestRunner {
//comment line
}
