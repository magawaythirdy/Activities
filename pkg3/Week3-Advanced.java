package week.pkg3;

public class Advanced {
    public static void main(String[] args) {
        // Correct login details stored in the program
        String correctUsername = "admin";
        String correctPassword = "12345";

        // Values entered by the user (change these to test each path)
        String username = "admin";
        String password = "12345";
        boolean isLocked = false;

        // Stage 1: check the username first
        if (username.equals(correctUsername)) {
            // Stage 2: check the password only if the username matched
            if (password.equals(correctPassword)) {
                // Stage 3: check the account only if both matched
                if (!isLocked) {
                    System.out.println("Login successful. Welcome!");
                } else {
                    System.out.println("Login failed: Account is locked.");
                }
            } else {
                System.out.println("Login failed: Wrong password.");
            }
        } else {
            System.out.println("Login failed: Username not found.");
        }
    }
}   
