/*
 * Assignment - 58 : 14th Feb'2024
"Print last character with minimum frequency:
input: aakanksha
output: h->1"
 */

package puja_poreddiwar;

public class Assignment58LastCharWith1Frq {

	void printChar(String input) {
		int count = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				count++;
				System.out.print(ch + " = " + count);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String str = "aakanksha";
		new Assignment58LastCharWith1Frq().printChar(str);
	}
}
