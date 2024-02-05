package shramika_vaidya;

public class MaxFrequencyChar {

	int getCharFrequencyCount(String str, char targetChar) {
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == targetChar) {
				charCount++;
			}
		}
		return charCount;
	}

	void printMaxFreqChar(String str1) {
		int max = 0;
		char targetChar = ' ';
		for (int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			int charCount = getCharFrequencyCount(str1, ch);
			if (max < charCount) {
				max = charCount;
				targetChar = ch;
			}
		}
		if (max == 1) {
			System.out.println(str1 + "  having all unique characters");
		} else {
			System.out.println(str1 + " -> " + targetChar + " -> " + max);
		}
	}

	public static void main(String[] args) {
		MaxFrequencyChar maxFrequencyChar = new MaxFrequencyChar();
		maxFrequencyChar.printMaxFreqChar("aakanksha");
		maxFrequencyChar.printMaxFreqChar("teecccchnoceredites");
		maxFrequencyChar.printMaxFreqChar("maulik");
	}
}
