package io.devotel.userservice.Exception;


/*
 * Author: Behrouz Atoofi.
 * Created on: 29/07/2025 A
 */

public class UserExistsException extends RuntimeException {

    public UserExistsException() {
        super("User not found");
    }

    public UserExistsException(String message) {
        super(message);
    }

    public UserExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
