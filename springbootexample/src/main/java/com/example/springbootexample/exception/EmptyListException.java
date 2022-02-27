package com.example.springbootexample.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmptyListException extends RuntimeException{
    private String errorMessage;
    private String errorCode;
}
