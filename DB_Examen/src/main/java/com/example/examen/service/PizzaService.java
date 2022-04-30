package com.example.examen.service;

import com.example.examen.exceptions.InvalidTypeException;
import com.example.examen.factory.PizzaFactory;
import com.example.examen.model.Pizza;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaService {
    public List<Pizza> pizzaList () throws InvalidTypeException {
        List<Pizza> pizzaList = new ArrayList<>();
        pizzaList.add(PizzaFactory.createPizza(PizzaFactory.PizzaType.CARNIVORA));
        pizzaList.add(PizzaFactory.createPizza(PizzaFactory.PizzaType.CLASSIC));
        pizzaList.add(PizzaFactory.createPizza(PizzaFactory.PizzaType.PROSCIUTTO));
        return pizzaList;
    }

    public List<String> pizzaListAsString() {
        List<String> pizzaListAsString = new ArrayList<>();
        pizzaListAsString.add("CARNIVORA");
        pizzaListAsString.add("PROSCITTO");
        pizzaListAsString.add("CLASSIC");
        return pizzaListAsString;
    }
}
