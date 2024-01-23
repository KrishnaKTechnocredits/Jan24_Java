package priya_t;

public class CharFrequencyString {

	void printChar(String input, char targetChar) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (ch == targetChar)
				count++;

		}
		System.out.println("Char:" + targetChar);
		System.out.println("frequency of t in technocredits is " + count);

	}

	public static void main(String[] args) {
		CharFrequencyString string = new CharFrequencyString();
		string.printChar("technocredits", 't');

	}
}
