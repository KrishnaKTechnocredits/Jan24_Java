package shafaque;

public class Assignment58 {
	int getCountOfChar(String input, char character) {
		int count = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (ch == character) {
				count++;
			}
		}
		return count;
	}

	void printMinimumCountCharacter(String input) {
		int min = input.length();
		char target = ' ';
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			int count = getCountOfChar(input, ch);
			if (min > count) {
				min = count;
				target = ch;
			}
		}
		System.out.println(target + "->" + min);
	}

	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		assignment58.printMinimumCountCharacter("aakanksha");
	}
}
