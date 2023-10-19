package Interview_String_Code;

public class RemoveFirstIntAndReverse {

	public static void main(String[] args) {
		String input = "abcd123efg";

		String trim = input.replaceFirst("\\d", "");
		System.out.println(trim);
		System.out.println(new StringBuilder(trim).reverse().toString());
	}

}
