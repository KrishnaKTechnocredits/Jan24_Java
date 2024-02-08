//Write a method which accept String Array and return char Array and return last character of each word, if last character is digit, then consider second last character.

package priya_t;

public class Assignment49_ReturnLastCharacterFromString {
	char[] getLastCharacterFromString(String[] arr) {
		char[] CHAR = new char[arr.length];

		for (int index = 0; index < arr.length; index++) {
			int len = arr[index].length();
			char ch = arr[index].toLowerCase().charAt(len - 1);
            if (Character.isDigit(ch))
				CHAR[index] = arr[index].toLowerCase().charAt(len - 2);
			else
				CHAR[index] = arr[index].toLowerCase().charAt(len - 1);
		}
		return CHAR;
	}

	void display(char[] output) {
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}
	}

	public static void main(String[] args) {
		String input = "techno credits32 pune4 indi5a";
		String[] arr = input.split(" ");
		Assignment49_ReturnLastCharacterFromString obj = new Assignment49_ReturnLastCharacterFromString();
		char[] output = obj.getLastCharacterFromString(arr);
		obj.display(output);

	}

}
