package com.asusoftware.befriends.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

/**
 * be-friends Created by Antonio on 3/1/2021
 */
@Getter
@Setter
@Entity
@Table(name = "user_info's")
public class UserInfo {

    @Id
    @GeneratedValue
    private UUID id;

    @Email
    @NotBlank
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "birthday")
    private Date birthday;

    @NotBlank
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "enabled", nullable = false)
    private Boolean enabled;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

}
