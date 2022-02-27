package com.example.springbootexample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomException {

    @ExceptionHandler(EmptyListException.class)
    public ResponseEntity<?> handleEmptyException(EmptyListException emptyListException) {
        return new ResponseEntity<String>("Your list is empty", HttpStatus.BAD_REQUEST);
    }
}
