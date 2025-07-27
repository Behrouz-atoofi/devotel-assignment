package io.devotel.userservice.mapper;


import io.devotel.user_service.UserDto;
import io.devotel.userservice.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/*
 * Author: Behrouz Atoofi.
 * Created on: 26/07/2025 A
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDTO(User user);

    User userDTOToUser(UserDto userDTO);

}
