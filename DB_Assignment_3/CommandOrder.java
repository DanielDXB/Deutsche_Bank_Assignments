package HW3;

public class CommandOrder extends Command {
    @Override
    public void execute(Client client, String pizza) {
        client.orderPizza(pizza);
    }
}