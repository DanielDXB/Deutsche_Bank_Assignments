package Ex2;

public class Taxi extends Vehicle {
    private int noPassengers, ticketPrice;

    public Taxi(int noPassengers, int ticketPrice, String colour) {
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
                " taxi is functional: " + this.isFunctional());
    }
}