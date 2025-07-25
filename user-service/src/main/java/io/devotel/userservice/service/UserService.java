package io.devotel.userservice.service;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.devotel.userservice.model.User;
import io.devotel.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;


    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
