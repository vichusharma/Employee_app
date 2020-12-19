package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class EmployeeNotFoundException extends RuntimeException {
    EmployeeNotFoundException(int empId)
    {
        super("Could not find Employee "+empId);
    }
}
