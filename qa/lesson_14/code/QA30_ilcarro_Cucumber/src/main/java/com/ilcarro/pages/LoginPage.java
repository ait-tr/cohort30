package com.ilcarro.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    public LoginPage enterData(String email, String password) {
        type(emailInput,email);
        type(passwordInput,password);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement submit;

    public LoginPage clickOnYallaButton() {
        click(submit);
        return this;
    }

    @FindBy(css = ".dialog-container h2")
    WebElement successMessage;

    public LoginPage isSuccessMessageDisplayed() {
        assert isElementDisplayed(successMessage);
        return this;
    }

    public LoginPage enterWrongData(DataTable table) {
        List<Map<String,String>> dataTable = table.asMaps();
        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        enterData(email,password);
        return this;
    }

    @FindBy(xpath = "//h2[.='\"Login or Password incorrect\"']")
    WebElement error;

    public LoginPage isErrorDisplayed() {
        assert isElementDisplayed(error);
        return this;
    }
}
