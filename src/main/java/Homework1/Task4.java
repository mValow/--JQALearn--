package Homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете работни часове: ");
        int workingHours = sc.nextInt();
        System.out.println("Въведете сума пари: ");
        double money = sc.nextDouble();
        System.out.print("Дали е почивен ден? (true/false): ");
        boolean isDayOff = sc.nextBoolean();


        if (isDayOff) {

            if (money > 0) {

                if (money < 10) {

                    System.out.println("Ще отида за сладолед.");
                } else {

                    System.out.println("Ще отида на кино.");
                }
            } else {

                System.out.println("Ще стоя вкъщи и ще гледам телевизия.");
            }
        } else {

            System.out.println("Ще работя.");
        }
    }
}
