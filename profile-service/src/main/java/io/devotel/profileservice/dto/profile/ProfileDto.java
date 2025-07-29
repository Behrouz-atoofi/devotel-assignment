package io.devotel.profileservice.dto.profile;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProfileDto {

    private Long id;
    private String name;
    private String email;
    private String bio;
    private String location;
    private int age;

    private Long userId;

}
