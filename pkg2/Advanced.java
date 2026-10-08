package week.pkg2;

public class Advanced {
    public static void main(String[] args) {
        // Starting balance
        double balance = 1000.0;
        System.out.println("Initial balance: " + balance);

        // Step 1: add a deposit using +=
        balance += 500;
        System.out.println("After deposit: " + balance);

        // Step 2: grow by 10% using *=
        balance *= 1.10;
        System.out.println("After 10% growth: " + balance);

        // Step 3: add another deposit using +=
        balance += 200;
        System.out.println("After second deposit: " + balance);

        // Postfix: count++ gives the CURRENT value first, then increases it
        int count = 5;
        System.out.println("count++ prints: " + count++);
        System.out.println("count after: " + count);

        // Prefix: ++count increases the value FIRST, then gives the new value
        count = 5;
        System.out.println("++count prints: " + ++count);
        System.out.println("count after: " + count);

        // The two printed values differ because count++ (postfix) returns the old
        // value (5) and increments afterward, so the println shows 5 and the
        // increase only appears on the next line (6). ++count (prefix) increments
        // first and returns the new value (6), so println shows 6 right away.
    }
}