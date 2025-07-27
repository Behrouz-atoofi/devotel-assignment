package io.devotel.profileservice.service;


import io.devotel.profileservice.dto.profile.CreateProfileDto;
import io.devotel.profileservice.dto.profile.ProfileDto;
import io.devotel.profileservice.mapper.ProfileMapper;
import io.devotel.profileservice.model.Profile;
import io.devotel.profileservice.repository.ProfileRepository;
import io.devotel.profileservice.service.client.UserClient;
import io.devotel.user_service.GetUserByIdResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final UserClient userClient;
    private final ProfileMapper profileMapper;

    public ProfileDto getProfile(Long id) {
        log.info("Get profile by id: {}", id);

        Profile profile = profileRepository.findById(id).orElseThrow(null);
        return profileMapper.toDto(profile);
    }

    public ProfileDto createProfile(CreateProfileDto createProfileDto) {
        log.info("Save createProfileDto: {}", createProfileDto);

        GetUserByIdResponse response = userClient.getUserById(createProfileDto.getId());


        // Implementing checking and business.

        return new ProfileDto();
    }
}