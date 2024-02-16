/*
 * "Print the character with maximum frequency:
input: TeeCccChH
output: c->4"
 */

package shridhar_k;

public class Assignment59 {

	private int getCharFreq(String inpStr, char inpCh) {
		int charFreq = 0;
		if (inpCh == '@')
			return -1;
		if (inpStr.indexOf(inpCh) == inpStr.lastIndexOf(inpCh)) {
			return 1;
		} else {
			for (int i = 0; i < inpStr.length(); i++) {
				if (inpStr.charAt(i) == inpCh) {
					charFreq++;
				}
			}
			return charFreq;
		}
	}

	private char getMaxFreqChar(String inpStr) {
		char charMaxFreq = ' ';
		int maxFreq = 0;
		for (int i = 0; i < inpStr.length(); i++) {
			char ch = inpStr.charAt(i);
			int count = getCharFreq(inpStr, ch);
			if (maxFreq < count) {
				maxFreq = count;
				charMaxFreq = ch;
			}
		}
		return charMaxFreq;
	}

	void printOutPut(String inpStr) {
		inpStr = inpStr.toLowerCase();
		char charMaxFreq = getMaxFreqChar(inpStr);
		int maxFreq = getCharFreq(inpStr, charMaxFreq);
		System.out.println(charMaxFreq + " -> " + maxFreq);
	}

	public static void main(String[] args) {
		String input = "TeeCccChH";
		new Assignment59().printOutPut(input);
	}
}
