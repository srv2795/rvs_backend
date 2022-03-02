package com.example.user.services;

import com.example.user.model.User;

import java.util.List;

public interface UserService {

    public User getUserById(int userId);

    public List<User> getAllUsers();

}
