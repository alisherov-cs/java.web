package com.example.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.Entity.User;
import com.example.web.Service.UsersService;

@RestController
@RequestMapping("users")
public class UsersController {
    
    @Autowired
    private UsersService usersService;

    @GetMapping()
    @ResponseStatus(code = HttpStatus.OK)
    List<User> getUsers() {
        return usersService.getUsers();
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    User getUser(@PathVariable int id) {
        return usersService.getUser(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    int createUser(@RequestBody User user) {
        return usersService.createUser(user);
    }

    @PatchMapping("{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    User updateUser(@PathVariable int id, @RequestBody User newUser) {
        return usersService.updateUser(id, newUser);
    }
}
