package ashwini_b;

/*
 Assignment - 59 : 14th Feb'2024
"Print the character with maximum frequency:
input: TeeCccChH
output: c->4
 */
public class CharacterWithMaxFreq {

	int charFreq(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return (count);
	}

	void printChar(String str) {
		int maxCount = 0;
		char maxChar = ' ';
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int charCount = charFreq(str, ch);
			if (maxCount < charCount  ) {
				maxChar = ch;
				maxCount = charCount;
			}
		}
		System.out.println(maxChar + "->" + maxCount);
	}

	public static void main(String[] args) {
		CharacterWithMaxFreq characterWithMaxFreq = new CharacterWithMaxFreq();
		characterWithMaxFreq.printChar("TeeCccChH");
	}
}
