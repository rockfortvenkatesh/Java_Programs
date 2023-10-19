package Interview_String_Code;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DisplayDuplicateAndMaxAndSequence {

	public static void main(String[] args) {
		String input = "i love to travel a lot!";

		String trim = input.trim().replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(trim);
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < trim.length(); i++) {
			char[] ch = trim.toCharArray();
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}

		System.out.println("Duplicate charaters are :");
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println("character is " + m.getKey() + " value is " + m.getValue());
			}
		}

		Map.Entry<Character, Integer> max = map.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();

		String stringSequence = map.entrySet().stream().map(a -> a.getKey() + a.getValue().toString())
				.collect(Collectors.joining());

		System.out.println("max character is :" + max);
		System.out.println("sequence of string is :" + stringSequence);
	}

}
