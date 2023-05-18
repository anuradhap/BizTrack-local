package com.bizTrack.BizTrack.Exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BizTrackExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public String handleUserNotFoundExceptionNew(UserNotFoundException ex) {
        return ex.getMessage();
    }

}
