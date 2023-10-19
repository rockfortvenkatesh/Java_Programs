package Interview_String_Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class stridjas {
	public static void main(String[] args) {
		String input = "abbcb";


		Set<Character> set = new HashSet<>();

		for(char ch : input.toCharArray()){
				set.add(ch);

		}

		System.out.println("unique string :"+set);
//		String input = "this is hello world World";
//
//		String[] split = input.split(" ");
//
//		Map<String, Integer> map = new HashMap<>();
//		List<String> dupli= new ArrayList<>();
//
//		for(String word : split){
//			if(map.containsKey(word.equalsIgnoreCase(word))){
//				dupli.add(word);
//		}else {
//				map.put(word,1);
//		}
//
//		}
//
//		System.out.println(map);
//
	}

}
