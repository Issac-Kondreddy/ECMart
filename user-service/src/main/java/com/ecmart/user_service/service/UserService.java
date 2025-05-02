package com.ecmart.user_service.service;

import com.ecmart.user_service.model.User;


public interface UserService {
    User registerUser(User user);
    User getUserbyEmail(String email);
}
