package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".card:nth-child(3)")
    WebElement alertsFrameWindows;

    public SidePanel getAlertsFrameWindows() {
        clickWithJS(alertsFrameWindows,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css = ".fc-button-label")
    WebElement consent;

    public HomePage conformCookies() {
        click(consent);
        return this;
    }

    @FindBy(css = ".card:nth-child(4)")
    WebElement widgets;

    public SidePanel getWidgets() {
        clickWithJS(widgets,0,300);
        return new SidePanel(driver);
    }

    @FindBy(css = ".card:nth-child(2)")
    WebElement forms;

    public SidePanel getForms() {
        clickWithJS(forms,0,300);
        return new SidePanel(driver);
    }
}
