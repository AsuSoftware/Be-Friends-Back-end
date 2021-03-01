package com.asusoftware.befriends.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Getter
@Setter
@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "value")
    private String value;

    @OneToMany(mappedBy = "images")
    private Post post;
}
