package Homework2;

public class Task4 {
    public static void main(String[] args) {

        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }


        System.out.println("Обход с for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}