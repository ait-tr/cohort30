package de.ait.ec.services.impl;

import de.ait.ec.dto.*;
import de.ait.ec.exceptions.RestException;
import de.ait.ec.models.Course;
import de.ait.ec.models.Lesson;
import de.ait.ec.repositories.CoursesRepository;
import de.ait.ec.repositories.LessonsRepository;
import de.ait.ec.services.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static de.ait.ec.dto.CourseDto.from;
import static de.ait.ec.dto.LessonDto.from;

@RequiredArgsConstructor
@Service
public class CoursesServiceImpl implements CoursesService {

    private final CoursesRepository coursesRepository;

    private final LessonsRepository lessonsRepository;
    @Override
    public CourseDto addCourse(NewCourseDto newCourse) {
        Course course = Course.builder()
                .title(newCourse.getTitle())
                .description(newCourse.getDescription())
                .price(newCourse.getPrice())
                .beginDate(LocalDate.parse(newCourse.getBeginDate()))
                .endDate(LocalDate.parse(newCourse.getEndDate()))
                .state(Course.State.DRAFT)
                .build();

        coursesRepository.save(course);

        return from(course);

    }

    @Override
    public List<CourseDto> getCourses() {
      List<Course> courses = coursesRepository.findAll();
        return from(courses);
    }

    @Override
    public CourseDto getCourse(Long courseId) {
     Course course =  getCourseOrThrow(courseId);
        return from(course);
    }

    @Override
    public CourseDto deleteCourse(Long courseId) {

        Course course = getCourseOrThrow(courseId);
        coursesRepository.deleteById(courseId);

        return from(course);
    }

    @Override
    public CourseDto updateCourse(Long courseId, UpdateCourseDto updateCourseDto) {
        Course course = getCourseOrThrow(courseId);

        course.setTitle(updateCourseDto.getTitle());
        course.setDescription(updateCourseDto.getDescription());
        course.setPrice(updateCourseDto.getPrice());
        course.setBeginDate(LocalDate.parse(updateCourseDto.getBeginDate()));
        course.setEndDate(LocalDate.parse(updateCourseDto.getEndDate()));

        coursesRepository.save(course);

        return from(course);
    }

    @Override
    public LessonDto addLessonToCourse(Long courseId, NewLessonDto newLesson) {

        // находим курс, в который хотим добавить урок
        Course course = getCourseOrThrow(courseId);

        // создаем урок, который нужно будет сохранить в базе

        Lesson lesson = Lesson.builder()
                .name(newLesson.getName())
                .dayOfWeek(DayOfWeek.valueOf(newLesson.getDayOfWeek()))
                .startTime(LocalTime.parse(newLesson.getStartTime()))
                .finishTime(LocalTime.parse(newLesson.getFinishTime()))
                .course(course) // проставляем, к какому курсу привязан урок
                .build();

        lessonsRepository.save(lesson); //  сохраняем урок


        return from(lesson);
    }

    private Course getCourseOrThrow(Long courseId){
        return coursesRepository.findById(courseId)
                .orElseThrow(()->
                      new RestException(HttpStatus.NOT_FOUND,"Course with id <" +courseId +"> not found"));
    }
}
