package com.RestDemo.Utlity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@ControllerAdvice
public class ControllAdviceForException {
    @ExceptionHandler
    public ResponseEntity<studentErrorResponseClass> ExceptionHandler(Exception e){
        studentErrorResponseClass response= new studentErrorResponseClass();
        response.setError(e.getMessage());
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        // response.setE(new StudentNotFoundExceptionClass("Student ID invalid"));
        response.setStatusCode(HttpStatus.NOT_FOUND.toString());
        response.setTimestamp(timeStamp);
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);

    }
    @ExceptionHandler
    public ResponseEntity<studentErrorResponseClass> StudentExceptionHandler(StudentNotFoundExceptionClass e){
        studentErrorResponseClass response= new studentErrorResponseClass();
        response.setError(e.getMessage());
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH:mm:ss").format(Calendar.getInstance().getTime());
        // response.setE(new StudentNotFoundExceptionClass("Student ID invalid"));
        response.setStatusCode(HttpStatus.NOT_FOUND.toString());
        response.setTimestamp(timeStamp);
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);

    }
}
