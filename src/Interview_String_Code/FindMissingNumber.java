package Interview_Integer_Code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class FindMissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size = sc.nextInt();

		System.out.print("Enter numbers :");
		Set<Integer> arr = new HashSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			arr.add(sc.nextInt());
		}

		for (int i = 1; i <= size; i++) {
			if (!arr.contains(i)) {
				list.add(i);
			}
		}
		System.out.println("Missing number is :" + list);
	}

}
