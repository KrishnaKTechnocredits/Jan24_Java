/*Assignment - 60 : 14th Feb'2024
 * PhenolV_Assignment_65
"Print character with second-highest frequency:
input: aakanksha
output: k->2"
*/

package phenol_verma;

public class StrSecHighFreqChar {

	// count the frequency of the character
	int freqCheck(String str, char chr) {
		int count = 0;

		for (int index = 0; index < str.length(); index++) {
			char strChar = str.charAt(index);

			if (chr == strChar) {
				count++;
			}

		}
		return count;
	}

	// get the character with max frequency
	char getMaxFrqChar(String str) {
		int maxFreqCount = 0;
		char chr = '_';
		char chr1 = '_';

		for (int index = 0; index < str.length(); index++) {
			chr = str.charAt(index);
			int charFreq = freqCheck(str, chr);

			if (charFreq > maxFreqCount) {
				maxFreqCount = charFreq;
				chr1 = str.charAt(index);
			}
		}

		return chr1;
	}

	// get the nth frequency character
	void nthPositionCharFreq(String str, int position) {
		char maxFreqChar = '_';
		int freqChar = 0;

		// if need to have 1st character frequency
		if (position == 1) {
			maxFreqChar = getMaxFrqChar(str);
			freqChar = freqCheck(str, maxFreqChar);
		} else {
			// for nth position character
			for (int index = 0; index < position - 1; index++) {
				maxFreqChar = getMaxFrqChar(str);
				freqChar = freqCheck(str, maxFreqChar);
				// removing all the character with same frequency
				for (int indexMaxFreq = 0; indexMaxFreq < str.length(); indexMaxFreq++) {
					char maxFreqCharRem = str.charAt(indexMaxFreq);
					int freqCharRem = freqCheck(str, maxFreqCharRem);
					if (freqCharRem == freqChar) {
						str = str.replaceAll(Character.toString(maxFreqCharRem), "");
					}
				}
				maxFreqChar = getMaxFrqChar(str);
				freqChar = freqCheck(str, maxFreqChar);
			}
			//System.out.println(freqChar);
			//System.out.println(maxFreqChar);
			System.out.println("Position " + position + " character " + maxFreqChar + " having frequency of " + freqChar);
		}
	}

	public static void main(String[] args) {
		int position = 4;
		StrSecHighFreqChar strSecHighFreqChar = new StrSecHighFreqChar();
		String oriString = "aaaawwwwdddhhhssggpx";
		System.out.println("Original String = " + oriString);
		strSecHighFreqChar.nthPositionCharFreq(oriString, position);
	}
}
