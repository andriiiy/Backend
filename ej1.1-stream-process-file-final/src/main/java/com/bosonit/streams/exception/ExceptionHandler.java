package com.bosonit.streams.exception;

public class ExceptionHandler {

    public void printExceptionInfo(Exception e) {
        System.out.println(e.getMessage());
    }

    public void printExceptionInfoAndStackTrace(Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}
