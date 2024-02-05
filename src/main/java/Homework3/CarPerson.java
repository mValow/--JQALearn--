package Homework3;

public class CarPerson {

    public static void main(String[] args) {

        Car car1 = new Car(2023, 50000.0, true, 60.0, 60.0, "Gasoline");
        Car car2 = new Car(2020, 25000.0, false, 50.0, 50.0, "Diesel");

        car2.useFuel(35.0);
        car2.changeEngineFuelOperationSystem("Hybrid");

        System.out.println("Car 1:");
        System.out.println(car1);

        System.out.println("Car 2:");
        System.out.println(car2);
    }
}