package com.asusoftware.befriends.service.impl;

import com.asusoftware.befriends.model.dto.user.CreateUserDto;
import com.asusoftware.befriends.repository.UserRepository;
import com.asusoftware.befriends.service.UserCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Service
@RequiredArgsConstructor
public class UserCreatorImpl implements UserCreator {

    private final UserRepository userRepository;

    @Override
    public void create(CreateUserDto createUserDto) {
        userRepository.save(CreateUserDto.toUser(createUserDto));
    }
}
