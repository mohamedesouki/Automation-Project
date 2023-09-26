package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features ="src/main/resources/features",
        glue ="org.example.stepDefs",
        tags = "@smoke",
        plugin = {
                "html:target/cucumber.html"
        }
)
public class Runners extends AbstractTestNGCucumberTests {




}
