package Interview_String_Code;

public class FirstNonRepeatCharAndAllNonRepeatChar {

	public static void main(String[] args) {
		String input = "i love my life";
		String trim = input.trim().replaceAll("[^0-9a-zA-Z]", "");

		String NonRepeatChar = "";

		for (char ch : trim.toCharArray()) {
			if (trim.indexOf(ch) == trim.lastIndexOf(ch)) {
				NonRepeatChar += Character.toString(ch);
			}
		}
		System.out.println("Non Repeat character are :" + NonRepeatChar);
		System.out.println("First Non Repeat character is :" + NonRepeatChar.charAt(0));
	}

}
