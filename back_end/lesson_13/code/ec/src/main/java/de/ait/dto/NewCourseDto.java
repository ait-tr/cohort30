package de.ait.dto;

import lombok.Data;

@Data // геттеры, сеттеры, equals, hashcode
public class NewCourseDto {

    private String title;
    private String description;
    private String beginDate;
    private String endDate;
    private Double price;
}
