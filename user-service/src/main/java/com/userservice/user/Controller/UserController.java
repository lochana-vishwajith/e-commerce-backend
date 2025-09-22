package com.userservice.user.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.userservice.user.DTO.UserDTO;
import com.userservice.user.Models.User;
import com.userservice.user.Response.UserResponse;
import com.userservice.user.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @Autowired
    ObjectMapper objectMapper;

    @PostMapping
    public ResponseEntity<UserResponse> createUsers(@RequestBody User user){
        LOGGER.info("[User] - Request received to save user in the database - {}",user.toString());
        UserDTO requestDto = objectMapper.convertValue(user, UserDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createuser(requestDto));
    }
}
