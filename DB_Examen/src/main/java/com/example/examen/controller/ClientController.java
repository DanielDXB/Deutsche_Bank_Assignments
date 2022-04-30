package com.example.examen.controller;

import com.example.examen.exceptions.InvalidTypeException;
import com.example.examen.exceptions.UserNotFountException;
import com.example.examen.exceptions.UsernameAlreadyExistsException;
import com.example.examen.factory.PizzaFactory;
import com.example.examen.model.Client;
import com.example.examen.model.Pizza;
import com.example.examen.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/new-client")
    public Client addClient(@RequestBody Client client) throws UsernameAlreadyExistsException {
        return clientService.addClient(client);
    }

    @PostMapping("/order-pizza/{type}/{client_id}")
    public Pizza orderPizza(@PathVariable PizzaFactory.PizzaType type, @PathVariable Integer client_id) throws UserNotFountException, InvalidTypeException {
        return clientService.orderPizza(type, client_id);
    }
}
