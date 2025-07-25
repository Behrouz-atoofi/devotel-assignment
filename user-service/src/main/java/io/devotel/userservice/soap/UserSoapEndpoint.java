package io.devotel.userservice.soap;

import io.devotel.userservice.model.User;
import io.devotel.userservice.service.UserService;
import io.devotel.userservice.soap.generated.GetUserByIdRequest;
import io.devotel.userservice.soap.generated.GetUserByIdResponse;
import io.devotel.userservice.soap.generated.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

@Endpoint
@RequiredArgsConstructor
public class UserSoapEndpoint {

    private static final String NAMESPACE_URI = "http://devotel.io/user-service";

    @Autowired
    private final UserService userService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetUserByIdRequest")
    @ResponsePayload
    public GetUserByIdResponse getUserById(@RequestPayload GetUserByIdRequest request) {
        User user = userService.findById(request.getId());

        GetUserByIdResponse response = new GetUserByIdResponse();
        response.setUser(mapToDto(user));
        return response;
    }

    private UserDto mapToDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        return dto;
    }

}
