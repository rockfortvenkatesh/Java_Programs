package Interview_Integer_Code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter length of integer :");
		int size = sc.nextInt();
		int[] num = new int[size];

		System.out.println("enter values :");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}

		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < num.length; i++) {
			if (set.contains(num[i])) {
				list.add(num[i]);
			} else {
				set.add(num[i]);
			}
		}
		System.out.println("duplicate is :" + list);
	}

}
