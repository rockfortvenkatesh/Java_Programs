package relevel_test;
import java.util.*;

public class uniqueElement {

	public static void main(String[] args) {
		int sum = 0 ;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int[] inputs = new int[size];
		for(int i = 0 ; i < size  ; i++) {
			inputs[i] = sc.nextInt();
		}
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0 ; i < size  ; i++) {
			set.add(inputs[i]);
		}

		 sum =  set.stream()
				.reduce(0,Integer::sum);
		System.out.println(sum);
	}

}
