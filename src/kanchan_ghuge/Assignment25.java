package kanchan_ghuge;

public class Assignment25 {

	void printDuplicateCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index) {
				if (input.indexOf(ch) != input.lastIndexOf(ch)) {
					char temp = input.charAt(index);
					System.out.print(temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Assignment25().printDuplicateCharacter("aakanksha");
	}
}
