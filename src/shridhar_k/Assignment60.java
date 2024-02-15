/*
 * "Print character with second-highest frequency:
input: aakanksha
output: k->2"
 */

package shridhar_k;

public class Assignment60 {

	int getFrequencuOfCharacter(String inpStr, char inpCh) {
		int count = 0;
		if(inpCh == '@') {
			return -1;
		}
		else if (inpStr.indexOf(inpCh) == inpStr.lastIndexOf(inpCh)) {
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
			inpStr = inpStr.replace(inpStr.charAt(i), '@');
		}
		return maxFreqCh;
	}

	void printHeighestFreqCharOfGivenIndex(String originalString, int freqIndex) {
		String inpStr = originalString;
		char character = ' ';
		if (freqIndex == 1) {
			character = getMaxCharFreq(inpStr);
		} else {
			for(int i =1; i<= freqIndex; i++) {
			character = getMaxCharFreq(inpStr);
			inpStr = inpStr.replace(String.valueOf(character), "");
			if(i != freqIndex) {
				character = getMaxCharFreq(inpStr);
			}
		}
	}
		int characterFreq = getFrequencuOfCharacter(originalString, character);

		System.out.println("output : " + character + " -> " + characterFreq);
	}

	public static void main(String[] args) {
		String input = "aakanksha";
		new Assignment60().printHeighestFreqCharOfGivenIndex(input, 2);
	}
}
