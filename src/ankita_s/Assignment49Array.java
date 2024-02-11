package ankita_s;

public class Assignment49Array {

	char[] getCharacter(String[] str) {
		char[] character = new char[str.length];
		for (int index = 0; index < str.length; index++) {
			String input = str[index];
			int length = input.length();
			char ch = input.charAt(length - 1);
			if (Character.isDigit(ch)) {
				ch = input.charAt(length - 2);
			}
			character[index] = ch;
		}
		return character;
	}

	void printCharacterArray(char[] output) {
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}
	}

	public static void main(String[] args) {
		Assignment49Array assign49 = new Assignment49Array();
		String input = "techno credits32 pune4 indi5a";
		String[] str = input.split(" ");
		char[] output = assign49.getCharacter(str);
		assign49.printCharacterArray(output);

	}

}
