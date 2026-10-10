package week.pkg4;

import java.util.Scanner;

public class Intermediate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("Enter an integer (-1 to stop): ");
        int number = input.nextInt();

        while (number != -1) {
            total += number;
            System.out.print("Enter an integer (-1 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Final total: " + total);
    }
}