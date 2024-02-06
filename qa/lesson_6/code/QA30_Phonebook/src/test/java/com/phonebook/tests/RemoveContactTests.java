package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    //precondition: login and add contact
    @BeforeMethod
    public void precondition() {
        if (!isLoginLinkPresent()){
            clickOnSignOutButton();
        }

        clickOnLoginLink();
        fillLoginRegisterForm(new User().setEmail("manuel@gm.com")
                .setPassword("Manuel1234$"));
        clickOnLoginButton();

        clickOnAddLink();
        fillContactForm("Karl", "Adam", "1234567890", "adam@gm.com", "Berlin", "goalkeeper");
        clickOnSaveButton();
    }

    @Test
    public void removeContactTest() {
        int sizeBefore = sizeOfContacts();
        //click on the card
        removeContact();
        pause(1000);
        int sizeAfter = sizeOfContacts();
        //assert size of contacts equals -1
        Assert.assertEquals(sizeAfter,sizeBefore-1);
    }

}
