package Homework6;

public class Main {
    public static void main(String[] args) {
        Animal b = new Bird();
        Animal c = new Cat();
        Animal d = new Dog();

        b.play();
        c.play();
        d.play();

        b.makeSomeNoise();
        c.makeSomeNoise();
        d.makeSomeNoise();

        Bird specific = (Bird) b;
        specific.fly();
        specific.sing();
        specific.sing(2);
    }
}
