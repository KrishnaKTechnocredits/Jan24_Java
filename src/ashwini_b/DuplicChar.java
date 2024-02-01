package ashwini_b;

/*
 Assignment - 25 : 29th Jan'2024
Print all the duplicate characters from the given String.

input = "aakanksha";
output : ak 
 */
public class DuplicChar {

	void printDuplicateChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (i == input.indexOf(ch)) {
				if (input.indexOf(ch) != input.lastIndexOf(ch)) {
					System.out.print(ch);
				}
			}

		}
	}

	public static void main(String[] args) {
		DuplicChar duplicChar = new DuplicChar();
		duplicChar.printDuplicateChar("aakanksha");
	}
}
