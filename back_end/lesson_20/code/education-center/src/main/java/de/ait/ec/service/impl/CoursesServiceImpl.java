package de.ait.ec.service.impl;

import de.ait.ec.dto.*;
import de.ait.ec.exceptions.RestException;
import de.ait.ec.model.Course;
import de.ait.ec.model.Lesson;
import de.ait.ec.model.User;
import de.ait.ec.repository.CoursesRepository;
import de.ait.ec.repository.LessonsRepository;
import de.ait.ec.repository.UsersRepository;
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
import static de.ait.ec.dto.UserDto.from;

@RequiredArgsConstructor
@Service
public class CoursesServiceImpl implements CoursesService {

    private Logger logger = LoggerFactory.getLogger(CoursesServiceImpl.class);

    private final CoursesRepository coursesRepository;

    private final LessonsRepository lessonsRepository;

    private final UsersRepository studentRepository;
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

        Lesson lesson;

        // создаем урок, который нужно будет сохранить в базе

        if(newLesson.getExistsLessonId() == null) { // если id существующего урока не указан
            // создадим урок, который затем сохраним в бд
            lesson = Lesson.builder()
                    .name(newLesson.getName())
                    .dayOfWeek(DayOfWeek.valueOf(newLesson.getDayOfWeek()))
                    .startTime(LocalTime.parse(newLesson.getStartTime()))
                    .finishTime(LocalTime.parse(newLesson.getFinishTime()))
                    .course(course) // проставляем, к какому курсу привязан урок
                    .build();
        } else { // если , был указан id  существующего урока
            lesson = lessonsRepository.findById(newLesson.getExistsLessonId())
                    .orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND,
                    "Lesson with id <" + newLesson.getExistsLessonId() + "> not found "));
            lesson.setCourse(course); //  проставили курс ему
        }
        lessonsRepository.save(lesson); //  сохраняем/обновляем существующий  урок


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

    @Override
    public LessonDto deleteLessonFromCourse(Long courseId, Long lessonId) {
        //2 вариант
        Course course = getCourseOrThrow(courseId);

        Lesson lesson = lessonsRepository.findByCourseAndId(course,lessonId)
                .orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND,
                        "Lesson with id <" + lessonId + "> not found in course with id <" + courseId + ">"));
        lesson.setCourse(null);
        lessonsRepository.save(lesson);
        return from(lesson);

        // 1 вариант
     /*   Course course = getCourseOrThrow(courseId);
        Set<Lesson> lessonsOfCourse = course.getLessons(); // получили все уроки нужного курса

        // нужно в этом списке найти урок, который мы хотим удалить

        for (Lesson lesson: lessonsOfCourse) { //  обходим все уроки этого курса
            if (lesson.getId().equals(lessonId)) { //  если у урока ID  совпадает с искомым ID урока
                lesson.setCourse(null); //  делаем ссылку у этого урока на курс null
                lessonsRepository.save(lesson);// сохраняем заново урок в бд
                return from(lesson);
            }
        }
            //  мы попадем сюда только если такого урока у курса нет
            throw new RestException(HttpStatus.NOT_FOUND,
                    "Lesson with id <" + lessonId + "> not found in course with id <" + courseId + ">");
        */
        }

    @Override
    public LessonDto updateLessonInCourse(Long courseId, Long lessonId, UpdateLessonDto updateLesson) {
        Course course = getCourseOrThrow(courseId);
        Lesson lesson = lessonsRepository.findByCourseAndId(course,lessonId)
                .orElseThrow(() -> new RestException(HttpStatus.NOT_FOUND,
                        "Lesson with id <" + lessonId + "> not found in course with id <" + courseId + ">"));
        lesson.setName(updateLesson.getName());
        lesson.setStartTime(LocalTime.parse(updateLesson.getStartTime()));
        lesson.setFinishTime(LocalTime.parse(updateLesson.getFinishTime()));
        lesson.setDayOfWeek(DayOfWeek.valueOf(updateLesson.getDayOfWeek()));

        lessonsRepository.save(lesson);

        return from(lesson);
    }

    @Override
    public List<UserDto> addStudentToCourse(Long courseId, StudentToCourseDto studentData) {
        Course course = getCourseOrThrow(courseId);
        User student =  studentRepository.findById(studentData.getUserId())
                .orElseThrow(()-> new RestException(HttpStatus.NOT_FOUND,
                        "User with id <" +studentData.getUserId() + ">not found"));

        // не рабочий вариант
    //    course.getStudents().add(student);
    //    coursesRepository.save(course);

        if( !student.getCourses().add(course)){
            throw new RestException(HttpStatus.BAD_REQUEST, "User with id <" +
                    student.getId() + ">already present in course with id <" +course.getId() +">");
        }

        studentRepository.save(student);
        Set<User> studentsOfCourse = studentRepository.findAllByCoursesContainsOrderById(course);

        return from(studentsOfCourse);
    }


    private Course getCourseOrThrow(Long courseId){
        return coursesRepository.findById(courseId)
                .orElseThrow(()->
                      new RestException(HttpStatus.NOT_FOUND,"Course with id <" +courseId +"> not found"));
    }
}
