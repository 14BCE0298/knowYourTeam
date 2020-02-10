package com.sharma.vishal.knowYourTeam10.exceptions;

public class ExceptionMapper {
    String message;

    public ExceptionMapper(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
