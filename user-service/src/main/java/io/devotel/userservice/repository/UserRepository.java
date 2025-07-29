package io.devotel.userservice.repository;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.devotel.userservice.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();

    User findById(long id);

    Optional<User> findByEmail(String email);


}
