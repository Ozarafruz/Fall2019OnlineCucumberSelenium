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
       //tags = "@driver",
       // tags = "@sales_manager and @driver",
     //   tags = "@sales_manager or @driver",
       // tags = "@activities",
        //tags = "not @driver" //run everything accept scenario with this tag
        tags = "@create_calendar_event_2",


        plugin = {
                "html:target/default-report",
                "json:target/cucumber.json"
        }


)
public class CucumberRunner {
}
