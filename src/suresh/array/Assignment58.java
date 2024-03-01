/*
 * Assignment - 58 : 
"Print last character with minimum frequency:
input: aakanksha
output: h->1
 */

package suresh.array;

public class Assignment58 {

	int getCharFrequecy(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch1 = input.charAt(i);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	char getMinFrequecy(String input) {
		int mincount = 0;
		char maxchar = ' ';

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int count = getCharFrequecy(input, ch);
			if (count == 1) {
				mincount = count;
				maxchar = ch;
			}

		}
		System.out.println(maxchar);
		System.out.println(mincount);

		return maxchar;
	}

	public static void main(String[] args) {
		Assignment58 assignment58 = new Assignment58();
		assignment58.getMinFrequecy("aakanksha");
	}
}
