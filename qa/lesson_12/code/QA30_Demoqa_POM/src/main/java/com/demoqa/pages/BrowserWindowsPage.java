package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage{

    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "windowButton")
    WebElement windowButton;

    public BrowserWindowsPage switchToNewWindow(int index) {
        clickWithJS(windowButton,0,200);

        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }

    @FindBy(id = "sampleHeading")
    WebElement sampleHeading;

    public BrowserWindowsPage verifyNewWindowMessage(String message) {
        Assert.assertTrue(shouldHaveText(sampleHeading,message,10));
        return this;
    }

}
