package de.ait.mvcdemo.dto;

public class RegisterDto {
    private String inputFirstName;
    private String inputLastName;
    private String inputEmail;
    private String inputPassword;

    public RegisterDto(String inputFirstName, String inputLastName, String inputEmail, String inputPassword) {
        this.inputFirstName = inputFirstName;
        this.inputLastName = inputLastName;
        this.inputEmail = inputEmail;
        this.inputPassword = inputPassword;
    }

    public RegisterDto() {
    }

    public String getInputFirstName() {
        return inputFirstName;
    }

    public void setInputFirstName(String inputFirstName) {
        this.inputFirstName = inputFirstName;
    }

    public String getInputLastName() {
        return inputLastName;
    }

    public void setInputLastName(String inputLastName) {
        this.inputLastName = inputLastName;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }
}
