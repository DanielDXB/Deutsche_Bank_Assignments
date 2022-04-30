package com.example.examen.controller;

import com.example.examen.exceptions.InvalidTypeException;
import com.example.examen.model.Pizza;
import com.example.examen.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MenuController {
    private final PizzaService pizzaService;

    @GetMapping("/menu")
    public List<Pizza> getMenu() throws InvalidTypeException {
        return pizzaService.pizzaList();
    }

    @GetMapping("/menu-as-string")
    public List<String> getMenuAsString() {
        return pizzaService.pizzaListAsString();
    }
}
