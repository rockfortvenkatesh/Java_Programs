package Interview_String_Code;

public class RemoveCharacter {

	public static void main(String[] args) {
		String input = "hello world";

		char removeCharacter = 'o';

		char[] ch = input.toCharArray();
		StringBuilder newInput = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			if (!(ch[i] == removeCharacter)) {
				newInput.append(ch[i]);
			}
		}

		System.out.println(newInput);
	}

}
