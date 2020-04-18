package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = true,
        strict = false,
       //tags = "@driver",
       // tags = "@sales_manager and @driver",
     //   tags = "@sales_manager or @driver",
        tags = "@activities",
        //tags = "not @driver" //run everything accept scenario with this tag
        plugin = "html:target/cucumber-html-report"

)
public class CucumberRunner {
}
