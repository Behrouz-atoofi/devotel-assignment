package io.devotel.profileservice;


/*
 * Author: Behrouz Atoofi.
 * Created on: 27/07/2025 A
 */

import io.devotel.profileservice.config.UserClientConfig;
import io.devotel.profileservice.service.client.UserClient;
import io.devotel.user_service.GetUserByIdResponse;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserClientConfig.class, loader = AnnotationConfigContextLoader.class)
@RequiredArgsConstructor
public class ClientLiveTest {

    private final UserClient client;
//
//    @Test
//    public void givenUserId_WhenGetUserById_ThenReturnUser() {
//        GetUserByIdResponse response = client.getUserById(1L);
//        assertEquals("Behrouz", response.getUser().getName());
//    }
}
