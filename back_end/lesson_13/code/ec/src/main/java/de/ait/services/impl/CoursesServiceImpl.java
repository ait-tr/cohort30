package de.ait.services.impl;

import de.ait.dto.CourseDto;
import de.ait.dto.NewCourseDto;
import de.ait.exceptions.RestException;
import de.ait.models.Course;
import de.ait.repositories.CoursesRepository;
import de.ait.services.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import static de.ait.dto.CourseDto.from;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CoursesServiceImpl implements CoursesService {

    private final CoursesRepository coursesRepository;
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
     Course course =  coursesRepository.findById(courseId)// либо находим курс по id
                .orElseThrow(()->
                  //  new IllegalArgumentException("Course with id <" +courseId +"> not found"));
                    new RestException(HttpStatus.NOT_FOUND,"Course with id <" +courseId +"> not found"));// или
        // бросается ошибка
        return from(course);
    }
}
