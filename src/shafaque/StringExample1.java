package shafaque;

public class StringExample1 {

	int getFrequencyChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++)
			if (str.charAt(index) == ch) {
				count++;
			}
		return count;
	}

	void printUniqueChar() {
		String str = "technocredits";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (getFrequencyChar(str, ch) == 1) {
				System.out.print(ch);
			}

		}
	}

	public static void main(String[] args) {
		new StringExample1().printUniqueChar();
	}
}
