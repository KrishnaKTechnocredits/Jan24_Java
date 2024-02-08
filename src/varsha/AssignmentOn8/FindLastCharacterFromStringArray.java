package varsha.AssignmentOn8;

//Write a method which accept String Array and return char Array. 
//return last character of each word, if last character is digit, then consider second last character.
//
//input : techno credits32 pune4 indi5a
//output : o3ea

public class FindLastCharacterFromStringArray {

	char[] getLastCharacter(String[] str) {
		char[] character = new char[str.length];
		for (int index = 0; index < str.length; index++) {
			String input = str[index];
			int len = input.length();
			char ch = input.charAt(len - 1);
			if (Character.isDigit(ch)) {
				ch = input.charAt(len - 2);
			}
			character[index] = ch;
		}
		return character;
	}

	void printCharacterArray(char[] output) {
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		String input = "techno credits32 pune4 indi5a";
		String[] str = input.split(" ");
		FindLastCharacterFromStringArray findLastCharacterFromStringArray = new FindLastCharacterFromStringArray();
		char[] output = findLastCharacterFromStringArray.getLastCharacter(str);
		findLastCharacterFromStringArray.printCharacterArray(output);

	}
}
