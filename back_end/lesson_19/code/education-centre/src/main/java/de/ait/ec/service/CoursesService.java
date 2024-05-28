package de.ait.ec.service;

import de.ait.ec.dto.*;

import java.util.List;

public interface CoursesService {

    CourseDto addCourse(NewCourseDto newCourse);

    List<CourseDto> getCourses();

    CourseDto getCourse(Long courseId);

    CourseDto deleteCourse(Long courseId);

    CourseDto updateCourse(Long courseId, UpdateCourseDto updateCourse);

    LessonDto addLessonToCourse(Long courseId, NewLessonDto newLesson);

    List<LessonDto> getLessonsOfCourse(Long courseId);
}
