package com.example.web.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.web.entities.User;

@Service
public class UsersService {
    List<User> users = Arrays.asList(
            new User("John", 21),
            new User("Ruben", 17)
    );

    public List<User> getUsers() {
        return users;
    }
}
