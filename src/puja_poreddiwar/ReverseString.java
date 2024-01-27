package puja_poreddiwar;

public class ReverseString {

	void printStringReverse(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.printStringReverse("techno");
	}
}
