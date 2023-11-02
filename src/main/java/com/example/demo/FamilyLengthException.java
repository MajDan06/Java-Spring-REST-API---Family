package com.example.demo;

public class FamilyLengthException extends RuntimeException{

    public FamilyLengthException(String message) {
        super(message);
    }

    public FamilyLengthException(String message, Throwable cause) {
        super(message, cause);
    }

    public FamilyLengthException(Throwable cause) {
        super(cause);
    }
}
