package com.example.examen.factory;

import com.example.examen.exceptions.InvalidTypeException;
import com.example.examen.model.Pizza;
import com.example.examen.model.PizzaTypes.CarnivoraPizza;
import com.example.examen.model.PizzaTypes.ClassicPizza;
import com.example.examen.model.PizzaTypes.ProscittoPizza;
import org.springframework.stereotype.Component;

@Component
public class PizzaFactory {
    public enum PizzaType {
        CARNIVORA, PROSCIUTTO, CLASSIC
    }

    public static Pizza createPizza(PizzaType pizzaType) throws InvalidTypeException {
        return switch (pizzaType) {
            case CARNIVORA -> new CarnivoraPizza();
            case PROSCIUTTO -> new ProscittoPizza();
            case CLASSIC -> new ClassicPizza();
            default -> throw new InvalidTypeException();
        };
    }
}
