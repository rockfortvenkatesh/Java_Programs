package Interview_Integer_Code;

import java.util.Scanner;

public class FindIndexOfTarget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Target number :");
		int target = sc.nextInt();

		System.out.print("Array size :");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("enter number :");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				System.out.println("index of target is :" + i);
				break;
			}
		}
	}

}
