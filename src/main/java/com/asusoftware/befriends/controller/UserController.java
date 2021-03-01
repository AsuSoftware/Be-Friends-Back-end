package com.asusoftware.befriends.controller;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping(path = "/create")
    public void create(@RequestBody CreateUserDto createUserDto) {
        userService.create(createUserDto);
    }
}
