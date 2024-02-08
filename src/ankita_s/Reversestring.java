package ankita_s;

public class Reversestring {

	void printReversestring(String input) {
		System.out.println("Input string is: " + input);
		int len = input.length();
		System.out.println("Output string is: ");
		for (int index = len - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		Reversestring reversestring = new Reversestring();
		reversestring.printReversestring("AnkitA");
	}
}
