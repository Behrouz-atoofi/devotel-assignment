package io.devotel.userservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */
@Entity
@Getter
@Setter
@ToString
public class User {

    @Id
    private Long id;

    private String name;
    private String email;
}
