package com.asusoftware.befriends.service.impl;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.model.dto.user.LoginDto;
import com.asusoftware.befriends.model.dto.user.UpdateUserDto;
import com.asusoftware.befriends.service.UserCreator;
import com.asusoftware.befriends.service.UserRemoval;
import com.asusoftware.befriends.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserCreator userCreator;
    private final UserRemoval userRemoval;

    @Override
    public void create(CreateUserDto createUserDto) {
        userCreator.create(createUserDto);
    }

    @Override
    public void update(UpdateUserDto updateUserDto) {

    }

    @Override
    public String login(LoginDto loginDto) {
        return null;
    }

    @Override
    public void delete(UUID id) {
        userRemoval.delete(id);
    }
}
