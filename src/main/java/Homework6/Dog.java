package Homework6;

public class Dog extends Animal{
    @Override
    void play(){
        bringStick();
    }


    public void bringStick() {
        System.out.println("-----------------------------");
        System.out.println("The Dog is bringing the Stick");
    }
}
