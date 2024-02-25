/*"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en" */

package akshay_gaikwad;

public class CharacterExactlyTwice {

	private int getCharFreq(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}
	
	void printCharOccurTwice(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (getCharFreq(str, ch) == 2) {
					System.out.print(ch);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new CharacterExactlyTwice().printCharOccurTwice("teecccchhhnno");
	}
}
