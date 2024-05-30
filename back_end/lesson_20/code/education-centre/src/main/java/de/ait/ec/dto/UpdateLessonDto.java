package de.ait.ec.dto;

import lombok.Data;

@Data
public class UpdateLessonDto {


    private String name;
    private String startTime;
    private String finishTime;
    private String dayOfWeek;

}
