package de.ait.services;

import de.ait.dto.CourseDto;
import de.ait.dto.NewCourseDto;

import java.util.List;

public interface CoursesService {

    CourseDto addCourse(NewCourseDto newCourse);

    List<CourseDto> getCourses();

    CourseDto getCourse(Long courseId);
}
