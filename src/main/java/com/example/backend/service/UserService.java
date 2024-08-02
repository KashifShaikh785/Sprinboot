package com.example.backend.service;

import com.example.backend.model.User;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
}
