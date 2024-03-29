package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // run with junit
@CucumberOptions(
        features = "src/test/resources/features", // path to features
        glue = "com/vytrack/step_definitions"
)
public class CucumberRunner {
}
