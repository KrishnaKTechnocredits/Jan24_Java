package shramika_vaidya;

public class PrintLastCharWithMinFreq {

	int getCharFrequency(String str, char targetChar) {
		int charCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (targetChar == ch) {
				charCount++;
			}
		}
		return charCount;
	}

	void PrintLastMinFreqChar(String str1) {
		char targetchar = ' ';
		for (int index = str1.length() - 1; index >= 0; index--) {
			char ch = str1.charAt(index);
			int charCount = getCharFrequency(str1, ch);
			if (charCount == 1) {
				targetchar = ch;
				System.out.println(targetchar + " -> " + charCount);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new PrintLastCharWithMinFreq().PrintLastMinFreqChar("aakanksha");
	}
}
