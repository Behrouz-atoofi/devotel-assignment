package io.devotel.userservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * Author: Behrouz Atoofi.
 * Created on: 26/07/2025 A
 */
@Getter
@Setter
@ToString
public class UserDto {

    @Schema(description = "شناسه کاربر", example = "1")
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 50, message = "Name must be 2-50 characters")
    @Schema(description = "نام کاربر", example = "behrouz Atoofi")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Email format is invalid")
    @Schema(description = "ایمیل کاربر", example = "mr.atoufi@gmail.com")
    private String email;

}
