package gaurav_garg;

public class PrintUniqueChracterInStringAssigment23 {

	int frequencyCount(String str, char char1) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char char2 = str.charAt(i);
			if (char1 == char2) {
				count++;
			}
		}
		return count;
	}

	void printUniqueCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			char char1 = str.charAt(i);
			int frequency = frequencyCount(str, char1);

			if (frequency == 1) {
				System.out.print(char1);
			}
		}
	}

	public static void main(String[] args) {
		new PrintUniqueChracterInStringAssigment23().printUniqueCharacter("technocredits");
	}
}
