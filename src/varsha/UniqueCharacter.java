package varsha;

public class UniqueCharacter {

	int getfrequencyCount(String input, char character) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == character) {
				count++;
			}
		}
		return count;
	}

	void printUniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = getfrequencyCount(input, input.charAt(index));
			if (count == 1) {
				System.out.print(input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		UniqueCharacter uniqueCharacter = new UniqueCharacter();
		uniqueCharacter.printUniqueChar("technocredits");

	}

}
