package Homework2;

public class Task6 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};


        boolean areEqual = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                areEqual = false;
                break;
            }
        }


        if (areEqual) {
            System.out.println("Arrays are same");
        } else {
            System.out.println("Arrays are different");
        }
    }
}
