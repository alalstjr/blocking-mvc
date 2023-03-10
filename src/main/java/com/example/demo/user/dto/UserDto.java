package com.example.demo.user.dto;

import com.example.demo.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String id;
    private String username;
    private String nickname;

    public User dtoToEntity(UserDto userDto) {
        return User.builder()
                   .username(userDto.getUsername())
                   .nickname(userDto.getNickname())
                   .build();
    }
}
