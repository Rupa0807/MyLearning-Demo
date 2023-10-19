package com.RestDemo.Utlity;

import java.nio.charset.CoderMalfunctionError;

public class studentErrorResponseClass {
    public studentErrorResponseClass() {
    }

    private String error;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    private String StatusCode;
    private String timestamp;

    public studentErrorResponseClass(String error, String statusCode, StudentNotFoundExceptionClass e) {
        this.error = error;
        StatusCode = statusCode;
        this.e = e;
    }

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }

    public StudentNotFoundExceptionClass getE() {
        return e;
    }

    public void setE(StudentNotFoundExceptionClass e) {
        this.e = e;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private  StudentNotFoundExceptionClass e;
}
