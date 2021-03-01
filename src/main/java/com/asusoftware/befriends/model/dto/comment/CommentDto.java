package com.asusoftware.befriends.model.dto.comment;

import com.asusoftware.befriends.model.Comment;
import com.asusoftware.befriends.model.dto.user.UserDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * be-friends Created by Antonio on 3/1/2021
 */
@Getter
@Setter
public class CommentDto {

    @NotNull private UUID id;
    @NotNull private LocalDateTime createdAt;
    @NotBlank private String value;
    @NotNull private UserDto userDto;

    public static CommentDto toDto(Comment comment) {
        CommentDto commentDto = new CommentDto();
        commentDto.setId(comment.getId());
        commentDto.setCreatedAt(comment.getCreatedAt());
        commentDto.setValue(comment.getValue());
        commentDto.setUserDto(UserDto.toDto(comment.getUser()));
        return commentDto;
    }
}
