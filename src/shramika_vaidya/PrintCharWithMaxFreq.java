package shramika_vaidya;

public class PrintCharWithMaxFreq {

	int getCharFreq(String str, char targetchar) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			str = str.toLowerCase();
			char ch = str.charAt(i);
			if (targetchar == ch) {
				count++;
			}
		}
		return count;
	}

	void printMaxFreqChar(String str1) {
		int max = 0;
		char targetchar = ' ';
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			int charCount = getCharFreq(str1, ch);
			if (max < charCount) {
				max = charCount;
				targetchar = ch;
			}
		}
		System.out.println(targetchar + " -> " + max);
	}

	public static void main(String[] args) {
		new PrintCharWithMaxFreq().printMaxFreqChar("TeeCccChH");
	}
}
