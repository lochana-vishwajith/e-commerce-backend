package com.userservice.user.Service;

import com.userservice.user.DTO.UserDTO;
import com.userservice.user.Response.UserResponse;

public interface UserService {

    UserResponse createuser(UserDTO userDto);
}
