package io.devotel.userservice.service;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.devotel.user_service.UserDto;
import io.devotel.userservice.Exception.UserExistsException;
import io.devotel.userservice.mapper.UserMapper;
import io.devotel.userservice.model.User;
import io.devotel.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;
    private final UserMapper userMapper;


    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public UserDto registerUser(UserDto userDto) {
        log.info("Registering user: {}", userDto);

        checkUserExistsByEmail(userDto.getEmail());
        User user = userMapper.userDTOToUser(userDto);
        return userMapper.userToUserDTO(userRepository.save(user));
    }

    public List<UserDto> findAllUsers() {
        log.info("Finding all users");
        return userRepository.findAll().stream().map(userMapper::userToUserDTO).collect(Collectors.toList());
    }

    public void checkUserExistsByEmail(String email) {
        log.debug("checkUserExistsByEmail: {}", email);

        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent()) {
            throw new UserExistsException("There is already a user with the email: " + email);
        }

    }
}
