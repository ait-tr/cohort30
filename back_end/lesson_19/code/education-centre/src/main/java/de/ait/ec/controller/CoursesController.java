package de.ait.ec.controller;

import de.ait.ec.dto.*;
import de.ait.ec.service.CoursesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/courses")
public class CoursesController {

    private final CoursesService coursesService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CourseDto> addCourse(@RequestBody @Valid NewCourseDto newCourse)
    {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                        .body(coursesService.addCourse(newCourse));

    }

    @GetMapping
    public ResponseEntity<List<CourseDto>> getCourses()
    {
        return ResponseEntity
                .ok(coursesService.getCourses());
    }


    @GetMapping("/{course-id}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable("course-id") Long courseId){
        return ResponseEntity
                .ok(coursesService.getCourse(courseId));
    }


    @DeleteMapping("/{course-id}")
    public ResponseEntity<CourseDto> deleteCourse(@PathVariable("course-id") Long courseId){

        return ResponseEntity
                .ok(coursesService.deleteCourse(courseId));
    }

    @PutMapping("/{course-id}")
    public ResponseEntity<CourseDto> updateCourse(@PathVariable("course-id") Long courseId,
                                                  @RequestBody @Valid UpdateCourseDto updateCourse){
        return ResponseEntity
                .ok(coursesService.updateCourse(courseId,updateCourse));
    }

    // end-point для добавления урока в курс
    // POST /api/courses/{id-курса}/lessons

    @PostMapping("/{course-id}/lessons")
    public ResponseEntity<LessonDto> addLessonToCourse(@PathVariable("course-id")Long courseId,
                                                       @RequestBody NewLessonDto newLesson){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(coursesService.addLessonToCourse(courseId,newLesson));
    }

    // end-point  для получения всех уроков определенного курса
    // GET /api/courses/{id-курса}/lessons
    @GetMapping("/{course-id}/lessons")
    public ResponseEntity<List<LessonDto>> getLessonsOfCourse(@PathVariable("course-id") Long courseId){
        return ResponseEntity
                .ok(coursesService.getLessonsOfCourse(courseId));
    }






}
