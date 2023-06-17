package com.g3.person_api.exception;

public class NotFound extends RuntimeException{
    public NotFound(String message) {
        super(message);
    }
}
