package week.pkg3;

public class Expert {
    public static void main(String[] args) {
        // Stored account details
        String correctUsername = "ben";
        int correctPin = 1234;
        double balance = 25000.00;

        // Values entered by the user (change these to test)
        String username = "ben";
        int pin = 1234;
        double withdrawAmount = 5000.00;

        // Stage 1: nested if to check username AND PIN
        if (username.equals(correctUsername)) {
            if (pin == correctPin) {

                // Else-if ladder to determine the tier from the balance
                String tier;
                if (balance >= 50000) {
                    tier = "Platinum";
                } else if (balance >= 20000) {
                    tier = "Gold";
                } else if (balance >= 5000) {
                    tier = "Silver";
                } else {
                    tier = "Bronze";
                }

                // Switch on tier to select the daily limit and fee percentage
                double dailyLimit;
                double feePercent;
                switch (tier) {
                    case "Platinum":
                        dailyLimit = 50000;
                        feePercent = 0;
                        break;
                    case "Gold":
                        dailyLimit = 20000;
                        feePercent = 1;
                        break;
                    case "Silver":
                        dailyLimit = 10000;
                        feePercent = 2;
                        break;
                    default:
                        dailyLimit = 5000;
                        feePercent = 3;
                        break;
                }

                double fee = withdrawAmount * feePercent / 100;
                double totalDeduction = withdrawAmount + fee;

                System.out.println("Account Tier: " + tier);
                System.out.println("Daily Limit: " + dailyLimit);
                System.out.println("Fee: " + feePercent + "% (" + fee + ")");

                // Nested if: check sufficient balance AND daily limit
                if (totalDeduction <= balance) {
                    if (withdrawAmount <= dailyLimit) {
                        System.out.println("APPROVED: Withdrawal of " + withdrawAmount);
                        System.out.println("New Balance: " + (balance - totalDeduction));
                    } else {
                        System.out.println("DENIED: Amount exceeds the daily limit of " + dailyLimit);
                    }
                } else {
                    System.out.println("DENIED: Insufficient balance (amount + fee is " + totalDeduction + ")");
                }

            } else {
                System.out.println("DENIED: Incorrect PIN.");
            }
        } else {
            System.out.println("DENIED: Username not found.");
        }
    }
}
