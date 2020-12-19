package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody //advice is rendered straight into the response body
    @ExceptionHandler(EmployeeNotFoundException.class) //advice to only respond if EmployeeNotFoundException is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND) //HTTP 404
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
