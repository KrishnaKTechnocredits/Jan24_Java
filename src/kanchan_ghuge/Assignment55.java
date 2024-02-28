/*Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en  */

package kanchan_ghuge;

class Assignment55 {

	int getCharFreq(String str, char targetch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == targetch) {
				count++;
			}
		}
		return count;
	}

	void printCharOccuringTwice(String input) {
		System.out.println("characters occurring exactly twice are = ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int charfreq = getCharFreq(input, ch);
			if (charfreq == 2) {
				if (index == input.indexOf(ch))
					;
				System.out.println(input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		String s = "teecccchhhnno";
		new Assignment55().printCharOccuringTwice(s);
	}
}
