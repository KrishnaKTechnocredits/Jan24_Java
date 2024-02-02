package priya_t;

public class ProgrammingTest2_lastConsonantfromString {
	String input = "aakansha";

	void printChar(String input, char targetChar) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == targetChar);
		}
		System.out.println("Last consonant from the given string is:" + targetChar);
	}

	public static void main(String[] args) {
		ProgrammingTest2_lastConsonantfromString lastno = new ProgrammingTest2_lastConsonantfromString();
		lastno.printChar("aakansha", 'h');
	}
}
