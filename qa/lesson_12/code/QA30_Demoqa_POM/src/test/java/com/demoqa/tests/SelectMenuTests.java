package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SelectMenuPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTests extends TestBase{

    HomePage homePage;
    SidePanel sidePanel;

    SelectMenuPage selectMenuPage;

    @BeforeMethod
    public void precondition() {
        homePage = new HomePage(driver);
        sidePanel = new SidePanel(driver);
        selectMenuPage = new SelectMenuPage(driver);

        homePage.conformCookies().getWidgets();
        sidePanel.getSelectMenu();
    }

    @Test
    public void selectOldStyleTest() {
        selectMenuPage.selectOldStyle("Black");
    }

    @Test
    public void multiSelectTest() {
        selectMenuPage.multiSelect(new String[]{"Red","Blue","Green"});
    }

    @Test
    public void standardMultiSelectTest() {
        selectMenuPage.standardMultiSelect(2);
    }
}
