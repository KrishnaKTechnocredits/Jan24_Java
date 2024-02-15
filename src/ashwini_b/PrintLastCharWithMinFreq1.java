package ashwini_b;

/*
 Assignment - 58 : 14th Feb'2024
"Print last character with minimum frequency:
input: aakanksha
output: h->1"
 */
public class PrintLastCharWithMinFreq1 {

	int charFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch1 = input.charAt(index);
			if (ch == ch1) {
				count++;
			}
		}
		return (count);
	}

	void lastChar(String input) {
		int minCharCount = input.length();
		char minChar = ' ';
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			int charcount = charFrequency(input, ch);
			if (minCharCount > charcount) {
				minCharCount = charcount;
				minChar = ch;
			}
		}
		System.out.println(minChar + "->" + minCharCount);
	}

	public static void main(String[] args) {
		PrintLastCharWithMinFreq1 printLastCharWithMinFreq1 = new PrintLastCharWithMinFreq1();
		printLastCharWithMinFreq1.lastChar("aakanksha");
	}
}
