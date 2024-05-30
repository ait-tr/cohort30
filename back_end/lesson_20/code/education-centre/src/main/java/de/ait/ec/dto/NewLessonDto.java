package de.ait.ec.dto;

import lombok.Data;

@Data
public class NewLessonDto {

    // идентификатор существующего урока, если он задан, то остальные поля не нужны
    private Long existsLessonId;
    private String name;
    private String startTime;
    private String finishTime;
    private String dayOfWeek;

}
