package io.devotel.profileservice.service;


import io.devotel.profileservice.dto.profile.CreateProfileDto;
import io.devotel.profileservice.dto.profile.ProfileDto;
import io.devotel.profileservice.exception.ProfileExistsException;
import io.devotel.profileservice.exception.UserNotFoundException;
import io.devotel.profileservice.mapper.ProfileMapper;
import io.devotel.profileservice.model.Profile;
import io.devotel.profileservice.repository.ProfileRepository;
import io.devotel.profileservice.service.client.UserClient;
import io.devotel.user_service.GetUserByIdResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

        Profile profile = profileRepository.findById(id).orElseThrow(ProfileNotFoundException::new);
        return profileMapper.toDto(profile);
    }

    public ProfileDto createProfile(CreateProfileDto createProfileDto) {
        log.info("Save createProfileDto: {}", createProfileDto);

        checkProfileExistsByUserId(createProfileDto.getUserId());

        GetUserByIdResponse user = getUserById(createProfileDto.getUserId());

        Profile savedProfile = profileMapper.fromCreateProfileDto(createProfileDto);
        savedProfile.setName(user.getUser().getName());
        savedProfile = profileRepository.save(savedProfile);
        return profileMapper.toDto(savedProfile);
    }

    public GetUserByIdResponse getUserById(Long userId) {
        log.info("Get user by id: {}", userId);
        GetUserByIdResponse response = userClient.getUserById(userId);

        return Optional.ofNullable(response)
                .orElseThrow(() -> new UserNotFoundException("User with id " + userId + " not found"));

    }

    private void checkProfileExistsByUserId(Long userId) {
        log.debug("Checking if profile exists for userId: {}", userId);

        if (profileRepository.findByUserId(userId).isPresent()) {
            throw new ProfileExistsException("A profile already exists for userId: " + userId);
        }
    }

}