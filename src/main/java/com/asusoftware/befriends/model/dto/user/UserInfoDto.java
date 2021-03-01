package com.asusoftware.befriends.model.dto.user;

import com.asusoftware.befriends.model.UserInfo;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

/**
 * be-friends Created by Antonio on 3/1/2021
 */
@Getter
@Setter
public class UserInfoDto {
    @NotBlank @Email private String email;
    @NotNull private Date birthday;
    @NotBlank private String password;
    @NotNull private LocalDateTime createdAt;


    public static UserInfoDto toDto(UserInfo userInfo) {
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setEmail(userInfo.getEmail());
        userInfoDto.setBirthday(userInfo.getBirthday());
        userInfoDto.setPassword(userInfo.getPassword());
        userInfoDto.setCreatedAt(userInfo.getCreatedAt());
        return userInfoDto;
    }

    public static UserInfo toEntity(UserInfoDto userInfoDto) {
        UserInfo userInfo = new UserInfo();
        userInfo.setEmail(userInfoDto.getEmail());
        userInfo.setBirthday(userInfoDto.getBirthday());
        userInfo.setPassword(userInfoDto.getPassword());
        userInfo.setEnabled(false);
        userInfo.setCreatedAt(LocalDateTime.now(ZoneOffset.UTC));
        return userInfo;
    }
}
