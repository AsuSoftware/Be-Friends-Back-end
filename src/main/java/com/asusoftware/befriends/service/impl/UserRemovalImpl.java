package com.asusoftware.befriends.service.impl;

import com.asusoftware.befriends.service.UserRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Service
@RequiredArgsConstructor
public class UserRemovalImpl implements UserRemoval {

    private final UserRemoval userRemoval;

    @Override
    public void delete(UUID id) {
        userRemoval.delete(id);
    }
}
