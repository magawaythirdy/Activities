package week.pkg1;

public class Intermediate {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 180.99;
        String storeName = "Mang Inasal";

        // totalCost should NOT be an int because quantity * unitPrice produces
        // a double (with decimal centavos). Storing it in an int would either
        // cause a compile error or cut off the decimal part, giving a wrong total.
        double totalCost = quantity * unitPrice;

        System.out.println("Store: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Cost: " + totalCost);
    }
}
