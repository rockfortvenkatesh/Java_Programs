package InterviewProblems;

import java.util.HashMap;

public class findAllPairs {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3, 4, 5, 6};
        int target = arr[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                System.out.print(" "+arr[i] + "," + comp);
            }
            map.put(arr[i], 1);

        }

    }
}
