package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddNewContactTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        }
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
                .setPassword("Manuel1234$"));
        clickOnLoginButton();
    }

    @Test
    public void addNewContactPositiveTest() {
        clickOnAddLink();
        fillContactForm("Karl", "Adam", "1234567890", "adam@gm.com", "Berlin", "goalkeeper");
        clickOnSaveButton();
        Assert.assertTrue(isContactCreated("Karl"));
    }

    @AfterMethod
    public void postCondition() {
        removeContact();
    }

}
