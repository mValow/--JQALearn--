package Homework4;



public class ComputerPrices {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2024, 1.369, "Linux");
        Computer comp2 = new Computer(2023, 1.200, "Windows");


        int comparePcPrice = comp1.comparePrice(comp2);
        if (comparePcPrice == -1) {
            System.out.println("The first computer is more expensive than the second.");
        } else if (comparePcPrice == 1) {
            System.out.println("The second computer is more expensive than the first.");
        } else {
            System.out.println("The prices of both computers are equal.");
        }

        System.out.println("First PC:");
        System.out.println(comp1);

        System.out.println("Second PC:");
        System.out.println(comp2);


    }
}
