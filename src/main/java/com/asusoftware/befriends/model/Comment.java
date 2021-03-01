package com.asusoftware.befriends.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @NotBlank
    @Column(name = "value")
    private String value;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
