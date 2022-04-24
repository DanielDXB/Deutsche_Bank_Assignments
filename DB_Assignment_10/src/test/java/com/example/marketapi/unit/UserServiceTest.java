package com.example.marketapi.unit;

import com.example.marketapi.model.User;
import com.example.marketapi.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void whenCreateUser_ThenUserTableSizeMustBeOne() {
        User user = new User();
        userService.createUser(user);
        Assertions.assertEquals(1, userService.getAllUsers().size());
    }
}
