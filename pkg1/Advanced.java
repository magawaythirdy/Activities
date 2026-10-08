package week.pkg1;

public class Advanced {
    public static void main(String[] args) {
        // Declare a double value representing centimeters
        double centimeters = 275.8;

        // Explicit casting: (int) cuts off the decimal part, giving whole meters
        int wholeMeters = (int) (centimeters / 100);

        // Remaining centimeters after removing the whole meters
        double remainingCentimeters = centimeters - (wholeMeters * 100);

        System.out.println("Centimeters: " + centimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        // Implicit widening (int to double)
        // No cast is needed because a double can hold every possible int value,
        // so Java converts it automatically without losing any data.
        int wholeNumber = 50;
        double widened = wholeNumber;
        System.out.println("Implicit Widening: " + widened);

        // Explicit narrowing (double to int)
        // The cast is required because a double may lose data. Here, the decimal
        // part .99 is lost (truncated, not rounded), so 9.99 becomes 9.
        double decimalValue = 9.99;
        int narrowed = (int) decimalValue;
        System.out.println("Explicit Narrowing: " + narrowed);
    }
}
