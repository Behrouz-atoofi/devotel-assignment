package io.devotel.profileservice.exception;


/*
 * Author: Behrouz Atoofi.
 * Created on: 29/07/2025 A
 */

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException() {
        super("User not found");
    }

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
