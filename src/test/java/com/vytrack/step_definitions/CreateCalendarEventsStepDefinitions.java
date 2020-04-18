package com.vytrack.step_definitions;

import com.vytrack.page.activities.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CreateCalendarEventsStepDefinitions {

    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();

    @Then("user click on create calendar event button")
    public void user_click_on_create_calendar_event_button() {
        System.out.println("User click on create calendar event button");
     calendarEventsPage.clickToCreateCalendarEvent();
    }

    @Then("user enters {string} as title")
    public void user_enters_as_title(String string) {
        System.out.println("User enters title: "+string);
       calendarEventsPage.enterCalendarEventTitle(string);
    }

    @Then("user enters {string} as description")
    public void user_enters_as_description(String string) {
        System.out.println("User enters descriptions: "+string);
        calendarEventsPage.enterCalendarEventDescription(string);

    }
    @Then("user click on save and close button")
    public void user_click_on_save_and_close_button() {
        System.out.println("User click on save and close button");
        calendarEventsPage.clickOnSaveAndClose();

    }

    @Then("user verifies that description of new calendar event is {string}")
    public void user_verifies_that_description_of_new_calendar_event_is(String string) {
        Assert.assertEquals(string,calendarEventsPage.getGeneralInfoDescriptionText());
    }

    @Then("user verifies that title of new calendar event is {string}")
    public void user_verifies_that_title_of_new_calendar_event_is(String string) {
       Assert.assertEquals(string,calendarEventsPage.getGeneralInfoDescriptionText());
    }


}
