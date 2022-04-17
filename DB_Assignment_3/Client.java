package HW3;

public class Client {
    PizzaFactory pizzaFactory;

    public Client(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
        this.pizzaFactory.attachClient(this);
    }

    public void reciveUpdate() {
        System.out.println("New baked pizzas : " + pizzaFactory.getPizza());
    }

    public void orderPizza(String pizza) {
        System.out.println("You ordered a " + pizza);
    }
}