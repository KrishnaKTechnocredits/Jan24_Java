/*
 * "Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */

package shridhar_k;

public class Assignment60 {

	int getFrequencuOfCharacter(String inpStr, char inpCh) {
		int count = 0;
		if (inpStr.indexOf(inpCh) == inpStr.lastIndexOf(inpCh)) {
			return 1;
		} else {
			for (int i = 0; i < inpStr.length() ; i++) {
				if (inpStr.charAt(i) == inpCh) {
					count++;
				}
			}
			return count;
		}
	}

	char getMaxCharFreq(String inpStr) {
		int maxFreq = 0;
		char maxFreqCh = ' ';
		for (int i = 0; i < inpStr.length() ; i++) {
			int charFreq = getFrequencuOfCharacter(inpStr, inpStr.charAt(i));
			if (maxFreq < charFreq) {
				maxFreq = charFreq;
				maxFreqCh = inpStr.charAt(i);
			}
		}
		return maxFreqCh;
	}

	void printSecondHeighestFreqChar(String inpStr, int freqIndex) {
		char character = ' ';
		if (freqIndex == 1) {
			character = getMaxCharFreq(inpStr);
		} else {
			character = getMaxCharFreq(inpStr);
			inpStr = inpStr.replace(String.valueOf(character), "");
			character = getMaxCharFreq(inpStr);
		}
		int characterFreq = getFrequencuOfCharacter(inpStr, character);

		System.out.println("output : " + character + " -> " + characterFreq);
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		new Assignment60().printSecondHeighestFreqChar(input, 2);
	}
}
