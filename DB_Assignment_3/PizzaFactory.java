package HW3;

import HW3.PizzTypes.*;

public class PizzaFactory {
    public Client client;
    private String pizza;

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
        notifyClient();
    }

    public void attachClient(Client client) {
        this.client = client;
    }

    public void notifyClient() {
        client.reciveUpdate();
    }

    private static PizzaFactory uniqueInstance = null;

    private PizzaFactory() {
    }

    public static PizzaFactory getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactory();
        }

        return uniqueInstance;
    }

    public Pizza createPizzaType(String type) {
        return switch (type) {
            case "Capriciosa" -> new Capriciosa();
            case "Marguerita" -> new Marguerita();
            case "ProsciuttoFunghi" -> new ProsciuttoFunghi();
            case "QuatroStagioni" -> new QuatroStagioni();
            default -> null;
        };
    }
}