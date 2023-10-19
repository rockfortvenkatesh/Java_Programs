package relevel_test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 2, 4, 6, 7, 3};

        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = Arrays.stream(array)
                .filter(e -> !uniqueElements.add(e))
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + duplicateElements);
    }
}
