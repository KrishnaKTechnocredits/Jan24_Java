package priya_t;

public class ReverseString {
	void printAllChar(String input) {

		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));

		}
	}

	public static void main(String[] args) {
		ReverseString string = new ReverseString();
		string.printAllChar("techno");

	}
}
