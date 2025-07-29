package io.devotel.profileservice.exception;


/*
 * Author: Behrouz Atoofi.
 * Created on: 29/07/2025 A
 */

public class ProfileExistsException extends RuntimeException {

    public ProfileExistsException() {
        super("profile already exists");
    }

    public ProfileExistsException(String message) {
        super(message);
    }

    public ProfileExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
