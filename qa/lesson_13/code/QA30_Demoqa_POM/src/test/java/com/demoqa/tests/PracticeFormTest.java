package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).conformCookies().getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void enterPracticeFormTest() {
        new PracticeFormPage(driver).hideAd();
        new PracticeFormPage(driver)
                .enterPersonalData("Jack","Sparrow","jack@gm.com","1234567890")
                .selectGender("Male")
                .enterDate("16 August 1987")
                .addSubject(new String[]{"Math","English"})
                .selectHobby(new String[]{"Sports","Reading","Music"})
                .uploadPicture("C:/Tools/1.jpg")
                .enterState("NCR")
                .enterCity("Delhi")
                .submit()
                .verifyStudentAccount("Thanks for submitting the form");
    }
}
