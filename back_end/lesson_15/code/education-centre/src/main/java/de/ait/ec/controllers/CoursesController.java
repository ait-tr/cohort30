package de.ait.ec.controllers;

import de.ait.ec.dto.CourseDto;
import de.ait.ec.dto.NewCourseDto;
import de.ait.ec.dto.UpdateCourseDto;
import de.ait.ec.services.CoursesService;
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




}
