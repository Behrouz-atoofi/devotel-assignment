package io.devotel.profileservice.exception;
 

/*
 * Author: Behrouz Atoofi.
 * Created on: 29/07/2025 A
 */
 
public class ProfileNotFoundException extends RuntimeException {

    public ProfileNotFoundException() {
        super("profile not found");
    }

    public ProfileNotFoundException(String message) {
        super(message);
    }

    public ProfileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
