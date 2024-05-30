package de.ait.ec.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data // геттеры, сеттеры, equals, hashcode
public class NewCourseDto {

    @NotNull
    @NotBlank
    @NotEmpty
    private String title;

    @Size(min = 5, max = 200)
    @NotBlank
    @NotNull
    private String description;
    @Pattern(regexp = "^(?:(?:19|20)\\d\\d)-(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2\\d|3[0-1])$")
    private String beginDate;

    @Pattern(regexp = "^(?:(?:19|20)\\d\\d)-(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2\\d|3[0-1])$")
    private String endDate;

    @Min(value = 0)
    @Max(value = 300)
    private Double price;
}
