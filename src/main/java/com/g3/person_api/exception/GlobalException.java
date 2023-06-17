package com.g3.person_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.URI;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(NotFound.class)
    public ProblemDetail notFound(
            NotFound notFound
    ){
        ProblemDetail problemDetail=ProblemDetail.forStatusAndDetail(
                HttpStatus.NOT_FOUND,notFound.getMessage()
        );
        problemDetail.setTitle("not found...!!");
        problemDetail.setType(URI.create("localhost:8080/error/notfound"));

        return problemDetail;
    }
}
