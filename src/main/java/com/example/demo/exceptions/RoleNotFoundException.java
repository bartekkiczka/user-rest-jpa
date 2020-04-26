package com.example.demo.exceptions;

public class RoleNotFoundException extends RuntimeException {

    public RoleNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public RoleNotFoundException(String message){
        super(message);
    }

    public RoleNotFoundException(Throwable cause){
        super(cause);
    }
}
