package Homework5;

public class Person {
    String name;
    int age;
    boolean isMan;


    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;

    }

    public void showPersonInfo() {
        System.out.println("\n");
        System.out.println("Person Name: " + this.name);
        System.out.println("Person Age: " + this.age);
        System.out.println("isMan: " + this.isMan);

    }
}


