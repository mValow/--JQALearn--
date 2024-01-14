package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Въведете първото число: ");
         int firstNum = sc.nextInt();

        System.out.println("Въведете второто число: ");
         double secondNum = sc.nextDouble();

        System.out.println("Въведете третото число: ");
         int thirdNum = sc.nextInt();

        System.out.println("Въведете четвъртото число: ");
         double fourthNum = sc.nextDouble();

        int cast = firstNum;
             firstNum = (int) secondNum;
              secondNum = cast;


        cast = thirdNum;
          thirdNum = (int) fourthNum;
            fourthNum = cast;

        System.out.println("Първото число е: " + firstNum);
        System.out.println("Второто число е: " + secondNum);
        System.out.println("Третото число е: " + thirdNum);
        System.out.println("Четвъртото число е: " + fourthNum);


        System.out.println("Сумиране на първото и второто число след кастване от int to double: " + (firstNum + (int) secondNum));


        System.out.println("Сумиране на третото и четвъртото число след кастване от double to int: " + (thirdNum + (int) fourthNum));


    }
}
