package week.pkg2;

public class Intermediate {
    public static void main(String[] args) {
        // Student's average grade and number of absences
        double average = 82.5;
        int absences = 2;

        // Pass if (average >= 75 AND absences <= 3) OR average >= 90 regardless of absences
        boolean passes = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Average: " + average);
        System.out.println("Absences: " + absences);

        if (passes) {
            System.out.println("Result: PASS");
            // Explain which condition made the student pass
            if (average >= 90) {
                System.out.println("Reason: Average is 90 or above, so absences don't matter.");
            } else {
                System.out.println("Reason: Average is at least 75 and absences are 3 or fewer.");
            }
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: Average is below 90 and does not meet both 75+ average and 3 or fewer absences.");
        }
    }
}
