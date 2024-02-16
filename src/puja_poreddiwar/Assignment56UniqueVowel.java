/*
 * Assignment - 56 : 14th Feb'2024
"Print only unique vowels:
input: technocredits
output: oi"
 */

package puja_poreddiwar;

public class Assignment56UniqueVowel {

	boolean isuniqueCharacter(String str, char ch) {
		if (str.indexOf(ch) == str.lastIndexOf(ch)) {
			return true;
		}
		return false;
	}

	void printVoewels(String input) {
		String outputCh = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (isuniqueCharacter(input, ch)) {
					outputCh = outputCh + ch;
				}
			}

		}
		System.out.print("Unique vowel charaters in the given string is: " + outputCh);
	}

	public static void main(String[] args) {
		String str = "technocredits";
		new Assignment56UniqueVowel().printVoewels(str);
	}
}
