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
public class CreateProfileDto {

    @Schema(description = "ایمیل کاربر", example = "mr.atoufi@gmail.com")
    private String email;
    @Schema(description = "درباره کاربر", example = "senior Java developer")
    private String bio;
    @Schema(description = "ادرس کاربر", example = "Tehran")
    private String location;
    @Schema(description = "سن کاربر", example = "32")
    private int age;
    @Schema(description = "شناسه کاربری", example = "1L")
    // client first register a user in userService and then with UserId sends a request to profile-service
    private Long userId;

}
