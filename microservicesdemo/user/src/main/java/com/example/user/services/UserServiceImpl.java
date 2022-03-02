package com.example.user.services;

import com.example.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    List<User> userList = List.of(
            new User(1, "ashu"),
            new User(2, "himanshu"),
            new User(3, "chetan"),
            new User(4, "roli"));

    @Override
    public User getUserById(int userId) {
        User user = userList.stream().filter(user1 -> user1.getUserId() == userId).findFirst().get();
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }
}
