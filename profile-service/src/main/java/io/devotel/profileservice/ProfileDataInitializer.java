package io.devotel.profileservice;


/*
 * Author: Behrouz Atoofi.
 * Created on: 29/07/2025 A
 */

import io.devotel.profileservice.model.Profile;
import io.devotel.profileservice.repository.ProfileRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProfileDataInitializer {

    private final ProfileRepository profileRepository;


    @PostConstruct
    public void init() {

        Profile profile = new Profile();
        profile.setId(1L);
        profile.setName("Behrouz");
        profile.setLocation("Tehran");
        profile.setBio("Backend developer");
        profile.setAge(32);
        profile.setUserId(1L);

        Profile profile1 = new Profile();
        profile1.setId(2L);
        profile1.setName("Nima");
        profile1.setLocation("Isfahan");
        profile1.setBio("Frontend developer");
        profile1.setAge(40);
        profile1.setUserId(2L);

        profileRepository.save(profile);
        profileRepository.save(profile1);


    }
}
