package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        }
    }

    @Test
    public void registerExistedUserNegativeTest() {
        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
                .setPassword("Manuel1234$"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());
    }

}
