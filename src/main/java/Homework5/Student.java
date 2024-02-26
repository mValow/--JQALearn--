package Homework5;

public class Student extends Person {
    double score;

    public Student(String name, int age, boolean isMan, double score) {

        super(name, age, isMan);
        this.score = score;
    }

    public void showStudentInfo() {
        System.out.println("\n");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("isMan: " + isMan);
        System.out.println("Student Score : " + score);

    }


}
