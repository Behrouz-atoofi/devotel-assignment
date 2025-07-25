package io.devotel.profileservice.controller;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.devotel.profileservice.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProfileApi {

    private final ProfileService profileService;


}
