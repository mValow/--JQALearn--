package Homework5;

public class Employee extends Person {
    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (age < 18) {
            return 0.0;
        } else {
            return hours * daySalary * 1.5;
        }
    }

    public void showEmployeeInfo() {
        System.out.println("\n");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("isMan: " + isMan);
        System.out.println("Employee Day Salary : " + daySalary);

    }
}
