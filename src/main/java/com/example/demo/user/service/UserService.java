package com.example.demo.user.service;

import com.example.demo.user.dto.UserDto;
import com.example.demo.user.entity.User;
import com.example.demo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    public User saveUser(UserDto userDtoMono) {
        return this.userRepository.save(userDtoMono.dtoToEntity(userDtoMono));
    }
}
