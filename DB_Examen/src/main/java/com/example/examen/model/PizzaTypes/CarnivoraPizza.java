package com.example.examen.model.PizzaTypes;

import com.example.examen.model.Pizza;

import javax.persistence.Entity;

@Entity
public class CarnivoraPizza extends Pizza {
    public static String type() {
        return "Carnivora Pizza";
    }
}
