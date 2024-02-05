package Homework3;

public class Car {

    int year;
    double price;
    boolean isSportCar;
    double fuelTankCapacity;
    double freeFuel;
    String engineFuelOperationSystem;

    public Car(int year, double price, boolean isSportCar, double fuelTankCapacity, double freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    public void changeEngineFuelOperationSystem(String newEngineFuelOperationSystem) {
        this.engineFuelOperationSystem = newEngineFuelOperationSystem;
    }

    public void useFuel(double fuel) {
        if (fuel > freeFuel) {
            System.out.println("Not enough free fuel!");
        } else {
            freeFuel -= fuel;
        }
    }


    public String toString() {
        return "Car{" + "year=" + year + ", price=" + price + ", isSportCar=" + isSportCar +
                ", fuelTankCapacity=" + fuelTankCapacity +
                ", freeFuel=" + freeFuel +
                ", engineFuelOperationSystem='" + engineFuelOperationSystem + '\'' +
                '}';
    }
}
