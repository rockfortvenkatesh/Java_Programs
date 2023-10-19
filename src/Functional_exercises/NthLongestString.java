package Functional_exercises;

import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;

public class NthLongestString {
    public static List<String> findNthLongestStrings(List<String> inputList, int n) {
        // Find the length of the nth longest string
        List<Integer> lengths = inputList.stream()
                .map(String::length)
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .collect(Collectors.toList());

        int nthLongestLength;
        if (n <= 0 || n > lengths.size()) {
            // If n is out of bounds, return an empty list
            return List.of();
        } else {
            nthLongestLength = lengths.get(n - 1);
        }

        // Filter the strings with the nth longest length
        List<String> result = inputList.stream()
                .filter(str -> str.length() == nthLongestLength)
                .collect(Collectors.toList());

        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("Yuri", "Ron", "Interview", "Longest", "List", "Contain");
        int n = 2;

        List<String> result = findNthLongestStrings(inputList, n);
        System.out.println("Nth longest strings: " + result);
    }
}

