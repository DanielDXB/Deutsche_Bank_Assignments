package com.example.hw8.controller;

import com.example.hw8.model.User;
import com.example.hw8.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/showUsers")
    public List<User> createUserList() {
        return userService.createUserList();
    }

    @PostMapping("/usersUnder18")
    public List<User> filterUsersByAgeLessThan18() {
        return userService.filterUsersByAgeLessThan18(userService.createUserList());
    }

    @PostMapping("/doubleUsersAge")
    public List<User> doubleUsersAge() {
        return userService.doubleUsersAge(userService.createUserList());
    }

    @PostMapping("/lastUser")
    public User getLastUser() {
        return userService.getLastUser(userService.createUserList());
    }

    @PostMapping("/minimax")
    public List<Integer> getMinAndMax() {
        return userService.getLowestAndHighest(userService.createUserList());
    }

    @PostMapping("/noduplicate")
    public List<User> noDuplicatesList() {
        return userService.removeDuplicates(userService.createUserList());
    }

    @PostMapping("/megaFilter")
    public List<User> megaFilter() {
        return userService.megaFilter(userService.createUserList());
    }
}
