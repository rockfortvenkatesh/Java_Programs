package Interview_Integer_Code;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxAndMinWithIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Size of array :");
		int size = sc.nextInt();

		System.out.print("Enter numbers :");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		int max = Arrays.stream(arr).max().orElseThrow();
		int min = Arrays.stream(arr).min().orElseThrow();

		System.out.println("max is :" + max + " min is :" + min);
	}

}
