package aanand;

/*Print the character with maximum frequency:
input: TeeCccChH
output: c->4*/

public class Assignment59 {

	int findMaxFrequency(String str, char targetChar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	void printFindMaxFrequency(String input) {
		int maxCount = 0;
		char printChar = ' ';
		for (int i = 0; i < input.length(); i++) {
			input = input.toLowerCase();
			char ch = input.charAt(i);
			int output = findMaxFrequency(input, ch);
			if (maxCount < output) {
				maxCount = output;
				printChar = ch;
			}
		}
		System.out.println(printChar + " -> " + maxCount);
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		assignment59.printFindMaxFrequency("TeeCccChH");
	}
}