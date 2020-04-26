package com.vytrack.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources",
        dryRun = false,
        strict = false,
        tags = "@view_calendar_events",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)
public class CucumberRunner extends AbstractTestNGCucumberTests {


}


//tags = "@driver",
// tags = "@sales_manager and @driver",
//   tags = "@sales_manager or @driver",
// tags = "@activities",
//tags = "not @driver" //run everything accept scenario with this tag