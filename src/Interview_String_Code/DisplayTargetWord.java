package Interview_String_Code;

import java.util.LinkedList;
import java.util.List;

public class DisplayTargetWord {

	public static void main(String[] args) {

		String word = "In Java, a string is an object that represents a number of character values.";
		String trim = word.replaceAll("[^0-9a-zA-Z]", " ");

		System.out.println(trim);

		String[] words = trim.trim().split(" ");

		int target = 4;
		List<String> newwords = new LinkedList<String>();

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == target) {
				newwords.add(words[i]);
			}
		}
		System.out.println("Target matched words are :" + newwords);
	}

}
