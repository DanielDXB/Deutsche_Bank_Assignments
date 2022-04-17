package HW3.PizzaToppings;

import HW3.PizzTypes.Pizza;
import HW3.ToppingDecorator;

public class Tomato extends ToppingDecorator {
    public Tomato(Pizza newPizza) {
        super(newPizza);
    }

    public String getPizzaDescription() {
        return plainPizza.getPizzaDescription() + " with " + Toppings.TOMATO + " topping";
    }
}