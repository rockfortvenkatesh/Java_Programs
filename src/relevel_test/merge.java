package relevel_test;
import java.util.*;
public class merge {
    public static void main(String[] args) {
        int fSize, sSize, i, j, k;
        int[] first = new int[100];
        int[] second = new int[100];
        int[] merged = new int[200];

        Scanner scanner = new Scanner(System.in);
        // Input First Array

       fSize = 5;

        for (i = 0; i < fSize; i++) {
            first[i] = scanner.nextInt();
        }


        sSize = 5;

        for (i = 0; i < sSize; i++) {
            second[i] = scanner.nextInt();
        }

        i = j = k = 0;
        while (i < fSize && j < sSize) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }

        if (i == fSize) {
            while (j < sSize)
                merged[k++] = second[j++];
        }

        if (j == sSize) {
            while (i < fSize)
                merged[k++] = first[i++];
        }

        System.out.println("Merged Array");
        for (i = 0; i < k; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
