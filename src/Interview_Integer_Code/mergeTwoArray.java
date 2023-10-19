package Interview_Integer_Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mergeTwoArray {
    public static void main(String[] args) {
        List<Integer> firstarray = Arrays.asList(8, 5, 4, 6, 2);
        List<Integer> secondarray = Arrays.asList(1, 2, 3, 4, 5);


        Collections.sort(firstarray);
        Collections.sort(secondarray);

        System.out.println("First Array: " + firstarray);
        System.out.println("Second Array: " + secondarray);

        int a = 0, b = 0;
        List<Integer> mergedArray = new ArrayList<>();

        while (a < firstarray.size() && b < secondarray.size()) {
            if (firstarray.get(a) < secondarray.get(b)) {
                mergedArray.add(firstarray.get(a++));
            } else {
                mergedArray.add(secondarray.get(b++));
            }
        }

        while (a < firstarray.size()) {
            mergedArray.add(firstarray.get(a++));
        }

        while (b < secondarray.size()) {
            mergedArray.add(secondarray.get(b++));
        }

        System.out.println("Merged and Sorted Array: " + mergedArray);
    }
}
