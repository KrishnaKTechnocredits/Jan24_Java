package hiral_purohit;

public class CharArray {

	char[] getOutput(String[] input) {
		char[] chArray = new char[input.length];
		for (int index = 0; index < input.length; index++) {
			int len = input[index].length();
			char ch = input[index].toLowerCase().charAt(len - 1);
			if (!Character.isDigit(ch))
				chArray[index] = input[index].toLowerCase().charAt(len - 1);
			else
				chArray[index] = input[index].toLowerCase().charAt(len - 2);
		}
		return chArray;
	}

	void display(char[] output) {
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}
	}

	public static void main(String[] args) {
		String input = "techno credits32 pune4 indi5a";
		String[] arr = input.split(" ");
		CharArray charArray = new CharArray();
		char[] output = charArray.getOutput(arr);
		charArray.display(output);

	}

}
