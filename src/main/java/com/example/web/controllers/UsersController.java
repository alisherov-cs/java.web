package com.example.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.entities.User;
import com.example.web.services.UsersService;

@RestController
@RequestMapping("users")
public class UsersController {
    
    @Autowired
    UsersService usersService;

    @GetMapping()
    List<User> getUsers() {
        return usersService.getUsers();
    }
}
