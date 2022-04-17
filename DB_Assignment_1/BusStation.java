package Ex2;

import java.util.ArrayList;
import java.util.Collections;

public class BusStation {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void showAllVehicles() {
        for (Vehicle v : vehicles)
            System.out.println("Vehicle: { colour:" +
                    v.getColor() + " is functional: " +
                    v.isFunctional() + " }");
    }

    public int showTotalProfit() {
        int totalProfit = 0;
        for (Vehicle v : vehicles) {
            totalProfit += v.profit();
        }
        return totalProfit;
    }

    public void sortVehicles() {
        Collections.sort(vehicles);
    }
}