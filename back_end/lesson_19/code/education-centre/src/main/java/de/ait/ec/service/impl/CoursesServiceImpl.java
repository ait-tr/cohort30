package de.ait.ec.service.impl;

import de.ait.ec.dto.*;
import de.ait.ec.exceptions.RestException;
import de.ait.ec.models.Course;
import de.ait.ec.models.Lesson;
import de.ait.ec.repository.CoursesRepository;
import de.ait.ec.repository.LessonsRepository;
import de.ait.ec.service.CoursesService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import static de.ait.ec.dto.CourseDto.from;
import static de.ait.ec.dto.LessonDto.from;

@RequiredArgsConstructor
@Service
public class CoursesServiceImpl implements CoursesService {

    private Logger logger = LoggerFactory.getLogger(CoursesServiceImpl.class);

    private final CoursesRepository coursesRepository;

    private final LessonsRepository lessonsRepository;
    @Override
    public CourseDto addCourse(NewCourseDto newCourse) {

        // здесь будет Join point,  т.е. место, куда мы хотим внедрить advice

        System.out.println("!!!!!!!!!!!!!!!!!ADD COURSE!!!!!!!!!!!!!!!!!!");

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

     //   String courseTitle = "Test course";

     //   logger.info("Database request: get all courses");
     //   logger.warn("Course with title {} not found",courseTitle);
     //   logger.error("SQL exception! Incorrect query");


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

    @Override
    public List<LessonDto> getLessonsOfCourse(Long courseId) {
        // найдем курс, у которого хотим получить уроки
        Course course = getCourseOrThrow(courseId);

        // получим уроки курса
        Set<Lesson> lessons = course.getLessons();

        // конвертируем в DTO
        return from(lessons);
    }

    private Course getCourseOrThrow(Long courseId){
        return coursesRepository.findById(courseId)
                .orElseThrow(()->
                      new RestException(HttpStatus.NOT_FOUND,"Course with id <" +courseId +"> not found"));
    }
}
