package Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете ден от седмицата: ");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Its Monday :)");
        }
        if (num == 2) {
            System.out.println("Its Tuesday :)");
        }
        if (num == 3) {
            System.out.println("Its Wednesday :)");
        }
        if (num == 4) {
            System.out.println("Its Thursday :)");
        }
        if (num == 5) {
            System.out.println("Its Friday :)");
        }
        if (num == 6) {
            System.out.println("Its Saturday :)");
        }
        if (num == 7) {
            System.out.println("Its Sunday :)");
        }


    }
}
