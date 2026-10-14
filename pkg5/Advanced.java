package week.pkg5;

import java.util.Arrays;

public class Advanced {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 90, 88, 73, 95};
        int target = 90;

        // Linear search: check each element one by one
        int foundIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index " + foundIndex);
        } else {
            System.out.println("Target " + target + " not found");
        }

        // Sorting a copy keeps the original order intact. The original index
        // positions (like the one found by the search above) stay meaningful,
        // and the original data is not changed by accident.
        int[] sorted = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sorted);

        System.out.println("Original: " + Arrays.toString(scores));
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }
}