package io.devotel.userservice.soap;


import io.devotel.user_service.GetUserByIdRequest;
import io.devotel.user_service.GetUserByIdResponse;
import io.devotel.userservice.mapper.UserMapper;
import io.devotel.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/*
 * Author: Behrouz Atoofi.
 * Created on: 27/07/2025 A
 */
@Endpoint
@RequiredArgsConstructor
public class UserEndPoint {

    private static final String NAMESPACE_URI = "http://devotel.io/user-service";

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getUserRequest")
    @ResponsePayload
    public GetUserByIdResponse getUserByIdResponse(@RequestPayload GetUserByIdRequest request) {
        GetUserByIdResponse response = new GetUserByIdResponse();
        response.setUser(userMapper.userToUserDTO(userRepository.findById(request.getId())));

        return response;
    }

}
