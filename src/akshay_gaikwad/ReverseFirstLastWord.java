package akshay_gaikwad;

public class ReverseFirstLastWord {
	String reverseWord(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index);
		}
		return output;
	}

	void printFirstLastWord(String str) {
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			if (i == 0 || i == strArr.length - 1) {
				System.out.print(reverseWord(strArr[i]) + " ");
			} else {
				System.out.print(strArr[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		String input = "Welcome to the Technocredits";
		new ReverseFirstLastWord().printFirstLastWord(input);
	}
}