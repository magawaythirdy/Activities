package week.pkg4;

public class Advanced {
    public static void main(String[] args) {
        int size = 6;

        for (int row = 1; row <= size; row++) {
            // continue: skip printing row 3 entirely
            if (row == 3) {
                continue;
            }

            for (int col = 1; col <= row; col++) {
                // break: stop the INNER loop early once the column reaches 4
                if (col == 4) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}