package com.bugtrackingsystem.exceptions;


public class ResourceAlreadyExistException extends RuntimeException{
    public ResourceAlreadyExistException() {
        super("Resource already exists");
    }

    public ResourceAlreadyExistException(String message) {
        super(message);
    }
}
