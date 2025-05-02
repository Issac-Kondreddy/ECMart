package com.ecmart.user_service.service;

import com.ecmart.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecmart.user_service.model.User;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    };

    public User registerUser(User user) {
        return userRepository.save(user);
    }
    public User getUserbyEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
