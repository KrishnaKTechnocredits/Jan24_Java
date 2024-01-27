package samiksha;

public class ReverseString {

	void printStringInReverse(String input) {
		for (int num = input.length() - 1; num >= 0; num--) {
			System.out.println(input.charAt(num));
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.printStringInReverse("Techno");
	}
}
