package de.ait.logging;

// AspectJ framework

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class AspectLogging {
    private Logger logger = LoggerFactory.getLogger(AspectLogging.class);// чтобы логгер понимал в каком классе включено логирование

    @Pointcut("execution(* de.ait.services.impl.CoursesServiceImpl.addCourse(de.ait.dto.NewCourseDto))")
    // @Pointcut("execution(* de.ait.services.impl.CoursesServiceImpl.addCourse(..))")
    public void saveCourse(){}

    // Advice - тот код, который будет внедряться  в основной код

    @Before("saveCourse()")
    public void  beforeSavingCourse(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs(); // все входящие параметры метода addCourse
        logger.info("Method addCourse of the class CoursesServicesImpl is called with parameter {}",args[0]);
        // args[0] -  т.к. мы знаем, что у нас один параметр в этом методе

    }
    @After("saveCourse()")
    public void afterSavingCourse(){
        logger.info("Method addCourse of the class CoursesServiceImpl finished its work ");
    }

    @Pointcut("execution(* de.ait.services.impl.CoursesServiceImpl.getCourse(..))")
    public void getCourseById(){}

    // advice

  /*  @AfterReturning("getCourseById()")
    public void afterReturningCourseById(){
        logger.info("Method getCourse of the class CoursesServiceImpl successfully returned course");
    }

   */

    @AfterReturning(value = "getCourseById()", returning = "result")
    public void afterReturningCourseById(Object result){
        logger.info("Method getCourse of the class CoursesServiceImpl successfully returned course {}",result);
    }


    @AfterThrowing(value = "getCourseById()",throwing = "e")
    public void afterThrowingExceptionWhileGettingCourseById(Exception e){
        logger.info("Method getCourse of the class CoursesServiceImpl threw an exception while getting course: "+
                "message -{}",e.getMessage());
    }

    // HomeWork: Pointcut и Advice для метода getCourses

    @Pointcut("execution(* de.ait.services.impl.CoursesServiceImpl.getCourses(..))")
    public void getCourses() {}

    @Before("getCourses()")
    public void beforeGettingCourses(JoinPoint joinPoint) {
        logger.info("Method getCourses of the class CoursesServiceImpl is called");
    }

    @After("getCourses()")
    public void afterGettingCourses(JoinPoint joinPoint) {
        logger.info("Method getCourses of the class CoursesServiceImpl finished its work");
    }

    @AfterReturning(value = "getCourses()", returning = "result")
    public void afterReturningCourses(Object result) {
        logger.info("Method getCourses of the class CoursesServiceImpl successfully returned courses. Number of courses: {}", ((List<?>) result).size());
    }

    @AfterThrowing(value = "getCourses()", throwing = "e")
    public void afterThrowingExceptionWhileGettingCourses(Exception e) {
        logger.info("Method getCourses of the class CoursesServiceImpl threw an exception while getting courses: message - {}", e.getMessage());
    }

}
