package week.pkg2;

public class Basic {
    public static void main(String[] args) {
        // Declare two integers
        int a = 17;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Division (/) and modulus (%) behave differently for negative operands:
        // integer division cuts off the decimal (-17 / 5 = -3, not -4), and the
        // result of % takes the sign of the first number (-17 % 5 = -2).
    }
}    

