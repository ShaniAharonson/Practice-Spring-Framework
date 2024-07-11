package com.example.demo.advice;

import com.example.demo.exceptions.CatException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CatControllerAdvice {
    @ExceptionHandler(value = {CatException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrDetails handleError(Exception e){
        return new ErrDetails("Error ", e.getMessage());
    }
}
