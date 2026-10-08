package week.pkg1;

public class Expert {
    public static void main(String[] args) {
        // Byte overflow: a byte holds -128 to 127, so adding 1 to 127 wraps around
        byte smallNumber = 127;
        smallNumber++;
        System.out.println("Byte after 127 + 1: " + smallNumber);

        // Two Strings created with new, and one using a literal (all same text)
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = "hello";

        // s1 == s2 is false: each "new" creates a separate object in memory,
        // and == compares the memory addresses, not the text.
        System.out.println("s1 == s2: " + (s1 == s2));

        // s1 == s3 is false: s1 is a new object on the heap, while s3 points
        // to the shared literal in the String pool, so the addresses differ.
        System.out.println("s1 == s3: " + (s1 == s3));

        // s2 == s3 is false: same reason as above, s2 is a separate heap object
        // and s3 points to the pooled literal.
        System.out.println("s2 == s3: " + (s2 == s3));

        // .equals() compares the actual text, and all three contain "hello",
        // so every .equals() comparison below is true.
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));

        // Shared array reference: both variables point to the SAME array object
        int[] original = {1, 2, 3};
        int[] alias = original;

        // Modifying through alias changes the same array that original points to
        alias[0] = 99;
        System.out.println("original[0]: " + original[0]);
        System.out.println("alias[0]: " + alias[0]);
    }
}

