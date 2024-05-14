package de.ait.ec.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class NewUserDto {

    @Email
    @NotNull
    private String email;

    @NotNull
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")
    private String password;

}
