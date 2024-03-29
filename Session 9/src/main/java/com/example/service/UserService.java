
package com.example.service;

import com.example.dto.request.UserRequest;
import com.example.dto.response.UserResponse;
import com.example.model.User;

public interface UserService {
    User register (User user);
    UserResponse login (UserRequest userRequest);
}

