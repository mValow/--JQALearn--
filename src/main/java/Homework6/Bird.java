package Homework6;

public class Bird extends Animal {
    @Override
    void play() {
        fly();
    }

    void fly() {
        System.out.println("-----------------------------");
        System.out.println("The Bird is flying");
    }

    void sing() {
        System.out.println("The Bird is singing");
    }

    void sing(int numberOfBirds) {
        System.out.println(numberOfBirds + " - birds are singing together\n");
    }
}