package com.asusoftware.befriends.service;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.model.dto.user.LoginDto;
import com.asusoftware.befriends.model.dto.user.UpdateUserDto;

import java.util.UUID;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
public interface UserService {
    void create(CreateUserDto createUserDto);
    void update(UpdateUserDto updateUserDto);
    String login(LoginDto loginDto);
    void delete(UUID id);
}
