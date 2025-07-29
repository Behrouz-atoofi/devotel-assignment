package io.devotel.profileservice.handler;


import io.devotel.profileservice.exception.ProfileExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
 * Author: Behrouz Atoofi.
 * Created on: 29/07/2025 A
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProfileExistsException.class)
    public ResponseEntity<String> handleProfileExists(ProfileExistsException ex) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }
}
