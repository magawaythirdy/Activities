package week.pkg3;

public class Intermediate {
    public static void main(String[] args) {
        // Purchase amount (change this value to test other tiers)
        double purchaseAmount = 3500.00;
        double discountPercent;
        String tier;

        // Ranges are ordered from highest to lowest so no tier is unreachable
        if (purchaseAmount >= 5000) {
            discountPercent = 15;
            tier = "Platinum";
        } else if (purchaseAmount >= 3000) {
            discountPercent = 10;
            tier = "Gold";
        } else if (purchaseAmount >= 1000) {
            discountPercent = 5;
            tier = "Silver";
        } else {
            discountPercent = 0;
            tier = "Regular";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountPercent / 100);

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + tier + " (" + discountPercent + "%)");
        System.out.println("Final Price: " + finalPrice);
    }
}