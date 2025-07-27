package io.devotel.userservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "نام کاربر", example = "behrouz Atoofi")
    private String name;
    @Schema(description = "ایمیل کاربر", example = "mr.atoufi@gmail.com")
    private String email;

}
