package de.ait.ec.dto;

import lombok.Data;

@Data
public class NewLessonDto {
    private String name;
    private String startTime;
    private String finishTime;
    private String dayOfWeek;

}
