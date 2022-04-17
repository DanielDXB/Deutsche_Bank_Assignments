package com.example.swaggerpractice.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Profile("dev")
public class DevController {
    @PostMapping("/dev")
    public String testAsDev() {
        return "Dev Test";
    }
}
