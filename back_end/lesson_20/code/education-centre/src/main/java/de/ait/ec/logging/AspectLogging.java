package de.ait.ec.logging;

// AspectJ framework

import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {
    private Logger logger = LoggerFactory.getLogger(AspectLogging.class);// чтобы логгер понимал
                                                                                // в каком классе включено логирование

    @Pointcut("execution(* de.ait.ec.service.impl.CoursesServiceImpl.addCourse(de.ait.ec.dto.NewCourseDto))")
   // @Pointcut("execution(* de.ait.ec.service.impl.CoursesServiceImpl.addCourse(..))")
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

    @Pointcut("execution(* de.ait.ec.service.impl.CoursesServiceImpl.getCourse(..))")
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

    @SneakyThrows // ломбок аннотация, которую можно использовать чтобы не бросать exception  или не писать try/catch
    @Around(value = "getCourseById()")
    public Object profiler(ProceedingJoinPoint proceedingJoinPoint){
        String methodName = proceedingJoinPoint.getSignature().getName();

        logger.info("!!!!!!!!!!!!!!!start {}",methodName); // выполняется при старте метода
        long start = System.currentTimeMillis();// выполняется при старте метода

         Object result = proceedingJoinPoint.proceed();

        long finish = System.currentTimeMillis();// при окончании метода
        logger.info("!!!!!!!!!!!!!!finish {} time {}",methodName,finish - start);

        return result;
     //   return "Hello!";
    }








}
