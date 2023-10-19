package Interview_Integer_Code;

import java.util.Scanner;

public class CountSumOfPossibilites {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Target value :");
		int target = sc.nextInt();
		System.out.print("Enter size of array :");
		int num = sc.nextInt();

		int count = 0;

		int[] arr = new int[num];
		System.out.println("Enter number :");

		for (int i = 0; i < num; i++) {

			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					count++;
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}
		System.out.println("Sum of possibilites is :" + count);

	}

}
