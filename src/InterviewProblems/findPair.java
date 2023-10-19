package InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindPairsClosestToZero {
    public static void main(String[] args) {
        int[] array = {1, 2, -3, -5, 7, 8, 20, -40, 6};
        List<int[]> closestPairs = findPairsWithSumClosestToZero(array);

        System.out.println("Pairs with sum closest to 0:");
        for (int[] pair : closestPairs) {
            System.out.println(Arrays.toString(pair));
        }
    }

    public static List<int[]> findPairsWithSumClosestToZero(int[] array) {
        List<int[]> closestPairs = new ArrayList<>();

        if (array.length < 2) {
            System.out.println("Array should contain at least two elements.");
            return closestPairs;
        }

        int closestSum = Integer.MAX_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int currentSum = array[i] + array[j];
                int currentDiff = Math.abs(currentSum);

                if (currentDiff < closestSum) {
                    closestSum = currentDiff;
                    closestPairs.clear(); // Clear previous pairs since they are no longer closest.
                    closestPairs.add(new int[] {array[i], array[j]});
                } else if (currentDiff == closestSum) {
                    closestPairs.add(new int[] {array[i], array[j]});
                }
            }
        }

        return closestPairs;
    }
}
