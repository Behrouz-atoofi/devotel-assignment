package io.devotel.userservice;


/*
 * Author: Behrouz Atoofi.
 * Created on: 29/07/2025 A
 */

import io.devotel.userservice.model.User;
import io.devotel.userservice.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserDataInitializer {

    private final UserRepository userRepository;

    @PostConstruct
    public void init() {
        User user = new User();
        user.setId(1L);
        user.setName("Behrouz");
        user.setEmail("mr.atoufi@gmail.com");

        User user1 = new User();
        user1.setId(2L);
        user1.setName("Nima");
        user1.setEmail("nima@gmail.com");

        userRepository.save(user);
        userRepository.save(user1);
    }

}
