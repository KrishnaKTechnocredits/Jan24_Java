package shafaque;

public class Reversestring {
	void printreverse(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Reversestring reversestring = new Reversestring();
		reversestring.printreverse("techno");
	}

}
