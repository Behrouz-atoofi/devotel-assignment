package io.devotel.userservice.repository;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import io.devotel.userservice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
