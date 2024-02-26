package Homework6;

public class Cat extends Animal{
    @Override
    void play(){
        climb();
    }
    void climb() {
        System.out.println("-----------------------------");
        System.out.println("The cat is climbing");
    }
}
