package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Въведете първото число: ");
          int firstNum = scanner.nextInt();

        System.out.println("Въведете второто число: ");
          int secondNum = scanner.nextInt();

        System.out.println("Въведете третото число: ");
          int thirdNum = scanner.nextInt();


        System.out.println("Първото число е: " + firstNum);
        System.out.println("Второто число е: " + secondNum);
        System.out.println("Третото число е: " + thirdNum);
        System.out.println();


        int temp = firstNum;
         firstNum = secondNum;
          secondNum = thirdNum;
            thirdNum = temp;


        System.out.println("Първото число е: " + firstNum);
        System.out.println("Второто число е: " + secondNum);
        System.out.println("Третото число е: " + thirdNum);



        int sum = firstNum + secondNum;
          int difference = sum - thirdNum;


        System.out.println("Разликата между сумата на първото и второто число и третото число е: " + difference);


    }
}
