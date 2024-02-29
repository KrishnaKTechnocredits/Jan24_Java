package aanand.array;

public class Assignment49 {

	char getLastCharOfWord(String str) {

		char ch = str.charAt(str.length() - 1);

		if (Character.isDigit(ch)) {
			ch = str.charAt(str.length() - 2);
		} else
			ch = str.charAt(str.length() - 1);
		return ch;
	}

	void printLastCharOfArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			char ch = getLastCharOfWord(str[i]);
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		String[] input = { "techno", "credits32", "pune4", "indi5a" };
		Assignment49 assignment49 = new Assignment49();
		assignment49.printLastCharOfArray(input);
	}
}