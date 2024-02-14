package ashwini_b;

/*
Assignment - 55 : 14th Feb'2024
"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */
public class CharctOccurTwice {

	void printChar(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int charcount = singleCharCount(input, ch);
			// check if char count is 2
			if (charcount == 2) {
				// print ch if i = first index of ch
				if (input.indexOf(ch) == i) {
					System.out.print(ch);
				}
			}
		}
	}

	int singleCharCount(String input, char ch) {
		int count = 0;
		for (int j = 0; j < input.length(); j++) {
			char ch1 = input.charAt(j);
			if (ch == ch1) {
				count++;
			}
		}
		return (count);
	}

	public static void main(String[] args) {
		CharctOccurTwice arrayCharctOccurTwice = new CharctOccurTwice();
		arrayCharctOccurTwice.printChar("teecccchhhnno");
	}
}
