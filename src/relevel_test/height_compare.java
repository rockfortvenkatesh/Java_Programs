package relevel_test;
import java.util.*;

public class height_compare {

	public static void main(String[] args) {
		int temp, count = 0;
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		
		int[] height = new int[noOfStudents];
		int[] excepted = new int[noOfStudents];
		
		
		for(int i = 0 ; i < noOfStudents  ; i++) {
			height[i] = sc.nextInt();
		}


		System.arraycopy(height, 0, excepted, 0, noOfStudents);
		
		
		for(int i = 0 ; i < noOfStudents  ; i++) {
			for(int j = i+1 ; j < noOfStudents ; j++) {
				if(excepted[i]>excepted[j]) {
					temp =  excepted[i];
					excepted[i] = excepted[j];
					excepted[j] = temp;
				}
			}
		}
		
		
		for(int i = 0 ; i < noOfStudents  ; i++) {
			if(height[i] != excepted[i]) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
