package com.RestDemo.Utlity;

public class StudentNotFoundExceptionClass extends RuntimeException{
    public StudentNotFoundExceptionClass(String message) {
        super(message);
    }
}
