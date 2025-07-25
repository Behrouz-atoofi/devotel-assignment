package io.devotel.userservice.dto;


/*
 * Author: Behrouz Atoofi.
 * Created on: 25/07/2025 A
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserSoapDto {

    private Long id;
    private String name;
    private String email;

}
