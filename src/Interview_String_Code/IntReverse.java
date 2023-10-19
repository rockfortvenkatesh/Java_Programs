package Interview_Integer_Code;

import java.util.Arrays;
import java.util.Scanner;

public class IntReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();

		System.out.println("Enter number :");
		int[] arr = new int[size];
		int[] rev = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			rev[i] = arr[size - 1 - i];
		}

		System.out.println(Arrays.toString(rev));
	}

}
