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

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @PostConstruct
     default void initData() {
        User user = new User();
        user.setId(1L);
        user.setName("Behrouz");
        user.setEmail("mr.atoufi@@gmail.com");

        UserRepository.this.save(user);
    }


    List<User> findAll();

    User findById(long id);


}
