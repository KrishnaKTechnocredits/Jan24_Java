package puja_poreddiwar;

public class LastCharOfEachWord {

	char getLastChar(String str) {
		char c = ' ';
		char ch = str.charAt(str.length() - 1);
		if (Character.isDigit(ch))
			c = str.charAt(str.length() - 2);
		else
			c = ch;
		return c;
	}

	void printString(String[] arr) {
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			char ch = getLastChar(arr[i]);
			str += ch;
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "techno credits32 pune4 indi5a";
		String[] input = str.split(" ");
		new LastCharOfEachWord().printString(input);
	}
}