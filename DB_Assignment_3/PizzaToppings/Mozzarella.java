package HW3.PizzaToppings;

import HW3.PizzTypes.Pizza;
import HW3.ToppingDecorator;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    public String getPizzaDescription() {
        return plainPizza.getPizzaDescription() + " with " + Toppings.MOZZARELLA + " topping";
    }
}