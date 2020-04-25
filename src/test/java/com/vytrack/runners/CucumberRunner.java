package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@create_car_ddt",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json"
        }

)
public class CucumberRunner {


}


//tags = "@driver",
// tags = "@sales_manager and @driver",
//   tags = "@sales_manager or @driver",
// tags = "@activities",
//tags = "not @driver" //run everything accept scenario with this tag