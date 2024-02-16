/*"Print character with second-highest frequency:
input: aakanksha
output: k->2"*/

package akshay_gaikwad;

public class SecondHighFreq {
	
	private int getFreqOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if(ch == str.charAt(index)) {
				count++;
			}
		}
		return count;
	}
	
	private char getMaxFreqChar(String str) {
		int maxCount = 0;
		char maxCh = ' ';
		for (int index = 0; index < str.length(); index++) {
			char currentChar = str.charAt(index);
			int count = getFreqOfChar(str, currentChar);
			if (count > maxCount) {
				maxCount = count;
				maxCh = currentChar;
			}
		}
		return maxCh;
	}

	void printSecondHighFreqChar(String str) {
		str = str.toLowerCase();
		char maxCh = getMaxFreqChar(str);
		String temp = String.valueOf(maxCh);
		str = str.replace(temp, "");
		char secFeqChar = getMaxFreqChar(str);
		System.out.println(secFeqChar + " -> " + getFreqOfChar(str, secFeqChar));
	}
	
	public static void main(String[] args) {
		new SecondHighFreq().printSecondHighFreqChar("aakanksha");
	}
}
