package io.devotel.profileservice.mapper;

import io.devotel.profileservice.dto.profile.CreateProfileDto;
import io.devotel.profileservice.dto.profile.ProfileDto;
import io.devotel.profileservice.model.Profile;
import org.mapstruct.Mapper;


/*
 * Author: Behrouz Atoofi.
 * Created on: 26/07/2025 A
 */

@Mapper(componentModel = "spring")

public interface ProfileMapper {
    ProfileDto toDto(Profile entity);

    Profile toEntity(ProfileDto dto);

    Profile fromCreateProfileDto(CreateProfileDto createProfileDto);
}
