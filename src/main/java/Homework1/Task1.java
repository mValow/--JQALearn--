package Homework1;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Въведете първото число: ");
        int firstNumber = sc.nextInt();


        System.out.println("Въведете второто число: ");
        int secondNumber = sc.nextInt();


        System.out.println("Първото число е: " + firstNumber);
        System.out.println("Второто число е: " + secondNumber);


        System.out.println("Въведете третото число: ");
        int thirdNumber = sc.nextInt();


        if (firstNumber <= thirdNumber && thirdNumber <= secondNumber) {
            System.out.println("Третото число е между първото и второто.");
        } else {
            System.out.println("Третото число не е между първото и второто.");

        }
    }

}
