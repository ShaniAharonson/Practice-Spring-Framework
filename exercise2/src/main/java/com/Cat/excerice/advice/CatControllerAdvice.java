package com.Cat.excerice.advice;

import com.Cat.excerice.exceptions.CatSystemException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class CatControllerAdvice {
    @ExceptionHandler(value = {CatSystemException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrDetails handlerError(Exception e){
        return new ErrDetails("Error", e.getMessage());
    }

}
