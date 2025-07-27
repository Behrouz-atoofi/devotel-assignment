package io.devotel.profileservice.dto.profile;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProfileDto {

    @Schema(description = "شناسه پروفایل", example = "1")
    private Long id;
}
