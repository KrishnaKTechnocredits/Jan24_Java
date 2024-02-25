package ashwini_b;

/*
 Assignment - 60 : 14th Feb'2024
"Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */
public class SecondHighestChar {

	// Return character count in string
	int charCount(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch1 = input.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return (count);
	}

	// Get Maximum frequency character
	void maxCharFreq(String input) {
		int maxcount = 0;
		char maxChar = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int charactCount = charCount(input, ch);
			if (maxcount < charactCount) {
				maxcount = charactCount;
				maxChar = ch;
			}
		}
		input = input.replace(Character.toString(maxChar), "");
		seconHighestChar(input);
	}

	// Print second highest character
	void seconHighestChar(String input) {
		int maxcount = 0;
		char maxChar2 = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int charactCount = charCount(input, ch);
			if (maxcount < charactCount) {
				maxcount = charactCount;
				maxChar2 = ch;
			}
		}
		System.out.println(maxChar2 + "->" + maxcount);
	}

	public static void main(String[] args) {
		SecondHighestChar secondHighestChar = new SecondHighestChar();
		secondHighestChar.maxCharFreq("aakanksha");
	}
}
