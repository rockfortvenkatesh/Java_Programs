package InterviewProblems;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

 class splitArray {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;
        List<int[]> splitArrays = splitArray(original, splitSize);

        for (int[] splitArray : splitArrays) {
            System.out.println(Arrays.toString(splitArray));
        }
    }

    public static List<int[]> splitArray(int[] original, int splitSize) {
        List<int[]> splitArrays = new ArrayList<>();

        int startIndex = 0;
        while (startIndex < original.length) {
            int endIndex = Math.min(startIndex + splitSize, original.length);
            int[] splitArray = Arrays.copyOfRange(original, startIndex, endIndex);
            splitArrays.add(splitArray);
            startIndex += splitSize;
        }

        return splitArrays;
    }
}
