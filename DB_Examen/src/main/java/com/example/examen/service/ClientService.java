package com.example.examen.service;

import com.example.examen.exceptions.InvalidTypeException;
import com.example.examen.exceptions.UserNotFountException;
import com.example.examen.exceptions.UsernameAlreadyExistsException;
import com.example.examen.factory.PizzaFactory;
import com.example.examen.model.Client;
import com.example.examen.model.Pizza;
import com.example.examen.repository.ClientRepository;
import com.example.examen.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService {
    private final ClientRepository clientRepository;
    private final PizzaRepository pizzaRepository;

    public Client addClient(Client client) throws UsernameAlreadyExistsException {
        if (clientRepository.findByUsername(client.getUsername()) != null)
            throw new UsernameAlreadyExistsException("Username already exists!");
        else
            return clientRepository.save(client);
    }

    public Pizza orderPizza(PizzaFactory.PizzaType type, Integer clientId) throws UserNotFountException, InvalidTypeException {
        Optional<Client> client = clientRepository.findById(clientId);

        if (client.isPresent()){
            Pizza pizza = PizzaFactory.createPizza(type);
            return pizzaRepository.save(pizza);
        } else
            throw new UserNotFountException("User not found!");
    }
}
