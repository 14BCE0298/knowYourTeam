package com.sharma.vishal.knowYourTeam10.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.xml.ws.Response;
import java.time.LocalDate;
import java.util.Optional;

@RestControllerAdvice
public class GlobalExceptionMapper extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<Object> userNotFound(UserNotFoundException exception) {
        String errorMessage = "Error: " + exception.getLocalizedMessage()
                + " occured for user "
                + exception.getUserName()
                + " in call at: "
                + LocalDate.now();
        ExceptionMapper exceptionMapper = new ExceptionMapper(errorMessage);
        return new ResponseEntity<>(exceptionMapper, HttpStatus.NOT_FOUND);
    }
}
