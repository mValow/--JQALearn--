package Homework2;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 1, 8, 4};


        int[] copyArr = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }


        System.out.println("Original Array:");
        for (int number : arr) {
            System.out.println(number);
        }


        System.out.println("\nCopy Array:");
        for (int number : copyArr) {
            System.out.println(number);
        }

    }
}
