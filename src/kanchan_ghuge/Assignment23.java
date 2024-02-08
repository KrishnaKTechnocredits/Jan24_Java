package kanchan_ghuge;

public class Assignment23 {

	int getUniqueCharacter(String name, char character) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (ch == character) {
				count++;
			}
		}
		return count;
	}

	void printCharacter(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			int charCount = getUniqueCharacter(name, ch);
			if (charCount == 1)
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		new Assignment23().printCharacter("technocredits");
	}
}
