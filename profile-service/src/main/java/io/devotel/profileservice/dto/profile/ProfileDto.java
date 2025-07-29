package io.devotel.profileservice.dto.profile;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProfileDto {

    private Long id;

    @Size(max = 200, message = "Name must be less than 200 characters")
    private String name;

    @Size(max = 500, message = "Bio must be less than 500 characters")
    private String bio;

    @Size(max = 100, message = "Location must be less than 100 characters")
    private String location;

    @Min(value = 1, message = "Age must be greater than 0")
    @Max(value = 150, message = "Age must be realistic")
    private int age;

    @NotNull(message = "UserId is required")
    private Long userId;

}
