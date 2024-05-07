package de.ait.ec.validation;

import de.ait.ec.dto.StandardResponseDto;
import de.ait.ec.validation.dto.ValidationErrorDto;
import de.ait.ec.validation.dto.ValidationErrorsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@ControllerAdvice
public class ValidationExceptionHandler {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ValidationErrorsDto> handleValidationException(MethodArgumentNotValidException e){

        List<ValidationErrorDto> validationErrors = new ArrayList<>();

        List<ObjectError> errors = e.getBindingResult().getAllErrors();// получение всех возникших ошибок

        for (ObjectError error: errors){
            FieldError fieldError = (FieldError) error; // получаем из ObjectError значение FieldError
                                                        // для доступа к информации по конкретному полю
          //  System.out.println(error.getObjectName() + " " + error.getDefaultMessage());
            System.out.println(fieldError.getField() + " " + fieldError.getRejectedValue() + " "
                    + fieldError.getDefaultMessage());

            ValidationErrorDto errorDto = ValidationErrorDto.builder()
                    .field(fieldError.getField()) // указываем название поля
                    .message(fieldError.getDefaultMessage()) // указываем текст ошибки
                    .build();
            if(fieldError.getRejectedValue() != null){
                errorDto.setRejectedValue(fieldError.getRejectedValue().toString());
            }
            validationErrors.add(errorDto);
        }
        return ResponseEntity
                .badRequest()
                .body(ValidationErrorsDto.builder()
                        .errors(validationErrors)
                        .build());
    }


}
