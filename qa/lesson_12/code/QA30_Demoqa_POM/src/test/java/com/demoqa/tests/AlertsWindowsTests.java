package com.demoqa.tests;

import com.demoqa.pages.AlertsPage;
import com.demoqa.pages.BrowserWindowsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsWindowsTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver)
                .conformCookies()
                .getAlertsFrameWindows();
    }

    @Test
    public void alertWaitTest() {
        new SidePanel(driver).selectAlerts();
        new AlertsPage(driver).clickByAlertWithTimer();
    }

    @Test
    public void selectConfirmTest() {
        new SidePanel(driver).selectAlerts();
        new AlertsPage(driver).selectConfirm("Cancel").verifyResult("Cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        new SidePanel(driver).selectAlerts();
        new AlertsPage(driver).sendMessageToAlert("Hello world!!").verifyMessage("Hello world!!");
    }

    @Test
    public void newWindowTest() {
        new SidePanel(driver).selectBrowserWindows();
        new BrowserWindowsPage(driver).switchToNewWindow(1)
                .verifyNewWindowMessage("This is a sample page");
    }
}
