package com.userservice.user.Service.UserServiceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.userservice.user.DTO.UserDTO;
import com.userservice.user.Models.User;
import com.userservice.user.Repo.UserRepository;
import com.userservice.user.Response.UserResponse;
import com.userservice.user.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public UserResponse createuser(UserDTO userDto) {
        LOGGER.info("[User] - User details are going to be saved... - {}", userDto.toString());

        User createdUser = userRepository.save(objectMapper.convertValue(userDto, User.class));

        return objectMapper.convertValue(createdUser, UserResponse.class);
    }
}
