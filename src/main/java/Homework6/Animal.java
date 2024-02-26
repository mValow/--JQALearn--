package Homework6;

abstract class Animal implements IAnimal {

    abstract void play();

    @Override
    public void makeSomeNoise() {
        System.out.println("-----------------------------");
        System.out.println("Animals make some noise!");
    }
}
