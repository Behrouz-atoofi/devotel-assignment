package io.devotel.profileservice.controller;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.devotel.profileservice.dto.profile.CreateProfileDto;
import io.devotel.profileservice.dto.profile.ProfileDto;
import io.devotel.profileservice.service.ProfileService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/profiles")
public class ProfileApi {

    private final ProfileService profileService;

    @Operation(summary = "ساخت پروفایل جدید", description = "یک پروفایل جدید برای کاربر ایجاد می‌کند.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "پروفایل با موفقیت ایجاد شد"),
            @ApiResponse(responseCode = "400", description = "درخواست نامعتبر"),
            @ApiResponse(responseCode = "500", description = "خطای سرور")
    })
    @PostMapping
    public ResponseEntity<ProfileDto> createProfile(@RequestBody CreateProfileDto createProfileDto) {
        log.info("Creating profile: {}", createProfileDto);

        return ResponseEntity.ok().body(profileService.createProfile(createProfileDto));
    }

    @Operation(summary = "دریافت پروفایل بر اساس ID", description = "پروفایل را با شناسه‌ی مشخص بازیابی می‌کند.")
    @GetMapping("/{id}")
    public ResponseEntity<ProfileDto> getProfile(@PathVariable Long id) {
        log.info("Getting profile: {}", id);

        return ResponseEntity.ok().body(profileService.getProfile(id));
    }

}
