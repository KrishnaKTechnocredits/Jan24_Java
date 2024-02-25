/*
Assignment - 55 : 14th Feb'2024
"Print only characters occurring exactly twice:
input: teecccchhhnno;
output: en"
 */
package pallavi_raut;

public class PrintCharctOccurTwice_55 {

	public static void main(String[] args) {
		PrintCharctOccurTwice_55 charctOccurTwice = new PrintCharctOccurTwice_55();
		charctOccurTwice.printCharOccursTwice("teecccchhhnno");
	}

	void printCharOccursTwice(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int charcount = singleCharfreq(input, ch);
			if (charcount == 2) {
				if (input.indexOf(ch) == i) {
					System.out.print(ch);
				}
			}
		}
	}

	int singleCharfreq(String input, char targetCh) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char output = input.charAt(i);
			if (targetCh == output) {
				count++;
			}
		}
		return (count);
	}
}
