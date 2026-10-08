package week.pkg2;

public class Expert {
    public static void main(String[] args) {
        // Expression 1: arithmetic only
        // PREDICTED: 14 (multiplication happens before addition: 2 + 12)
        int result1 = 2 + 3 * 4;
        System.out.println("2 + 3 * 4 = " + result1);

        // Expression 2: arithmetic + relational + logical
        // PREDICTED: true (5 + 3 = 8 > 7 is true, 10 % 3 = 1 < 2 is true, true && true)
        boolean result2 = 5 + 3 > 7 && 10 % 3 < 2;
        System.out.println("5 + 3 > 7 && 10 % 3 < 2 = " + result2);

        // Expression 3: increment + arithmetic
        // PREDICTED: 13 (x++ uses 5 first, so 5 + 8 = 13, then x becomes 6)
        int x = 5;
        int y = 8;
        int result3 = x++ + y;
        System.out.println("x++ + y = " + result3);
        System.out.println("x after = " + x);

        // Expression 4: prefix increment + arithmetic
        // PREDICTED: 15 (++x makes x 7 first, then 7 + 8 = 15)
        int result4 = ++x + y;
        System.out.println("++x + y = " + result4);

        // Expression 5: logical operators (&& is evaluated before ||)
        // PREDICTED: false (true || false && false is read as true || (false && false)
        // which is true || false = true). I predicted false here, which was wrong.
        boolean result5 = true || false && false;
        System.out.println("true || false && false = " + result5);
        // FOLLOW-UP: I missed that && has higher precedence than ||, so
        // (false && false) is evaluated first, giving false, then true || false = true.
    }
}