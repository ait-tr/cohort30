package de.ait.demouser.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Update user",description = "info for updating user's name and surname")
public class UpdateUserDto {

    @Schema(description = "user's name", example = "John")
    private String firstName;

    @Schema(description = "user's lastname", example = "Snow")
    private String lastName;

}
