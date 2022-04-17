package Ex2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        BusStation busStation = new BusStation();
        Vehicle bus_1 = new Bus(5, 7, "Magenta");
        Vehicle bus_2 = new Bus(7, 5, "Black");
        Vehicle bus_3 = new Bus(3, 3, "Purple");
        Vehicle taxi_1 = new Taxi(3,12, "Blue");
        Vehicle taxi_2 = new Taxi(1,18, "Red");
        Vehicle taxi_3 = new Taxi(2,10, "Green");
        vehicleList.add(bus_1);
        vehicleList.add(bus_2);
        vehicleList.add(bus_3);
        vehicleList.add(taxi_1);
        vehicleList.add(taxi_2);
        vehicleList.add(taxi_3);
        bus_1.display();
        taxi_1.display();
        //add all Vehicles (Bus/Taxi) in BusStation ArrayList
        busStation.setVehicles(vehicleList);
        System.out.println(busStation.showTotalProfit());
        System.out.println("Vehicles before sorting:");
        busStation.showAllVehicles();
        busStation.sortVehicles();
        System.out.println("Vehicles after sorting:");
        busStation.showAllVehicles();
    }
}