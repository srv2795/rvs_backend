package com.example.SecureApp.service;

import com.example.SecureApp.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static List<User> userList = new ArrayList<>();

    public List<User> getUsers() {
        if (userList.size() == 0) {
            userList.add(new User("ashu", "12345"));
            userList.add(new User("himanshu","23678" ));
            userList.add(new User("chetan","48967" ));
        }
        return userList;
    }

    public List<User> createUser(User user) {
        userList.add(user);
        return userList;
    }

}
