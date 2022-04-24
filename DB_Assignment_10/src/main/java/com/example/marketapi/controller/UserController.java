package com.example.marketapi.controller;

import com.example.marketapi.model.User;
import com.example.marketapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/users-view")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user-view/{user_id}")
    public User getUserById(@PathVariable Integer user_id) {
        return userService.getUserById(user_id);
    }

    @DeleteMapping("/user-remove/{user_id}")
    public String deleteUser(@PathVariable Integer user_id) {
        userService.deleteUser(user_id);
        return "User has been successfully deleted";
    }

    @GetMapping("/users-sorted-by-their-orders")
    public List<User> getFilteredUsers() {
        return userService.filteredUsers();
    }
}
