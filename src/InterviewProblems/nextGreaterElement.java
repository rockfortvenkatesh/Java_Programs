package InterviewProblems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class nextGreaterElement {
    public static int[] findNextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextGreaterMap.put(nums[i], -1); // No greater element found
            } else {
                nextGreaterMap.put(nums[i], stack.peek());
            }
            stack.push(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = nextGreaterMap.get(nums[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        int[] nextGreater = findNextGreaterElements(nums);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " --> " + nextGreater[i]);
        }
    }
}



