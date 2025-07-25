package io.devotel.profileservice.repository;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.devotel.profileservice.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
