package HW3;

import HW3.PizzTypes.Pizza;

public abstract class ToppingDecorator implements Pizza {
    public Pizza plainPizza;

    public ToppingDecorator(Pizza newPizza) {
        this.plainPizza = newPizza;
    }

    public String getPizzaDescription() {
        return plainPizza.getPizzaDescription();
    }
}