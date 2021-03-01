package com.asusoftware.befriends.model;

import com.sun.istack.Nullable;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Nullable
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "image_id")
    private List<Image> images;

    @Nullable
    @Column(name = "likes")
    private List<User> likes;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;
}
