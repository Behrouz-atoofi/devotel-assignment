package io.devotel.profileservice.service.client;


/*
 * Author: Behrouz Atoofi.
 * Created on: 26/07/2025 A
 */

import io.devotel.user_service.GetUserByIdRequest;
import io.devotel.user_service.GetUserByIdResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class UserClient extends WebServiceGatewaySupport {

    public GetUserByIdResponse getUserById(Long id) {
        GetUserByIdRequest request = new GetUserByIdRequest();
        request.setId(id);
        return (GetUserByIdResponse) getWebServiceTemplate()
                .marshalSendAndReceive(request);
    }
}
