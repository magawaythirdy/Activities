package week.pkg4;

import java.util.Scanner;

public class Expert {
    static int[][] warehouse = {
        {25, 10, -1, 40},
        {5, 30, 2, 15},
        {-1, 50, 8, 20}
    };

    static final int CRITICAL = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        // do-while menu: runs at least once, until the user chooses to exit
        do {
            System.out.println("\n=== Warehouse Inventory Scanner ===");
            System.out.println("1. Total inventory");
            System.out.println("2. Find first critically low shelf");
            System.out.println("3. Restock a shelf");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    totalInventory();
                    break;
                case 2:
                    findLowShelf();
                    break;
                case 3:
                    restock(input);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    static void totalInventory() {
        int total = 0;
        for (int r = 0; r < warehouse.length; r++) {
            for (int c = 0; c < warehouse[r].length; c++) {
                // continue: skip damaged shelves (-1)
                if (warehouse[r][c] == -1) {
                    continue;
                }
                total += warehouse[r][c];
            }
        }
        System.out.println("Total inventory: " + total);
    }

    static void findLowShelf() {
        boolean found = false;
        for (int r = 0; r < warehouse.length; r++) {
            for (int c = 0; c < warehouse[r].length; c++) {
                // Damaged shelves are not counted as low stock
                if (warehouse[r][c] != -1 && warehouse[r][c] <= CRITICAL) {
                    System.out.println("First critically low shelf: row " + r + ", col " + c
                            + " (count: " + warehouse[r][c] + ")");
                    found = true;
                    break; // break: stop the inner loop once found
                }
            }
            if (found) {
                break; // break: stop the outer loop too
            }
        }
        if (!found) {
            System.out.println("No critically low shelves.");
        }
    }

    static void restock(Scanner input) {
        System.out.print("Enter row: ");
        int r = input.nextInt();
        System.out.print("Enter column: ");
        int c = input.nextInt();

        // Validate the shelf position
        if (r < 0 || r >= warehouse.length || c < 0 || c >= warehouse[0].length) {
            System.out.println("Invalid shelf position.");
            return; // return: exit the method early
        }
        if (warehouse[r][c] == -1) {
            System.out.println("Cannot restock a damaged shelf.");
            return;
        }

        // while loop: keep asking until the amount is valid (greater than 0)
        System.out.print("Enter amount to add: ");
        int amount = input.nextInt();
        while (amount <= 0) {
            System.out.print("Invalid. Enter a positive amount: ");
            amount = input.nextInt();
        }

        warehouse[r][c] += amount;
        System.out.println("Restocked. New count: " + warehouse[r][c]);
    }
}