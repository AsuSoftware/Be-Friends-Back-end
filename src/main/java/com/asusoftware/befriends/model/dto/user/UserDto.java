package com.asusoftware.befriends.model.dto.user;

import com.asusoftware.befriends.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

/**
 * be-friends Created by Antonio on 3/1/2021
 */
@Getter
@Setter
public class UserDto {
    @NotNull private UUID id;
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotBlank private String profileImage;

    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setProfileImage(user.getProfileImage());
        return userDto;
    }
}
