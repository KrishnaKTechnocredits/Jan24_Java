/*"Print last character with minimum frequency:
input: aakanksha
output: h->1" */

package akshay_gaikwad;

public class LeastFreqFromLast {

	private int getFreqOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch1 = str.charAt(index);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	void printLastLeastFreqChar(String str) {
		int minFreq = str.length();
		char leastFreqChar = ' ';
		for (int index = str.length()-1; index >= 0 ; index--) {
			char ch = str.charAt(index);
			int charFreq = getFreqOfChar(str, ch);
			if (charFreq < minFreq) {
				minFreq = charFreq;
				leastFreqChar = ch;
			}
		}
		System.out.println(leastFreqChar + " -> " + minFreq);
	}

	public static void main(String[] args) {
		new LeastFreqFromLast().printLastLeastFreqChar("aakanksha");
	}
}
