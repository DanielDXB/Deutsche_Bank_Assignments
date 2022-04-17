package HW3;

import HW3.PizzTypes.*;
import HW3.PizzaToppings.Mozzarella;
import HW3.PizzaToppings.Tomato;

public class Main {
    public static void main(String[] args) {
        PizzaFactory restaurant = PizzaFactory.getInstance();
        System.out.println(System.identityHashCode(restaurant));
        System.out.println(restaurant.createPizzaType("Capriciosa").getPizzaDescription());
        System.out.println(restaurant.createPizzaType("QuatroStagioni").getPizzaDescription());
        System.out.println(restaurant.createPizzaType("Marguerita").getPizzaDescription());
        System.out.println(restaurant.createPizzaType("ProsciuttoFunghi").getPizzaDescription());

        System.out.println(new Mozzarella(new Mozzarella(new Capriciosa())).getPizzaDescription());
        System.out.println(new Mozzarella(new QuatroStagioni()).getPizzaDescription());
        System.out.println(new Tomato(new Marguerita()).getPizzaDescription());
        System.out.println(new Tomato(new Mozzarella(new ProsciuttoFunghi())).getPizzaDescription());

        Client client = new Client(restaurant);
        restaurant.setPizza("Capriciosa");
        restaurant.setPizza("QuatroStagioni");

        CommandOrder commandOrder = new CommandOrder();
        commandOrder.execute(client, new Tomato(new Marguerita()).getPizzaDescription());

    }
}