package io.devotel.profileservice.dto.profile;


import io.swagger.v3.oas.annotations.media.Schema;
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

    @Schema(description = "نام کاربر", example = "behrouz Atoofi")
    private String name;
    @Schema(description = "ایمیل کاربر", example = "mr.atoufi@gmail.com")
    private String email;
    @Schema(description = "درباره کاربر", example = "senior Java developer")
    private String bio;
    @Schema(description = "ادرس کاربر", example = "Tehran")
    private String location;
    @Schema(description = "سن کاربر", example = "32")
    private int age;

}
