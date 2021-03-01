package com.asusoftware.befriends.model.dto.user;

import com.asusoftware.befriends.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * be-friends Created by Antonio on 2/28/2021
 */
@Getter
@Setter
public class CreateUserDto {
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotBlank private String profileImage;
    @NotNull private UserInfoDto userInfoDto;

    public static User toUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setProfileImage(createUserDto.getProfileImage());
        user.setUserInfo(UserInfoDto.toEntity(createUserDto.getUserInfoDto()));
        return user;
    }
}
