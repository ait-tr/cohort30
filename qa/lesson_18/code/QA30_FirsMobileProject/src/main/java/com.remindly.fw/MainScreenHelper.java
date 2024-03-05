package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper{

    public MainScreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public boolean isNoReminderTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void taOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderTitlePresent() {
        String text = driver.findElement(By.id("recycle_title")).getText();
        return text;
    }
}
