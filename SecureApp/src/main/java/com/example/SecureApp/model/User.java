package com.example.SecureApp.model;

import lombok.*;

@Getter
@Setter
@ToString
public class User {

    private String userId;
    private String name;

    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
