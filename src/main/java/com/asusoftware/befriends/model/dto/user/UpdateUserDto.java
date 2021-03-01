package com.asusoftware.befriends.model.dto.user;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Getter
@Setter
public class UpdateUserDto {
    @NotBlank
    private String firstName;
    @NotBlank private String lastName;
    @NotNull
    private Date birthday;
}
