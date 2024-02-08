package puja_poreddiwar;

public class CountOfChar {

	int count = 0;

	void countCharacters(String input, char countChar) {
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (ch == countChar) {
				count++;
			}
		}
		System.out.println("Frequency of " + countChar + " in technocredits is " + count);
	}

	public static void main(String[] args) {
		CountOfChar countOfChar = new CountOfChar();
		countOfChar.countCharacters("technocredits", 't');
	}
}
