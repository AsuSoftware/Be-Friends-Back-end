package com.asusoftware.befriends.repository;

import com.asusoftware.befriends.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
