package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EntityErrorResponse> handleUserException(UserNotFoundException userException){
        EntityErrorResponse entityNotFoundError = new EntityErrorResponse();
        entityNotFoundError.setStatus(HttpStatus.NOT_FOUND.value());
        entityNotFoundError.setMessage(userException.getMessage());
        entityNotFoundError.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(entityNotFoundError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EntityErrorResponse> handleRoleException(RoleNotFoundException roleException){
        EntityErrorResponse entityNotFoundError = new EntityErrorResponse();
        entityNotFoundError.setStatus(HttpStatus.NOT_FOUND.value());
        entityNotFoundError.setMessage(roleException.getMessage());
        entityNotFoundError.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(entityNotFoundError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EntityErrorResponse> badRequestException(Exception exception){
        EntityErrorResponse entityNotFoundError = new EntityErrorResponse();
        entityNotFoundError.setStatus(HttpStatus.BAD_REQUEST.value());
        entityNotFoundError.setMessage("You have provided a wrong type of data");
        entityNotFoundError.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(entityNotFoundError, HttpStatus.BAD_REQUEST);
    }
}
