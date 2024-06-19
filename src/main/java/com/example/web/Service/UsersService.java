package com.example.web.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.Entity.User;
import com.example.web.Repository.UserRepository;

@Service
public class UsersService {

    @Autowired
    private UserRepository users;


    public List<User> getUsers() {
        return users.findAll();
    }

    public User getUser(int id) {
        return users.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }

    public int createUser(User user) {
        User newUser = users.save(user);
        return newUser.getId();
    }

    public User updateUser(int id, User newUser) {
        this.getUser(id);
        newUser.setId(id);
        User updatedUser = users.save(newUser);
        return updatedUser;
    }
}
