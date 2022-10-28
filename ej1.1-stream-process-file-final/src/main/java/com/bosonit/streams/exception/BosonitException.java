package com.bosonit.streams.exception;

public class BosonitException extends Exception {

    public BosonitException(String message, Throwable cause) {
        super(message, cause);
    }

    public BosonitException(String message) {
        super(message);
    }
}