package week.pkg5;

public class Intermediate {
    public static void main(String[] args) {
        int[] scores = {85, 98, 78, 65, 90, 88, 74, 95};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
