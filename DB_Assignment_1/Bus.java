package Ex2;

public class Bus extends Vehicle {
    private int noPassengers, ticketPrice;

    public Bus(int noPassengers, int ticketPrice, String colour) {
        this.noPassengers = noPassengers;
        this.ticketPrice = ticketPrice;
        super.setColor(colour);
        super.setFunctional(true);
    }

    @Override
    public int charge() {
        return noPassengers * ticketPrice;
    }

    @Override
    public int profit() {
        return (int) (charge() * 0.25);
    }

    @Override
    public void display() {
        System.out.println("Number of passengers: " + this.noPassengers +
                " bus is functional: " + this.isFunctional());
    }
}