package de.ait.controllers;

import de.ait.dto.CourseDto;
import de.ait.dto.NewCourseDto;
import de.ait.services.CoursesService;
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
    public ResponseEntity<CourseDto> addCourse(@RequestBody NewCourseDto newCourse)
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




}
