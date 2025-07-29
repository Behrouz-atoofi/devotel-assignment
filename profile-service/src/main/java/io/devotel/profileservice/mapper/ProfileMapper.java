package io.devotel.profileservice.mapper;

import io.devotel.profileservice.dto.profile.CreateProfileDto;
import io.devotel.profileservice.dto.profile.ProfileDto;
import io.devotel.profileservice.model.Profile;
import io.devotel.user_service.GetUserByIdResponse;
import io.devotel.userservice.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


/*
 * Author: Behrouz Atoofi.
 * Created on: 26/07/2025 A
 */

@Mapper(componentModel = "spring")

public interface ProfileMapper {
    ProfileDto toDto(Profile entity);

    Profile toEntity(ProfileDto dto);

    Profile fromCreateProfileDto(CreateProfileDto createProfileDto );
}
