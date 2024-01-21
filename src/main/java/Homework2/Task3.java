package Homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextDouble();
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);


        }
    }
}