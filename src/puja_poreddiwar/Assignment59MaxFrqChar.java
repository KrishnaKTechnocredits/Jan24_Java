/*
Assignment - 59 : 14th Feb'2024
"Print the character with maximum frequency:
input: TeeCccChH
output: c->4"
 */

package puja_poreddiwar;

public class Assignment59MaxFrqChar {

	int getCharFreq(String str, char targetCh) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			char ch1 = Character.toLowerCase(ch);
			if (ch1 == targetCh)
				count++;
		}
		return count;
	}

	void printChar(String input) {
		int max = 0;
		char targetCh = ' ';
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = getCharFreq(input, ch);
			if (count > max) {
				max = count;
				targetCh = ch;
			}
		}
		System.out.println("character having Maximum frequency :" + targetCh + " --> " + max);
	}

	public static void main(String[] args) {
		String str = "TeeCccChH";
		new Assignment59MaxFrqChar().printChar(str);

	}

}
