package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddReminderTests extends TestBase {

    @Test
    public void addReminderPositiveTest() {
        app.getMainScreen().taOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnDateField();
        app.getReminder().swipeToMonth("future", "MAY", 2);
        app.getReminder().selectDate(0);
        app.getReminder().selectYear("future", "2025");
        app.getReminder().tapOnOk();
        app.getReminder().tapOnTimeField();
        app.getReminder().selectTime("am", 812, 930, 538, 653);
        app.getReminder().tapOnOk();
        app.getReminder().tapOnRepetitionIntervalField();
        app.getReminder().enterNumber("2");
        app.getReminder().swipe(0.8, 0.4);
        app.getReminder().tapOnRepetitionField();
        app.getReminder().selectTypeOfRepetition("Week");
        app.getReminder().saveReminder();
        app.getReminder().pause(500);
        Assert.assertTrue(app.getMainScreen().isReminderTitlePresent().contains("Holiday"));
    }
}

