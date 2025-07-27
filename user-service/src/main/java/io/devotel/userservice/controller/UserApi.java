package io.devotel.userservice.controller;


/*
 * Author: Behrouz Atoofi.
 * Created on: 26/07/2025 A
 */

import io.devotel.user_service.UserDto;
import io.devotel.userservice.mapper.UserMapper;
import io.devotel.userservice.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/users")
@Tag(name = "User API", description = "عملیات مربوط به کاربران")
public class UserApi {
    private final UserMapper userMapper;

    private final UserService userService;

    @Operation(summary = "ثبت نام کاربر")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ثبت نام موفق کاربر"),
            @ApiResponse(responseCode = "400", description = "درخواست نامعتبر"),
            @ApiResponse(responseCode = "500", description = "خطای سمت سرور")
    })
    @PostMapping
    public ResponseEntity<UserDto> registerNewUser(@RequestBody UserDto userDto) {
        log.info("Enter Registering new user: {}", userDto);
        return ResponseEntity.ok().body(userService.registerUser(userDto));
    }

    @Operation(summary = "دریافت کاربر بر اساس ID")
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(@Parameter(description = "شناسه کاربر", example = "1") @PathVariable Long id) {
        log.info("Enter getting user by id: {}", id);
        return ResponseEntity.ok().body(userMapper.userToUserDTO(userService.findById(id)));
    }

    @Operation(summary = "دریافت لیست همه کاربران")
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        log.info("Enter Getting all users");
        return ResponseEntity.ok().body(userService.findAllUsers());
    }

}
