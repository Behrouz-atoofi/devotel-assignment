package io.devotel.profileservice.dto.profile;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */
@Getter
@Setter
@ToString
public class CreateProfileDto extends ProfileDto {

    private String name;
    private String email;
    private String bio;
    private String location;
    private int age;

}
